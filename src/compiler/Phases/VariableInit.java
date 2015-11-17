package compiler.Phases;

import compiler.IR.*;
import compiler.IR.support.IRElementVisitorWithArgument;
import compiler.Exceptions.TypeCheckerException;
import compiler.Exceptions.VisitorException;

import java.util.HashSet;


public class VariableInit extends IRElementVisitorWithArgument<HashSet<MJVariable>> {

	public static void check(IR ir) throws TypeCheckerException {
		try {
			new VariableInit().visitProgram(ir.getProgram(), null);
		} catch (VisitorException e) {
			throw new TypeCheckerException(e.getMessage());
		}
	}
	
	@Override
	public HashSet<MJVariable> visitProgram(MJProgram e, HashSet<MJVariable> arg)
			throws VisitorException {
		for (MJClass c : e.getClasses()) {
			visitClass(c,arg);
		}

		return arg;
	}

	@Override
	public HashSet<MJVariable> visitClass(MJClass e, HashSet<MJVariable> arg)
			throws VisitorException {

		IR.currentClass = e;

		for (MJMethod m : e.getMethodList()) {			
			visitMethod(m, arg);
		}

		return arg;
	}

	@Override
	public HashSet<MJVariable> visitVariable(MJVariable e,
			HashSet<MJVariable> arg) throws VisitorException {
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitType(MJType e, HashSet<MJVariable> arg)
			throws VisitorException {
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitMethod(MJMethod e, HashSet<MJVariable> arg)
			throws VisitorException {

		IR.currentMethod = e;

		HashSet<MJVariable> parameters = new HashSet<MJVariable>(e.getParameters());

		visitStatement(e.getBody(), parameters);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJBlock e, HashSet<MJVariable> arg)
			throws VisitorException {

		for (MJStatement s : e.getStatements()) {
			arg = visitStatement(s,arg);
		}

		return arg;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJIf e, HashSet<MJVariable> arg)
			throws VisitorException {
		visitExpression(e.getCondition(), arg);
		visitStatement(e.getIfBlock(), arg);

		return arg;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJIfElse e,
			HashSet<MJVariable> arg) throws VisitorException {
		HashSet<MJVariable> initIf = visitStatement(((MJIfElse)e).getIfBlock(), (HashSet<MJVariable>)arg.clone());
		HashSet<MJVariable> initElse = visitStatement(((MJIfElse)e).getElseBlock(), (HashSet<MJVariable>)arg.clone());

		initIf.retainAll(initElse);
		return initIf;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJWhile e, HashSet<MJVariable> arg)
			throws VisitorException {
		visitExpression(e.getCondition(), arg);
		visitStatement(e.getBlock(), arg);

		return arg;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJAssign e,
			HashSet<MJVariable> arg) throws VisitorException {

		MJIdentifierClass lhs = ((MJAssign) e).getLhs();

		if (lhs instanceof MJArray || lhs instanceof MJSelector) {
			visitExpression(lhs, arg);
		} else {		
			MJVariable decl = ((MJIdentifier)lhs).getDeclaration();

			arg.add(decl);
		}
		
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJPrint e, HashSet<MJVariable> arg)
			throws VisitorException {
		visitExpression(e.getParameter(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJPrintln e,
			HashSet<MJVariable> arg) throws VisitorException {
		visitExpression(e.getParameter(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJMethodCallStmt e,
			HashSet<MJVariable> arg) throws VisitorException {
		visitExpression(e.getMethodCallExpr(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJReturn e,
			HashSet<MJVariable> arg) throws VisitorException {
		visitExpression(e.getArgument(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJAnd e, HashSet<MJVariable> arg)
			throws VisitorException {
		visitExpression(e.getLhs(), arg);
		visitExpression(e.getRhs(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJEqual e,
			HashSet<MJVariable> arg) throws VisitorException {
		visitExpression(e.getLhs(), arg);
		visitExpression(e.getRhs(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJLess e, HashSet<MJVariable> arg)
			throws VisitorException {
		visitExpression(e.getLhs(), arg);
		visitExpression(e.getRhs(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJPlus e, HashSet<MJVariable> arg)
			throws VisitorException {
		visitExpression(e.getLhs(), arg);
		visitExpression(e.getRhs(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJMinus e,
			HashSet<MJVariable> arg) throws VisitorException {
		visitExpression(e.getLhs(), arg);
		visitExpression(e.getRhs(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJMult e, HashSet<MJVariable> arg)
			throws VisitorException {
		visitExpression(e.getLhs(), arg);
		visitExpression(e.getRhs(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJUnaryMinus e,
			HashSet<MJVariable> arg) throws VisitorException {
		visitExpression(e.getArgument(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJNegate e,
			HashSet<MJVariable> arg) throws VisitorException {
		visitExpression(e.getArgument(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJNew e, HashSet<MJVariable> arg)
			throws VisitorException {
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJNewArray e,
			HashSet<MJVariable> arg) throws VisitorException {
		visitExpression(e.getSize(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJMethodCallExpr e,
			HashSet<MJVariable> arg) throws VisitorException {
		
		if (e.hasObject()) {
			visitExpression(e.getObject(), arg);
		}
		for (MJExpression argument : e.getArguments()) {
			visitExpression(argument, arg);
		}
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJParentheses e,
			HashSet<MJVariable> arg) throws VisitorException {
		visitExpression(e.getArgument(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJBoolean e,
			HashSet<MJVariable> arg) throws VisitorException {
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJInteger e,
			HashSet<MJVariable> arg) throws VisitorException {
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJString e,
			HashSet<MJVariable> arg) throws VisitorException {
		return arg;
	}
	
	@Override
	public HashSet<MJVariable> visitExpression(MJIdentifier e,
			HashSet<MJVariable> arg) throws VisitorException {
		if (! arg.contains(e.getDeclaration())) {
			throw new TypeCheckerException("Variable "+e.getName()+" not initialized.");
		}
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJArray e,
			HashSet<MJVariable> arg) throws VisitorException {
		visitExpression(e.getArray(), arg);
		visitExpression(e.getIndex(), arg);
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJSelector e,
			HashSet<MJVariable> arg) throws VisitorException {
		visitExpression(e.getObject(), arg);
		if (e.getField() instanceof MJSelector) {
			visitExpression(e.getField(), arg);
		}
		
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJNoExpression e,
			HashSet<MJVariable> arg) throws VisitorException {
		return arg;
	}

	@Override
	public HashSet<MJVariable> visitTypeDef(MJTypeDef e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitAttribute(MJAttribute e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitConstructor(MJConstructor e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJTryBlock e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJConstructorCallStmt e, HashSet<MJVariable> arg)
			throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJFor e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJThrow e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJPostIncrementStmt e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJPreIncrementStmt e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJPostDecrementStmt e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJPreDecrementStmt e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJVariableStmt e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJGreater e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJDivide e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJModulo e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJChar e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJDouble e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJPostIncrementExpr e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJPreIncrementExpr e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJPostDecrementExpr e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJPreDecrementExpr e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJTernary e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJSqrt e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJTypeCast e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitExpression(MJLinq e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<MJVariable> visitStatement(MJNoStatement e, HashSet<MJVariable> arg) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

}
