package compiler.IR;

public class MJIdentifier extends MJIdentifierClass {

	private MJVariable declaration;

	public MJIdentifier() {
	}

	public MJIdentifier(String name) {
		this.name = name;
	}

	public MJVariable getDeclaration() { return this.declaration; }
	public void setDeclaration(MJVariable decl) {
		this.declaration = decl;
	}

}
