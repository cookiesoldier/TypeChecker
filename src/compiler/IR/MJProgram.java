package compiler.IR;

import java.util.LinkedList;

public class MJProgram extends IR {

	private LinkedList<MJClass> classes;
	private LinkedList<MJTypeDef> typedefs;

	public MJProgram() {
		
	}
	
	public MJProgram(LinkedList<MJClass> cdl, LinkedList<MJTypeDef> tdl) {
		this.classes = cdl;
		this.typedefs = tdl;
	}

	public LinkedList<MJTypeDef> getTypedefs() {
		return typedefs;
	}

	public LinkedList<MJClass> getClasses() {
		return classes;
	}

}
