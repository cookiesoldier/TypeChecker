package compiler.IR;

import java.util.LinkedList;

public class MJTypeDef extends IR {

	private String name;
	private LinkedList<MJVariable> fieldList = new LinkedList<MJVariable>();
	
	public MJTypeDef(String name, LinkedList<MJVariable> vdl) {
		this.name = name;
		this.fieldList = vdl;
	}

	public String getName() {
		return name;
	}

	public LinkedList<MJVariable> getFieldList() {
		return fieldList;
	}

}
