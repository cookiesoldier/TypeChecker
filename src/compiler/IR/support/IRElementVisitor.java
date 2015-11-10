package compiler.IR.support;

import compiler.Exceptions.VisitorException;
import compiler.Frontend.MiniJavaVisitor;
import compiler.IR.*;

public abstract class IRElementVisitor<T>  {

	public abstract T visitProgram(MJProgram e) throws VisitorException;
	public abstract T visitClass(MJClass e) throws VisitorException;
	public abstract T visitTypeDef(MJTypeDef e) throws VisitorException;
	public abstract T visitVariable(MJVariable e) throws VisitorException;
	public abstract T visitAttribute(MJAttribute e) throws VisitorException;
	public abstract T visitType(MJType e) throws VisitorException;
	public abstract T visitMethod(MJMethod e) throws VisitorException;
	public abstract T visitConstructor(MJConstructor e) throws VisitorException;

	public T visitStatement(MJStatement e) throws VisitorException {
		if (e instanceof MJBlock) return visitStatement((MJBlock)e);
		if (e instanceof MJTryBlock) return visitStatement((MJTryBlock)e);
		if (e instanceof MJIfElse) return visitStatement((MJIfElse)e);
		if (e instanceof MJIf) return visitStatement((MJIf)e);
		if (e instanceof MJWhile) return visitStatement((MJWhile)e);
		if (e instanceof MJAssign) return visitStatement((MJAssign)e);
		if (e instanceof MJPrint) return visitStatement((MJPrint)e);
		if (e instanceof MJPrintln) return visitStatement((MJPrintln)e);
		if (e instanceof MJMethodCallStmt) return visitStatement((MJMethodCallStmt)e);
		if (e instanceof MJConstructorCallStmt) return visitStatement((MJConstructorCallStmt)e);
		if (e instanceof MJReturn) return visitStatement((MJReturn)e);
		if (e instanceof MJFor) return visitStatement((MJFor)e);
		if (e instanceof MJThrow) return visitStatement((MJThrow)e);
		if (e instanceof MJPostIncrementStmt) return visitStatement((MJPostIncrementStmt)e);
		if (e instanceof MJPreIncrementStmt) return visitStatement((MJPreIncrementStmt)e);
		if (e instanceof MJPostDecrementStmt) return visitStatement((MJPostDecrementStmt)e);
		if (e instanceof MJPreDecrementStmt) return visitStatement((MJPreDecrementStmt)e);
		if (e instanceof MJVariableStmt) return visitStatement((MJVariableStmt)e);
		if (e instanceof MJNoStatement) return visitStatement((MJNoStatement)e);
		throw new VisitorException("unknown statement class "+e.getClass().getName());
	}
	
	public abstract T visitStatement(MJBlock e) throws VisitorException;
	public abstract T visitStatement(MJTryBlock e) throws VisitorException;
	public abstract T visitStatement(MJIf e) throws VisitorException;
	public abstract T visitStatement(MJIfElse e) throws VisitorException;
	public abstract T visitStatement(MJWhile e) throws VisitorException;
	public abstract T visitStatement(MJAssign e) throws VisitorException;
	public abstract T visitStatement(MJPrint e) throws VisitorException;
	public abstract T visitStatement(MJPrintln e) throws VisitorException;
	public abstract T visitStatement(MJMethodCallStmt e) throws VisitorException;
	public abstract T visitStatement(MJConstructorCallStmt e) throws VisitorException;
	public abstract T visitStatement(MJReturn e) throws VisitorException;
	public abstract T visitStatement(MJFor e) throws VisitorException;
	public abstract T visitStatement(MJThrow e) throws VisitorException;
	public abstract T visitStatement(MJPostIncrementStmt e) throws VisitorException;
	public abstract T visitStatement(MJPreIncrementStmt e) throws VisitorException;
	public abstract T visitStatement(MJPostDecrementStmt e) throws VisitorException;
	public abstract T visitStatement(MJPreDecrementStmt e) throws VisitorException;
	public abstract T visitStatement(MJVariableStmt e) throws VisitorException;

	public T visitExpression(MJExpression e) throws VisitorException {
		if (e instanceof MJAnd) return visitExpression((MJAnd)e);
		if (e instanceof MJEqual) return visitExpression((MJEqual)e);
		if (e instanceof MJGreater) return visitExpression((MJEqual)e);
		if (e instanceof MJLess) return visitExpression((MJLess)e);
		if (e instanceof MJPlus) return visitExpression((MJPlus)e);
		if (e instanceof MJMinus) return visitExpression((MJMinus)e);
		if (e instanceof MJMult) return visitExpression((MJMult)e);
		if (e instanceof MJDivide) return visitExpression((MJDivide)e);
		if (e instanceof MJModulo) return visitExpression((MJModulo)e);
		if (e instanceof MJUnaryMinus) return visitExpression((MJUnaryMinus)e);
		if (e instanceof MJNegate) return visitExpression((MJNegate)e);
		if (e instanceof MJNew) return visitExpression((MJNew)e);
		if (e instanceof MJNewArray) return visitExpression((MJNewArray)e);
		if (e instanceof MJMethodCallExpr) return visitExpression((MJMethodCallExpr)e);
		if (e instanceof MJParentheses) return visitExpression((MJParentheses)e);
		if (e instanceof MJBoolean) return visitExpression((MJBoolean)e);
		if (e instanceof MJInteger) return visitExpression((MJInteger)e);
		if (e instanceof MJChar) return visitExpression((MJChar)e);
		if (e instanceof MJDouble) return visitExpression((MJDouble)e);
		if (e instanceof MJString) return visitExpression((MJString)e);
		if (e instanceof MJPostIncrementExpr) return visitExpression((MJPostIncrementExpr)e);
		if (e instanceof MJPreIncrementExpr) return visitExpression((MJPostIncrementExpr)e);
		if (e instanceof MJPostDecrementExpr) return visitExpression((MJPostDecrementExpr)e);
		if (e instanceof MJPreDecrementExpr) return visitExpression((MJPostDecrementExpr)e);		
		if (e instanceof MJTernary) return visitExpression((MJTernary)e);
		if (e instanceof MJSqrt) return visitExpression((MJSqrt)e);
		if (e instanceof MJTypeCast) return visitExpression((MJTypeCast)e);
		if (e instanceof MJLinq) return visitExpression((MJLinq)e);
		if (e instanceof MJArray) return visitExpression((MJArray)e);
		if (e instanceof MJSelector) return visitExpression((MJSelector)e);
		if (e instanceof MJIdentifier) return visitExpression((MJIdentifier)e);
		if (e instanceof MJNoExpression) return visitExpression((MJNoExpression)e);
		
		throw new VisitorException("unknown expression class "+e.getClass().getName());
	}
	public abstract T visitExpression(MJAnd e) throws VisitorException;
	public abstract T visitExpression(MJEqual e) throws VisitorException;
	public abstract T visitExpression(MJGreater e) throws VisitorException;
	public abstract T visitExpression(MJLess e) throws VisitorException;
	public abstract T visitExpression(MJPlus e) throws VisitorException;
	public abstract T visitExpression(MJMinus e) throws VisitorException;
	public abstract T visitExpression(MJMult e) throws VisitorException;
	public abstract T visitExpression(MJDivide e) throws VisitorException;
	public abstract T visitExpression(MJModulo e) throws VisitorException;
	public abstract T visitExpression(MJUnaryMinus e) throws VisitorException;
	public abstract T visitExpression(MJNegate e) throws VisitorException;
	public abstract T visitExpression(MJNew e) throws VisitorException;
	public abstract T visitExpression(MJNewArray e) throws VisitorException;
	public abstract T visitExpression(MJMethodCallExpr e) throws VisitorException;
	public abstract T visitExpression(MJParentheses e) throws VisitorException;
	public abstract T visitExpression(MJBoolean e) throws VisitorException;
	public abstract T visitExpression(MJInteger e) throws VisitorException;
	public abstract T visitExpression(MJChar e) throws VisitorException;
	public abstract T visitExpression(MJDouble e) throws VisitorException;
	public abstract T visitExpression(MJString e) throws VisitorException;
	public abstract T visitExpression(MJPostIncrementExpr e) throws VisitorException;
	public abstract T visitExpression(MJPreIncrementExpr e) throws VisitorException;
	public abstract T visitExpression(MJPostDecrementExpr e) throws VisitorException;
	public abstract T visitExpression(MJPreDecrementExpr e) throws VisitorException;
	public abstract T visitExpression(MJTernary e) throws VisitorException;
	public abstract T visitExpression(MJSqrt e) throws VisitorException;
	public abstract T visitExpression(MJTypeCast e) throws VisitorException;
	public abstract T visitExpression(MJLinq e) throws VisitorException;
	
	public abstract T visitExpression(MJIdentifier e) throws VisitorException;
	public abstract T visitExpression(MJArray e) throws VisitorException;
	public abstract T visitExpression(MJSelector e) throws VisitorException;
	
	public abstract T visitExpression(MJNoExpression e) throws VisitorException;
	public abstract T visitExpression(MJNoStatement e) throws VisitorException;
	
}