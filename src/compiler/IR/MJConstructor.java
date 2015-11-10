package compiler.IR;

import java.util.LinkedList;

public class MJConstructor extends MJMethod {

	public MJConstructor(String name, LinkedList<MJVariable> parList,
			MJBlock b, boolean isStatic, boolean isPublic, boolean isPrivate) {
		super(MJType.getVoidType(), name, parList, b, false, isPublic, isPrivate, new MJNoExpression());
	}

	public boolean isConstructor() { return true; }
}
