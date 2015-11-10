package compiler.IR;

public class MJAttribute extends MJVariable {

	private boolean isPublic;
	private boolean isPrivate;
	private boolean isStatic;

	public MJAttribute(MJVariable var, boolean isPublic, boolean isPrivate, boolean isStatic) {
		super(var.getType(), var.getName());
		this.isPublic=isPublic;
		this.isPrivate=isPrivate;
		this.isStatic=isStatic;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public boolean isStatic() {
		return isStatic;
	}

}
