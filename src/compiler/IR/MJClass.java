package compiler.IR;

import java.util.LinkedList;

public class MJClass extends IR {

	private String name;
	private MJType superClass;
	private LinkedList<MJClass> innerClassList = new LinkedList<MJClass>();
	private LinkedList<MJMethod> methodList = new LinkedList<MJMethod>();
	private LinkedList<MJConstructor> constructorList = new LinkedList<MJConstructor>();
	private LinkedList<MJAttribute> fieldList = new LinkedList<MJAttribute>();
	private boolean isTop = false;

	public MJClass() {}
	
	// this we have just for the main class

	public MJClass(String name, MJMethod md) {
		this.name = name;
		LinkedList<MJMethod> methodList = new LinkedList<MJMethod>();
		methodList.addFirst(md);
		this.methodList = methodList;
		this.superClass = MJType.getClassType("Object");
	}

	// and this is for the general case

	public MJClass(String name, String superClassName,
			LinkedList<MJClass> icdl, 
			LinkedList<MJAttribute> vdl, 
			LinkedList<MJMethod> mdl, 
			LinkedList<MJConstructor> cdl) {
		this.name = name;
		this.innerClassList = icdl;
		this.fieldList = vdl;
		this.methodList = mdl;
		this.constructorList = cdl;
		this.superClass = MJType.getClassType(superClassName);
	}

	public MJClass(String name, LinkedList<MJAttribute> vdl, LinkedList<MJMethod> mdl, 
			LinkedList<MJConstructor> cdl) {
		this.name = name;
		this.fieldList = vdl;
		this.methodList = mdl;
		this.constructorList = cdl;
		this.isTop = true;
	}

	public LinkedList<MJMethod> getMethodList() {
		return methodList;
	}

	public LinkedList<MJConstructor> getConstructorList() {
		return constructorList;
	}

	public String getName() {
		return name;
	}

	public LinkedList<MJClass> getInnerClassList() {
		return innerClassList;
	}

	public LinkedList<MJAttribute> getFieldList() {
		return fieldList;
	}

	public void setSuperClass(MJType superClass) {
		this.superClass = superClass;
	}

	public MJType getSuperClass() {
		return superClass;
	}

	public boolean isTop() {
		return this.isTop;
	}

	public void setAsTop() {
		this.isTop = true;
		
	}
}
