package compiler.Phases;

import java.util.LinkedList;

import compiler.IR.*;
import compiler.IR.support.IRElementVisitor;
import compiler.Exceptions.VisitorException;

public class AddThisToSelectors extends IRElementVisitor<MJExpression> {

	public static void rewrite(IR ir) {
		AddThisToSelectors rewriter = new AddThisToSelectors();
		try {
			rewriter.visitProgram(ir.getProgram());
		} catch (VisitorException e) {
			e.printStackTrace();
		}
	}

	public MJExpression visitProgram(MJProgram e) throws VisitorException {
		
		for (MJClass c : e.getClasses()) {
			IR.currentClass = c;
			visitClass(c);
		}
		
		return null;
	}

	public MJExpression visitClass(MJClass e) throws VisitorException {
		
		for (MJClass innerClass : e.getInnerClassList()) {
			
			IR.currentClass = innerClass;
			visitClass(innerClass);
		}
		
		IR.currentClass = e;
		
		for (MJMethod method : e.getMethodList()) {
			IR.currentMethod = method;
			visitMethod(method);
		}
		
		for (MJMethod method : e.getConstructorList()) {
			IR.currentMethod = method;
			visitMethod(method);
		}

		return null;
	}

	public MJExpression visitMethod(MJMethod e) throws VisitorException {
		visitStatement(e.getBody());
		return null;
	}

	public MJExpression visitVariable(MJVariable e) throws VisitorException {
		e.setInitializer(visitExpression(e.getInitializer()));
		return null;
	}

	public MJExpression visitType(MJType e) throws VisitorException {
		return null;
	}

	public MJExpression visitStatement(MJBlock e) throws VisitorException {

		for (MJVariable v : e.getVariables()) {
			visitVariable(v);
		}
		
		for (MJStatement s : e.getStatements()) {
			visitStatement(s);
		}
		
		return null;
	}

	public MJExpression visitStatement(MJIf e) throws VisitorException {

		e.setCondition(visitExpression(e.getCondition()));
		visitStatement(e.getIfBlock());
		
		return null;
	}

	public MJExpression visitStatement(MJIfElse e) throws VisitorException {

		e.setCondition(visitExpression(e.getCondition()));
		visitStatement(e.getIfBlock());
		visitStatement(e.getElseBlock());
		
		return null;
	}

	public MJExpression visitStatement(MJWhile e) throws VisitorException {

		e.setCondition(visitExpression(e.getCondition()));
		visitStatement(e.getBlock());
		
		return null;
	}

	public MJExpression visitStatement(MJAssign e) throws VisitorException {
		
		e.setLhs((MJIdentifier)visitExpression(e.getLhs()));
		e.setRhs(visitExpression(e.getRhs()));
		
		return null;
	}

	public MJExpression visitStatement(MJPrint e) throws VisitorException {
		
		e.setParameter(visitExpression(e.getParameter()));
		return null;
	}

	public MJExpression visitStatement(MJPrintln e) throws VisitorException {
		e.setParameter(visitExpression(e.getParameter()));
		return null;
	}

	public MJExpression visitStatement(MJMethodCallStmt e) throws VisitorException {
		e.setMethodCallExpr((MJMethodCallExpr)visitExpression(e.getMethodCallExpr()));
		return null;
	}

	public MJExpression visitStatement(MJReturn e) throws VisitorException {
		e.setArgument(visitExpression(e.getArgument()));
		return null;
	}

	public MJExpression visitExpression(MJAnd e) throws VisitorException {
		e.setLhs(visitExpression(e.getLhs()));
		e.setRhs(visitExpression(e.getRhs()));
		return e;
	}

	public MJExpression visitExpression(MJEqual e) throws VisitorException {
		e.setLhs(visitExpression(e.getLhs()));
		e.setRhs(visitExpression(e.getRhs()));
		return e;
	}

	public MJExpression visitExpression(MJLess e) throws VisitorException {
		e.setLhs(visitExpression(e.getLhs()));
		e.setRhs(visitExpression(e.getRhs()));
		return e;
	}

	public MJExpression visitExpression(MJPlus e) throws VisitorException {
		e.setLhs(visitExpression(e.getLhs()));
		e.setRhs(visitExpression(e.getRhs()));
		return e;
	}

	public MJExpression visitExpression(MJMinus e) throws VisitorException {
		e.setLhs(visitExpression(e.getLhs()));
		e.setRhs(visitExpression(e.getRhs()));
		return e;
	}

	public MJExpression visitExpression(MJMult e) throws VisitorException {
		e.setLhs(visitExpression(e.getLhs()));
		e.setRhs(visitExpression(e.getRhs()));
		return e;
	}

	public MJExpression visitExpression(MJUnaryMinus e) throws VisitorException {
		e.setArgument(visitExpression(e.getArgument()));
		return e;
	}

	public MJExpression visitExpression(MJNegate e) throws VisitorException {
		e.setArgument(visitExpression(e.getArgument()));
		return e;
	}

	public MJExpression visitExpression(MJNew e) throws VisitorException {
		return e;
	}

	public MJExpression visitExpression(MJNewArray e) throws VisitorException {
		e.setSize(visitExpression(e.getSize()));
		return e;
	}

	public MJExpression visitExpression(MJMethodCallExpr e) throws VisitorException {

		if (!e.getTarget().isStatic()) {
			if (!e.hasObject()) {
				MJIdentifier id = new MJIdentifier("this");
				MJType t = MJType.getClassType(IR.currentClass.getName());
				id.setType(t);
				id.setDeclaration(IR.currentMethod.getParameters().getFirst());

				e.setObject(id);
			}
		
			MJIdentifierClass thisid = e.getObject();			
			e.getArguments().addFirst(thisid);
		}
		
		LinkedList<MJExpression> arguments = e.getArguments();
		LinkedList<MJExpression> newArguments = new LinkedList<MJExpression>();
		
		for (MJExpression arg : arguments) {
			arg = (MJExpression)visitExpression(arg);
			newArguments.addLast(arg);
		}
		
		e.setArguments(newArguments);
		
		return e;
	}

	public MJExpression visitExpression(MJParentheses e) throws VisitorException {
		e.setArgument(visitExpression(e.getArgument()));
		return e;
	}

	public MJExpression visitExpression(MJInteger e) throws VisitorException {
		return e;
	}

	public MJExpression visitExpression(MJBoolean e) throws VisitorException {
		return e;
	}

	public MJExpression visitExpression(MJString e) throws VisitorException {
		return e;
	}

	public MJExpression visitExpression(MJIdentifier e) throws VisitorException {

		if (!IR.currentMethod.isStatic() && e.getDeclaration().isField()) {
		
			MJIdentifier id = new MJIdentifier("this");
			MJType t = MJType.getClassType(IR.currentClass.getName());
			id.setType(t);
			id.setDeclaration(IR.currentMethod.getParameters().getFirst());
			MJSelector s = new MJSelector(id, e);
			
			e = s;
		}
		return e;
	}

	public MJExpression visitExpression(MJArray e) throws VisitorException {
		e.setArray((MJIdentifier)visitExpression(e.getArray()));
		e.setIndex(visitExpression(e.getIndex()));
		return e;
	}

	public MJExpression visitExpression(MJSelector e) throws VisitorException {
		e.setObject((MJIdentifier)visitExpression(e.getObject()));
		e.setField((MJIdentifier)visitExpression(e.getField()));
		return e;
	}

	public MJExpression visitExpression(MJNoExpression e) throws VisitorException {
		return e;
	}

	public MJExpression visitTypeDef(MJTypeDef e) throws VisitorException {
		return null;
	}

	public MJExpression visitAttribute(MJAttribute e) throws VisitorException {
		e.setInitializer(visitExpression(e.getInitializer()));
		return null;
	}

	public MJExpression visitConstructor(MJConstructor e)
			throws VisitorException {
		visitStatement(e.getBody());
		return null;
	}

	public MJExpression visitStatement(MJTryBlock e) throws VisitorException {
		visitStatement(e.getTryBlock());
		visitStatement(e.getCatchBlock());
		return null;
	}

	public MJExpression visitStatement(MJConstructorCallStmt e)
			throws VisitorException {
		e.setMethodCallExpr((MJMethodCallExpr)visitExpression(e.getMethodCallExpr()));
		return null;
	}

	public MJExpression visitStatement(MJFor e) throws VisitorException {
		visitStatement(e.getInit());
		e.setCondition(visitExpression(e.getCondition()));
		return null;
	}

	public MJExpression visitStatement(MJThrow e) throws VisitorException {
		e.setArgument(visitExpression(e.getArgument()));
		return null;
	}

	public MJExpression visitStatement(MJPostIncrementStmt e)
			throws VisitorException {
		visitExpression(e.getArgument());
		return null;
	}

	public MJExpression visitStatement(MJPreIncrementStmt e)
			throws VisitorException {
		visitExpression(e.getArgument());
		return null;
	}

	public MJExpression visitStatement(MJPostDecrementStmt e)
			throws VisitorException {
		visitExpression(e.getArgument());
		return null;
	}

	public MJExpression visitStatement(MJPreDecrementStmt e)
			throws VisitorException {
		visitExpression(e.getArgument());
		return null;
	}

	public MJExpression visitStatement(MJVariableStmt e)
			throws VisitorException {
		visitVariable(e.getDeclaration());
		return null;
	}

	public MJExpression visitExpression(MJGreater e) throws VisitorException {
		e.setLhs(visitExpression(e.getLhs()));
		e.setRhs(visitExpression(e.getRhs()));
		return e;
	}

	public MJExpression visitExpression(MJDivide e) throws VisitorException {
		e.setLhs(visitExpression(e.getLhs()));
		e.setRhs(visitExpression(e.getRhs()));
		return e;
	}

	public MJExpression visitExpression(MJModulo e) throws VisitorException {
		e.setLhs(visitExpression(e.getLhs()));
		e.setRhs(visitExpression(e.getRhs()));
		return e;
	}

	public MJExpression visitExpression(MJChar e) throws VisitorException {
		return e;
	}

	public MJExpression visitExpression(MJDouble e) throws VisitorException {
		return e;
	}

	public MJExpression visitExpression(MJPostIncrementExpr e)
			throws VisitorException {
		e.setArgument(visitExpression(e.getArgument()));
		return e;
	}

	public MJExpression visitExpression(MJPreIncrementExpr e)
			throws VisitorException {
		e.setArgument(visitExpression(e.getArgument()));
		return e;
	}

	public MJExpression visitExpression(MJPostDecrementExpr e)
			throws VisitorException {
		e.setArgument(visitExpression(e.getArgument()));
		return e;
	}

	public MJExpression visitExpression(MJPreDecrementExpr e)
			throws VisitorException {
		e.setArgument(visitExpression(e.getArgument()));
		return e;
	}

	public MJExpression visitExpression(MJTernary e) throws VisitorException {
		e.setCondition(visitExpression(e.getCondition()));
		e.setTrueExpr(visitExpression(e.getTrueExpr()));
		e.setFalseExpr(visitExpression(e.getFalseExpr()));
		return e;
	}

	public MJExpression visitExpression(MJSqrt e) throws VisitorException {
		e.setParameter(visitExpression(e.getParameter()));
		return e;
	}

	public MJExpression visitExpression(MJTypeCast e) throws VisitorException {
		e.setArgument(visitExpression(e.getArgument()));
		return e;
	}

	public MJExpression visitExpression(MJLinq e) throws VisitorException {
		e.setFromIdent((MJIdentifierClass)visitExpression(e.getFromIdent()));
		e.setInExpression(visitExpression(e.getInExpression()));
		e.setWhereExpression(visitExpression(e.getWhereExpression()));
		e.setSelectExpression(visitExpression(e.getSelectExpression()));
		return e;
	}

	public MJExpression visitStatement(MJNoStatement e)
			throws VisitorException {
		return null;
	}

	@Override
	public MJExpression visitExpression(MJNoStatement e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

}
