package compiler.IR;

import java.util.LinkedList;

public class MJMethodCallExpr extends MJExpression {

	private boolean hasObject = false;
	private MJIdentifierClass object;
	private String methodName;
	private LinkedList<MJExpression> arguments;
	
	private MJMethod target;

	public MJMethodCallExpr(MJIdentifierClass object, String methodName,
			LinkedList<MJExpression> arguments) {
		if (object != null) {
			this.object = object;
			this.hasObject = true;
		}
		this.methodName = methodName;
		this.arguments = arguments;
	}

	public boolean hasObject() {
		return this.hasObject;
	}
	
	public MJIdentifierClass getObject() { return this.object; }
	public void setObject(MJIdentifierClass id) {
		this.object = id;
	}

	public String getMethodName() {
		return this.methodName;
	}

	public LinkedList<MJExpression> getArguments() { return this.arguments; }

	public void setArguments(LinkedList<MJExpression> _arguments) {
		this.arguments = _arguments;
		
	}
	
	public MJMethod getTarget() {
		return this.target;
	}

	public void setTarget(MJMethod method) {
		this.target = method;
	}
}
