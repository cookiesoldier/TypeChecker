package compiler.IR;

public class MJAssign extends MJStatement {

	private MJExpression rhs;
	private MJIdentifierClass lhs;

	public MJAssign() {}
	
	public MJAssign(MJIdentifierClass lhs, MJExpression rhs) {
		this.rhs = rhs;
		this.lhs = lhs;
	}

	public MJIdentifierClass getLhs() {
		return this.lhs;
	}

	public MJExpression getRhs() {
		return this.rhs;
	}

	public void setLhs(MJIdentifierClass op) { this.lhs = op; }
	public void setRhs(MJExpression op) { this.rhs = op; }

}
