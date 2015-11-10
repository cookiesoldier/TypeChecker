package compiler.Phases;

import compiler.IR.*;
import compiler.IR.support.IRElementVisitor;
import compiler.Exceptions.VisitorException;

public class AddThisArgument extends IRElementVisitor<Object> {

	public static void rewrite(IR ir) {
		AddThisArgument rewriter = new AddThisArgument();
		try {
			rewriter.visitProgram(ir.getProgram());
		} catch (VisitorException e) {
			e.printStackTrace();
		}
	}

	
	public Integer visitProgram(MJProgram e) throws VisitorException {
		
		for (MJClass c : e.getClasses()) {
			IR.currentClass = c;
			visitClass(c);
		}
		
		return null;
	}

	
	public Integer visitClass(MJClass e) throws VisitorException {
		
		for (MJMethod method : e.getMethodList()) {
			IR.currentMethod = method;
			visitMethod(method);
		}

		return null;
	}

	
	public Integer visitMethod(MJMethod e) throws VisitorException {
		// add 'this' to virtual methods
		
		if (!e.isStatic()) {
			
			MJType t = MJType.getClassType( IR.currentClass.getName() );
			MJVariable v = new MJVariable(t,"this");
			
			e.getParameters().addFirst(v);
		}
		
		return null;
	}

	
	public Object visitVariable(MJVariable e) throws VisitorException {		
		return null;
	}

	
	public Object visitType(MJType e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJBlock e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJIf e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJIfElse e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJWhile e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJAssign e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJPrint e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJPrintln e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJMethodCallStmt e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJReturn e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJAnd e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJEqual e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJLess e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJPlus e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJMinus e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJMult e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJUnaryMinus e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJNegate e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJNew e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJNewArray e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJMethodCallExpr e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJParentheses e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJBoolean e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJInteger e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJString e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJIdentifier e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJArray e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJSelector e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJNoExpression e) throws VisitorException {
		return null;
	}

	
	public Object visitTypeDef(MJTypeDef e) throws VisitorException {
		return null;
	}

	
	public Object visitAttribute(MJAttribute e) throws VisitorException {
		return null;
	}

	
	public Object visitConstructor(MJConstructor e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJTryBlock e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJConstructorCallStmt e)
			throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJFor e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJThrow e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJPostIncrementStmt e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJPreIncrementStmt e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJPostDecrementStmt e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJPreDecrementStmt e) throws VisitorException {
		return null;
	}

	
	public Object visitStatement(MJVariableStmt e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJGreater e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJDivide e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJModulo e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJChar e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJDouble e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJPostIncrementExpr e)
			throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJPreIncrementExpr e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJPostDecrementExpr e)
			throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJPreDecrementExpr e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJTernary e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJSqrt e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJTypeCast e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJLinq e) throws VisitorException {
		return null;
	}

	
	public Object visitExpression(MJNoStatement e) throws VisitorException {
		return null;
	}

}
