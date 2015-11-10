package compiler.IR;

public class MJThrow extends MJStatement {

	private MJExpression argument;

	public MJThrow(MJExpression e) {
		this.argument = e;
	}

	public MJExpression getArgument() {
		return this.argument;
	}

	public void setArgument(MJExpression _argument) {
		this.argument = _argument;
		
	}

}
