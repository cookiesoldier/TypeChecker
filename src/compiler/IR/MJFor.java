package compiler.IR;

public class MJFor extends MJStatement {

	private MJStatement  init;
	private MJExpression condition;
	private MJStatement  increment;
	private MJStatement  block;

	public MJFor(MJExpression condition, MJBlock block) {
	}

	public MJFor(MJStatement init, MJExpression condition,
			MJStatement increment, MJStatement block) {
		this.init = init;
		this.condition = condition;
		this.increment = increment;
		this.block = block;
	}

	public MJStatement getInit() {
		return init;
	}

	public MJStatement getIncrement() {
		return increment;
	}

	public MJExpression getCondition() {
		return this.condition;
	}

	public void setCondition(MJExpression condition) {
		this.condition = condition;
	}

	public MJStatement getBlock() {
		return block;
	}

}
