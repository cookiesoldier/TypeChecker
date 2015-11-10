package compiler.IR;

public class MJVariableStmt extends MJStatement {
	
	private MJVariable declaration;

	public MJVariableStmt(MJVariable declaration) {

			this.declaration = declaration;
	}

	public MJVariable getDeclaration() {
		return declaration;
	}

}
