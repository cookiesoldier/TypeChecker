package compiler.IR;

import java.util.LinkedList;

public class MJTryBlock extends MJStatement {

	private MJVariable exceptionVariable;
	private MJBlock tryBlock;
	private MJBlock catchBlock;
	
	public MJTryBlock(MJBlock tryBlock, MJVariable exceptionVariable,
			MJBlock catchBlock) {
		this.exceptionVariable = exceptionVariable;
		this.tryBlock = tryBlock;
		this.catchBlock = catchBlock;
	}
	
	public MJVariable getExceptionVariable() {
		return exceptionVariable;
	}

	public MJBlock getTryBlock() {
		return tryBlock;
	}

	public MJBlock getCatchBlock() {
		return catchBlock;
	}

}
