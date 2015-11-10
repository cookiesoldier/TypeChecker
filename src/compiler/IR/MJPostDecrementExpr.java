package compiler.IR;

public class MJPostDecrementExpr extends MJExpression {

	private MJExpression argument;

	public MJPostDecrementExpr(MJExpression e) {
		this.argument = e;
	}

	public MJExpression getArgument() {
		return this.argument;
	}

	public void setArgument(MJExpression _argument) {
		this.argument = _argument;
		
	}

}
