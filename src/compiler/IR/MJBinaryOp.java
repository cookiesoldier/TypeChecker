package compiler.IR;

public abstract class MJBinaryOp extends MJExpression {

	protected MJExpression lhs;
	protected MJExpression rhs;

	public void setLeftOperand(MJExpression op) {
		this.lhs = op;
	}

	public void setRightOperand(MJExpression op) {
		this.rhs = op;
	}

	public MJBinaryOp() {
	};

	public MJBinaryOp(MJExpression lhs, MJExpression rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public MJExpression getLhs() { return this.lhs; }
	public MJExpression getRhs() { return this.rhs; }
	
	public void setLhs(MJExpression op) { this.lhs = op; }
	public void setRhs(MJExpression op) { this.rhs = op; }

}
