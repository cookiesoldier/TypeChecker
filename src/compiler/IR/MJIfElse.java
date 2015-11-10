package compiler.IR;

public class MJIfElse extends MJIf {

	private MJBlock elseBlock;

	public MJIfElse(MJExpression condition, MJBlock ifBlock, MJBlock elseBlock) {
		super(condition, ifBlock);
		this.elseBlock = elseBlock;
	}

	public MJBlock getElseBlock() {
		return this.elseBlock;
	}

}
