package compiler.IR.support;

import compiler.Exceptions.VisitorException;
import compiler.IR.*;

public abstract class IRElementVisitorWithArgument<T> {

		public abstract T visitProgram(MJProgram e, T arg) throws VisitorException;
		public abstract T visitClass(MJClass e, T arg) throws VisitorException;
		public abstract T visitTypeDef(MJTypeDef e, T arg) throws VisitorException;
		public abstract T visitVariable(MJVariable e, T arg) throws VisitorException;
		public abstract T visitAttribute(MJAttribute e, T arg) throws VisitorException;
		public abstract T visitType(MJType e, T arg) throws VisitorException;
		public abstract T visitMethod(MJMethod e, T arg) throws VisitorException;
		public abstract T visitConstructor(MJConstructor e, T arg) throws VisitorException;

		public T visitStatement(MJStatement e, T arg) throws VisitorException {
			if (e instanceof MJBlock) return visitStatement((MJBlock)e, arg);
			if (e instanceof MJTryBlock) return visitStatement((MJTryBlock)e, arg);
			if (e instanceof MJIfElse) return visitStatement((MJIfElse)e, arg);
			if (e instanceof MJIf) return visitStatement((MJIf)e, arg);
			if (e instanceof MJWhile) return visitStatement((MJWhile)e, arg);
			if (e instanceof MJAssign) return visitStatement((MJAssign)e, arg);
			if (e instanceof MJPrint) return visitStatement((MJPrint)e, arg);
			if (e instanceof MJPrintln) return visitStatement((MJPrintln)e, arg);
			if (e instanceof MJMethodCallStmt) return visitStatement((MJMethodCallStmt)e, arg);
			if (e instanceof MJConstructorCallStmt) return visitStatement((MJConstructorCallStmt)e, arg);
			if (e instanceof MJReturn) return visitStatement((MJReturn)e, arg);
			if (e instanceof MJFor) return visitStatement((MJFor)e, arg);
			if (e instanceof MJThrow) return visitStatement((MJThrow)e, arg);
			if (e instanceof MJPostIncrementStmt) return visitStatement((MJPostIncrementStmt)e, arg);
			if (e instanceof MJPreIncrementStmt) return visitStatement((MJPreIncrementStmt)e, arg);
			if (e instanceof MJPostDecrementStmt) return visitStatement((MJPostDecrementStmt)e, arg);
			if (e instanceof MJPreDecrementStmt) return visitStatement((MJPreDecrementStmt)e, arg);
			if (e instanceof MJVariableStmt) return visitStatement((MJVariableStmt)e, arg);
			if (e instanceof MJNoStatement) return visitStatement((MJNoStatement)e, arg);
			throw new VisitorException("unknown statement class "+e.getClass().getName());
		}
		
		public abstract T visitStatement(MJBlock e, T arg) throws VisitorException;
		public abstract T visitStatement(MJTryBlock e, T arg) throws VisitorException;
		public abstract T visitStatement(MJIf e, T arg) throws VisitorException;
		public abstract T visitStatement(MJIfElse e, T arg) throws VisitorException;
		public abstract T visitStatement(MJWhile e, T arg) throws VisitorException;
		public abstract T visitStatement(MJAssign e, T arg) throws VisitorException;
		public abstract T visitStatement(MJPrint e, T arg) throws VisitorException;
		public abstract T visitStatement(MJPrintln e, T arg) throws VisitorException;
		public abstract T visitStatement(MJMethodCallStmt e, T arg) throws VisitorException;
		public abstract T visitStatement(MJConstructorCallStmt e, T arg) throws VisitorException;
		public abstract T visitStatement(MJReturn e, T arg) throws VisitorException;
		public abstract T visitStatement(MJFor e, T arg) throws VisitorException;
		public abstract T visitStatement(MJThrow e, T arg) throws VisitorException;
		public abstract T visitStatement(MJPostIncrementStmt e, T arg) throws VisitorException;
		public abstract T visitStatement(MJPreIncrementStmt e, T arg) throws VisitorException;
		public abstract T visitStatement(MJPostDecrementStmt e, T arg) throws VisitorException;
		public abstract T visitStatement(MJPreDecrementStmt e, T arg) throws VisitorException;
		public abstract T visitStatement(MJVariableStmt e, T arg) throws VisitorException;

		public T visitExpression(MJExpression e, T arg) throws VisitorException {
			if (e instanceof MJAnd) return visitExpression((MJAnd)e, arg);
			if (e instanceof MJEqual) return visitExpression((MJEqual)e, arg);
			if (e instanceof MJGreater) return visitExpression((MJEqual)e, arg);
			if (e instanceof MJLess) return visitExpression((MJLess)e, arg);
			if (e instanceof MJPlus) return visitExpression((MJPlus)e, arg);
			if (e instanceof MJMinus) return visitExpression((MJMinus)e, arg);
			if (e instanceof MJMult) return visitExpression((MJMult)e, arg);
			if (e instanceof MJDivide) return visitExpression((MJDivide)e, arg);
			if (e instanceof MJModulo) return visitExpression((MJModulo)e, arg);
			if (e instanceof MJUnaryMinus) return visitExpression((MJUnaryMinus)e, arg);
			if (e instanceof MJNegate) return visitExpression((MJNegate)e, arg);
			if (e instanceof MJNew) return visitExpression((MJNew)e, arg);
			if (e instanceof MJNewArray) return visitExpression((MJNewArray)e, arg);
			if (e instanceof MJMethodCallExpr) return visitExpression((MJMethodCallExpr)e, arg);
			if (e instanceof MJParentheses) return visitExpression((MJParentheses)e, arg);
			if (e instanceof MJBoolean) return visitExpression((MJBoolean)e, arg);
			if (e instanceof MJInteger) return visitExpression((MJInteger)e, arg);
			if (e instanceof MJChar) return visitExpression((MJChar)e, arg);
			if (e instanceof MJDouble) return visitExpression((MJDouble)e, arg);
			if (e instanceof MJString) return visitExpression((MJString)e, arg);
			if (e instanceof MJPostIncrementExpr) return visitExpression((MJPostIncrementExpr)e, arg);
			if (e instanceof MJPreIncrementExpr) return visitExpression((MJPostIncrementExpr)e, arg);
			if (e instanceof MJPostDecrementExpr) return visitExpression((MJPostDecrementExpr)e, arg);
			if (e instanceof MJPreDecrementExpr) return visitExpression((MJPostDecrementExpr)e, arg);		
			if (e instanceof MJTernary) return visitExpression((MJTernary)e, arg);
			if (e instanceof MJSqrt) return visitExpression((MJSqrt)e, arg);
			if (e instanceof MJTypeCast) return visitExpression((MJTypeCast)e, arg);
			if (e instanceof MJLinq) return visitExpression((MJLinq)e, arg);
			if (e instanceof MJArray) return visitExpression((MJArray)e, arg);
			if (e instanceof MJSelector) return visitExpression((MJSelector)e, arg);
			if (e instanceof MJIdentifier) return visitExpression((MJIdentifier)e, arg);
			if (e instanceof MJNoExpression) return visitExpression((MJNoExpression)e, arg);
			
			throw new VisitorException("unknown expression class "+e.getClass().getName());
		}
		public abstract T visitExpression(MJAnd e, T arg) throws VisitorException;
		public abstract T visitExpression(MJEqual e, T arg) throws VisitorException;
		public abstract T visitExpression(MJGreater e, T arg) throws VisitorException;
		public abstract T visitExpression(MJLess e, T arg) throws VisitorException;
		public abstract T visitExpression(MJPlus e, T arg) throws VisitorException;
		public abstract T visitExpression(MJMinus e, T arg) throws VisitorException;
		public abstract T visitExpression(MJMult e, T arg) throws VisitorException;
		public abstract T visitExpression(MJDivide e, T arg) throws VisitorException;
		public abstract T visitExpression(MJModulo e, T arg) throws VisitorException;
		public abstract T visitExpression(MJUnaryMinus e, T arg) throws VisitorException;
		public abstract T visitExpression(MJNegate e, T arg) throws VisitorException;
		public abstract T visitExpression(MJNew e, T arg) throws VisitorException;
		public abstract T visitExpression(MJNewArray e, T arg) throws VisitorException;
		public abstract T visitExpression(MJMethodCallExpr e, T arg) throws VisitorException;
		public abstract T visitExpression(MJParentheses e, T arg) throws VisitorException;
		public abstract T visitExpression(MJBoolean e, T arg) throws VisitorException;
		public abstract T visitExpression(MJInteger e, T arg) throws VisitorException;
		public abstract T visitExpression(MJChar e, T arg) throws VisitorException;
		public abstract T visitExpression(MJDouble e, T arg) throws VisitorException;
		public abstract T visitExpression(MJString e, T arg) throws VisitorException;
		public abstract T visitExpression(MJPostIncrementExpr e, T arg) throws VisitorException;
		public abstract T visitExpression(MJPreIncrementExpr e, T arg) throws VisitorException;
		public abstract T visitExpression(MJPostDecrementExpr e, T arg) throws VisitorException;
		public abstract T visitExpression(MJPreDecrementExpr e, T arg) throws VisitorException;
		public abstract T visitExpression(MJTernary e, T arg) throws VisitorException;
		public abstract T visitExpression(MJSqrt e, T arg) throws VisitorException;
		public abstract T visitExpression(MJTypeCast e, T arg) throws VisitorException;
		public abstract T visitExpression(MJLinq e, T arg) throws VisitorException;
		
		public abstract T visitExpression(MJIdentifier e, T arg) throws VisitorException;
		public abstract T visitExpression(MJArray e, T arg) throws VisitorException;
		public abstract T visitExpression(MJSelector e, T arg) throws VisitorException;
		
		public abstract T visitExpression(MJNoExpression e, T arg) throws VisitorException;
		public abstract T visitStatement(MJNoStatement e, T arg) throws VisitorException;
		
	}