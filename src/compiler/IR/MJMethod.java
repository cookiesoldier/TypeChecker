package compiler.IR;

import java.util.LinkedList;

public class MJMethod extends IR {

	private MJType returnType;
	private String name;
	private LinkedList<MJVariable> parameters;
	private MJBlock body;
	private boolean isStatic;
	private boolean isPublic;
	private boolean isPrivate;
	private MJExpression exception;

	public boolean isConstructor() { return false; }

	public MJMethod(MJType returnType, String name, LinkedList<MJVariable> parList,
			MJBlock b, boolean isStatic, boolean isPublic, boolean isPrivate, MJExpression exception) {
		this.returnType = returnType;
		this.name = name;
		this.parameters = parList;
		this.body = b;
		this.isStatic = isStatic;
		this.isPublic = isPublic;
		this.isPrivate = isPrivate;
		this.exception = exception;
	}

	public String getName() {
		return name;
	}

	public LinkedList<MJVariable> getParameters() {
		return parameters;
	}

	public MJType getReturnType() {
		return returnType;
	}

	public MJBlock getBody() {
		return body;
	}

	public boolean isStatic() {
		return this.isStatic;
	}

	public boolean isPublic() {
		return this.isPublic;
	}

	public boolean isPrivate() {
		return this.isPrivate;
	}
}
