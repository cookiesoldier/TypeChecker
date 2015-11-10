package compiler.IR;

public class MJParentheses extends MJExpression {

	private MJExpression argument;

	public MJParentheses() {
		
	}
	
	public MJParentheses(MJExpression e) {
		this.argument = e;
	}

	public MJExpression getArgument() {
		return this.argument;
	}

	public void setArgument(MJExpression _argument) {
		this.argument = _argument;
		
	}

}
