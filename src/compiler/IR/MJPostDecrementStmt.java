package compiler.IR;

public class MJPostDecrementStmt extends MJStatement {

	private MJExpression argument;

	public MJPostDecrementStmt(MJExpression e) {
		this.argument = e;
	}

	public MJExpression getArgument() {
		return this.argument;
	}

	public void setArgument(MJExpression _argument) {
		this.argument = _argument;
		
	}

}
