package compiler.IR;

public class MJNew extends MJExpression {

	private String className;

	protected MJNew() {}
	
	public MJNew(String className) {
		this.className = className;
	}

	public String getClassName() {
		return this.className;
	}
}
