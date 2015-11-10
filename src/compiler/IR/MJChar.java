package compiler.IR;

public class MJChar extends MJExpression {

	private char value;

	public MJChar(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

}
