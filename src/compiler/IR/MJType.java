package compiler.IR;

public final class MJType extends IR {

	public enum TypeEnum {
		INT, BOOLEAN, VOID, CLASS, ARRAY, UNTYPED, CHAR, DOUBLE
	};

	private TypeEnum type;
	private String name;
	private MJType baseType;
	private MJClass decl;
	
	private MJType() {	
	}
	
	private MJType(TypeEnum type) {
		this.type = type;
		this.name = type.toString();
	}

	private MJType(TypeEnum type, String tname) {
		this.type = type;
		this.name = tname;
	}

	private MJType(String name) {
		this(TypeEnum.CLASS);
		this.name = name;
	}

	private MJType(MJClass c) {
		this(TypeEnum.CLASS);
		this.name = c.getName();
		this.decl = c;
	}

	private MJType(MJType t) {
		this(TypeEnum.ARRAY);
		this.name = t.getName() + "[]";
		this.baseType = t;
	}

	// create some static object to be used for standard types

	private static MJType Tint = new MJType(TypeEnum.INT, "int");
	private static MJType Tdouble = new MJType(TypeEnum.DOUBLE, "double");
	private static MJType Tchar = new MJType(TypeEnum.CHAR, "char");
	private static MJType Tboolean = new MJType(TypeEnum.BOOLEAN, "boolean");
	private static MJType Tvoid = new MJType(TypeEnum.VOID, "void");
	private static MJType Tuntyped = new MJType(TypeEnum.UNTYPED, "var");
	
	public static MJType getClassType(String name) { return new MJType(name); }
	public static MJType getArrayType(MJType t) { return new MJType(t); }
	public static MJType getArrayType(String name) { return new MJType(new MJType(name)); }
	public static MJType getIntType() { return MJType.Tint; }
	public static MJType getDoubleType() { return MJType.Tdouble; }
	public static MJType getCharType() { return MJType.Tchar; }
	public static MJType getBooleanType() { return MJType.Tboolean; }
	public static MJType getVoidType() { return MJType.Tvoid; }	
	public static MJType getUntypedType() { return MJType.Tuntyped; }
	
	// check whether two types are the same

	public boolean isSame(MJType t) {

		if (t.getType() == this.getType()) {
			if (t.getType() == TypeEnum.CLASS) {
				if (t.getName().equals(this.getName())) {
					return true;
				}
				return false;
			}
			if (t.getType() == TypeEnum.ARRAY) {
				if (this.getBaseType().isSame(t.getBaseType())) {
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
	
	// convert type to string

	public String toString() {
		return name;
	}

	// check for a certain type

	public boolean isInt() {
		return (this.type == TypeEnum.INT);
	}

	public boolean isDouble() {
		return (this.type == TypeEnum.DOUBLE);
	}

	public boolean isChar() {
		return (this.type == TypeEnum.CHAR);
	}

	public boolean isBoolean() {
		return (this.type == TypeEnum.BOOLEAN);
	}

	public boolean isVoid() {
		return (this.type == TypeEnum.VOID);
	}

	public boolean isClass() {
		return (this.type == TypeEnum.CLASS || this.type == TypeEnum.ARRAY);
	}

	public boolean isArray() {
		return (this.type == TypeEnum.ARRAY);
	}

	// local getter functions

	public TypeEnum getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public MJType getBaseType() {
		return baseType;
	}

	public MJClass getDecl() {
		return decl;
	}

	public void setDecl(MJClass declaration) {
		this.decl = declaration;
		
	}

}
