package compiler.IR;

public class MJTypeCast extends MJExpression {

	private MJType type;
	private MJExpression argument;

	public MJTypeCast(MJType t, MJExpression e) {
		this.type = t;
		this.argument = e;
	}

	public MJType getType() {
		return type;
	}

	public MJExpression getArgument() {
		return argument;
	}

	public void setArgument(MJExpression argument) {
		this.argument = argument;
	}


}
