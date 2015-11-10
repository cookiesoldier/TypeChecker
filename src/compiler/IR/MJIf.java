package compiler.IR;

public class MJIf extends MJStatement {

	private MJExpression condition;
	private MJBlock ifBlock;

	public MJIf() {}
	
	public MJExpression getCondition() {
		return condition;
	}

	public MJBlock getIfBlock() {
		return ifBlock;
	}

	public MJIf(MJExpression condition, MJBlock ifBlock) {
		this.condition = condition;
		this.ifBlock = ifBlock;
	}

	public void setCondition(MJExpression _condition) {
		this.condition = _condition;
	}

}
