package compiler.IR;

public class MJPreIncrementExpr extends MJExpression {

	private MJExpression argument;

	public MJPreIncrementExpr(MJExpression e) {
		this.argument = e;
	}

	public MJExpression getArgument() {
		return this.argument;
	}

	public void setArgument(MJExpression _argument) {
		this.argument = _argument;
		
	}

}
