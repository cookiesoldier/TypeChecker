package compiler.IR;

public class MJSqrt extends MJExpression {

	private MJExpression parameter;

	public MJSqrt(MJExpression parameter) {
		this.parameter = parameter;
	}

	public MJExpression getParameter() {
		return parameter;
	}

	public void setParameter(MJExpression _parameter) {
		this.parameter = _parameter;
		
	}

}
