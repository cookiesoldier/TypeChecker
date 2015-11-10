package compiler.IR;

public class MJPreIncrementStmt extends MJStatement {

	private MJExpression argument;

	public MJPreIncrementStmt(MJExpression e) {
		this.argument = e;
	}

	public MJExpression getArgument() {
		return this.argument;
	}

	public void setArgument(MJExpression _argument) {
		this.argument = _argument;
		
	}

}
