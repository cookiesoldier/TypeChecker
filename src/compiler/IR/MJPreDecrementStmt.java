package compiler.IR;

public class MJPreDecrementStmt extends MJStatement {

	private MJExpression argument;

	public MJPreDecrementStmt(MJExpression e) {
		this.argument = e;
	}

	public MJExpression getArgument() {
		return this.argument;
	}

	public void setArgument(MJExpression _argument) {
		this.argument = _argument;
		
	}

}
