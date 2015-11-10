grammar MiniJava;

program
  : mainClass ( classDeclaration )* (typedefDeclaration)*
  ;

classDeclaration
  : CLASS className=IDENT ( EXTENDS superClassName=IDENT )? 
    CURLYOPEN 
        ( innerClassDeclaration )*
        ( attributeDeclaration )* 
        ( constructorDeclaration )*
        ( methodDeclaration )*
    CURLYCLOSE
  ;

innerClassDeclaration 
    : CLASS className=IDENT 
      CURLYOPEN 
        ( attributeDeclaration )* 
        ( constructorDeclaration )*
        ( methodDeclaration )*
      CURLYCLOSE
  ;
                 
attributeDeclaration 
    : ( visibility=(PUBLIC|PRIVATE)  )?
      ( isStatic=STATIC  )? 
      varDeclaration
    ;

mainClass
  : CLASS className=IDENT 
    CURLYOPEN 
      method=methodDeclaration 
    CURLYCLOSE
  ;
  
block  : CURLYOPEN ( varDeclaration )* ( statement )* CURLYCLOSE;

varDeclaration
  : var=variable ( EQUAL value=declExpression )? SEMICOLON
  ;

declExpression 
  : expression
  | arrayinit
  ;

arrayinit : CURLYOPEN ( values+=expression ( COMMA values+=expression )* )? CURLYCLOSE
          ;

variable : type variableName=IDENT
  ;

type 
   : typeBasic
   | typeArray
   | typeVar
   ;

typeBasic
  : typeBoolean
  | typeInt
  | typeChar
  | typeDouble
  | typeClass
  ;

typeArray  
    : typeBasic SQUAREOPEN SQUARECLOSE 
    ;

typeVar : VAR ;

typeBoolean : TYPEBOOLEAN ;
typeInt     : TYPEINT ;
typeChar    : TYPECHAR ;
typeDouble  : TYPEDOUBLE ;
typeClass   : className=IDENT;
                
methodDeclaration
  : ( visibility=(PUBLIC|PRIVATE)  )?
    ( isStatic=STATIC  )? 
    procType methodName=IDENT 
    ROUNDOPEN 
      ( variable ( COMMA variable )* )? 
    ROUNDCLOSE 
    ( THROWS exceptionID=IDENT )?
    CURLYOPEN 
        ( varDeclaration )* 
        ( statement )*
        statementReturn
    CURLYCLOSE
  ;

constructorDeclaration
  : ( visibility=(PUBLIC|PRIVATE)  )?
    ( isStatic=STATIC  )? 
    methodName=IDENT 
    ROUNDOPEN 
      ( variable ( COMMA variable )* )? 
    ROUNDCLOSE 
    CURLYOPEN 
        ( constructorCall)?
        ( varDeclaration )* 
        ( statement )*
        statementReturn
    CURLYCLOSE
  ;
  
procType
  : typeVoid  
  | type 
  ;

typeVoid: TYPEVOID ;
  
typedefDeclaration 
  : TYPEDEF STRUCT CURLYOPEN (varDeclaration)* CURLYCLOSE structName=IDENT SEMICOLON 
  ;
    
    
statement
  : block
  | tryBlock
  | statementIf
  | statementWhile
  | statementAssign
  | statementOpAssign
  | statementAssignArray
  | statementPrintln
  | statementPrint
  | statementMethod
  | statementReturn
  | statementFor
  | statementThrow
  | statementPostIncrement
  | statementPostDecrement
  | statementPreIncrement
  | statementPreDecrement      
  | varDeclarationStmt
  ;
    
tryBlock               : TRY tryBl=block CATCH ROUNDOPEN exceptionVar=variable ROUNDCLOSE catchBl=block ;
statementIf            : IF ROUNDOPEN condition=expression ROUNDCLOSE ifBlock=block (ELSE elseBlock=block )? ;
statementWhile         : WHILE ROUNDOPEN condition=expression ROUNDCLOSE whileBlock=statement ;
statementAssign        : lhs=identifier EQUAL rhs=expression SEMICOLON ;
statementOpAssign      : lhs=identifier op=(PLUS | MINUS | TIMES | DIVIDE) EQUAL rhs=expression SEMICOLON ;
statementAssignArray   : array=identifier SQUAREOPEN element=expression SQUARECLOSE EQUAL value=expression SEMICOLON;
statementPrint         : PRINT ROUNDOPEN argument=expression ROUNDCLOSE SEMICOLON ;
statementPrintln       : PRINTLN ROUNDOPEN argument=expression ROUNDCLOSE SEMICOLON ;
statementMethod        : expressionMethodCall SEMICOLON;
statementReturn        : RETURN ( argument=expression )? SEMICOLON ;
statementFor           : FOR ROUNDOPEN (init=statement)? SEMICOLON (terminate=expression)? SEMICOLON (increment=statement)? ROUNDCLOSE forBlock = statement ;
statementThrow         : THROW ROUNDOPEN expression ROUNDCLOSE ;
statementPostIncrement : expressionPostIncrement SEMICOLON ; 
statementPostDecrement : expressionPostDecrement SEMICOLON ; 
statementPreIncrement  : expressionPreIncrement SEMICOLON ; 
statementPreDecrement  : expressionPreDecrement SEMICOLON ;       
varDeclarationStmt     : varDeclaration ;
constructorCall        : (constructorName=(SUPER|THIS) ) ROUNDOPEN (arguments+=expression (COMMA arguments+=expression)* )? ROUNDCLOSE SEMICOLON ;

expression
  : head=level1 ( AND tail+=level1 )*
  ;

level1
  : head=level2 ( EQUALS tail+=level2 )*
  ;
  
level2
  : head=level3 ( operator+=(LESSTHAN | GREATERTHAN) tail+=level3 )*
  ;
    
level3
  : head=level4 ( operator+=(PLUS | MINUS) tail+=level4 )*
  ;

level4
  : head=level5 ( operator+=(TIMES | DIVIDE | MODULO) tail+=level5 )*
  ;
  
level5
    : expressionUnaryMinus
    | expressionNegation
    | expressionNewObject
    | expressionNewArray
    | expressionIdentifier
    | expressionArrayAccess
    | expressionMethodCall
    | expressionParentheses
    | expressionConstantTrue
    | expressionConstantFalse
    | expressionConstantInteger
    | expressionConstantString
    | expressionConstantChar
    | expressionConstantDouble
    | expressionPostIncrement
    | expressionPostDecrement
    | expressionPreIncrement
    | expressionPreDecrement      
    | expressionTernary
    | expressionMathSqrt
    | expressionTypeCast
    | expressionLINQ
    ; 
  
expressionUnaryMinus      : MINUS argument=level5 ;
expressionNegation        : EXCLAMATION argument=level5 ;
expressionNewObject       : NEW classname=IDENT ROUNDOPEN ROUNDCLOSE ;
expressionNewArray        : NEW TYPEINT SQUAREOPEN size=expression SQUARECLOSE ;        
expressionIdentifier      : ident=identifier ;
expressionArrayAccess     : ident=identifier SQUAREOPEN element=expression SQUARECLOSE ;
expressionParentheses     : ROUNDOPEN argument=expression ROUNDCLOSE ;
expressionConstantTrue    : TRUE ;
expressionConstantFalse   : FALSE ;
expressionConstantInteger : value=INT ;
expressionConstantString  : value=STRING ;
expressionConstantChar    : value=CHARVALUE ;
expressionConstantDouble  : value=DOUBLE ;
expressionMethodCall      : (object=identifier DOT)? method=IDENT ROUNDOPEN (arguments+=expression (COMMA arguments+=expression)* )? ROUNDCLOSE ;
expressionPostIncrement   : identifier PLUSPLUS ;
expressionPostDecrement   : identifier MINUSMINUS ;
expressionPreIncrement    : PLUSPLUS identifier ;
expressionPreDecrement    : MINUSMINUS identifier ;
expressionTernary         : ROUNDOPEN condition=expression ROUNDCLOSE QUESTION trueexpr=expression COLON falseexpr=expression ;
expressionMathSqrt        : SQRT ROUNDOPEN expression ROUNDCLOSE ;
expressionTypeCast        : (cast=type) expression ;    
expressionLINQ            : FROM fromIdent=IDENT IN inExpression=expression WHERE where=expression SELECT select=expression;


identifier
  : identifierIdentifier;

identifierIdentifier
  : identifierId ( DOT selectors+=IDENT )*
  ;

identifierId
  : idThis
  | idIDENT
  ;

idThis  : THIS ;
idIDENT : name=IDENT ;

MINUS : '-' ;
AND : '&&' ;
EQUALS : '==' ;
LESSTHAN : '<' ;
GREATERTHAN : '>' ;
PLUS : '+' ;
TIMES : '*' ;
DIVIDE : '/' ;
MODULO : '%' ;
EXCLAMATION : '!' ;
SEMICOLON : ';' ;
COMMA : ',' ;
EQUAL : '=' ;
DOT : '.' ;
QUESTION : '?' ;
COLON : ':' ;
PLUSPLUS : PLUS PLUS ;
MINUSMINUS : MINUS MINUS ;

ROUNDOPEN : '(' ;
ROUNDCLOSE : ')' ;
SQUAREOPEN : '[' ;
SQUARECLOSE : ']' ;
CURLYOPEN : '{' ;
CURLYCLOSE : '}' ;

TRUE : 'true' ;
FALSE : 'false' ;
CLASS : 'class' ;
EXTENDS : 'extends' ;
TYPEBOOLEAN : 'boolean' ;
TYPEVOID : 'void'  ;
TYPECHAR : 'char' ;
TYPEDOUBLE : 'double' ;
TYPEINT : 'int' ;
PUBLIC : 'public' ;
PRIVATE : 'private' ;
STATIC : 'static' ;
THIS : 'this' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
FOR : 'for' ;
PRINT : 'System.out.print' ;
PRINTLN : 'System.out.println' ;
SQRT : 'Math.sqrt' ;
RETURN : 'return' ;
NEW : 'new' ;
VAR : 'var' ;
TRY : 'try' ;
CATCH : 'catch' ;
THROW : 'throw' ;
THROWS : 'throws' ;
SUPER : 'super' ;
TYPEDEF : 'typedef' ;
STRUCT : 'struct' ;
FROM : 'from' ;
IN : 'in' ;
WHERE : 'where' ;
SELECT : 'select' ;

fragment LOWER : ('a'..'z');
fragment UPPER : ('A'..'Z');
fragment NONNULL : ('1'..'9');
fragment NUMBER : ('0' | NONNULL);
IDENT : ( LOWER | UPPER ) ( LOWER | UPPER | NUMBER | '_' )*;
INT : '0' | ( NONNULL NUMBER* );
DOUBLE : INT ( '.' NUMBER* )? ;
fragment CHAR : ' ' | '!' | ('\u0023'..'\u005B') | ('\u005D'..'\u007E') | '\\"' | '\\\\' | '\\t' | '\\n';
CHARVALUE : '\'' CHAR '\'' ;
STRING : '"' CHAR*? '"' ;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;
WHITESPACE  :   [ \t\n\r]+ -> skip;
