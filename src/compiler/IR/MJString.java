package compiler.IR;

public class MJString extends MJExpression {

	private String value;

	public MJString(String string) {
		this.value = string;
	}

	public String getValue() {
		return this.value;
	}
}
