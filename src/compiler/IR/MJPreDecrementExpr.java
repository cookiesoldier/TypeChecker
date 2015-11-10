package compiler.IR;

public class MJPreDecrementExpr extends MJExpression {

	private MJExpression argument;

	public MJPreDecrementExpr(MJExpression e) {
		this.argument = e;
	}

	public MJExpression getArgument() {
		return this.argument;
	}

	public void setArgument(MJExpression _argument) {
		this.argument = _argument;
		
	}

}
