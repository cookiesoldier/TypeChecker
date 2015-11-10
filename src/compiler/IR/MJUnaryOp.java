package compiler.IR;

public abstract class MJUnaryOp extends MJExpression {

	protected MJExpression argument;

	public MJUnaryOp() {
		
	}
	
	public MJUnaryOp(MJExpression l) {
		this.argument = l;
	}
	
	public MJExpression getArgument() { return this.argument; }
	
	public void setArgument(MJExpression _argument) {
		this.argument = _argument;
		
	}

}
