package compiler.IR;

public class MJPostIncrementExpr extends MJExpression {

	private MJExpression argument;

	public MJPostIncrementExpr(MJExpression e) {
		this.argument = e;
	}

	public MJExpression getArgument() {
		return this.argument;
	}

	public void setArgument(MJExpression _argument) {
		this.argument = _argument;
		
	}

}
