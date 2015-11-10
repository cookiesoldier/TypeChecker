package compiler.IR;

public abstract class MJExpression extends IR {

	protected MJExpression() {}
	
	private MJType type;

	public MJType getType() { return this.type; }
	public void setType(MJType t) { this.type = t; }
	
}
