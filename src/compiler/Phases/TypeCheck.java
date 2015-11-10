package compiler.Phases;

import compiler.IR.*;
import compiler.IR.support.IRElementVisitor;
import compiler.Exceptions.ClassAlreadyDeclared;
import compiler.Exceptions.ClassErrorField;
import compiler.Exceptions.ClassErrorMethod;
import compiler.Exceptions.ClassNotFound;
import compiler.Exceptions.InheritanceError;
import compiler.Exceptions.MethodNotFound;
import compiler.Exceptions.TypeCheckerException;
import compiler.Exceptions.VariableAlreadyDeclared;
import compiler.Exceptions.VariableNotFound;
import compiler.Exceptions.VisitorException;

import java.util.LinkedList;


public class TypeCheck extends IRElementVisitor<MJType> {

	public static void check(IR ir) throws TypeCheckerException {
	
		try {
			new TypeCheck().visitProgram(ir.getProgram());
		} catch (VisitorException e) {
			throw new TypeCheckerException(e.getMessage());
		}
		
	}
	
	// check whether one type can be assigned to the other

	public static boolean isAssignable(MJType src, MJType dest) throws TypeCheckerException {
		
		// if they have the same type, this should be easy
		// isSame is true for same kind of type and class types with same name
			
		if (src.isSame(dest)) {			
			return true;
		}

		if (src.isClass()) {

			// may be dest is a super class of src...
			
			// but only if we are not yet at the root
			
			if (src.getDecl().isTop()) {
				return false;
			}
			
			return isAssignable(src.getDecl().getSuperClass(), dest);

		}
		
		// if they are array types
		
		if (src.isArray()) {
			if (dest.isClass() && dest.getName().equals("Object")){
				return true;
			}
			return isAssignable(src.getBaseType(), dest.getBaseType());
		}

		return false;
	}

	public MJType visitProgram(MJProgram e) throws VisitorException {
		// we need a super class in our class table - Object

		MJClass oc = new MJClass("Object", 
				new LinkedList<MJAttribute>(), 
				new LinkedList<MJMethod>(), 
				new LinkedList<MJConstructor>());
		oc.setAsTop();
		e.getClasses().addLast(oc);
		
		LinkedList<MJAttribute> varlist = new LinkedList<MJAttribute>();
		MJVariable length = new MJVariable(MJType.getIntType(), "length");
		MJVariable text = new MJVariable(MJType.getClassType("String"), "text");
		varlist.add(new MJAttribute(text, true, false, false));
		varlist.addLast(new MJAttribute(length, true, false, false));

		oc = new MJClass("String", "Object", 
				new LinkedList<MJClass>(), 
				varlist, 
				new LinkedList<MJMethod>(), 
				new LinkedList<MJConstructor>());
		
		e.getClasses().addLast(oc);

		// and add its methods - this is actually empty

		// now iterate over all classes in the program and add them to the
		// classtable

		for (MJClass c : e.getClasses()) {
			try {
				IR.classes.add(c);
			} catch (ClassAlreadyDeclared e1) {
				throw new TypeCheckerException("Class " + e1.getMessage()
						+ " already declared.");
			} catch (ClassErrorField e1) {
				throw new TypeCheckerException("Class " + c.getName()
						+ " has two fields with name " + e1.getMessage());
			}
		}

		// and add all methods as well

		for (MJClass c : e.getClasses()) {
			try {
				IR.classes.addMethods(c);
			} catch (ClassErrorMethod e1) {
				throw new TypeCheckerException("Class " + e1.getMessage() + " already declared.");
			} catch (ClassNotFound e1) {
				throw new TypeCheckerException("Class " + e1.getMessage() + " not found.");
			} catch (InheritanceError e1) {
				throw new TypeCheckerException("Class " + c.getName() + " overwrites a method.");
			}
		}

		// finally we can typecheck the individual classes
		
		MJClass mainClass = e.getClasses().getFirst();
		
		if (mainClass.getFieldList().size()>0) {
			throw new TypeCheckerException("Main class may not have fields");
		}
		
		if (mainClass.getMethodList().size()!=1) {
			throw new TypeCheckerException("Main class may only have one method.");
		}

		MJMethod method = mainClass.getMethodList().getFirst();
		
		if (!(method.isPublic() && method.isStatic()) ) {
			throw new TypeCheckerException("Main method must be public static.");
		}
		
		if (!method.getReturnType().isVoid()) {
			throw new TypeCheckerException("Main method must have return type void.");			
		}
		
		if (!method.getName().equals("main")) {
			throw new TypeCheckerException("Main method must have name 'main'.");
		}
		
		if (!(method.getParameters().size()==1)) {
			throw new TypeCheckerException("Main method must take one argument.");
		}
		
		MJVariable parameter = method.getParameters().getFirst();
		
		if (!(parameter.getType().isArray() && 
				parameter.getType().getBaseType().isClass() && 
				parameter.getType().getBaseType().getName().equals("String"))) {
			throw new TypeCheckerException("Main method argument must have type 'String[]'");
		}
		
		for (MJClass c : e.getClasses()) {
			visitClass(c);
		}

		return MJType.getVoidType();
	}

	public MJType visitClass(MJClass e) throws VisitorException {
		// remember the current class

		// typecheck super class
		
		if (!e.isTop()) {
			try {
				visitType(e.getSuperClass());
				visitClass(IR.classes.lookup(e.getSuperClass().getName()));
			} catch (ClassNotFound exc) {
				throw new TypeCheckerException("Class "+e.getSuperClass().getName()+" not found!");
			}
		}

		IR.currentClass = e;

		// check fields

		for (MJVariable f : e.getFieldList()) {
			f.setIsField();
			visitVariable(f);
		}

		// and check methods

		for (MJMethod m : e.getMethodList()) {

			visitMethod(m);
		}

		return MJType.getVoidType();	}

	public MJType visitVariable(MJVariable e) throws VisitorException {
		// we only need to typecheck the type of the variable
		// adding to the scope stack ensures that the name is unique
		//System.out.println(e.getInitializer());
		
		if(!(e.getInitializer() instanceof MJNoExpression)){
			
			//den skal besøges først før man kan checke hvilken type den har.
			//da den er en expression
			MJType initializerType = visitExpression(e.getInitializer());
			/*
			System.out.println("datatatatatat");
			System.out.println(e.getType());
			
			System.out.println(e.getInitializer().getType());
			*/
			
			if(e.getType() == initializerType){
				visitType(e.getType());
				
			}else{
				throw new TypeCheckerException("Variable "+e.getName()+" Doesnt match its initialization type.");
			}
			
		}else{
		visitType(e.getType());
		}
		
		return MJType.getVoidType();
	}

	public MJType visitType(MJType e) throws VisitorException {
		
		if (e.isBoolean()) return MJType.getBooleanType();
		//Char check
		if (e.isChar()) return MJType.getCharType();
		//
		if (e.isInt()) return MJType.getIntType();
		if (e.isVoid()) return MJType.getVoidType();
		if (e.isClass()) {
			try {
				e.setDecl(IR.classes.lookup(e.getName()));
			} catch (ClassNotFound exc) {
				throw new TypeCheckerException("Class "+e.getName()+" not defined.");
			}
			return e;
		}
		if (e.isArray()) {
			visitType(e.getBaseType());
			return e;
		}
		throw new TypeCheckerException("Unknown type "+e.getName()+".");
	}

	public MJType visitMethod(MJMethod e) throws VisitorException {
		// remember which method we are in
		IR.currentMethod = e;
		
		//check om metoden er private og hvis den er, så checker vi om dens klasse vi vil kalde den fra matcher med klassen hvor den er lagt,
		//hvis nej så smid en fejl ellers continue
		/*
		if(IR.currentMethod.isPrivate() && IR.currentMethod.currentClass == ){
			
		}
		
		*/
		// typecheck the return type
		
		visitType(e.getReturnType());
		System.out.println("-------Info Start");
		System.out.println(e.isPrivate());
		System.out.println(e.getName());
		System.out.println("Test          "+e.getReturnType());
		System.out.println(IR.currentMethod.currentClass.getName());
		System.out.println("-------Info end --------");
		// we need a new scope for the parameters
		IR.stack.enterScope();
		for (MJVariable par : e.getParameters()) {

			// each parameter is type checked
			visitVariable(par);

			// and added to the scope
			try {
				IR.stack.add(par);
			} catch (VariableAlreadyDeclared exc) {
				throw new TypeCheckerException("Method "+e.getName()+" has duplicate parameter "+par.getName());
			}
		}

		// now we typecheck the body
		visitStatement(e.getBody());

		// and leave the scope
		IR.stack.leaveScope();

		return MJType.getVoidType();
	}

	public MJType visitStatement(MJBlock e) throws VisitorException {
		// enter a new scope
		IR.stack.enterScope();

		// add all variables
		for (MJVariable v : e.getVariables()) {
			try {
				visitVariable(v);
				IR.stack.add(v);
			} catch (VariableAlreadyDeclared exc) {
				throw new TypeCheckerException("Variable "+v.getName()+" already declared.");
			}
		}

		// typecheck all statements
		for (MJStatement s : e.getStatements()) {
			visitStatement(s);
		}

		// leave the scope
		IR.stack.leaveScope();

		return MJType.getVoidType();
	}

	public MJType visitStatement(MJIf e) throws VisitorException {

		// typecheck the condition
		MJType condType = visitExpression(e.getCondition());

		// which must have type boolean
		if (!condType.isBoolean()) {
			throw new TypeCheckerException("Type of condition must be boolean");
		}

		// then typecheck both the then block
		visitStatement(e.getIfBlock());

		return MJType.getVoidType();
	}

	public MJType visitStatement(MJIfElse e) throws VisitorException {
		visitStatement((MJIf)e);
		visitStatement(e.getElseBlock());
		return MJType.getVoidType();
	}

	public MJType visitStatement(MJWhile e) throws VisitorException {
		// typecheck the condition
		MJType condType = visitExpression(e.getCondition());

		// which must have type boolean
		if (!condType.isBoolean()) {
			throw new TypeCheckerException("Type of condition must be boolean");
		}

		// then typecheck the body
		visitStatement(e.getBlock());

		return MJType.getVoidType();
	}

	public MJType visitStatement(MJAssign e) throws VisitorException {
		// typecheck the rhs and lhs
		MJType rhsType = visitExpression(e.getRhs());
		MJType lhsType = visitExpression(e.getLhs());
		
		// check that rhs is assignable to lhs
		
		if (!isAssignable(rhsType, lhsType)) {
			throw new TypeCheckerException("Types in assignment are not assignable ("+lhsType+","+rhsType+")");
		}
		
		return MJType.getVoidType();
	}

	public MJType visitStatement(MJPrint e) throws VisitorException {
		
		// typecheck the parameter - and done.
		visitExpression(e.getParameter());
		
		return MJType.getVoidType();
	}

	public MJType visitStatement(MJPrintln e) throws VisitorException {
		
		// typecheck the parameter - and done.
		visitExpression(e.getParameter());
		
		return MJType.getVoidType();
	}

	public MJType visitStatement(MJMethodCallStmt e) throws VisitorException {
		visitExpression(e.getMethodCallExpr());
		
		return MJType.getVoidType();
	}

	public MJType visitStatement(MJReturn e) throws VisitorException {
		
		// typecheck the parameter - and done.
		MJType returnType = visitExpression(e.getArgument());
		
		if (!isAssignable(returnType, IR.currentMethod.getReturnType())) {
			throw new TypeCheckerException("Type of return does not match function's return type.");
		}
		
		return MJType.getVoidType();
	}

	public MJType visitExpression(MJAnd e) throws VisitorException {
		
		MJType ltype = visitExpression(e.getLhs());
		MJType rtype = visitExpression(e.getRhs());
		
		if (!ltype.isSame(rtype)) { 
			throw new TypeCheckerException("Arguments to && must be of same type");
		}
		
		if(!ltype.isBoolean()) {
			throw new TypeCheckerException("Arguments to && must be of type boolean");
		}
		e.setType(ltype);
		return e.getType();
	}

	public MJType visitExpression(MJEqual e) throws VisitorException {
		
		MJType ltype = visitExpression(e.getLhs());
		MJType rtype = visitExpression(e.getRhs());
		
		if (!ltype.isSame(rtype)) { 
			throw new TypeCheckerException("Arguments to == must be of same type");
		}
		
		e.setType(MJType.getBooleanType());
		return e.getType();
	}

	public MJType visitExpression(MJLess e) throws VisitorException {
		
		MJType ltype = visitExpression(e.getLhs());
		MJType rtype = visitExpression(e.getRhs());
		
		if (!ltype.isSame(rtype)) { 
			throw new TypeCheckerException("Arguments to < must be of same type");
		}
		
		if(!ltype.isInt()) {
			throw new TypeCheckerException("Arguments to < must be of type int");
		}
		e.setType(MJType.getBooleanType());
		return e.getType();
	}

	public MJType visitExpression(MJPlus e) throws VisitorException {
		
		MJType ltype = visitExpression(e.getLhs());
		MJType rtype = visitExpression(e.getRhs());
		
		if (!ltype.isSame(rtype)) { 
			throw new TypeCheckerException("Arguments to + must be of same type");
		}
		
		if(!(ltype.isInt() || (ltype.isClass() && ltype.getName().equals("String")))) {
			throw new TypeCheckerException("Arguments to + must be of type int or String");
		}
		
		e.setType(ltype);
		return e.getType();
	}

	public MJType visitExpression(MJMinus e) throws VisitorException {
		
		MJType ltype = visitExpression(e.getLhs());
		MJType rtype = visitExpression(e.getRhs());
		
		if (!ltype.isSame(rtype)) { 
			throw new TypeCheckerException("Arguments to - must be of same type");
		}
		
		if(!ltype.isInt()) {
			throw new TypeCheckerException("Arguments to - must be of type int");
		}
		
		e.setType(ltype);
		return e.getType();
	}

	public MJType visitExpression(MJMult e) throws VisitorException {
		
		MJType ltype = visitExpression(e.getLhs());
		MJType rtype = visitExpression(e.getRhs());
		
		if (!ltype.isSame(rtype)) { 
			throw new TypeCheckerException("Arguments to * must be of same type");
		}
		
		if(!ltype.isInt()) {
			throw new TypeCheckerException("Arguments to * must be of type int");
		}
		
		e.setType(ltype);
		return e.getType();
	}

	public MJType visitExpression(MJUnaryMinus e) throws VisitorException {
		
		MJType type = visitExpression(e.getArgument());
		
		if(!type.isInt()) {
			throw new TypeCheckerException("Arguments to - must be of type int");
		}
		
		e.setType(type);
		return e.getType();
	}

	public MJType visitExpression(MJNegate e) throws VisitorException {
		MJType type = visitExpression(e.getArgument());
		
		if(!type.isBoolean()) {
			throw new TypeCheckerException("Arguments to ! must be of type boolean");
		}
		
		e.setType(type);
		return e.getType();
	}

	public MJType visitExpression(MJNew e) throws VisitorException {

		MJClass decl;
		try {
			 decl = IR.classes.lookup(e.getClassName());
		} catch (ClassNotFound e1) {
			throw new TypeCheckerException("Class "+e.getClassName()+" not defined.");
		}

		MJType t = MJType.getClassType(e.getClassName());
		t.setDecl(decl);
		e.setType(t);

		return e.getType();
	}

	public MJType visitExpression(MJNewArray e) throws VisitorException {
		MJType etype = visitExpression(e.getSize());
		
		if (!etype.isInt()) {
			throw new TypeCheckerException("Type of size in array must be integer");
		}
		
		e.setType(MJType.getArrayType(MJType.getIntType()));
		return e.getType();
	}

	public MJType visitExpression(MJMethodCallExpr e) throws VisitorException {

		MJClass defclass = IR.currentClass;
		MJMethod method;
		
		String id = e.getMethodName();
		
		if (e.hasObject()) {
			MJType objType = visitExpression(e.getObject());

			if (!objType.isClass()) {
				throw new TypeCheckerException("Baseobject in selector must have class type.");
			}

			defclass = objType.getDecl();
			
		}
		
		for (MJExpression arg : e.getArguments()) {
			visitExpression(arg);
		}

		try {
			method = IR.classes.lookupMethod(defclass, id, e.getArguments());
		} catch (ClassErrorMethod exc) {
			throw new TypeCheckerException("No matching class found.");
		} catch (MethodNotFound exc) {
			throw new TypeCheckerException("No matching method found.");
		}

		e.setTarget(method);
		e.setType(method.getReturnType());
		return e.getType();
	}

	public MJType visitExpression(MJParentheses e) throws VisitorException {
		e.setType(visitExpression(e.getArgument()));
		return e.getType();
	}

	public MJType visitExpression(MJBoolean e) throws VisitorException {
		e.setType(MJType.getBooleanType());
		return e.getType();
	}

	public MJType visitExpression(MJInteger e) throws VisitorException {
		e.setType(MJType.getIntType());
		return e.getType();
	}
	
	public MJType visitExpression(MJChar e) throws VisitorException {
		e.setType(MJType.getCharType());
		return e.getType();
	}

	public MJType visitExpression(MJString e) throws VisitorException {
		e.setType(MJType.getClassType("String"));
		return e.getType();

	}

	public MJType visitExpression(MJIdentifier e) throws VisitorException {
		// find the declaration for the identifier on the stack
		MJVariable var;
		String name = e.getName();
		
		if (name.equals("this") && IR.currentMethod.isStatic()) {
			throw new TypeCheckerException("this encountered in static method.");
		}

		try {
			var = IR.find(name);
		} catch (VariableNotFound exc) {
			throw new TypeCheckerException("Unknown identifier " + name);
		}

		// remember the declaration
		
		e.setDeclaration(var);
		e.setType(var.getType());
		return e.getType();
	}

	public MJType visitExpression(MJArray e) throws VisitorException {
		
		// typecheck the identifier
		MJType idtype = visitExpression(e.getArray());
		
		// which must have array type
		if (!idtype.isArray()) {
			throw new TypeCheckerException(e.getName()+" must have array type");
		}
		
		// typecheck the index
		MJType idxtype = visitExpression(e.getIndex());
		
		// which must have type integer
		if (!idxtype.isInt()) {
			throw new TypeCheckerException("Index for "+e.getName()+" must have type int");			
		}
		
		// type of the element is that of the base type
		e.setType(idtype.getBaseType());		
		return e.getType();
	}

	public MJType visitExpression(MJSelector e) throws VisitorException {

		// a selector has the form object.field

		// first type check the object
		// this sets also the object.decl 

		MJType idtype = visitExpression(e.getObject());

		// the object must have class type

		if (!idtype.isClass()) {
			throw new TypeCheckerException("Type of an object in a selector must be a class type.");
		}

		// now get the class declaration of object

		MJClass classDecl;
		try {
			classDecl = IR.classes.lookup(idtype.getName());
		} catch (ClassNotFound exc) {
			throw new TypeCheckerException("No class declaration for object's type found.");
		}

		// now we can finally search for the field in the declaration

		MJVariable fieldDecl;
		try {
			fieldDecl = IR.classes.lookupField(classDecl, e.getField().getName());
		} catch (ClassErrorField exc) {
			throw new TypeCheckerException("Class "+ classDecl.getName() + 
					" has no field "+ e.getField().getName() + ".");
		}

		// and from the field declaration we get the type...

		e.setDeclaration(fieldDecl);
		e.setType(fieldDecl.getType());
		return e.getType();
	}

	public MJType visitExpression(MJNoExpression e) throws VisitorException {
		e.setType(MJType.getVoidType());
		return e.getType();
	}

	public MJType visitTypeDef(MJTypeDef e) throws VisitorException {
		return null;
	}

	public MJType visitAttribute(MJAttribute e) throws VisitorException {
		visitVariable(e);
		visitExpression(e.getInitializer());
		return null;
	}

	public MJType visitConstructor(MJConstructor e) throws VisitorException {
		return null;
	}

	public MJType visitStatement(MJTryBlock e) throws VisitorException {
		return null;
	}

	public MJType visitStatement(MJConstructorCallStmt e)
			throws VisitorException {
		return null;
	}

	public MJType visitStatement(MJFor e) throws VisitorException {
		return null;
	}

	public MJType visitStatement(MJThrow e) throws VisitorException {
		return null;
	}

	public MJType visitStatement(MJPostIncrementStmt e) throws VisitorException {
		return null;
	}

	public MJType visitStatement(MJPreIncrementStmt e) throws VisitorException {
		return null;
	}

	public MJType visitStatement(MJPostDecrementStmt e) throws VisitorException {
		return null;
	}

	public MJType visitStatement(MJPreDecrementStmt e) throws VisitorException {
		return null;
	}

	public MJType visitStatement(MJVariableStmt e) throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJGreater e) throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJDivide e) throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJModulo e) throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJDouble e) throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJPostIncrementExpr e)throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJPreIncrementExpr e) throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJPostDecrementExpr e) throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJPreDecrementExpr e) throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJTernary e) throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJSqrt e) throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJTypeCast e) throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJLinq e) throws VisitorException {
		return null;
	}

	public MJType visitExpression(MJNoStatement e) throws VisitorException {
		return null;
	}
}
