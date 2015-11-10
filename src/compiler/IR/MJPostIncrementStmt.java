package compiler.IR;

public class MJPostIncrementStmt extends MJStatement {

	private MJExpression argument;

	public MJPostIncrementStmt(MJExpression e) {
		this.argument = e;
	}

	public MJExpression getArgument() {
		return this.argument;
	}

	public void setArgument(MJExpression _argument) {
		this.argument = _argument;
		
	}

}
