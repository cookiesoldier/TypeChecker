package compiler.IR;

import java.util.LinkedList;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import compiler.Frontend.*;
import compiler.Frontend.MiniJavaParser.VarDeclarationStmtContext;
import compiler.Frontend.MiniJavaParser.*;

public class IRbuilder extends AbstractParseTreeVisitor<IR> implements MiniJavaVisitor<IR> {
		
//	program
//	  : mainClass ( classDeclaration )*
//	  ;

	 
	public MJProgram visitProgram(MiniJavaParser.ProgramContext ctx) {
		
		LinkedList<MJClass> classDeclarations = new LinkedList<MJClass>();
		LinkedList<MJTypeDef> typeDefDeclarations = new LinkedList<MJTypeDef>();

		classDeclarations.add(visitMainClass(ctx.mainClass()));
		
		for (MiniJavaParser.ClassDeclarationContext c : ctx.classDeclaration()) {
			classDeclarations.add(visitClassDeclaration(c));
		}
		
		for (MiniJavaParser.TypedefDeclarationContext c : ctx.typedefDeclaration()) {
			typeDefDeclarations.add(visitTypedefDeclaration(c));
		}
		
		return new MJProgram(classDeclarations, typeDefDeclarations);
	}

//	classDeclaration
//	  : 'class' className=IDENT ( 'extends' superClassName=IDENT )? 
//	    '{' ( varDeclaration 
//	        )* 
//	        ( methodDeclaration 
//	        )*
//	    '}'
//	  ;
	
	public MJClass visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
		
		String className = ctx.className.getText();
		String superClassName="Object";
		
		if (ctx.superClassName!=null) {
			superClassName = ctx.superClassName.getText();
		}

		LinkedList<MJClass> innerClassDeclarations = new LinkedList<MJClass>();
		for (MiniJavaParser.InnerClassDeclarationContext c : ctx.innerClassDeclaration()) {
			innerClassDeclarations.add(visitInnerClassDeclaration(c));
		}
		
		LinkedList<MJAttribute> attributeDeclarations = new LinkedList<MJAttribute>();
		for (AttributeDeclarationContext c : ctx.attributeDeclaration()) {
			attributeDeclarations.add(visitAttributeDeclaration(c));
		}
		
		LinkedList<MJMethod> methods = new LinkedList<MJMethod>();
		for (MiniJavaParser.MethodDeclarationContext c : ctx.methodDeclaration()) {
			methods.add(visitMethodDeclaration(c));
		}
		
		LinkedList<MJConstructor> constructors = new LinkedList<MJConstructor>();
		for (ConstructorDeclarationContext c : ctx.constructorDeclaration()) {
			constructors.add(visitConstructorDeclaration(c));
		}
		
		return new MJClass(className, superClassName, innerClassDeclarations, attributeDeclarations, methods, constructors);
	}
	
//	mainClass
//	  : 'class' className=IDENT 
//	    '{' 
//	      'public' 'static' 'void' 'main' '(' 'String' '[' ']' parameterName=IDENT ')' 
//	      block
//	    '}'
//	  ;
	  
	public MJClass visitMainClass(MiniJavaParser.MainClassContext ctx) {
		
		String className = ctx.className.getText();

		MJMethod method = visitMethodDeclaration(ctx.method);
	
		return new MJClass(className, method);
	}

//	block
//	  : '{' ( varDeclaration )* 
//	        ( statement )*
//	    '}'
//	  ;
	    
	public MJBlock visitBlock(MiniJavaParser.BlockContext ctx) {
		
		LinkedList<MJVariable> variableDeclarations = new LinkedList<MJVariable>();
		for (MiniJavaParser.VarDeclarationContext c : ctx.varDeclaration()) {
			MJVariable var = visitVarDeclaration(c);
			variableDeclarations.add(var);
		}
		
		LinkedList<MJStatement> statements = new LinkedList<MJStatement>();
		for (MiniJavaParser.StatementContext c : ctx.statement()) {
			statements.add(visitStatement(c));
		}
		
		return new MJBlock(variableDeclarations, statements);
	}
	
//	varDeclaration
//	  : var=variable ';'
//	  ;

	public MJVariable visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {  
			MJVariable x = visitVariable(ctx.var); 
			
			if (ctx.value != null) {
				MJExpression expr = visitDeclExpression(ctx.declExpression());
				x.setInitializer(expr);
			}
			return x;
	}

//	variable : type variableName=IDENT;
	
	public MJVariable visitVariable(MiniJavaParser.VariableContext ctx){
		
		MJType variableType = visitType(ctx.type());
		String variableName = ctx.IDENT().getText();
		
		MJVariable x = new MJVariable(variableType, variableName);
		
		return x;
	}

//	type 
//	   : typeBasic
//	   | typeArray
//	   ;
//
//	typeBasic
//	  : typeBoolean
//	  | typeInt
//	  | typeClass
//	  ;
//
//	typeBoolean : 'boolean' ;
//	typeInt     : 'int' ;
//	typeClass   : className=IDENT;

	public MJType visitType(MiniJavaParser.TypeContext ctx) { return (MJType)visitChildren(ctx); }
	
	public MJType visitTypeBasic(TypeBasicContext ctx) {
		return (MJType)visitChildren(ctx);
	}

	public MJType visitTypeBoolean(MiniJavaParser.TypeBooleanContext ctx) {
		return MJType.getBooleanType();
	}	
	
	public MJType visitTypeInt(MiniJavaParser.TypeIntContext ctx) {
		return MJType.getIntType();
	}
	
	public MJType visitTypeChar(TypeCharContext ctx) {
		return MJType.getCharType();
	}

	public MJType visitTypeDouble(TypeDoubleContext ctx) {
		return MJType.getDoubleType();
	}

	public MJType visitTypeClass(MiniJavaParser.TypeClassContext ctx) {
		return MJType.getClassType(ctx.className.getText());
	}
	
	public IR visitTypeArray(TypeArrayContext ctx) {
		return MJType.getArrayType( (MJType)visitTypeBasic(ctx.typeBasic()));
	}

	public MJType visitTypeVar(MiniJavaParser.TypeVarContext ctx) {
		return MJType.getUntypedType();
	}	
	
//	methodDeclaration
//	  : ( isPublic='public'  )?
//	    ( isStatic='static'  )? 
//	    procType methodName=IDENT 
//	    '(' 
//	      ( variable ( ',' variable )* )? 
//	    ')' 
//	    '{' ( varDeclaration )* 
//	        ( statement )*
//	        statementReturn
//	    '}'
//	  ;
	  
	public MJMethod visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
		
		boolean isPublic = false; 
		if (ctx.visibility!=null) isPublic=(ctx.visibility.getText().equals("public"));
		boolean isPrivate = false; 
		if (ctx.visibility!=null) isPrivate=(ctx.visibility.getText().equals("private"));
		boolean isStatic = (ctx.isStatic != null);

		MJType returnType = visitProcType(ctx.procType());
		
		String methodName = ctx.methodName.getText();
		
		LinkedList<MJVariable> parameterList = new LinkedList<MJVariable>();
		for (MiniJavaParser.VariableContext c : ctx.variable()) {
			parameterList.add(visitVariable(c));
		}
		
		MJExpression exception = new MJNoExpression();
		
		if (ctx.exceptionID != null) {
			exception = new MJIdentifier(ctx.exceptionID.getText());
		}
		
		LinkedList<MJVariable> variableDeclarations = new LinkedList<MJVariable>();
		for (MiniJavaParser.VarDeclarationContext c : ctx.varDeclaration()) {
			variableDeclarations.add(visitVarDeclaration(c));
		}
		
		LinkedList<MJStatement> statements = new LinkedList<MJStatement>();
		for (MiniJavaParser.StatementContext c : ctx.statement()) {
			statements.add(visitStatement(c));
		}
		
		statements.add(visitStatementReturn(ctx.statementReturn()));
		
		MJBlock body = new MJBlock(variableDeclarations, statements);
		
		MJMethod method = new MJMethod(returnType, methodName, parameterList, body, isStatic, isPublic, isPrivate, exception);
		
		return method;
	}
	
//	procType
//	  : type  
//	  | voidtype 
//	  ;
//
//	voidtype: 'void' ;
	  
	public MJType visitProcType(MiniJavaParser.ProcTypeContext ctx) { 
		return (MJType)visitChildren(ctx); 
	}
	
	public MJType visitTypeVoid(MiniJavaParser.TypeVoidContext ctx) {
		return MJType.getVoidType();
	}

//	statement
//	  : block
//	  | statementIf
//	  | statementWhile
//	  | statementAssign
//	  | statementAssignArray
//	  | statementPrintln
//	  | statementPrint
//	  | statementMethod
//	  ;
//
//	statementIf : 'if' '(' condition=expression ')' ifBlock=block ('else' elseBlock=block )? ;
//	statementWhile : 'while' '(' condition=expression ')' whileBlock=statement ;
//	statementAssign  : lhs=id '=' rhs=expression ';' ;
//	statementAssignArray : array=identifier '[' element=expression ']' '=' value=expression ';';
//	statementPrint : 'System.out.print' '(' argument=expression ')' ';' ;
//	statementPrintln : 'System.out.println' '(' argument=expression ')' ';' ;
//	statementMethod : (object=identifier '.')? method=IDENT '(' (arguments+=expression (',' arguments+=expression)* )? ')' ';';
//
//	statementReturn  : 'return' ('(' argument=expression ')' )? ';' ;
	
	public MJStatement visitStatement(MiniJavaParser.StatementContext ctx) { return (MJStatement)visitChildren(ctx); }	
	
	public MJStatement visitTryBlock(TryBlockContext ctx) {
		MJBlock tryBlock = visitBlock(ctx.tryBl);
		MJBlock catchBlock = visitBlock(ctx.catchBl);
		MJVariable exceptionVariable = visitVariable(ctx.exceptionVar);
		
		return new MJTryBlock(tryBlock, exceptionVariable, catchBlock);
	}
	
	public MJStatement visitStatementIf(StatementIfContext ctx) {
		MJExpression condition = (MJExpression)visitExpression(ctx.condition);
		MJBlock ifBlock = visitBlock(ctx.ifBlock);
		MJBlock elseBlock = null;
		
		if (ctx.elseBlock == null) {
			return new MJIf(condition, ifBlock);
		} else {
			elseBlock = (MJBlock)visitBlock(ctx.elseBlock);
			return new MJIfElse(condition, ifBlock, elseBlock);
		}		
	}

	public MJWhile visitStatementWhile(StatementWhileContext ctx) {
		MJExpression condition = (MJExpression)visitExpression(ctx.condition);
		MJBlock block = (MJBlock)visitStatement(ctx.whileBlock);
		
		return new MJWhile(condition, block);
	}

	public MJStatement visitStatementAssign(MiniJavaParser.StatementAssignContext ctx) {
		
		MJIdentifierClass leftHandSide = (MJIdentifierClass)visitIdentifier(ctx.lhs);
		MJExpression rightHandSide = (MJExpression)visitExpression(ctx.rhs);
		
		return new MJAssign(leftHandSide, rightHandSide);
	}
	
	public MJStatement visitStatementOpAssign(MiniJavaParser.StatementOpAssignContext ctx) {
		
		MJIdentifierClass leftHandSide = (MJIdentifierClass)visitIdentifier(ctx.lhs);
		MJExpression rightHandSide = (MJExpression)visitExpression(ctx.rhs);
		String op = ctx.op.getText();
		
		if (op.equals("+")) {
			rightHandSide = new MJPlus(visitIdentifier(ctx.lhs), rightHandSide);
		} else 
		if (op.equals("-")) {
			rightHandSide = new MJMinus(visitIdentifier(ctx.lhs), rightHandSide);
		} else 
		if (op.equals("*")) {
			rightHandSide = new MJTimes(visitIdentifier(ctx.lhs), rightHandSide);
		} else 
		if (op.equals("/")) {
			rightHandSide = new MJDivide(visitIdentifier(ctx.lhs), rightHandSide);
		} else 
		if (op.equals("%")) {
			rightHandSide = new MJModulo(visitIdentifier(ctx.lhs), rightHandSide);
		} 
		
		return new MJAssign(leftHandSide, rightHandSide);
	}
	
	public MJStatement visitStatementAssignArray(StatementAssignArrayContext ctx) {
		MJIdentifierClass array = (MJIdentifierClass)visitIdentifier(ctx.array);
		MJExpression element = (MJExpression)visitExpression(ctx.element);
		MJExpression rhs = (MJExpression)visitExpression(ctx.value);
		
		MJArray lhs = new MJArray(array, element);
		return new MJAssign(lhs, rhs);
	}

	public MJStatement visitStatementPrint(StatementPrintContext ctx) {
		MJExpression argument = (MJExpression)visitExpression(ctx.argument);
		
		return new MJPrint(argument);
	}

	public MJStatement visitStatementPrintln(MiniJavaParser.StatementPrintlnContext ctx) {
		
		MJExpression argument = (MJExpression)visitExpression(ctx.argument);
		
		return new MJPrintln(argument);
	}
	
	public MJStatement visitStatementMethod(StatementMethodContext ctx) {
		MJMethodCallExpr call = visitExpressionMethodCall(ctx.expressionMethodCall());
		
		return new MJMethodCallStmt(call);

	}

	public MJStatement visitStatementReturn(MiniJavaParser.StatementReturnContext ctx) {
		
		MJExpression argument = new MJNoExpression();
		
		if (ctx.argument!=null) {
			argument = visitExpression(ctx.argument);
		}
		
		return new MJReturn(argument);
	}
	
	public MJStatement visitStatementFor(MiniJavaParser.StatementForContext ctx) {
		
		MJExpression terminate = new MJNoExpression();
		MJStatement increment = new MJNoStatement();
		MJStatement init = new MJNoStatement();
		MJStatement block;
		
		if (ctx.init!=null) {
			init = visitStatement(ctx.init);
		}
		
		terminate = visitExpression(ctx.terminate);
		
		if (ctx.increment!=null) {
			increment = visitStatement(ctx.increment);
		}
		
		block = visitStatement(ctx.forBlock);
		return new MJFor(init, terminate, increment, block);
		
	}

	public MJStatement visitStatementThrow(StatementThrowContext ctx) {
		MJExpression argument = visitExpression(ctx.expression());
		
		return new MJThrow(argument);
	}

	public IR visitStatementPreIncrement(StatementPreIncrementContext ctx) {
		MJExpression expression = visitExpressionPreIncrement(ctx.expressionPreIncrement());
		return new MJPreIncrementStmt(expression);
	}

	public IR visitStatementPostIncrement(StatementPostIncrementContext ctx) {
		MJExpression expression = visitExpressionPostIncrement(ctx.expressionPostIncrement());
		return new MJPostIncrementStmt(expression);
	}

	public IR visitStatementPreDecrement(StatementPreDecrementContext ctx) {
		MJExpression expression = visitExpressionPreDecrement(ctx.expressionPreDecrement());
		return new MJPreDecrementStmt(expression);
	}

	public IR visitStatementPostDecrement(StatementPostDecrementContext ctx) {
		MJExpression expression = visitExpressionPostDecrement(ctx.expressionPostDecrement());
		return new MJPostDecrementStmt(expression);
	}

	public IR visitVarDeclarationStmt(VarDeclarationStmtContext ctx) {
		MJVariable variable = visitVarDeclaration(ctx.varDeclaration());
		return new MJVariableStmt(variable);
	}

//	expression
//	  : head=level1 ( '&&' tail+=level1 )*
//	  ;
	
	public MJExpression visitExpression(MiniJavaParser.ExpressionContext ctx) {
		
		MJExpression root = visitLevel1(ctx.head);
		
		for (MiniJavaParser.Level1Context c : ctx.tail) {
			MJExpression newRoot = new MJAnd(root, visitLevel1(c));
			root = newRoot;
		}
		
		return root;
	}
	
//	level1
//	  : head=level2 ( '==' tail+=level2 )*
//	  ;

	public MJExpression visitLevel1(MiniJavaParser.Level1Context ctx) {
		
		MJExpression root = visitLevel2(ctx.head);
		
		for (MiniJavaParser.Level2Context c : ctx.tail) {
			MJExpression newRoot = new MJEqual(root, visitLevel2(c));
			root = newRoot;
		}
		
		return root;
	}

//	level2
//	  : head=level3 ( ('<'|'>' tail+=level3 )* 
//	  ;

	public MJExpression visitLevel2(MiniJavaParser.Level2Context ctx) {
		
		MJExpression root = visitLevel3(ctx.head);
		
		for (MiniJavaParser.Level3Context c : ctx.tail) {
			String operator = ctx.operator.get(0).getText();

			MJExpression newRoot;
			
			if (operator.equals("<")) {
				newRoot = new MJLess(root, visitLevel3(c));
			} else {
				newRoot = new MJGreater(root, visitLevel3(c));
			}

			root = newRoot;
		}
		
		return root;
	}

//	level3
//	  : head=level4 ( ('+'|'-') tail+=level4 )*
//	  ;

	public MJExpression visitLevel3(MiniJavaParser.Level3Context ctx) {
		
		MJExpression root = visitLevel4(ctx.head);
		
		for (MiniJavaParser.Level4Context c : ctx.tail) {
			String operator = ctx.operator.get(0).getText();
			
			MJExpression newRoot;
			
			if (operator.equals("+")) {
				newRoot = new MJPlus(root, visitLevel4(c));
			} else {
				newRoot = new MJMinus(root, visitLevel4(c));
			}
			
			root = newRoot;
		}
		
		return root;
	}

//	level4
//    : head=level5 ( '*' tail+=level5 )*
//	  ;

	public MJExpression visitLevel4(MiniJavaParser.Level4Context ctx) {

		MJExpression root = visitLevel5(ctx.head);
		
		for (MiniJavaParser.Level5Context c : ctx.tail) {
			String operator = ctx.operator.get(0).getText();

			MJExpression newRoot;
		
			if (operator.equals("*")) {
				newRoot = new MJMult(root, visitLevel5(c));
			} else if (operator.equals("/")) {
				newRoot = new MJDivide(root, visitLevel5(c));
			} else {
				newRoot = new MJModulo(root, visitLevel5(c));
			}
		
			root = newRoot;
		}
		
		return root;
	}

//	level5
//	  : expressionUnaryMinus
//	  | expressionNegation
//	  | expressionNewObject
//	  | expressionNewArray
//	  | expressionIdentifier
//	  | expressionArrayAccess
//	  | expressionMethodCall
//	  | expressionParentheses
//	  | expressionConstantTrue
//	  | expressionConstantFalse
//	  | expressionConstantInteger
//	  | expressionConstantString
//	  ; 
//
//	expressionUnaryMinus      : '-' argument=level5 ;
//	expressionNegation        : '!' argument=level5 ;
//	expressionNewObject       : 'new' classname=IDENT '(' ')' ;
//	expressionNewArray        : 'new' 'int' '[' size=expression ']' ;  
//	expressionIdentifier      :  ident=identifier ;
//	expressionArrayAccess     :  ident=identifier '[' element=expression ']' ;
//	expressionParentheses     :  '(' argument=expression ')' ;
//	expressionConstantTrue    :  'true' ;
//	expressionConstantFalse   :  'false' ;
//	expressionConstantInteger :  value=INT ;
//	expressionConstantString  :  value=STRING ;
//	expressionMethodCall      :  (object=identifier '.')? method=IDENT '(' (arguments+=expression (',' arguments+=expression)* )? ')' ;

	public MJExpression visitLevel5(MiniJavaParser.Level5Context ctx) { return (MJExpression)visitChildren(ctx); }

	public MJExpression visitExpressionUnaryMinus(MiniJavaParser.ExpressionUnaryMinusContext ctx) {
		return new MJUnaryMinus(visitLevel5(ctx.argument));
	}

	public MJExpression visitExpressionParentheses(MiniJavaParser.ExpressionParenthesesContext ctx) {
		return new MJParentheses(visitExpression(ctx.argument));
	}

	public MJExpression visitExpressionConstantTrue(MiniJavaParser.ExpressionConstantTrueContext ctx) {
		return MJBoolean.True;
	}

	public MJExpression visitExpressionConstantFalse(MiniJavaParser.ExpressionConstantFalseContext ctx) {
		return MJBoolean.False;
	}
	
	public MJExpression visitExpressionConstantInteger(MiniJavaParser.ExpressionConstantIntegerContext ctx) {
		return new MJInteger(ctx.value.getText());
	}
	
	public MJExpression visitExpressionConstantChar(ExpressionConstantCharContext ctx) {
		return new MJChar(ctx.value.getText().charAt(1));
	}

	public MJExpression visitExpressionConstantDouble(ExpressionConstantDoubleContext ctx) {
		return new MJDouble(ctx.value.getText());
	}

	public MJExpression visitExpressionConstantString(MiniJavaParser.ExpressionConstantStringContext ctx) {
		return new MJString(ctx.value.getText());
	}

	public MJExpression visitExpressionTernary(ExpressionTernaryContext ctx) {
		
		MJExpression condition = visitExpression(ctx.condition);
		MJExpression trueExpr = visitExpression(ctx.trueexpr);
		MJExpression falseExpr = visitExpression(ctx.falseexpr);
		
		return new MJTernary(condition, trueExpr, falseExpr);
	}

	public MJExpression visitExpressionMathSqrt(ExpressionMathSqrtContext ctx) {
		MJExpression argument = visitExpression(ctx.expression());
		return new MJSqrt(argument);
	}

	public MJExpression visitExpressionTypeCast(ExpressionTypeCastContext ctx) {
		MJType type = visitType(ctx.cast);
		MJExpression argument = visitExpression(ctx.expression());
		return new MJTypeCast(type, argument);
	}

	public MJExpression visitExpressionLINQ(ExpressionLINQContext ctx) {
		MJIdentifier fromIdent = new MJIdentifier(ctx.fromIdent.getText());
		MJExpression inExpression = visitExpression(ctx.inExpression);
		MJExpression whereExpression = visitExpression(ctx.where);
		MJExpression selectExpression = visitExpression(ctx.select);
		
		return new MJLinq(fromIdent, inExpression, whereExpression, selectExpression);
	}


//	identifier
//	  : id ( '.' selectors+=IDENT )*
//	  ;
//
//	id
//	  : idThis
//	  | idIDENT
//	  ;
//
//	idThis  : 'this' ;
//	idIDENT : name=IDENT ;
	
	public MJIdentifierClass visitIdentifier(IdentifierContext ctx) {
		return (MJIdentifierClass)visitChildren(ctx);
	}

	public MJIdentifierClass visitIdentifierIdentifier(IdentifierIdentifierContext ctx) {
		MJIdentifierClass id = visitIdentifierId(ctx.identifierId()); 
		
		for (Token t : ctx.selectors) {
			MJIdentifier selector = new MJIdentifier(t.getText());
			MJSelector s = new MJSelector(id, selector);
			id = s;
		}
		
		return id;
	}

	public MJIdentifierClass visitIdentifierId(IdentifierIdContext ctx) {
		return (MJIdentifierClass)visitChildren(ctx);
	}
	
	public MJIdentifier visitIdThis(MiniJavaParser.IdThisContext ctx) { return new MJIdentifier("this"); }
	
	public MJIdentifier visitIdIDENT(MiniJavaParser.IdIDENTContext ctx) { return new MJIdentifier(ctx.name.getText()); }

	public MJIdentifierClass visitExpressionIdentifier(ExpressionIdentifierContext ctx) {
		return (MJIdentifierClass)visitChildren(ctx);
	}

	public MJMethodCallExpr visitExpressionMethodCall(MiniJavaParser.ExpressionMethodCallContext ctx) {
		MJIdentifierClass object = null;
		
		if (ctx.object != null) {
			object = (MJIdentifierClass)visitIdentifier(ctx.object);
		}
		
		String methodName = ctx.method.getText();
		LinkedList<MJExpression> arguments = new LinkedList<MJExpression>();
		
		for (MiniJavaParser.ExpressionContext argCtx : ctx.arguments ) {
			arguments.add( visitExpression(argCtx));
		}
		
		return new MJMethodCallExpr(object, methodName, arguments);
	}

	public MJExpression visitExpressionArrayAccess(ExpressionArrayAccessContext ctx) {
		MJIdentifierClass id = (MJIdentifierClass)visitIdentifier(ctx.ident);
		MJExpression index = (MJExpression)visitExpression(ctx.element);
		
		return new MJArray(id, index);
	}

	public MJExpression visitExpressionNegation(ExpressionNegationContext ctx) {
		MJExpression argument = (MJExpression)visitLevel5(ctx.argument);
		
		return new MJNegate(argument);
	}

	public MJExpression visitExpressionNewObject(ExpressionNewObjectContext ctx) {
		
		String className = ctx.classname.getText();
		
		return new MJNew(className);
	}

	public MJExpression visitExpressionNewArray(ExpressionNewArrayContext ctx) {

		MJExpression size = (MJExpression)visitExpression(ctx.size);
			
		return new MJNewArray(size);
	}

	public MJExpression visitExpressionPostIncrement(ExpressionPostIncrementContext ctx) {
		MJExpression argument = visitIdentifier(ctx.identifier());
		return new MJPostIncrementExpr(argument);
	}

	public MJExpression visitExpressionPreIncrement(ExpressionPreIncrementContext ctx) {
		MJExpression argument = visitIdentifier(ctx.identifier());
		return new MJPreIncrementExpr(argument);
	}

	public MJExpression visitExpressionPostDecrement(ExpressionPostDecrementContext ctx) {
		MJExpression argument = visitIdentifier(ctx.identifier());
		return new MJPostDecrementExpr(argument);
	}

	public MJExpression visitExpressionPreDecrement(ExpressionPreDecrementContext ctx) {
		MJExpression argument = visitIdentifier(ctx.identifier());
		return new MJPreDecrementExpr(argument);
	}

	public MJExpression visitArrayinit(ArrayinitContext ctx) {
		LinkedList<MJExpression> arrayInitList = new LinkedList<MJExpression>();
		
		for (ExpressionContext c : ctx.values) {
			arrayInitList.add(visitExpression(c));
		}
		
		return new MJArrayInit(arrayInitList);
	}

	@Override
	public MJClass visitInnerClassDeclaration(InnerClassDeclarationContext ctx) {
			
		String className = ctx.className.getText();
		
		LinkedList<MJAttribute> variableDeclarations = new LinkedList<MJAttribute>();
		for (AttributeDeclarationContext c : ctx.attributeDeclaration()) {
			variableDeclarations.add(visitAttributeDeclaration(c));
		}
		
		LinkedList<MJMethod> methods = new LinkedList<MJMethod>();
		for (MiniJavaParser.MethodDeclarationContext c : ctx.methodDeclaration()) {
			methods.add(visitMethodDeclaration(c));
		}
		
		LinkedList<MJConstructor> constructors = new LinkedList<MJConstructor>();
		for (ConstructorDeclarationContext c : ctx.constructorDeclaration()) {
			constructors.add(visitConstructorDeclaration(c));
		}
		
		return new MJClass(className, variableDeclarations, methods, constructors);
	}

	public MJAttribute visitAttributeDeclaration(AttributeDeclarationContext ctx) {

		boolean isPublic = false; 
		if (ctx.visibility!=null) isPublic=(ctx.visibility.getText().equals("public"));
		boolean isPrivate = false; 
		if (ctx.visibility!=null) isPrivate=(ctx.visibility.getText().equals("private"));
		boolean isStatic = (ctx.isStatic != null);

		MJVariable variable = visitVarDeclaration(ctx.varDeclaration()); 

		return new MJAttribute(variable, isPublic, isPrivate, isStatic);
	}

	public MJStatement visitConstructorCall(ConstructorCallContext ctx) {
		MJIdentifierClass object = null;
		
		String methodName = ctx.constructorName.getText();
		LinkedList<MJExpression> arguments = new LinkedList<MJExpression>();
		
		for (MiniJavaParser.ExpressionContext argCtx : ctx.arguments ) {
			arguments.add( visitExpression(argCtx));
		}
		
		return new MJConstructorCallStmt(object, methodName, arguments);
	}

	public MJExpression visitDeclExpression(DeclExpressionContext ctx) {
		return (MJExpression)visitChildren(ctx); 
	}

	public MJTypeDef visitTypedefDeclaration(TypedefDeclarationContext ctx) {
		LinkedList<MJVariable> vdl = new LinkedList<MJVariable>();
		
		for (VarDeclarationContext c : ctx.varDeclaration()) {
			vdl.add(visitVarDeclaration(c));
		}
				
		return new MJTypeDef(ctx.structName.getText(), vdl);
	}

	public MJConstructor visitConstructorDeclaration(ConstructorDeclarationContext ctx) {
		
		boolean isPublic = false; 
		if (ctx.visibility!=null) isPublic=(ctx.visibility.getText().equals("public"));
		boolean isPrivate = false; 
		if (ctx.visibility!=null) isPrivate=(ctx.visibility.getText().equals("private"));
		boolean isStatic = (ctx.isStatic != null);
		
		String methodName = ctx.methodName.getText();
		
		LinkedList<MJVariable> parameterList = new LinkedList<MJVariable>();
		for (MiniJavaParser.VariableContext c : ctx.variable()) {
			parameterList.add(visitVariable(c));
		}
		
		LinkedList<MJVariable> variableDeclarations = new LinkedList<MJVariable>();
		for (MiniJavaParser.VarDeclarationContext c : ctx.varDeclaration()) {
			variableDeclarations.add(visitVarDeclaration(c));
		}
		
		LinkedList<MJStatement> statements = new LinkedList<MJStatement>();
		if (ctx.constructorCall() != null) {
			statements.add(visitConstructorCall(ctx.constructorCall()));
		}
		
		if (ctx.constructorCall()!=null) {
			statements.add(visitConstructorCall(ctx.constructorCall()));
		}

		for (MiniJavaParser.StatementContext c : ctx.statement()) {
			statements.add(visitStatement(c));
		}
		
		statements.add(visitStatementReturn(ctx.statementReturn()));
		
		MJBlock body = new MJBlock(variableDeclarations, statements);
		
		MJConstructor constructor = new MJConstructor (methodName, parameterList, body, isStatic, isPublic, isPrivate);
		
		return constructor;

	}

}
