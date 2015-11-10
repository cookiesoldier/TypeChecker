package compiler.Phases;

import compiler.IR.*;
import compiler.IR.support.IRElementVisitor;
import compiler.Exceptions.VisitorException;

import java.io.PrintStream;


public class PrettyPrint extends IRElementVisitor<Integer> {

	public class PrettyPrinter {

		private PrintStream ps;
		private int indent=0;
		private int width=2;
		private boolean isindented = false;
		
		public PrettyPrinter() {
			this.ps = System.out;
		}
		
		public PrettyPrinter(PrintStream ps) {
			this.ps = ps;
		}
		
		public void in() {
			indent+=width;
		}
		
		public void out() {
			indent-=width;
			if (indent<0) {
				indent=0;
			}
		}
		
		private void indent() {
			if (isindented) return;
			for (int i=0;i<this.indent;i++) ps.print(' ');
			isindented=true;
		}
		
		public void println(String s) {
			this.indent();
			ps.println(s);
			isindented=false;
		}

		public void print(String s) {
			this.indent();
			ps.print(s);
		}
	}

	private PrettyPrinter pp = new PrettyPrinter();
	
	
	public Integer visitProgram(MJProgram e) throws VisitorException {
		
		for (MJClass c : e.getClasses()) {
			visitClass(c);
		}
		
		for (MJTypeDef c : e.getTypedefs()) {
			visitTypeDef(c);
		}
		
		return null;
	}

	
	public Integer visitClass(MJClass e) throws VisitorException {
		
		pp.print("class ");
		pp.print(e.getName());
		pp.println(" {");
		pp.in();
		for (MJAttribute attribute : e.getFieldList()) {
			visitAttribute(attribute);
			if (!(attribute.getInitializer() instanceof MJNoExpression)) {
				pp.print(" = ");
				visitExpression(attribute.getInitializer());
			}
			pp.println(";");
		}
		for (MJConstructor constructor : e.getConstructorList()) {
			visitConstructor(constructor);
		}
		for (MJMethod method : e.getMethodList()) {
			visitMethod(method);
		}
		pp.out();
		pp.println("}");

		return null;
	}

	public Integer visitTypeDef(MJTypeDef e) throws VisitorException {

		pp.print("typedef struct ");
		pp.println(" {");
		pp.in();
		for (MJVariable attribute : e.getFieldList()) {
			visitVariable(attribute);
			if (!(attribute.getInitializer() instanceof MJNoExpression)) {
				pp.print(" = ");
				visitExpression(attribute.getInitializer());
			}

			pp.println(";");
		}
		pp.out();
		pp.print("} ");
		pp.println(e.getName()+";");
		return null;
	}
	
	public Integer visitVariable(MJVariable e) throws VisitorException {
		visitType(e.getType());
		pp.print(" ");
		pp.print(e.getName());

		return null;
	}

	public Integer visitAttribute(MJAttribute e) throws VisitorException {
		if (e.isPrivate()) { pp.print("private "); }
		if (e.isPublic()) { pp.print("public "); }
		if (e.isStatic()) { pp.print("static "); }
		visitVariable(e);
		if (!(e.getInitializer() instanceof MJNoExpression)) {
			pp.print(" = ");
			visitExpression(e.getInitializer());
		}
		return null;
	}

	public Integer visitType(MJType e) throws VisitorException {
		pp.print(e.toString());
		return null;
	}

	
	public Integer visitMethod(MJMethod e) throws VisitorException {
		
		if (e.isPrivate()) { pp.print("private "); }
		if (e.isPublic()) { pp.print("public "); }
		if (e.isStatic()) { pp.print("static "); }
		visitType(e.getReturnType());
		pp.print(" ");
		pp.print(e.getName());
		pp.print("(");
		boolean first = true;
		for (MJVariable parameter : e.getParameters()) {
			if (!first) {
				pp.print(", ");
			} else {
				first = false;
			}
			visitVariable(parameter);
		}
		pp.print(") ");
		visitStatement(e.getBody());
		return null;
	}

	public Integer visitConstructor(MJConstructor e) throws VisitorException {
		if (e.isPrivate()) { pp.print("private "); }
		if (e.isPublic()) { pp.print("public "); }
		if (e.isStatic()) { pp.print("static "); }

		pp.print(" ");
		pp.print(e.getName());
		pp.print("(");
		boolean first = true;
		for (MJVariable parameter : e.getParameters()) {
			if (!first) {
				pp.print(", ");
			} else {
				first = false;
			}
			visitVariable(parameter);
		}
		pp.print(") ");
		visitStatement(e.getBody());
		return null;
	}

	public Integer visitStatement(MJBlock e) throws VisitorException {
		pp.println("{");
		pp.in();
		for (MJVariable variable : e.getVariables()) {
			visitVariable(variable);
			if (!(variable.getInitializer() instanceof MJNoExpression)) {
				pp.print(" = ");
				visitExpression(variable.getInitializer());
			}
			pp.println(";");
		}
		for (MJStatement statement : e.getStatements()) {
			visitStatement(statement);
		}
		pp.out();
		pp.println("}");
		return null;
	}

	public Integer visitStatement(MJTryBlock e) throws VisitorException {
		pp.print("try ");
		visitStatement(e.getTryBlock());
		pp.print("catch (");
		visitVariable(e.getExceptionVariable());
		pp.print(")");
		visitStatement(e.getCatchBlock());
		return null;
	}
	
	public Integer visitStatement(MJIf e) throws VisitorException {
		pp.print("if");
		pp.print(" (");
		visitExpression(e.getCondition());
		pp.print(" ) ");
		visitStatement(e.getIfBlock());
		return null;
	}

	
	public Integer visitStatement(MJIfElse e) throws VisitorException {
		visitStatement((MJIf)e);
		pp.print(" else ");
		visitStatement(e.getElseBlock());
		pp.println("");
		return null;
	}

	
	public Integer visitStatement(MJWhile e) throws VisitorException {
		pp.print("while");
		pp.print(" (");
		visitExpression(e.getCondition());
		pp.print(" ) ");
		visitStatement(e.getBlock());
		return null;
	}

	
	public Integer visitStatement(MJAssign e) throws VisitorException {
		visitExpression(e.getLhs());
		pp.print(" = ");
		visitExpression(e.getRhs());
		pp.println(";");
		return null;
	}

	
	public Integer visitStatement(MJPrint e) throws VisitorException {
		pp.print("System.out.print(");
		visitExpression(e.getParameter());
		pp.print(")");
		pp.println(";");
		return null;
	}

	
	public Integer visitStatement(MJPrintln e) throws VisitorException {
		pp.print("System.out.println(");
		visitExpression(e.getParameter());
		pp.print(")");
		pp.println(";");
		return null;
	}

	
	public Integer visitStatement(MJMethodCallStmt e) throws VisitorException {
		visitExpression(e.getMethodCallExpr());
		pp.println(";");
		return null;
	}

	
	public Integer visitStatement(MJReturn e) throws VisitorException {
		pp.print("return");
		visitExpression(e.getArgument());
		pp.println(";");
		return null;
	}

	public Integer visitStatement(MJConstructorCallStmt e)
			throws VisitorException {

		visitExpression(e.getMethodCallExpr());
		return null;
	}
	
	public Integer visitStatement(MJFor e) throws VisitorException {
		pp.print("for");
		pp.print("( ");
		visitStatement(e.getInit());
		pp.print(" ; ");
		visitExpression(e.getCondition());
		pp.print(" ; ");
		visitStatement(e.getIncrement());
		pp.print(" ) ");
		visitStatement(e.getBlock());
		return null;
	}

	public Integer visitStatement(MJThrow e) throws VisitorException {
		pp.print("throw(");
		visitExpression(e.getArgument());
		pp.println(");");
		return null;
	}

	
	public Integer visitStatement(MJPostIncrementStmt e)
			throws VisitorException {
		visitExpression(e.getArgument());
		pp.println(";");
		return null;
	}

	
	public Integer visitStatement(MJPreIncrementStmt e) throws VisitorException {
		visitExpression(e.getArgument());
		pp.println(";");
		return null;
	}

	
	public Integer visitStatement(MJPostDecrementStmt e)
			throws VisitorException {
		visitExpression(e.getArgument());
		pp.println(";");
		return null;
	}

	
	public Integer visitStatement(MJPreDecrementStmt e) throws VisitorException {
		visitExpression(e.getArgument());
		pp.println(";");
		return null;
	}

	public Integer visitStatement(MJVariableStmt e) throws VisitorException {
		visitVariable(e.getDeclaration());
		MJVariable attribute = e.getDeclaration();
		if (!(attribute.getInitializer() instanceof MJNoExpression)) {
			pp.print(" = ");
			visitExpression(attribute.getInitializer());
		}
		pp.println(";");
		return null;		
	}
	
	public Integer visitStatement(MJNoStatement e) throws VisitorException {
		return null;
	}
	
	public Integer visitExpression(MJAnd e) throws VisitorException {
		visitExpression(e.getLhs());
		pp.print(" && ");
		visitExpression(e.getRhs());
		return null;
	}

	
	public Integer visitExpression(MJEqual e) throws VisitorException {
		visitExpression(e.getLhs());
		pp.print(" == ");
		visitExpression(e.getRhs());
		return null;
	}

	
	public Integer visitExpression(MJLess e) throws VisitorException {
		visitExpression(e.getLhs());
		pp.print(" < ");
		visitExpression(e.getRhs());
		return null;
	}

	public Integer visitExpression(MJGreater e) throws VisitorException {
		visitExpression(e.getLhs());
		pp.print(" > ");
		visitExpression(e.getRhs());
		return null;
	}
	
	
	public Integer visitExpression(MJPlus e) throws VisitorException {
		visitExpression(e.getLhs());
		pp.print(" + ");
		visitExpression(e.getRhs());
		return null;
	}

	
	public Integer visitExpression(MJMinus e) throws VisitorException {
		visitExpression(e.getLhs());
		pp.print(" - ");
		visitExpression(e.getRhs());
		return null;
	}
	
	public Integer visitExpression(MJMult e) throws VisitorException {
		visitExpression(e.getLhs());
		pp.print(" * ");
		visitExpression(e.getRhs());
		return null;
	}

	public Integer visitExpression(MJDivide e) throws VisitorException {
		visitExpression(e.getLhs());
		pp.print(" / ");
		visitExpression(e.getRhs());
		return null;
	}
	
	public Integer visitExpression(MJModulo e) throws VisitorException {
		visitExpression(e.getLhs());
		pp.print(" % ");
		visitExpression(e.getRhs());
		return null;
	}

	public Integer visitExpression(MJUnaryMinus e) throws VisitorException {
		pp.print("-");
		visitExpression(e.getArgument());
		return null;
	}

	public Integer visitExpression(MJNegate e) throws VisitorException {
		pp.print("!");
		visitExpression(e.getArgument());
		return null;
	}
	
	public Integer visitExpression(MJNew e) throws VisitorException {
		pp.print("new ");
		pp.print(e.getClassName());
		pp.print("()");
		return null;
	}
	
	public Integer visitExpression(MJNewArray e) throws VisitorException {
		pp.print("new ");
		pp.print("int");
		pp.print("[");
		visitExpression(e.getSize());
		pp.print("]");
		return null;
	}
	
	public Integer visitExpression(MJMethodCallExpr e) throws VisitorException {
		if (e.hasObject()) {
			visitExpression((MJExpression)e.getObject());
			pp.print(".");
		}
		pp.print(e.getMethodName());
		pp.print("(");
		boolean first = true;
		for (MJExpression argument : e.getArguments()) {
			if (!first) {
				pp.print(", ");
			} else {
				first = false;
			}
			visitExpression(argument);
		}
		pp.print(")");
		return null;
	}
	
	public Integer visitExpression(MJParentheses e) throws VisitorException {
		pp.print("(");
		visitExpression(e.getArgument());
		pp.print(")");
		return null;
	}
	
	public Integer visitExpression(MJBoolean e) throws VisitorException {
		if (e.isTrue()) {
			pp.print("true");
		} else {
			pp.print("false");
		}
		return null;
	}
	
	public Integer visitExpression(MJInteger e) throws VisitorException {
		pp.print(Integer.toString(e.getValue()));
		return null;
	}
	
	public Integer visitExpression(MJChar e) throws VisitorException {
		pp.print("'"+e.getValue()+"'");
		return null;
	}

	public Integer visitExpression(MJDouble e) throws VisitorException {
		pp.print(Double.toString(e.getValue()));
		return null;
	}

	public Integer visitExpression(MJString e) throws VisitorException {
		pp.print(e.getValue());
		return null;
	}
	
	public Integer visitExpression(MJIdentifier e) throws VisitorException {
		pp.print(e.getName());
		return null;
	}
	
	public Integer visitExpression(MJArray e) throws VisitorException {
		visitExpression(e.getArray());
		pp.print("[");
		visitExpression(e.getIndex());
		pp.print("]");
		return null;
	}
	
	public Integer visitExpression(MJSelector e) throws VisitorException {
		visitExpression(e.getObject());
		pp.print(".");
		visitExpression(e.getField());
		return null;
	}

	public Integer visitExpression(MJNoExpression e) throws VisitorException {
		return null;
	}
	
	
	public Integer visitExpression(MJPostIncrementExpr e)
			throws VisitorException {
		visitExpression(e.getArgument());
		pp.print("++");
		return null;
	}

	
	public Integer visitExpression(MJPreIncrementExpr e)
			throws VisitorException {
		pp.print("++");
		visitExpression(e.getArgument());
		return null;
	}

	
	public Integer visitExpression(MJPostDecrementExpr e)
			throws VisitorException {
		visitExpression(e.getArgument());
		pp.print("--");
		return null;
	}

	
	public Integer visitExpression(MJPreDecrementExpr e)
			throws VisitorException {
		pp.print("--");
		visitExpression(e.getArgument());
		return null;
	}

	
	public Integer visitExpression(MJTernary e) throws VisitorException {
		pp.print("(");
		visitExpression(e.getCondition());
		pp.print(" ? ");
		visitExpression(e.getTrueExpr());
		pp.print(" : ");
		visitExpression(e.getFalseExpr());
		return null;
	}

	
	public Integer visitExpression(MJSqrt e) throws VisitorException {
		pp.print("Math.Sqrt( ");
		visitExpression(e.getParameter());
		pp.print(")");
		return null;
	}

	
	public Integer visitExpression(MJTypeCast e) throws VisitorException {
		pp.print("(");
		visitType(e.getType());
		pp.print(")");
		visitExpression(e.getArgument());
		return null;
	}

	
	public Integer visitExpression(MJLinq e) throws VisitorException {
		pp.print("from ");
		visitExpression(e.getFromIdent());
		pp.print(" in ");
		visitExpression(e.getInExpression());
		pp.print(" where ");
		visitExpression(e.getWhereExpression());
		pp.print(" select ");
		visitExpression(e.getSelectExpression());
		return null;
	}

	
	public Integer visitExpression(MJNoStatement e) throws VisitorException {
		return null;
	}

}
