package compiler.IR.support;

import compiler.Exceptions.VisitorException;
import compiler.IR.*;

public abstract class IRElementVisitorWithArgument<T> {

	public abstract T visitProgram(MJProgram e, T arg) throws VisitorException;
	public abstract T visitClass(MJClass e, T arg) throws VisitorException;
	public abstract T visitVariable(MJVariable e, T arg) throws VisitorException;
	public abstract T visitType(MJType e, T arg) throws VisitorException;
	public abstract T visitMethod(MJMethod e, T arg) throws VisitorException;

	public T visitStatement(MJStatement e, T arg) throws VisitorException {
		if (e instanceof MJBlock) return visitStatement((MJBlock)e, arg);
		if (e instanceof MJIfElse) return visitStatement((MJIfElse)e, arg);
		if (e instanceof MJIf) return visitStatement((MJIf)e, arg);
		if (e instanceof MJWhile) return visitStatement((MJWhile)e, arg);
		if (e instanceof MJAssign) return visitStatement((MJAssign)e, arg);
		if (e instanceof MJPrint) return visitStatement((MJPrint)e, arg);
		if (e instanceof MJPrintln) return visitStatement((MJPrintln)e, arg);
		if (e instanceof MJMethodCallStmt) return visitStatement((MJMethodCallStmt)e, arg);
		if (e instanceof MJReturn) return visitStatement((MJReturn)e, arg);
		throw new VisitorException("unknown statement class "+e.getClass().getName());
	}
	
	public abstract T visitStatement(MJBlock e, T arg) throws VisitorException;
	public abstract T visitStatement(MJIf e, T arg) throws VisitorException;
	public abstract T visitStatement(MJIfElse e, T arg) throws VisitorException;
	public abstract T visitStatement(MJWhile e, T arg) throws VisitorException;
	public abstract T visitStatement(MJAssign e, T arg) throws VisitorException;
	public abstract T visitStatement(MJPrint e, T arg) throws VisitorException;
	public abstract T visitStatement(MJPrintln e, T arg) throws VisitorException;
	public abstract T visitStatement(MJMethodCallStmt e, T arg) throws VisitorException;
	public abstract T visitStatement(MJReturn e, T arg) throws VisitorException;

	public T visitExpression(MJExpression e, T arg) throws VisitorException {
		if (e instanceof MJAnd) return visitExpression((MJAnd)e, arg);
		if (e instanceof MJEqual) return visitExpression((MJEqual)e, arg);
		if (e instanceof MJLess) return visitExpression((MJLess)e, arg);
		if (e instanceof MJPlus) return visitExpression((MJPlus)e, arg);
		if (e instanceof MJMinus) return visitExpression((MJMinus)e, arg);
		if (e instanceof MJMult) return visitExpression((MJMult)e, arg);
		if (e instanceof MJUnaryMinus) return visitExpression((MJUnaryMinus)e, arg);
		if (e instanceof MJNegate) return visitExpression((MJNegate)e, arg);
		if (e instanceof MJNewArray) return visitExpression((MJNewArray)e, arg);
		if (e instanceof MJNew) return visitExpression((MJNew)e, arg);
		if (e instanceof MJMethodCallExpr) return visitExpression((MJMethodCallExpr)e, arg);
		if (e instanceof MJParentheses) return visitExpression((MJParentheses)e, arg);
		if (e instanceof MJBoolean) return visitExpression((MJBoolean)e, arg);
		if (e instanceof MJInteger) return visitExpression((MJInteger)e, arg);
		if (e instanceof MJString) return visitExpression((MJString)e, arg);
		if (e instanceof MJArray) return visitExpression((MJArray)e, arg);
		if (e instanceof MJSelector) return visitExpression((MJSelector)e, arg);
		if (e instanceof MJIdentifier) return visitExpression((MJIdentifier)e, arg);
		if (e instanceof MJNoExpression) return visitExpression((MJNoExpression)e, arg);
		
		throw new VisitorException("unknown expression class "+e.getClass().getName());
	}
	public abstract T visitExpression(MJAnd e, T arg) throws VisitorException;
	public abstract T visitExpression(MJEqual e, T arg) throws VisitorException;
	public abstract T visitExpression(MJLess e, T arg) throws VisitorException;
	public abstract T visitExpression(MJPlus e, T arg) throws VisitorException;
	public abstract T visitExpression(MJMinus e, T arg) throws VisitorException;
	public abstract T visitExpression(MJMult e, T arg) throws VisitorException;
	public abstract T visitExpression(MJUnaryMinus e, T arg) throws VisitorException;
	public abstract T visitExpression(MJNegate e, T arg) throws VisitorException;
	public abstract T visitExpression(MJNew e, T arg) throws VisitorException;
	public abstract T visitExpression(MJNewArray e, T arg) throws VisitorException;
	public abstract T visitExpression(MJMethodCallExpr e, T arg) throws VisitorException;
	public abstract T visitExpression(MJParentheses e, T arg) throws VisitorException;
	public abstract T visitExpression(MJBoolean e, T arg) throws VisitorException;
	public abstract T visitExpression(MJInteger e, T arg) throws VisitorException;
	public abstract T visitExpression(MJString e, T arg) throws VisitorException;
	
	public abstract T visitExpression(MJIdentifier e, T arg) throws VisitorException;
	public abstract T visitExpression(MJArray e, T arg) throws VisitorException;
	public abstract T visitExpression(MJSelector e, T arg) throws VisitorException;
	
	public abstract T visitExpression(MJNoExpression e, T arg) throws VisitorException;
	
}