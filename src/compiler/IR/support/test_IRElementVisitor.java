package compiler.IR.support;

import compiler.Exceptions.VisitorException;
import compiler.IR.*;

public abstract class test_IRElementVisitor<T> {

	public abstract T visitProgram(MJProgram e) throws VisitorException;
	public abstract T visitClass(MJClass e) throws VisitorException;
	public abstract T visitVariable(MJVariable e) throws VisitorException;
	public abstract T visitType(MJType e) throws VisitorException;
	public abstract T visitMethod(MJMethod e) throws VisitorException;

	public T visitStatement(MJStatement e) throws VisitorException {
		if (e instanceof MJBlock) return visitStatement((MJBlock)e);
		if (e instanceof MJIfElse) return visitStatement((MJIfElse)e);
		if (e instanceof MJIf) return visitStatement((MJIf)e);
		if (e instanceof MJWhile) return visitStatement((MJWhile)e);
		if (e instanceof MJAssign) return visitStatement((MJAssign)e);
		if (e instanceof MJPrint) return visitStatement((MJPrint)e);
		if (e instanceof MJPrintln) return visitStatement((MJPrintln)e);
		if (e instanceof MJMethodCallStmt) return visitStatement((MJMethodCallStmt)e);
		if (e instanceof MJReturn) return visitStatement((MJReturn)e);
		throw new VisitorException("unknown statement class "+e.getClass().getName());
	}
	
	public abstract T visitStatement(MJBlock e) throws VisitorException;
	public abstract T visitStatement(MJIf e) throws VisitorException;
	public abstract T visitStatement(MJIfElse e) throws VisitorException;
	public abstract T visitStatement(MJWhile e) throws VisitorException;
	public abstract T visitStatement(MJAssign e) throws VisitorException;
	public abstract T visitStatement(MJPrint e) throws VisitorException;
	public abstract T visitStatement(MJPrintln e) throws VisitorException;
	public abstract T visitStatement(MJMethodCallStmt e) throws VisitorException;
	public abstract T visitStatement(MJReturn e) throws VisitorException;

	public T visitExpression(MJExpression e) throws VisitorException {
		if (e instanceof MJAnd) return visitExpression((MJAnd)e);
		if (e instanceof MJEqual) return visitExpression((MJEqual)e);
		if (e instanceof MJLess) return visitExpression((MJLess)e);
		if (e instanceof MJPlus) return visitExpression((MJPlus)e);
		if (e instanceof MJMinus) return visitExpression((MJMinus)e);
		if (e instanceof MJMult) return visitExpression((MJMult)e);
		if (e instanceof MJUnaryMinus) return visitExpression((MJUnaryMinus)e);
		if (e instanceof MJNegate) return visitExpression((MJNegate)e);
		if (e instanceof MJNew) return visitExpression((MJNew)e);
		if (e instanceof MJNewArray) return visitExpression((MJNewArray)e);
		if (e instanceof MJMethodCallExpr) return visitExpression((MJMethodCallExpr)e);
		if (e instanceof MJParentheses) return visitExpression((MJParentheses)e);
		if (e instanceof MJBoolean) return visitExpression((MJBoolean)e);
		if (e instanceof MJInteger) return visitExpression((MJInteger)e);
		if (e instanceof MJString) return visitExpression((MJString)e);
		if (e instanceof MJArray) return visitExpression((MJArray)e);
		if (e instanceof MJSelector) return visitExpression((MJSelector)e);
		if (e instanceof MJIdentifier) return visitExpression((MJIdentifier)e);
		if (e instanceof MJNoExpression) return visitExpression((MJNoExpression)e);
		
		throw new VisitorException("unknown expression class "+e.getClass().getName());
	}
	public abstract T visitExpression(MJAnd e) throws VisitorException;
	public abstract T visitExpression(MJEqual e) throws VisitorException;
	public abstract T visitExpression(MJLess e) throws VisitorException;
	public abstract T visitExpression(MJPlus e) throws VisitorException;
	public abstract T visitExpression(MJMinus e) throws VisitorException;
	public abstract T visitExpression(MJMult e) throws VisitorException;
	public abstract T visitExpression(MJUnaryMinus e) throws VisitorException;
	public abstract T visitExpression(MJNegate e) throws VisitorException;
	public abstract T visitExpression(MJNew e) throws VisitorException;
	public abstract T visitExpression(MJNewArray e) throws VisitorException;
	public abstract T visitExpression(MJMethodCallExpr e) throws VisitorException;
	public abstract T visitExpression(MJParentheses e) throws VisitorException;
	public abstract T visitExpression(MJBoolean e) throws VisitorException;
	public abstract T visitExpression(MJInteger e) throws VisitorException;
	public abstract T visitExpression(MJString e) throws VisitorException;
	
	public abstract T visitExpression(MJIdentifier e) throws VisitorException;
	public abstract T visitExpression(MJArray e) throws VisitorException;
	public abstract T visitExpression(MJSelector e) throws VisitorException;
	
	public abstract T visitExpression(MJNoExpression e) throws VisitorException;
	
}