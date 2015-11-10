package compiler.IR;

public class MJPrint extends MJStatement {

	private MJExpression parameter;

	public MJPrint() {
		
	}
	
	public MJPrint(MJExpression parameter) {
		this.parameter = parameter;
	}

	public MJExpression getParameter() {
		return parameter;
	}

	public void setParameter(MJExpression _parameter) {
		this.parameter = _parameter;
		
	}

}
