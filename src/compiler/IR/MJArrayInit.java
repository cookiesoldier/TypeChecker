package compiler.IR;

import java.util.LinkedList;

public class MJArrayInit extends MJExpression {

	private LinkedList<MJExpression> arguments;
	
	public MJArrayInit(LinkedList<MJExpression> arguments) {
		this.arguments = arguments;
	}

	public LinkedList<MJExpression> getArguments() { return this.arguments; }

	public void setArguments(LinkedList<MJExpression> _arguments) {
		this.arguments = _arguments;
		
	}
	
}
