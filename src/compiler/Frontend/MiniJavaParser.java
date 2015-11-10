// Generated from /Users/probst/workspace/MiniJava_Analysis/src/compiler/Frontend/MiniJava.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MINUS=1, AND=2, EQUALS=3, LESSTHAN=4, GREATERTHAN=5, PLUS=6, TIMES=7, 
		DIVIDE=8, MODULO=9, EXCLAMATION=10, SEMICOLON=11, COMMA=12, EQUAL=13, 
		DOT=14, QUESTION=15, COLON=16, PLUSPLUS=17, MINUSMINUS=18, ROUNDOPEN=19, 
		ROUNDCLOSE=20, SQUAREOPEN=21, SQUARECLOSE=22, CURLYOPEN=23, CURLYCLOSE=24, 
		TRUE=25, FALSE=26, CLASS=27, EXTENDS=28, TYPEBOOLEAN=29, TYPEVOID=30, 
		TYPECHAR=31, TYPEDOUBLE=32, TYPEINT=33, PUBLIC=34, PRIVATE=35, STATIC=36, 
		THIS=37, IF=38, ELSE=39, WHILE=40, FOR=41, PRINT=42, PRINTLN=43, SQRT=44, 
		RETURN=45, NEW=46, VAR=47, TRY=48, CATCH=49, THROW=50, THROWS=51, SUPER=52, 
		TYPEDEF=53, STRUCT=54, FROM=55, IN=56, WHERE=57, SELECT=58, IDENT=59, 
		INT=60, DOUBLE=61, CHARVALUE=62, STRING=63, LINE_COMMENT=64, MULTILINE_COMMENT=65, 
		WHITESPACE=66;
	public static final String[] tokenNames = {
		"<INVALID>", "'-'", "'&&'", "'=='", "'<'", "'>'", "'+'", "'*'", "'/'", 
		"'%'", "'!'", "';'", "','", "'='", "'.'", "'?'", "':'", "PLUSPLUS", "MINUSMINUS", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'true'", "'false'", "'class'", 
		"'extends'", "'boolean'", "'void'", "'char'", "'double'", "'int'", "'public'", 
		"'private'", "'static'", "'this'", "'if'", "'else'", "'while'", "'for'", 
		"'System.out.print'", "'System.out.println'", "'Math.sqrt'", "'return'", 
		"'new'", "'var'", "'try'", "'catch'", "'throw'", "'throws'", "'super'", 
		"'typedef'", "'struct'", "'from'", "'in'", "'where'", "'select'", "IDENT", 
		"INT", "DOUBLE", "CHARVALUE", "STRING", "LINE_COMMENT", "MULTILINE_COMMENT", 
		"WHITESPACE"
	};
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_innerClassDeclaration = 2, 
		RULE_attributeDeclaration = 3, RULE_mainClass = 4, RULE_block = 5, RULE_varDeclaration = 6, 
		RULE_declExpression = 7, RULE_arrayinit = 8, RULE_variable = 9, RULE_type = 10, 
		RULE_typeBasic = 11, RULE_typeArray = 12, RULE_typeVar = 13, RULE_typeBoolean = 14, 
		RULE_typeInt = 15, RULE_typeChar = 16, RULE_typeDouble = 17, RULE_typeClass = 18, 
		RULE_methodDeclaration = 19, RULE_constructorDeclaration = 20, RULE_procType = 21, 
		RULE_typeVoid = 22, RULE_typedefDeclaration = 23, RULE_statement = 24, 
		RULE_tryBlock = 25, RULE_statementIf = 26, RULE_statementWhile = 27, RULE_statementAssign = 28, 
		RULE_statementOpAssign = 29, RULE_statementAssignArray = 30, RULE_statementPrint = 31, 
		RULE_statementPrintln = 32, RULE_statementMethod = 33, RULE_statementReturn = 34, 
		RULE_statementFor = 35, RULE_statementThrow = 36, RULE_statementPostIncrement = 37, 
		RULE_statementPostDecrement = 38, RULE_statementPreIncrement = 39, RULE_statementPreDecrement = 40, 
		RULE_varDeclarationStmt = 41, RULE_constructorCall = 42, RULE_expression = 43, 
		RULE_level1 = 44, RULE_level2 = 45, RULE_level3 = 46, RULE_level4 = 47, 
		RULE_level5 = 48, RULE_expressionUnaryMinus = 49, RULE_expressionNegation = 50, 
		RULE_expressionNewObject = 51, RULE_expressionNewArray = 52, RULE_expressionIdentifier = 53, 
		RULE_expressionArrayAccess = 54, RULE_expressionParentheses = 55, RULE_expressionConstantTrue = 56, 
		RULE_expressionConstantFalse = 57, RULE_expressionConstantInteger = 58, 
		RULE_expressionConstantString = 59, RULE_expressionConstantChar = 60, 
		RULE_expressionConstantDouble = 61, RULE_expressionMethodCall = 62, RULE_expressionPostIncrement = 63, 
		RULE_expressionPostDecrement = 64, RULE_expressionPreIncrement = 65, RULE_expressionPreDecrement = 66, 
		RULE_expressionTernary = 67, RULE_expressionMathSqrt = 68, RULE_expressionTypeCast = 69, 
		RULE_expressionLINQ = 70, RULE_identifier = 71, RULE_identifierIdentifier = 72, 
		RULE_identifierId = 73, RULE_idThis = 74, RULE_idIDENT = 75;
	public static final String[] ruleNames = {
		"program", "classDeclaration", "innerClassDeclaration", "attributeDeclaration", 
		"mainClass", "block", "varDeclaration", "declExpression", "arrayinit", 
		"variable", "type", "typeBasic", "typeArray", "typeVar", "typeBoolean", 
		"typeInt", "typeChar", "typeDouble", "typeClass", "methodDeclaration", 
		"constructorDeclaration", "procType", "typeVoid", "typedefDeclaration", 
		"statement", "tryBlock", "statementIf", "statementWhile", "statementAssign", 
		"statementOpAssign", "statementAssignArray", "statementPrint", "statementPrintln", 
		"statementMethod", "statementReturn", "statementFor", "statementThrow", 
		"statementPostIncrement", "statementPostDecrement", "statementPreIncrement", 
		"statementPreDecrement", "varDeclarationStmt", "constructorCall", "expression", 
		"level1", "level2", "level3", "level4", "level5", "expressionUnaryMinus", 
		"expressionNegation", "expressionNewObject", "expressionNewArray", "expressionIdentifier", 
		"expressionArrayAccess", "expressionParentheses", "expressionConstantTrue", 
		"expressionConstantFalse", "expressionConstantInteger", "expressionConstantString", 
		"expressionConstantChar", "expressionConstantDouble", "expressionMethodCall", 
		"expressionPostIncrement", "expressionPostDecrement", "expressionPreIncrement", 
		"expressionPreDecrement", "expressionTernary", "expressionMathSqrt", "expressionTypeCast", 
		"expressionLINQ", "identifier", "identifierIdentifier", "identifierId", 
		"idThis", "idIDENT"
	};

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<TypedefDeclarationContext> typedefDeclaration() {
			return getRuleContexts(TypedefDeclarationContext.class);
		}
		public TypedefDeclarationContext typedefDeclaration(int i) {
			return getRuleContext(TypedefDeclarationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); mainClass();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(153); classDeclaration();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPEDEF) {
				{
				{
				setState(159); typedefDeclaration();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token className;
		public Token superClassName;
		public AttributeDeclarationContext attributeDeclaration(int i) {
			return getRuleContext(AttributeDeclarationContext.class,i);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public List<InnerClassDeclarationContext> innerClassDeclaration() {
			return getRuleContexts(InnerClassDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<AttributeDeclarationContext> attributeDeclaration() {
			return getRuleContexts(AttributeDeclarationContext.class);
		}
		public InnerClassDeclarationContext innerClassDeclaration(int i) {
			return getRuleContext(InnerClassDeclarationContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public TerminalNode EXTENDS() { return getToken(MiniJavaParser.EXTENDS, 0); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(CLASS);
			setState(166); ((ClassDeclarationContext)_localctx).className = match(IDENT);
			setState(169);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(167); match(EXTENDS);
				setState(168); ((ClassDeclarationContext)_localctx).superClassName = match(IDENT);
				}
			}

			setState(171); match(CURLYOPEN);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(172); innerClassDeclaration();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(178); attributeDeclaration();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(184); constructorDeclaration();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEBOOLEAN) | (1L << TYPEVOID) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC) | (1L << VAR) | (1L << IDENT))) != 0)) {
				{
				{
				setState(190); methodDeclaration();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196); match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerClassDeclarationContext extends ParserRuleContext {
		public Token className;
		public AttributeDeclarationContext attributeDeclaration(int i) {
			return getRuleContext(AttributeDeclarationContext.class,i);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<AttributeDeclarationContext> attributeDeclaration() {
			return getRuleContexts(AttributeDeclarationContext.class);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public InnerClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterInnerClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitInnerClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitInnerClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerClassDeclarationContext innerClassDeclaration() throws RecognitionException {
		InnerClassDeclarationContext _localctx = new InnerClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_innerClassDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198); match(CLASS);
			setState(199); ((InnerClassDeclarationContext)_localctx).className = match(IDENT);
			setState(200); match(CURLYOPEN);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(201); attributeDeclaration();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(207); constructorDeclaration();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEBOOLEAN) | (1L << TYPEVOID) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC) | (1L << VAR) | (1L << IDENT))) != 0)) {
				{
				{
				setState(213); methodDeclaration();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219); match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeDeclarationContext extends ParserRuleContext {
		public Token visibility;
		public Token isStatic;
		public TerminalNode PUBLIC() { return getToken(MiniJavaParser.PUBLIC, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public TerminalNode PRIVATE() { return getToken(MiniJavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(MiniJavaParser.STATIC, 0); }
		public AttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAttributeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAttributeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDeclarationContext attributeDeclaration() throws RecognitionException {
		AttributeDeclarationContext _localctx = new AttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attributeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(221);
				((AttributeDeclarationContext)_localctx).visibility = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					((AttributeDeclarationContext)_localctx).visibility = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(225);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(224); ((AttributeDeclarationContext)_localctx).isStatic = match(STATIC);
				}
			}

			setState(227); varDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public Token className;
		public MethodDeclarationContext method;
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(CLASS);
			setState(230); ((MainClassContext)_localctx).className = match(IDENT);
			setState(231); match(CURLYOPEN);
			setState(232); ((MainClassContext)_localctx).method = methodDeclaration();
			setState(233); match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235); match(CURLYOPEN);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(236); varDeclaration();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << CURLYOPEN) | (1L << TYPEBOOLEAN) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTLN) | (1L << RETURN) | (1L << VAR) | (1L << TRY) | (1L << THROW) | (1L << IDENT))) != 0)) {
				{
				{
				setState(242); statement();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248); match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public VariableContext var;
		public DeclExpressionContext value;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public DeclExpressionContext declExpression() {
			return getRuleContext(DeclExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MiniJavaParser.EQUAL, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); ((VarDeclarationContext)_localctx).var = variable();
			setState(253);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(251); match(EQUAL);
				setState(252); ((VarDeclarationContext)_localctx).value = declExpression();
				}
			}

			setState(255); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayinitContext arrayinit() {
			return getRuleContext(ArrayinitContext.class,0);
		}
		public DeclExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterDeclExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitDeclExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitDeclExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclExpressionContext declExpression() throws RecognitionException {
		DeclExpressionContext _localctx = new DeclExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declExpression);
		try {
			setState(259);
			switch (_input.LA(1)) {
			case MINUS:
			case EXCLAMATION:
			case PLUSPLUS:
			case MINUSMINUS:
			case ROUNDOPEN:
			case TRUE:
			case FALSE:
			case TYPEBOOLEAN:
			case TYPECHAR:
			case TYPEDOUBLE:
			case TYPEINT:
			case THIS:
			case SQRT:
			case NEW:
			case VAR:
			case FROM:
			case IDENT:
			case INT:
			case DOUBLE:
			case CHARVALUE:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); expression();
				}
				break;
			case CURLYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(258); arrayinit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayinitContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> values = new ArrayList<ExpressionContext>();
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public ArrayinitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayinit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayinit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayinit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayinit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayinitContext arrayinit() throws RecognitionException {
		ArrayinitContext _localctx = new ArrayinitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayinit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(CURLYOPEN);
			setState(270);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << ROUNDOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << TYPEBOOLEAN) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << THIS) | (1L << SQRT) | (1L << NEW) | (1L << VAR) | (1L << FROM) | (1L << IDENT) | (1L << INT) | (1L << DOUBLE) | (1L << CHARVALUE) | (1L << STRING))) != 0)) {
				{
				setState(262); ((ArrayinitContext)_localctx).expression = expression();
				((ArrayinitContext)_localctx).values.add(((ArrayinitContext)_localctx).expression);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(263); match(COMMA);
					setState(264); ((ArrayinitContext)_localctx).expression = expression();
					((ArrayinitContext)_localctx).values.add(((ArrayinitContext)_localctx).expression);
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(272); match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Token variableName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); type();
			setState(275); ((VariableContext)_localctx).variableName = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeArrayContext typeArray() {
			return getRuleContext(TypeArrayContext.class,0);
		}
		public TypeVarContext typeVar() {
			return getRuleContext(TypeVarContext.class,0);
		}
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); typeBasic();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); typeArray();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279); typeVar();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBasicContext extends ParserRuleContext {
		public TypeBooleanContext typeBoolean() {
			return getRuleContext(TypeBooleanContext.class,0);
		}
		public TypeClassContext typeClass() {
			return getRuleContext(TypeClassContext.class,0);
		}
		public TypeIntContext typeInt() {
			return getRuleContext(TypeIntContext.class,0);
		}
		public TypeCharContext typeChar() {
			return getRuleContext(TypeCharContext.class,0);
		}
		public TypeDoubleContext typeDouble() {
			return getRuleContext(TypeDoubleContext.class,0);
		}
		public TypeBasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBasic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBasicContext typeBasic() throws RecognitionException {
		TypeBasicContext _localctx = new TypeBasicContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeBasic);
		try {
			setState(287);
			switch (_input.LA(1)) {
			case TYPEBOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(282); typeBoolean();
				}
				break;
			case TYPEINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(283); typeInt();
				}
				break;
			case TYPECHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(284); typeChar();
				}
				break;
			case TYPEDOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(285); typeDouble();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(286); typeClass();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArrayContext extends ParserRuleContext {
		public TerminalNode SQUARECLOSE() { return getToken(MiniJavaParser.SQUARECLOSE, 0); }
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TerminalNode SQUAREOPEN() { return getToken(MiniJavaParser.SQUAREOPEN, 0); }
		public TypeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArrayContext typeArray() throws RecognitionException {
		TypeArrayContext _localctx = new TypeArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); typeBasic();
			setState(290); match(SQUAREOPEN);
			setState(291); match(SQUARECLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniJavaParser.VAR, 0); }
		public TypeVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVarContext typeVar() throws RecognitionException {
		TypeVarContext _localctx = new TypeVarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBooleanContext extends ParserRuleContext {
		public TerminalNode TYPEBOOLEAN() { return getToken(MiniJavaParser.TYPEBOOLEAN, 0); }
		public TypeBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBooleanContext typeBoolean() throws RecognitionException {
		TypeBooleanContext _localctx = new TypeBooleanContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); match(TYPEBOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIntContext extends ParserRuleContext {
		public TerminalNode TYPEINT() { return getToken(MiniJavaParser.TYPEINT, 0); }
		public TypeIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIntContext typeInt() throws RecognitionException {
		TypeIntContext _localctx = new TypeIntContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(TYPEINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeCharContext extends ParserRuleContext {
		public TerminalNode TYPECHAR() { return getToken(MiniJavaParser.TYPECHAR, 0); }
		public TypeCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCharContext typeChar() throws RecognitionException {
		TypeCharContext _localctx = new TypeCharContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(TYPECHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDoubleContext extends ParserRuleContext {
		public TerminalNode TYPEDOUBLE() { return getToken(MiniJavaParser.TYPEDOUBLE, 0); }
		public TypeDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDoubleContext typeDouble() throws RecognitionException {
		TypeDoubleContext _localctx = new TypeDoubleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(TYPEDOUBLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeClassContext extends ParserRuleContext {
		public Token className;
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TypeClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeClassContext typeClass() throws RecognitionException {
		TypeClassContext _localctx = new TypeClassContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); ((TypeClassContext)_localctx).className = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public Token visibility;
		public Token isStatic;
		public Token methodName;
		public Token exceptionID;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ProcTypeContext procType() {
			return getRuleContext(ProcTypeContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(MiniJavaParser.THROWS, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode PRIVATE() { return getToken(MiniJavaParser.PRIVATE, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public TerminalNode PUBLIC() { return getToken(MiniJavaParser.PUBLIC, 0); }
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode STATIC() { return getToken(MiniJavaParser.STATIC, 0); }
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(305);
				((MethodDeclarationContext)_localctx).visibility = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					((MethodDeclarationContext)_localctx).visibility = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(309);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(308); ((MethodDeclarationContext)_localctx).isStatic = match(STATIC);
				}
			}

			setState(311); procType();
			setState(312); ((MethodDeclarationContext)_localctx).methodName = match(IDENT);
			setState(313); match(ROUNDOPEN);
			setState(322);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEBOOLEAN) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << VAR) | (1L << IDENT))) != 0)) {
				{
				setState(314); variable();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(315); match(COMMA);
					setState(316); variable();
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(324); match(ROUNDCLOSE);
			setState(327);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(325); match(THROWS);
				setState(326); ((MethodDeclarationContext)_localctx).exceptionID = match(IDENT);
				}
			}

			setState(329); match(CURLYOPEN);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(330); varDeclaration();
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(336); statement();
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(342); statementReturn();
			setState(343); match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public Token visibility;
		public Token isStatic;
		public Token methodName;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public ConstructorCallContext constructorCall() {
			return getRuleContext(ConstructorCallContext.class,0);
		}
		public TerminalNode PRIVATE() { return getToken(MiniJavaParser.PRIVATE, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public TerminalNode PUBLIC() { return getToken(MiniJavaParser.PUBLIC, 0); }
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode STATIC() { return getToken(MiniJavaParser.STATIC, 0); }
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructorDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(345);
				((ConstructorDeclarationContext)_localctx).visibility = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					((ConstructorDeclarationContext)_localctx).visibility = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(349);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(348); ((ConstructorDeclarationContext)_localctx).isStatic = match(STATIC);
				}
			}

			setState(351); ((ConstructorDeclarationContext)_localctx).methodName = match(IDENT);
			setState(352); match(ROUNDOPEN);
			setState(361);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEBOOLEAN) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << VAR) | (1L << IDENT))) != 0)) {
				{
				setState(353); variable();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(354); match(COMMA);
					setState(355); variable();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(363); match(ROUNDCLOSE);
			setState(364); match(CURLYOPEN);
			setState(366);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(365); constructorCall();
				}
				break;
			}
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(368); varDeclaration();
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(374); statement();
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(380); statementReturn();
			setState(381); match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeVoidContext typeVoid() {
			return getRuleContext(TypeVoidContext.class,0);
		}
		public ProcTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProcType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProcType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProcType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcTypeContext procType() throws RecognitionException {
		ProcTypeContext _localctx = new ProcTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_procType);
		try {
			setState(385);
			switch (_input.LA(1)) {
			case TYPEVOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(383); typeVoid();
				}
				break;
			case TYPEBOOLEAN:
			case TYPECHAR:
			case TYPEDOUBLE:
			case TYPEINT:
			case VAR:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(384); type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVoidContext extends ParserRuleContext {
		public TerminalNode TYPEVOID() { return getToken(MiniJavaParser.TYPEVOID, 0); }
		public TypeVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVoidContext typeVoid() throws RecognitionException {
		TypeVoidContext _localctx = new TypeVoidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); match(TYPEVOID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefDeclarationContext extends ParserRuleContext {
		public Token structName;
		public TerminalNode STRUCT() { return getToken(MiniJavaParser.STRUCT, 0); }
		public TerminalNode TYPEDEF() { return getToken(MiniJavaParser.TYPEDEF, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public TypedefDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypedefDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypedefDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypedefDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefDeclarationContext typedefDeclaration() throws RecognitionException {
		TypedefDeclarationContext _localctx = new TypedefDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typedefDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(TYPEDEF);
			setState(390); match(STRUCT);
			setState(391); match(CURLYOPEN);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEBOOLEAN) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << VAR) | (1L << IDENT))) != 0)) {
				{
				{
				setState(392); varDeclaration();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398); match(CURLYCLOSE);
			setState(399); ((TypedefDeclarationContext)_localctx).structName = match(IDENT);
			setState(400); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementPostIncrementContext statementPostIncrement() {
			return getRuleContext(StatementPostIncrementContext.class,0);
		}
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public StatementOpAssignContext statementOpAssign() {
			return getRuleContext(StatementOpAssignContext.class,0);
		}
		public StatementPrintContext statementPrint() {
			return getRuleContext(StatementPrintContext.class,0);
		}
		public StatementPrintlnContext statementPrintln() {
			return getRuleContext(StatementPrintlnContext.class,0);
		}
		public StatementMethodContext statementMethod() {
			return getRuleContext(StatementMethodContext.class,0);
		}
		public StatementWhileContext statementWhile() {
			return getRuleContext(StatementWhileContext.class,0);
		}
		public StatementPreIncrementContext statementPreIncrement() {
			return getRuleContext(StatementPreIncrementContext.class,0);
		}
		public StatementIfContext statementIf() {
			return getRuleContext(StatementIfContext.class,0);
		}
		public StatementPreDecrementContext statementPreDecrement() {
			return getRuleContext(StatementPreDecrementContext.class,0);
		}
		public StatementAssignContext statementAssign() {
			return getRuleContext(StatementAssignContext.class,0);
		}
		public StatementAssignArrayContext statementAssignArray() {
			return getRuleContext(StatementAssignArrayContext.class,0);
		}
		public VarDeclarationStmtContext varDeclarationStmt() {
			return getRuleContext(VarDeclarationStmtContext.class,0);
		}
		public StatementForContext statementFor() {
			return getRuleContext(StatementForContext.class,0);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public StatementPostDecrementContext statementPostDecrement() {
			return getRuleContext(StatementPostDecrementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementThrowContext statementThrow() {
			return getRuleContext(StatementThrowContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(420);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403); tryBlock();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404); statementIf();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(405); statementWhile();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(406); statementAssign();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(407); statementOpAssign();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(408); statementAssignArray();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(409); statementPrintln();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(410); statementPrint();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(411); statementMethod();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(412); statementReturn();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(413); statementFor();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(414); statementThrow();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(415); statementPostIncrement();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(416); statementPostDecrement();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(417); statementPreIncrement();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(418); statementPreDecrement();
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(419); varDeclarationStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryBlockContext extends ParserRuleContext {
		public BlockContext tryBl;
		public VariableContext exceptionVar;
		public BlockContext catchBl;
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode CATCH() { return getToken(MiniJavaParser.CATCH, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode TRY() { return getToken(MiniJavaParser.TRY, 0); }
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tryBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(TRY);
			setState(423); ((TryBlockContext)_localctx).tryBl = block();
			setState(424); match(CATCH);
			setState(425); match(ROUNDOPEN);
			setState(426); ((TryBlockContext)_localctx).exceptionVar = variable();
			setState(427); match(ROUNDCLOSE);
			setState(428); ((TryBlockContext)_localctx).catchBl = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementIfContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext ifBlock;
		public BlockContext elseBlock;
		public TerminalNode IF() { return getToken(MiniJavaParser.IF, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ELSE() { return getToken(MiniJavaParser.ELSE, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public StatementIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIfContext statementIf() throws RecognitionException {
		StatementIfContext _localctx = new StatementIfContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statementIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(IF);
			setState(431); match(ROUNDOPEN);
			setState(432); ((StatementIfContext)_localctx).condition = expression();
			setState(433); match(ROUNDCLOSE);
			setState(434); ((StatementIfContext)_localctx).ifBlock = block();
			setState(437);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(435); match(ELSE);
				setState(436); ((StatementIfContext)_localctx).elseBlock = block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWhileContext extends ParserRuleContext {
		public ExpressionContext condition;
		public StatementContext whileBlock;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(MiniJavaParser.WHILE, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWhileContext statementWhile() throws RecognitionException {
		StatementWhileContext _localctx = new StatementWhileContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statementWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); match(WHILE);
			setState(440); match(ROUNDOPEN);
			setState(441); ((StatementWhileContext)_localctx).condition = expression();
			setState(442); match(ROUNDCLOSE);
			setState(443); ((StatementWhileContext)_localctx).whileBlock = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignContext extends ParserRuleContext {
		public IdentifierContext lhs;
		public ExpressionContext rhs;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MiniJavaParser.EQUAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignContext statementAssign() throws RecognitionException {
		StatementAssignContext _localctx = new StatementAssignContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statementAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); ((StatementAssignContext)_localctx).lhs = identifier();
			setState(446); match(EQUAL);
			setState(447); ((StatementAssignContext)_localctx).rhs = expression();
			setState(448); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementOpAssignContext extends ParserRuleContext {
		public IdentifierContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public TerminalNode TIMES() { return getToken(MiniJavaParser.TIMES, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode MINUS() { return getToken(MiniJavaParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MiniJavaParser.PLUS, 0); }
		public TerminalNode EQUAL() { return getToken(MiniJavaParser.EQUAL, 0); }
		public TerminalNode DIVIDE() { return getToken(MiniJavaParser.DIVIDE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementOpAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementOpAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementOpAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementOpAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementOpAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementOpAssignContext statementOpAssign() throws RecognitionException {
		StatementOpAssignContext _localctx = new StatementOpAssignContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statementOpAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); ((StatementOpAssignContext)_localctx).lhs = identifier();
			setState(451);
			((StatementOpAssignContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << TIMES) | (1L << DIVIDE))) != 0)) ) {
				((StatementOpAssignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(452); match(EQUAL);
			setState(453); ((StatementOpAssignContext)_localctx).rhs = expression();
			setState(454); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignArrayContext extends ParserRuleContext {
		public IdentifierContext array;
		public ExpressionContext element;
		public ExpressionContext value;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode SQUARECLOSE() { return getToken(MiniJavaParser.SQUARECLOSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode EQUAL() { return getToken(MiniJavaParser.EQUAL, 0); }
		public TerminalNode SQUAREOPEN() { return getToken(MiniJavaParser.SQUAREOPEN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementAssignArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementAssignArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementAssignArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementAssignArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignArrayContext statementAssignArray() throws RecognitionException {
		StatementAssignArrayContext _localctx = new StatementAssignArrayContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statementAssignArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); ((StatementAssignArrayContext)_localctx).array = identifier();
			setState(457); match(SQUAREOPEN);
			setState(458); ((StatementAssignArrayContext)_localctx).element = expression();
			setState(459); match(SQUARECLOSE);
			setState(460); match(EQUAL);
			setState(461); ((StatementAssignArrayContext)_localctx).value = expression();
			setState(462); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementPrintContext extends ParserRuleContext {
		public ExpressionContext argument;
		public TerminalNode PRINT() { return getToken(MiniJavaParser.PRINT, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPrintContext statementPrint() throws RecognitionException {
		StatementPrintContext _localctx = new StatementPrintContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statementPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); match(PRINT);
			setState(465); match(ROUNDOPEN);
			setState(466); ((StatementPrintContext)_localctx).argument = expression();
			setState(467); match(ROUNDCLOSE);
			setState(468); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementPrintlnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRINTLN() { return getToken(MiniJavaParser.PRINTLN, 0); }
		public StatementPrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPrintln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPrintlnContext statementPrintln() throws RecognitionException {
		StatementPrintlnContext _localctx = new StatementPrintlnContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statementPrintln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); match(PRINTLN);
			setState(471); match(ROUNDOPEN);
			setState(472); ((StatementPrintlnContext)_localctx).argument = expression();
			setState(473); match(ROUNDCLOSE);
			setState(474); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementMethodContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionMethodCallContext expressionMethodCall() {
			return getRuleContext(ExpressionMethodCallContext.class,0);
		}
		public StatementMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementMethodContext statementMethod() throws RecognitionException {
		StatementMethodContext _localctx = new StatementMethodContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statementMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); expressionMethodCall();
			setState(477); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementReturnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(MiniJavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementReturnContext statementReturn() throws RecognitionException {
		StatementReturnContext _localctx = new StatementReturnContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_statementReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); match(RETURN);
			setState(481);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << ROUNDOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << TYPEBOOLEAN) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << THIS) | (1L << SQRT) | (1L << NEW) | (1L << VAR) | (1L << FROM) | (1L << IDENT) | (1L << INT) | (1L << DOUBLE) | (1L << CHARVALUE) | (1L << STRING))) != 0)) {
				{
				setState(480); ((StatementReturnContext)_localctx).argument = expression();
				}
			}

			setState(483); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementForContext extends ParserRuleContext {
		public StatementContext init;
		public ExpressionContext terminate;
		public StatementContext increment;
		public StatementContext forBlock;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniJavaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniJavaParser.SEMICOLON, i);
		}
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public TerminalNode FOR() { return getToken(MiniJavaParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementForContext statementFor() throws RecognitionException {
		StatementForContext _localctx = new StatementForContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statementFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485); match(FOR);
			setState(486); match(ROUNDOPEN);
			setState(488);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << CURLYOPEN) | (1L << TYPEBOOLEAN) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTLN) | (1L << RETURN) | (1L << VAR) | (1L << TRY) | (1L << THROW) | (1L << IDENT))) != 0)) {
				{
				setState(487); ((StatementForContext)_localctx).init = statement();
				}
			}

			setState(490); match(SEMICOLON);
			setState(492);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << ROUNDOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << TYPEBOOLEAN) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << THIS) | (1L << SQRT) | (1L << NEW) | (1L << VAR) | (1L << FROM) | (1L << IDENT) | (1L << INT) | (1L << DOUBLE) | (1L << CHARVALUE) | (1L << STRING))) != 0)) {
				{
				setState(491); ((StatementForContext)_localctx).terminate = expression();
				}
			}

			setState(494); match(SEMICOLON);
			setState(496);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << CURLYOPEN) | (1L << TYPEBOOLEAN) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTLN) | (1L << RETURN) | (1L << VAR) | (1L << TRY) | (1L << THROW) | (1L << IDENT))) != 0)) {
				{
				setState(495); ((StatementForContext)_localctx).increment = statement();
				}
			}

			setState(498); match(ROUNDCLOSE);
			setState(499); ((StatementForContext)_localctx).forBlock = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementThrowContext extends ParserRuleContext {
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THROW() { return getToken(MiniJavaParser.THROW, 0); }
		public StatementThrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementThrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementThrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementThrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementThrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementThrowContext statementThrow() throws RecognitionException {
		StatementThrowContext _localctx = new StatementThrowContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_statementThrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501); match(THROW);
			setState(502); match(ROUNDOPEN);
			setState(503); expression();
			setState(504); match(ROUNDCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementPostIncrementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPostIncrementContext expressionPostIncrement() {
			return getRuleContext(ExpressionPostIncrementContext.class,0);
		}
		public StatementPostIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPostIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPostIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPostIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPostIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPostIncrementContext statementPostIncrement() throws RecognitionException {
		StatementPostIncrementContext _localctx = new StatementPostIncrementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_statementPostIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506); expressionPostIncrement();
			setState(507); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementPostDecrementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPostDecrementContext expressionPostDecrement() {
			return getRuleContext(ExpressionPostDecrementContext.class,0);
		}
		public StatementPostDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPostDecrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPostDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPostDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPostDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPostDecrementContext statementPostDecrement() throws RecognitionException {
		StatementPostDecrementContext _localctx = new StatementPostDecrementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statementPostDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509); expressionPostDecrement();
			setState(510); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementPreIncrementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPreIncrementContext expressionPreIncrement() {
			return getRuleContext(ExpressionPreIncrementContext.class,0);
		}
		public StatementPreIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPreIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPreIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPreIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPreIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPreIncrementContext statementPreIncrement() throws RecognitionException {
		StatementPreIncrementContext _localctx = new StatementPreIncrementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_statementPreIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512); expressionPreIncrement();
			setState(513); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementPreDecrementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPreDecrementContext expressionPreDecrement() {
			return getRuleContext(ExpressionPreDecrementContext.class,0);
		}
		public StatementPreDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPreDecrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPreDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPreDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPreDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPreDecrementContext statementPreDecrement() throws RecognitionException {
		StatementPreDecrementContext _localctx = new StatementPreDecrementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statementPreDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515); expressionPreDecrement();
			setState(516); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationStmtContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarationStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclarationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclarationStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclarationStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationStmtContext varDeclarationStmt() throws RecognitionException {
		VarDeclarationStmtContext _localctx = new VarDeclarationStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_varDeclarationStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518); varDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorCallContext extends ParserRuleContext {
		public Token constructorName;
		public ExpressionContext expression;
		public List<ExpressionContext> arguments = new ArrayList<ExpressionContext>();
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode SUPER() { return getToken(MiniJavaParser.SUPER, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public TerminalNode THIS() { return getToken(MiniJavaParser.THIS, 0); }
		public ConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitConstructorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorCallContext constructorCall() throws RecognitionException {
		ConstructorCallContext _localctx = new ConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_constructorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(520);
			((ConstructorCallContext)_localctx).constructorName = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==SUPER) ) {
				((ConstructorCallContext)_localctx).constructorName = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
			setState(521); match(ROUNDOPEN);
			setState(530);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << ROUNDOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << TYPEBOOLEAN) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << THIS) | (1L << SQRT) | (1L << NEW) | (1L << VAR) | (1L << FROM) | (1L << IDENT) | (1L << INT) | (1L << DOUBLE) | (1L << CHARVALUE) | (1L << STRING))) != 0)) {
				{
				setState(522); ((ConstructorCallContext)_localctx).expression = expression();
				((ConstructorCallContext)_localctx).arguments.add(((ConstructorCallContext)_localctx).expression);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(523); match(COMMA);
					setState(524); ((ConstructorCallContext)_localctx).expression = expression();
					((ConstructorCallContext)_localctx).arguments.add(((ConstructorCallContext)_localctx).expression);
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(532); match(ROUNDCLOSE);
			setState(533); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Level1Context head;
		public Level1Context level1;
		public List<Level1Context> tail = new ArrayList<Level1Context>();
		public List<Level1Context> level1() {
			return getRuleContexts(Level1Context.class);
		}
		public Level1Context level1(int i) {
			return getRuleContext(Level1Context.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(MiniJavaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MiniJavaParser.AND, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(535); ((ExpressionContext)_localctx).head = level1();
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(536); match(AND);
					setState(537); ((ExpressionContext)_localctx).level1 = level1();
					((ExpressionContext)_localctx).tail.add(((ExpressionContext)_localctx).level1);
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level1Context extends ParserRuleContext {
		public Level2Context head;
		public Level2Context level2;
		public List<Level2Context> tail = new ArrayList<Level2Context>();
		public Level2Context level2(int i) {
			return getRuleContext(Level2Context.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(MiniJavaParser.EQUALS); }
		public List<Level2Context> level2() {
			return getRuleContexts(Level2Context.class);
		}
		public TerminalNode EQUALS(int i) {
			return getToken(MiniJavaParser.EQUALS, i);
		}
		public Level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level1Context level1() throws RecognitionException {
		Level1Context _localctx = new Level1Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_level1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(543); ((Level1Context)_localctx).head = level2();
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(544); match(EQUALS);
					setState(545); ((Level1Context)_localctx).level2 = level2();
					((Level1Context)_localctx).tail.add(((Level1Context)_localctx).level2);
					}
					} 
				}
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level2Context extends ParserRuleContext {
		public Level3Context head;
		public Token LESSTHAN;
		public List<Token> operator = new ArrayList<Token>();
		public Token GREATERTHAN;
		public Token _tset1069;
		public Level3Context level3;
		public List<Level3Context> tail = new ArrayList<Level3Context>();
		public List<TerminalNode> LESSTHAN() { return getTokens(MiniJavaParser.LESSTHAN); }
		public List<TerminalNode> GREATERTHAN() { return getTokens(MiniJavaParser.GREATERTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(MiniJavaParser.LESSTHAN, i);
		}
		public TerminalNode GREATERTHAN(int i) {
			return getToken(MiniJavaParser.GREATERTHAN, i);
		}
		public Level3Context level3(int i) {
			return getRuleContext(Level3Context.class,i);
		}
		public List<Level3Context> level3() {
			return getRuleContexts(Level3Context.class);
		}
		public Level2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level2Context level2() throws RecognitionException {
		Level2Context _localctx = new Level2Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_level2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551); ((Level2Context)_localctx).head = level3();
			setState(556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(552);
					((Level2Context)_localctx)._tset1069 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==LESSTHAN || _la==GREATERTHAN) ) {
						((Level2Context)_localctx)._tset1069 = (Token)_errHandler.recoverInline(this);
					}
					consume();
					((Level2Context)_localctx).operator.add(((Level2Context)_localctx)._tset1069);
					setState(553); ((Level2Context)_localctx).level3 = level3();
					((Level2Context)_localctx).tail.add(((Level2Context)_localctx).level3);
					}
					} 
				}
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level3Context extends ParserRuleContext {
		public Level4Context head;
		public Token PLUS;
		public List<Token> operator = new ArrayList<Token>();
		public Token MINUS;
		public Token _tset1098;
		public Level4Context level4;
		public List<Level4Context> tail = new ArrayList<Level4Context>();
		public TerminalNode MINUS(int i) {
			return getToken(MiniJavaParser.MINUS, i);
		}
		public Level4Context level4(int i) {
			return getRuleContext(Level4Context.class,i);
		}
		public List<Level4Context> level4() {
			return getRuleContexts(Level4Context.class);
		}
		public List<TerminalNode> MINUS() { return getTokens(MiniJavaParser.MINUS); }
		public List<TerminalNode> PLUS() { return getTokens(MiniJavaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MiniJavaParser.PLUS, i);
		}
		public Level3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level3Context level3() throws RecognitionException {
		Level3Context _localctx = new Level3Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_level3);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559); ((Level3Context)_localctx).head = level4();
			setState(564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(560);
					((Level3Context)_localctx)._tset1098 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
						((Level3Context)_localctx)._tset1098 = (Token)_errHandler.recoverInline(this);
					}
					consume();
					((Level3Context)_localctx).operator.add(((Level3Context)_localctx)._tset1098);
					setState(561); ((Level3Context)_localctx).level4 = level4();
					((Level3Context)_localctx).tail.add(((Level3Context)_localctx).level4);
					}
					} 
				}
				setState(566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level4Context extends ParserRuleContext {
		public Level5Context head;
		public Token TIMES;
		public List<Token> operator = new ArrayList<Token>();
		public Token DIVIDE;
		public Token MODULO;
		public Token _tset1127;
		public Level5Context level5;
		public List<Level5Context> tail = new ArrayList<Level5Context>();
		public TerminalNode MODULO(int i) {
			return getToken(MiniJavaParser.MODULO, i);
		}
		public TerminalNode TIMES(int i) {
			return getToken(MiniJavaParser.TIMES, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(MiniJavaParser.TIMES); }
		public Level5Context level5(int i) {
			return getRuleContext(Level5Context.class,i);
		}
		public List<TerminalNode> MODULO() { return getTokens(MiniJavaParser.MODULO); }
		public List<Level5Context> level5() {
			return getRuleContexts(Level5Context.class);
		}
		public TerminalNode DIVIDE(int i) {
			return getToken(MiniJavaParser.DIVIDE, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(MiniJavaParser.DIVIDE); }
		public Level4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level4Context level4() throws RecognitionException {
		Level4Context _localctx = new Level4Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_level4);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567); ((Level4Context)_localctx).head = level5();
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(568);
					((Level4Context)_localctx)._tset1127 = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
						((Level4Context)_localctx)._tset1127 = (Token)_errHandler.recoverInline(this);
					}
					consume();
					((Level4Context)_localctx).operator.add(((Level4Context)_localctx)._tset1127);
					setState(569); ((Level4Context)_localctx).level5 = level5();
					((Level4Context)_localctx).tail.add(((Level4Context)_localctx).level5);
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level5Context extends ParserRuleContext {
		public ExpressionMathSqrtContext expressionMathSqrt() {
			return getRuleContext(ExpressionMathSqrtContext.class,0);
		}
		public ExpressionNegationContext expressionNegation() {
			return getRuleContext(ExpressionNegationContext.class,0);
		}
		public ExpressionConstantCharContext expressionConstantChar() {
			return getRuleContext(ExpressionConstantCharContext.class,0);
		}
		public ExpressionMethodCallContext expressionMethodCall() {
			return getRuleContext(ExpressionMethodCallContext.class,0);
		}
		public ExpressionPostDecrementContext expressionPostDecrement() {
			return getRuleContext(ExpressionPostDecrementContext.class,0);
		}
		public ExpressionConstantStringContext expressionConstantString() {
			return getRuleContext(ExpressionConstantStringContext.class,0);
		}
		public ExpressionNewObjectContext expressionNewObject() {
			return getRuleContext(ExpressionNewObjectContext.class,0);
		}
		public ExpressionConstantIntegerContext expressionConstantInteger() {
			return getRuleContext(ExpressionConstantIntegerContext.class,0);
		}
		public ExpressionParenthesesContext expressionParentheses() {
			return getRuleContext(ExpressionParenthesesContext.class,0);
		}
		public ExpressionConstantDoubleContext expressionConstantDouble() {
			return getRuleContext(ExpressionConstantDoubleContext.class,0);
		}
		public ExpressionConstantTrueContext expressionConstantTrue() {
			return getRuleContext(ExpressionConstantTrueContext.class,0);
		}
		public ExpressionLINQContext expressionLINQ() {
			return getRuleContext(ExpressionLINQContext.class,0);
		}
		public ExpressionTernaryContext expressionTernary() {
			return getRuleContext(ExpressionTernaryContext.class,0);
		}
		public ExpressionConstantFalseContext expressionConstantFalse() {
			return getRuleContext(ExpressionConstantFalseContext.class,0);
		}
		public ExpressionUnaryMinusContext expressionUnaryMinus() {
			return getRuleContext(ExpressionUnaryMinusContext.class,0);
		}
		public ExpressionTypeCastContext expressionTypeCast() {
			return getRuleContext(ExpressionTypeCastContext.class,0);
		}
		public ExpressionPostIncrementContext expressionPostIncrement() {
			return getRuleContext(ExpressionPostIncrementContext.class,0);
		}
		public ExpressionArrayAccessContext expressionArrayAccess() {
			return getRuleContext(ExpressionArrayAccessContext.class,0);
		}
		public ExpressionPreDecrementContext expressionPreDecrement() {
			return getRuleContext(ExpressionPreDecrementContext.class,0);
		}
		public ExpressionPreIncrementContext expressionPreIncrement() {
			return getRuleContext(ExpressionPreIncrementContext.class,0);
		}
		public ExpressionNewArrayContext expressionNewArray() {
			return getRuleContext(ExpressionNewArrayContext.class,0);
		}
		public ExpressionIdentifierContext expressionIdentifier() {
			return getRuleContext(ExpressionIdentifierContext.class,0);
		}
		public Level5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level5Context level5() throws RecognitionException {
		Level5Context _localctx = new Level5Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_level5);
		try {
			setState(597);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575); expressionUnaryMinus();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576); expressionNegation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(577); expressionNewObject();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(578); expressionNewArray();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(579); expressionIdentifier();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(580); expressionArrayAccess();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(581); expressionMethodCall();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(582); expressionParentheses();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(583); expressionConstantTrue();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(584); expressionConstantFalse();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(585); expressionConstantInteger();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(586); expressionConstantString();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(587); expressionConstantChar();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(588); expressionConstantDouble();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(589); expressionPostIncrement();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(590); expressionPostDecrement();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(591); expressionPreIncrement();
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(592); expressionPreDecrement();
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(593); expressionTernary();
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(594); expressionMathSqrt();
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(595); expressionTypeCast();
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(596); expressionLINQ();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionUnaryMinusContext extends ParserRuleContext {
		public Level5Context argument;
		public TerminalNode MINUS() { return getToken(MiniJavaParser.MINUS, 0); }
		public Level5Context level5() {
			return getRuleContext(Level5Context.class,0);
		}
		public ExpressionUnaryMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionUnaryMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionUnaryMinusContext expressionUnaryMinus() throws RecognitionException {
		ExpressionUnaryMinusContext _localctx = new ExpressionUnaryMinusContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionUnaryMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599); match(MINUS);
			setState(600); ((ExpressionUnaryMinusContext)_localctx).argument = level5();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionNegationContext extends ParserRuleContext {
		public Level5Context argument;
		public TerminalNode EXCLAMATION() { return getToken(MiniJavaParser.EXCLAMATION, 0); }
		public Level5Context level5() {
			return getRuleContext(Level5Context.class,0);
		}
		public ExpressionNegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNegationContext expressionNegation() throws RecognitionException {
		ExpressionNegationContext _localctx = new ExpressionNegationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expressionNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602); match(EXCLAMATION);
			setState(603); ((ExpressionNegationContext)_localctx).argument = level5();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionNewObjectContext extends ParserRuleContext {
		public Token classname;
		public TerminalNode NEW() { return getToken(MiniJavaParser.NEW, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public ExpressionNewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNewObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionNewObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionNewObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionNewObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNewObjectContext expressionNewObject() throws RecognitionException {
		ExpressionNewObjectContext _localctx = new ExpressionNewObjectContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expressionNewObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); match(NEW);
			setState(606); ((ExpressionNewObjectContext)_localctx).classname = match(IDENT);
			setState(607); match(ROUNDOPEN);
			setState(608); match(ROUNDCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionNewArrayContext extends ParserRuleContext {
		public ExpressionContext size;
		public TerminalNode TYPEINT() { return getToken(MiniJavaParser.TYPEINT, 0); }
		public TerminalNode NEW() { return getToken(MiniJavaParser.NEW, 0); }
		public TerminalNode SQUARECLOSE() { return getToken(MiniJavaParser.SQUARECLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SQUAREOPEN() { return getToken(MiniJavaParser.SQUAREOPEN, 0); }
		public ExpressionNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNewArrayContext expressionNewArray() throws RecognitionException {
		ExpressionNewArrayContext _localctx = new ExpressionNewArrayContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expressionNewArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610); match(NEW);
			setState(611); match(TYPEINT);
			setState(612); match(SQUAREOPEN);
			setState(613); ((ExpressionNewArrayContext)_localctx).size = expression();
			setState(614); match(SQUARECLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionIdentifierContext extends ParserRuleContext {
		public IdentifierContext ident;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionIdentifierContext expressionIdentifier() throws RecognitionException {
		ExpressionIdentifierContext _localctx = new ExpressionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expressionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616); ((ExpressionIdentifierContext)_localctx).ident = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionArrayAccessContext extends ParserRuleContext {
		public IdentifierContext ident;
		public ExpressionContext element;
		public TerminalNode SQUARECLOSE() { return getToken(MiniJavaParser.SQUARECLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SQUAREOPEN() { return getToken(MiniJavaParser.SQUAREOPEN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionArrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionArrayAccessContext expressionArrayAccess() throws RecognitionException {
		ExpressionArrayAccessContext _localctx = new ExpressionArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expressionArrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618); ((ExpressionArrayAccessContext)_localctx).ident = identifier();
			setState(619); match(SQUAREOPEN);
			setState(620); ((ExpressionArrayAccessContext)_localctx).element = expression();
			setState(621); match(SQUARECLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionParenthesesContext extends ParserRuleContext {
		public ExpressionContext argument;
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionParentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionParenthesesContext expressionParentheses() throws RecognitionException {
		ExpressionParenthesesContext _localctx = new ExpressionParenthesesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_expressionParentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623); match(ROUNDOPEN);
			setState(624); ((ExpressionParenthesesContext)_localctx).argument = expression();
			setState(625); match(ROUNDCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantTrueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MiniJavaParser.TRUE, 0); }
		public ExpressionConstantTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantTrueContext expressionConstantTrue() throws RecognitionException {
		ExpressionConstantTrueContext _localctx = new ExpressionConstantTrueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_expressionConstantTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627); match(TRUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantFalseContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(MiniJavaParser.FALSE, 0); }
		public ExpressionConstantFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantFalseContext expressionConstantFalse() throws RecognitionException {
		ExpressionConstantFalseContext _localctx = new ExpressionConstantFalseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_expressionConstantFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629); match(FALSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantIntegerContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public ExpressionConstantIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantIntegerContext expressionConstantInteger() throws RecognitionException {
		ExpressionConstantIntegerContext _localctx = new ExpressionConstantIntegerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_expressionConstantInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631); ((ExpressionConstantIntegerContext)_localctx).value = match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantStringContext extends ParserRuleContext {
		public Token value;
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public ExpressionConstantStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantStringContext expressionConstantString() throws RecognitionException {
		ExpressionConstantStringContext _localctx = new ExpressionConstantStringContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expressionConstantString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); ((ExpressionConstantStringContext)_localctx).value = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantCharContext extends ParserRuleContext {
		public Token value;
		public TerminalNode CHARVALUE() { return getToken(MiniJavaParser.CHARVALUE, 0); }
		public ExpressionConstantCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantCharContext expressionConstantChar() throws RecognitionException {
		ExpressionConstantCharContext _localctx = new ExpressionConstantCharContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_expressionConstantChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635); ((ExpressionConstantCharContext)_localctx).value = match(CHARVALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantDoubleContext extends ParserRuleContext {
		public Token value;
		public TerminalNode DOUBLE() { return getToken(MiniJavaParser.DOUBLE, 0); }
		public ExpressionConstantDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantDoubleContext expressionConstantDouble() throws RecognitionException {
		ExpressionConstantDoubleContext _localctx = new ExpressionConstantDoubleContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_expressionConstantDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); ((ExpressionConstantDoubleContext)_localctx).value = match(DOUBLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMethodCallContext extends ParserRuleContext {
		public IdentifierContext object;
		public Token method;
		public ExpressionContext expression;
		public List<ExpressionContext> arguments = new ArrayList<ExpressionContext>();
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode DOT() { return getToken(MiniJavaParser.DOT, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMethodCallContext expressionMethodCall() throws RecognitionException {
		ExpressionMethodCallContext _localctx = new ExpressionMethodCallContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expressionMethodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(639); ((ExpressionMethodCallContext)_localctx).object = identifier();
				setState(640); match(DOT);
				}
				break;
			}
			setState(644); ((ExpressionMethodCallContext)_localctx).method = match(IDENT);
			setState(645); match(ROUNDOPEN);
			setState(654);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << ROUNDOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << TYPEBOOLEAN) | (1L << TYPECHAR) | (1L << TYPEDOUBLE) | (1L << TYPEINT) | (1L << THIS) | (1L << SQRT) | (1L << NEW) | (1L << VAR) | (1L << FROM) | (1L << IDENT) | (1L << INT) | (1L << DOUBLE) | (1L << CHARVALUE) | (1L << STRING))) != 0)) {
				{
				setState(646); ((ExpressionMethodCallContext)_localctx).expression = expression();
				((ExpressionMethodCallContext)_localctx).arguments.add(((ExpressionMethodCallContext)_localctx).expression);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(647); match(COMMA);
					setState(648); ((ExpressionMethodCallContext)_localctx).expression = expression();
					((ExpressionMethodCallContext)_localctx).arguments.add(((ExpressionMethodCallContext)_localctx).expression);
					}
					}
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(656); match(ROUNDCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionPostIncrementContext extends ParserRuleContext {
		public TerminalNode PLUSPLUS() { return getToken(MiniJavaParser.PLUSPLUS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionPostIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPostIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPostIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPostIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPostIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPostIncrementContext expressionPostIncrement() throws RecognitionException {
		ExpressionPostIncrementContext _localctx = new ExpressionPostIncrementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expressionPostIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658); identifier();
			setState(659); match(PLUSPLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionPostDecrementContext extends ParserRuleContext {
		public TerminalNode MINUSMINUS() { return getToken(MiniJavaParser.MINUSMINUS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionPostDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPostDecrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPostDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPostDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPostDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPostDecrementContext expressionPostDecrement() throws RecognitionException {
		ExpressionPostDecrementContext _localctx = new ExpressionPostDecrementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_expressionPostDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661); identifier();
			setState(662); match(MINUSMINUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionPreIncrementContext extends ParserRuleContext {
		public TerminalNode PLUSPLUS() { return getToken(MiniJavaParser.PLUSPLUS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionPreIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPreIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPreIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPreIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPreIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPreIncrementContext expressionPreIncrement() throws RecognitionException {
		ExpressionPreIncrementContext _localctx = new ExpressionPreIncrementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_expressionPreIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664); match(PLUSPLUS);
			setState(665); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionPreDecrementContext extends ParserRuleContext {
		public TerminalNode MINUSMINUS() { return getToken(MiniJavaParser.MINUSMINUS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionPreDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPreDecrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPreDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPreDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPreDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPreDecrementContext expressionPreDecrement() throws RecognitionException {
		ExpressionPreDecrementContext _localctx = new ExpressionPreDecrementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expressionPreDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667); match(MINUSMINUS);
			setState(668); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionTernaryContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext trueexpr;
		public ExpressionContext falseexpr;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(MiniJavaParser.QUESTION, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COLON() { return getToken(MiniJavaParser.COLON, 0); }
		public ExpressionTernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionTernary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionTernary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionTernaryContext expressionTernary() throws RecognitionException {
		ExpressionTernaryContext _localctx = new ExpressionTernaryContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_expressionTernary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670); match(ROUNDOPEN);
			setState(671); ((ExpressionTernaryContext)_localctx).condition = expression();
			setState(672); match(ROUNDCLOSE);
			setState(673); match(QUESTION);
			setState(674); ((ExpressionTernaryContext)_localctx).trueexpr = expression();
			setState(675); match(COLON);
			setState(676); ((ExpressionTernaryContext)_localctx).falseexpr = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMathSqrtContext extends ParserRuleContext {
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SQRT() { return getToken(MiniJavaParser.SQRT, 0); }
		public ExpressionMathSqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMathSqrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionMathSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionMathSqrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionMathSqrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMathSqrtContext expressionMathSqrt() throws RecognitionException {
		ExpressionMathSqrtContext _localctx = new ExpressionMathSqrtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_expressionMathSqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); match(SQRT);
			setState(679); match(ROUNDOPEN);
			setState(680); expression();
			setState(681); match(ROUNDCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionTypeCastContext extends ParserRuleContext {
		public TypeContext cast;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionTypeCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionTypeCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionTypeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionTypeCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionTypeCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionTypeCastContext expressionTypeCast() throws RecognitionException {
		ExpressionTypeCastContext _localctx = new ExpressionTypeCastContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_expressionTypeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(683); ((ExpressionTypeCastContext)_localctx).cast = type();
			}
			setState(684); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionLINQContext extends ParserRuleContext {
		public Token fromIdent;
		public ExpressionContext inExpression;
		public ExpressionContext where;
		public ExpressionContext select;
		public TerminalNode WHERE() { return getToken(MiniJavaParser.WHERE, 0); }
		public TerminalNode IN() { return getToken(MiniJavaParser.IN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SELECT() { return getToken(MiniJavaParser.SELECT, 0); }
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode FROM() { return getToken(MiniJavaParser.FROM, 0); }
		public ExpressionLINQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionLINQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionLINQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionLINQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionLINQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionLINQContext expressionLINQ() throws RecognitionException {
		ExpressionLINQContext _localctx = new ExpressionLINQContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_expressionLINQ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686); match(FROM);
			setState(687); ((ExpressionLINQContext)_localctx).fromIdent = match(IDENT);
			setState(688); match(IN);
			setState(689); ((ExpressionLINQContext)_localctx).inExpression = expression();
			setState(690); match(WHERE);
			setState(691); ((ExpressionLINQContext)_localctx).where = expression();
			setState(692); match(SELECT);
			setState(693); ((ExpressionLINQContext)_localctx).select = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierIdentifierContext identifierIdentifier() {
			return getRuleContext(IdentifierIdentifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695); identifierIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierIdentifierContext extends ParserRuleContext {
		public Token IDENT;
		public List<Token> selectors = new ArrayList<Token>();
		public List<TerminalNode> DOT() { return getTokens(MiniJavaParser.DOT); }
		public IdentifierIdContext identifierId() {
			return getRuleContext(IdentifierIdContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public TerminalNode DOT(int i) {
			return getToken(MiniJavaParser.DOT, i);
		}
		public IdentifierIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifierIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifierIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifierIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierIdentifierContext identifierIdentifier() throws RecognitionException {
		IdentifierIdentifierContext _localctx = new IdentifierIdentifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_identifierIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(697); identifierId();
			setState(702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(698); match(DOT);
					setState(699); ((IdentifierIdentifierContext)_localctx).IDENT = match(IDENT);
					((IdentifierIdentifierContext)_localctx).selectors.add(((IdentifierIdentifierContext)_localctx).IDENT);
					}
					} 
				}
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierIdContext extends ParserRuleContext {
		public IdThisContext idThis() {
			return getRuleContext(IdThisContext.class,0);
		}
		public IdIDENTContext idIDENT() {
			return getRuleContext(IdIDENTContext.class,0);
		}
		public IdentifierIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifierId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifierId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifierId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierIdContext identifierId() throws RecognitionException {
		IdentifierIdContext _localctx = new IdentifierIdContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_identifierId);
		try {
			setState(707);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(705); idThis();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(706); idIDENT();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdThisContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(MiniJavaParser.THIS, 0); }
		public IdThisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idThis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdThisContext idThis() throws RecognitionException {
		IdThisContext _localctx = new IdThisContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_idThis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709); match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdIDENTContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public IdIDENTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idIDENT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdIDENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdIDENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdIDENT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdIDENTContext idIDENT() throws RecognitionException {
		IdIDENTContext _localctx = new IdIDENTContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_idIDENT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711); ((IdIDENTContext)_localctx).name = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3D\u02cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\7\2\u009d\n\2\f\2\16\2\u00a0\13\2"+
		"\3\2\7\2\u00a3\n\2\f\2\16\2\u00a6\13\2\3\3\3\3\3\3\3\3\5\3\u00ac\n\3\3"+
		"\3\3\3\7\3\u00b0\n\3\f\3\16\3\u00b3\13\3\3\3\7\3\u00b6\n\3\f\3\16\3\u00b9"+
		"\13\3\3\3\7\3\u00bc\n\3\f\3\16\3\u00bf\13\3\3\3\7\3\u00c2\n\3\f\3\16\3"+
		"\u00c5\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00cd\n\4\f\4\16\4\u00d0\13\4"+
		"\3\4\7\4\u00d3\n\4\f\4\16\4\u00d6\13\4\3\4\7\4\u00d9\n\4\f\4\16\4\u00dc"+
		"\13\4\3\4\3\4\3\5\5\5\u00e1\n\5\3\5\5\5\u00e4\n\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\7\7\u00f0\n\7\f\7\16\7\u00f3\13\7\3\7\7\7\u00f6\n"+
		"\7\f\7\16\7\u00f9\13\7\3\7\3\7\3\b\3\b\3\b\5\b\u0100\n\b\3\b\3\b\3\t\3"+
		"\t\5\t\u0106\n\t\3\n\3\n\3\n\3\n\7\n\u010c\n\n\f\n\16\n\u010f\13\n\5\n"+
		"\u0111\n\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u011b\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0122\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\5\25\u0135\n\25\3\25\5\25\u0138"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0140\n\25\f\25\16\25\u0143\13"+
		"\25\5\25\u0145\n\25\3\25\3\25\3\25\5\25\u014a\n\25\3\25\3\25\7\25\u014e"+
		"\n\25\f\25\16\25\u0151\13\25\3\25\7\25\u0154\n\25\f\25\16\25\u0157\13"+
		"\25\3\25\3\25\3\25\3\26\5\26\u015d\n\26\3\26\5\26\u0160\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u0167\n\26\f\26\16\26\u016a\13\26\5\26\u016c\n\26"+
		"\3\26\3\26\3\26\5\26\u0171\n\26\3\26\7\26\u0174\n\26\f\26\16\26\u0177"+
		"\13\26\3\26\7\26\u017a\n\26\f\26\16\26\u017d\13\26\3\26\3\26\3\26\3\27"+
		"\3\27\5\27\u0184\n\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u018c\n\31\f"+
		"\31\16\31\u018f\13\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01a7"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u01b8\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\5$\u01e4\n$\3$\3"+
		"$\3%\3%\3%\5%\u01eb\n%\3%\3%\5%\u01ef\n%\3%\3%\5%\u01f3\n%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3"+
		",\3,\7,\u0210\n,\f,\16,\u0213\13,\5,\u0215\n,\3,\3,\3,\3-\3-\3-\7-\u021d"+
		"\n-\f-\16-\u0220\13-\3.\3.\3.\7.\u0225\n.\f.\16.\u0228\13.\3/\3/\3/\7"+
		"/\u022d\n/\f/\16/\u0230\13/\3\60\3\60\3\60\7\60\u0235\n\60\f\60\16\60"+
		"\u0238\13\60\3\61\3\61\3\61\7\61\u023d\n\61\f\61\16\61\u0240\13\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0258\n\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\38\38\38\38\38\39\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3@\5@\u0285\n@\3@\3@\3@\3@\3@\7@\u028c\n@\f@\16@\u028f\13@\5@\u0291"+
		"\n@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3F\3F\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3J\3J\3J\7J"+
		"\u02bf\nJ\fJ\16J\u02c2\13J\3K\3K\5K\u02c6\nK\3L\3L\3M\3M\3M\2N\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\2\b\3\2$%\4\2\3\3\b\n\4\2\'\'\66\66\3\2\6\7\4"+
		"\2\3\3\b\b\3\2\t\13\u02de\2\u009a\3\2\2\2\4\u00a7\3\2\2\2\6\u00c8\3\2"+
		"\2\2\b\u00e0\3\2\2\2\n\u00e7\3\2\2\2\f\u00ed\3\2\2\2\16\u00fc\3\2\2\2"+
		"\20\u0105\3\2\2\2\22\u0107\3\2\2\2\24\u0114\3\2\2\2\26\u011a\3\2\2\2\30"+
		"\u0121\3\2\2\2\32\u0123\3\2\2\2\34\u0127\3\2\2\2\36\u0129\3\2\2\2 \u012b"+
		"\3\2\2\2\"\u012d\3\2\2\2$\u012f\3\2\2\2&\u0131\3\2\2\2(\u0134\3\2\2\2"+
		"*\u015c\3\2\2\2,\u0183\3\2\2\2.\u0185\3\2\2\2\60\u0187\3\2\2\2\62\u01a6"+
		"\3\2\2\2\64\u01a8\3\2\2\2\66\u01b0\3\2\2\28\u01b9\3\2\2\2:\u01bf\3\2\2"+
		"\2<\u01c4\3\2\2\2>\u01ca\3\2\2\2@\u01d2\3\2\2\2B\u01d8\3\2\2\2D\u01de"+
		"\3\2\2\2F\u01e1\3\2\2\2H\u01e7\3\2\2\2J\u01f7\3\2\2\2L\u01fc\3\2\2\2N"+
		"\u01ff\3\2\2\2P\u0202\3\2\2\2R\u0205\3\2\2\2T\u0208\3\2\2\2V\u020a\3\2"+
		"\2\2X\u0219\3\2\2\2Z\u0221\3\2\2\2\\\u0229\3\2\2\2^\u0231\3\2\2\2`\u0239"+
		"\3\2\2\2b\u0257\3\2\2\2d\u0259\3\2\2\2f\u025c\3\2\2\2h\u025f\3\2\2\2j"+
		"\u0264\3\2\2\2l\u026a\3\2\2\2n\u026c\3\2\2\2p\u0271\3\2\2\2r\u0275\3\2"+
		"\2\2t\u0277\3\2\2\2v\u0279\3\2\2\2x\u027b\3\2\2\2z\u027d\3\2\2\2|\u027f"+
		"\3\2\2\2~\u0284\3\2\2\2\u0080\u0294\3\2\2\2\u0082\u0297\3\2\2\2\u0084"+
		"\u029a\3\2\2\2\u0086\u029d\3\2\2\2\u0088\u02a0\3\2\2\2\u008a\u02a8\3\2"+
		"\2\2\u008c\u02ad\3\2\2\2\u008e\u02b0\3\2\2\2\u0090\u02b9\3\2\2\2\u0092"+
		"\u02bb\3\2\2\2\u0094\u02c5\3\2\2\2\u0096\u02c7\3\2\2\2\u0098\u02c9\3\2"+
		"\2\2\u009a\u009e\5\n\6\2\u009b\u009d\5\4\3\2\u009c\u009b\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a4\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\5\60\31\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\3\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\35\2\2\u00a8\u00ab\7=\2\2\u00a9\u00aa"+
		"\7\36\2\2\u00aa\u00ac\7=\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00b1\7\31\2\2\u00ae\u00b0\5\6\4\2\u00af\u00ae\3"+
		"\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b7\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\5\b\5\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00bd\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\5*\26\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c3\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\5(\25\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\32\2\2\u00c7\5\3\2\2"+
		"\2\u00c8\u00c9\7\35\2\2\u00c9\u00ca\7=\2\2\u00ca\u00ce\7\31\2\2\u00cb"+
		"\u00cd\5\b\5\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d3\5*\26\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d9\5(\25\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00de\7\32\2\2\u00de\7\3\2\2\2\u00df\u00e1\t\2\2\2\u00e0\u00df\3\2\2"+
		"\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\7&\2\2\u00e3\u00e2"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\5\16\b\2"+
		"\u00e6\t\3\2\2\2\u00e7\u00e8\7\35\2\2\u00e8\u00e9\7=\2\2\u00e9\u00ea\7"+
		"\31\2\2\u00ea\u00eb\5(\25\2\u00eb\u00ec\7\32\2\2\u00ec\13\3\2\2\2\u00ed"+
		"\u00f1\7\31\2\2\u00ee\u00f0\5\16\b\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3"+
		"\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f7\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f6\5\62\32\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3"+
		"\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fb\7\32\2\2\u00fb\r\3\2\2\2\u00fc\u00ff\5\24\13"+
		"\2\u00fd\u00fe\7\17\2\2\u00fe\u0100\5\20\t\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\r\2\2\u0102\17\3\2\2"+
		"\2\u0103\u0106\5X-\2\u0104\u0106\5\22\n\2\u0105\u0103\3\2\2\2\u0105\u0104"+
		"\3\2\2\2\u0106\21\3\2\2\2\u0107\u0110\7\31\2\2\u0108\u010d\5X-\2\u0109"+
		"\u010a\7\16\2\2\u010a\u010c\5X-\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0108\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\7\32\2\2\u0113\23\3\2\2\2\u0114\u0115\5\26\f\2\u0115"+
		"\u0116\7=\2\2\u0116\25\3\2\2\2\u0117\u011b\5\30\r\2\u0118\u011b\5\32\16"+
		"\2\u0119\u011b\5\34\17\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\27\3\2\2\2\u011c\u0122\5\36\20\2\u011d\u0122\5 \21"+
		"\2\u011e\u0122\5\"\22\2\u011f\u0122\5$\23\2\u0120\u0122\5&\24\2\u0121"+
		"\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0120\3\2\2\2\u0122\31\3\2\2\2\u0123\u0124\5\30\r\2\u0124\u0125"+
		"\7\27\2\2\u0125\u0126\7\30\2\2\u0126\33\3\2\2\2\u0127\u0128\7\61\2\2\u0128"+
		"\35\3\2\2\2\u0129\u012a\7\37\2\2\u012a\37\3\2\2\2\u012b\u012c\7#\2\2\u012c"+
		"!\3\2\2\2\u012d\u012e\7!\2\2\u012e#\3\2\2\2\u012f\u0130\7\"\2\2\u0130"+
		"%\3\2\2\2\u0131\u0132\7=\2\2\u0132\'\3\2\2\2\u0133\u0135\t\2\2\2\u0134"+
		"\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0138\7&"+
		"\2\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013a\5,\27\2\u013a\u013b\7=\2\2\u013b\u0144\7\25\2\2\u013c\u0141\5\24"+
		"\13\2\u013d\u013e\7\16\2\2\u013e\u0140\5\24\13\2\u013f\u013d\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144\u013c\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0149\7\26\2\2\u0147\u0148\7\65\2\2\u0148\u014a\7"+
		"=\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014f\7\31\2\2\u014c\u014e\5\16\b\2\u014d\u014c\3\2\2\2\u014e\u0151\3"+
		"\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0155\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0154\5\62\32\2\u0153\u0152\3\2\2\2\u0154\u0157\3"+
		"\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u0159\5F$\2\u0159\u015a\7\32\2\2\u015a)\3\2\2\2\u015b"+
		"\u015d\t\2\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2"+
		"\2\2\u015e\u0160\7&\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\7=\2\2\u0162\u016b\7\25\2\2\u0163\u0168\5\24"+
		"\13\2\u0164\u0165\7\16\2\2\u0165\u0167\5\24\13\2\u0166\u0164\3\2\2\2\u0167"+
		"\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016b\u0163\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016e\7\26\2\2\u016e\u0170\7\31\2\2\u016f\u0171\5"+
		"V,\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0175\3\2\2\2\u0172"+
		"\u0174\5\16\b\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3"+
		"\2\2\2\u0175\u0176\3\2\2\2\u0176\u017b\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u017a\5\62\32\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3"+
		"\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e"+
		"\u017f\5F$\2\u017f\u0180\7\32\2\2\u0180+\3\2\2\2\u0181\u0184\5.\30\2\u0182"+
		"\u0184\5\26\f\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184-\3\2\2\2"+
		"\u0185\u0186\7 \2\2\u0186/\3\2\2\2\u0187\u0188\7\67\2\2\u0188\u0189\7"+
		"8\2\2\u0189\u018d\7\31\2\2\u018a\u018c\5\16\b\2\u018b\u018a\3\2\2\2\u018c"+
		"\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2"+
		"\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7\32\2\2\u0191\u0192\7=\2\2\u0192"+
		"\u0193\7\r\2\2\u0193\61\3\2\2\2\u0194\u01a7\5\f\7\2\u0195\u01a7\5\64\33"+
		"\2\u0196\u01a7\5\66\34\2\u0197\u01a7\58\35\2\u0198\u01a7\5:\36\2\u0199"+
		"\u01a7\5<\37\2\u019a\u01a7\5> \2\u019b\u01a7\5B\"\2\u019c\u01a7\5@!\2"+
		"\u019d\u01a7\5D#\2\u019e\u01a7\5F$\2\u019f\u01a7\5H%\2\u01a0\u01a7\5J"+
		"&\2\u01a1\u01a7\5L\'\2\u01a2\u01a7\5N(\2\u01a3\u01a7\5P)\2\u01a4\u01a7"+
		"\5R*\2\u01a5\u01a7\5T+\2\u01a6\u0194\3\2\2\2\u01a6\u0195\3\2\2\2\u01a6"+
		"\u0196\3\2\2\2\u01a6\u0197\3\2\2\2\u01a6\u0198\3\2\2\2\u01a6\u0199\3\2"+
		"\2\2\u01a6\u019a\3\2\2\2\u01a6\u019b\3\2\2\2\u01a6\u019c\3\2\2\2\u01a6"+
		"\u019d\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u019f\3\2\2\2\u01a6\u01a0\3\2"+
		"\2\2\u01a6\u01a1\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\63\3\2\2\2\u01a8\u01a9\7\62\2"+
		"\2\u01a9\u01aa\5\f\7\2\u01aa\u01ab\7\63\2\2\u01ab\u01ac\7\25\2\2\u01ac"+
		"\u01ad\5\24\13\2\u01ad\u01ae\7\26\2\2\u01ae\u01af\5\f\7\2\u01af\65\3\2"+
		"\2\2\u01b0\u01b1\7(\2\2\u01b1\u01b2\7\25\2\2\u01b2\u01b3\5X-\2\u01b3\u01b4"+
		"\7\26\2\2\u01b4\u01b7\5\f\7\2\u01b5\u01b6\7)\2\2\u01b6\u01b8\5\f\7\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\67\3\2\2\2\u01b9\u01ba\7*\2\2"+
		"\u01ba\u01bb\7\25\2\2\u01bb\u01bc\5X-\2\u01bc\u01bd\7\26\2\2\u01bd\u01be"+
		"\5\62\32\2\u01be9\3\2\2\2\u01bf\u01c0\5\u0090I\2\u01c0\u01c1\7\17\2\2"+
		"\u01c1\u01c2\5X-\2\u01c2\u01c3\7\r\2\2\u01c3;\3\2\2\2\u01c4\u01c5\5\u0090"+
		"I\2\u01c5\u01c6\t\3\2\2\u01c6\u01c7\7\17\2\2\u01c7\u01c8\5X-\2\u01c8\u01c9"+
		"\7\r\2\2\u01c9=\3\2\2\2\u01ca\u01cb\5\u0090I\2\u01cb\u01cc\7\27\2\2\u01cc"+
		"\u01cd\5X-\2\u01cd\u01ce\7\30\2\2\u01ce\u01cf\7\17\2\2\u01cf\u01d0\5X"+
		"-\2\u01d0\u01d1\7\r\2\2\u01d1?\3\2\2\2\u01d2\u01d3\7,\2\2\u01d3\u01d4"+
		"\7\25\2\2\u01d4\u01d5\5X-\2\u01d5\u01d6\7\26\2\2\u01d6\u01d7\7\r\2\2\u01d7"+
		"A\3\2\2\2\u01d8\u01d9\7-\2\2\u01d9\u01da\7\25\2\2\u01da\u01db\5X-\2\u01db"+
		"\u01dc\7\26\2\2\u01dc\u01dd\7\r\2\2\u01ddC\3\2\2\2\u01de\u01df\5~@\2\u01df"+
		"\u01e0\7\r\2\2\u01e0E\3\2\2\2\u01e1\u01e3\7/\2\2\u01e2\u01e4\5X-\2\u01e3"+
		"\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\7\r"+
		"\2\2\u01e6G\3\2\2\2\u01e7\u01e8\7+\2\2\u01e8\u01ea\7\25\2\2\u01e9\u01eb"+
		"\5\62\32\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2"+
		"\u01ec\u01ee\7\r\2\2\u01ed\u01ef\5X-\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\7\r\2\2\u01f1\u01f3\5\62\32\2"+
		"\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5"+
		"\7\26\2\2\u01f5\u01f6\5\62\32\2\u01f6I\3\2\2\2\u01f7\u01f8\7\64\2\2\u01f8"+
		"\u01f9\7\25\2\2\u01f9\u01fa\5X-\2\u01fa\u01fb\7\26\2\2\u01fbK\3\2\2\2"+
		"\u01fc\u01fd\5\u0080A\2\u01fd\u01fe\7\r\2\2\u01feM\3\2\2\2\u01ff\u0200"+
		"\5\u0082B\2\u0200\u0201\7\r\2\2\u0201O\3\2\2\2\u0202\u0203\5\u0084C\2"+
		"\u0203\u0204\7\r\2\2\u0204Q\3\2\2\2\u0205\u0206\5\u0086D\2\u0206\u0207"+
		"\7\r\2\2\u0207S\3\2\2\2\u0208\u0209\5\16\b\2\u0209U\3\2\2\2\u020a\u020b"+
		"\t\4\2\2\u020b\u0214\7\25\2\2\u020c\u0211\5X-\2\u020d\u020e\7\16\2\2\u020e"+
		"\u0210\5X-\2\u020f\u020d\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2"+
		"\2\u0211\u0212\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u020c"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7\26\2\2"+
		"\u0217\u0218\7\r\2\2\u0218W\3\2\2\2\u0219\u021e\5Z.\2\u021a\u021b\7\4"+
		"\2\2\u021b\u021d\5Z.\2\u021c\u021a\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c"+
		"\3\2\2\2\u021e\u021f\3\2\2\2\u021fY\3\2\2\2\u0220\u021e\3\2\2\2\u0221"+
		"\u0226\5\\/\2\u0222\u0223\7\5\2\2\u0223\u0225\5\\/\2\u0224\u0222\3\2\2"+
		"\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227["+
		"\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022e\5^\60\2\u022a\u022b\t\5\2\2\u022b"+
		"\u022d\5^\60\2\u022c\u022a\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2"+
		"\2\2\u022e\u022f\3\2\2\2\u022f]\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0236"+
		"\5`\61\2\u0232\u0233\t\6\2\2\u0233\u0235\5`\61\2\u0234\u0232\3\2\2\2\u0235"+
		"\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237_\3\2\2\2"+
		"\u0238\u0236\3\2\2\2\u0239\u023e\5b\62\2\u023a\u023b\t\7\2\2\u023b\u023d"+
		"\5b\62\2\u023c\u023a\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023fa\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0258\5d\63\2"+
		"\u0242\u0258\5f\64\2\u0243\u0258\5h\65\2\u0244\u0258\5j\66\2\u0245\u0258"+
		"\5l\67\2\u0246\u0258\5n8\2\u0247\u0258\5~@\2\u0248\u0258\5p9\2\u0249\u0258"+
		"\5r:\2\u024a\u0258\5t;\2\u024b\u0258\5v<\2\u024c\u0258\5x=\2\u024d\u0258"+
		"\5z>\2\u024e\u0258\5|?\2\u024f\u0258\5\u0080A\2\u0250\u0258\5\u0082B\2"+
		"\u0251\u0258\5\u0084C\2\u0252\u0258\5\u0086D\2\u0253\u0258\5\u0088E\2"+
		"\u0254\u0258\5\u008aF\2\u0255\u0258\5\u008cG\2\u0256\u0258\5\u008eH\2"+
		"\u0257\u0241\3\2\2\2\u0257\u0242\3\2\2\2\u0257\u0243\3\2\2\2\u0257\u0244"+
		"\3\2\2\2\u0257\u0245\3\2\2\2\u0257\u0246\3\2\2\2\u0257\u0247\3\2\2\2\u0257"+
		"\u0248\3\2\2\2\u0257\u0249\3\2\2\2\u0257\u024a\3\2\2\2\u0257\u024b\3\2"+
		"\2\2\u0257\u024c\3\2\2\2\u0257\u024d\3\2\2\2\u0257\u024e\3\2\2\2\u0257"+
		"\u024f\3\2\2\2\u0257\u0250\3\2\2\2\u0257\u0251\3\2\2\2\u0257\u0252\3\2"+
		"\2\2\u0257\u0253\3\2\2\2\u0257\u0254\3\2\2\2\u0257\u0255\3\2\2\2\u0257"+
		"\u0256\3\2\2\2\u0258c\3\2\2\2\u0259\u025a\7\3\2\2\u025a\u025b\5b\62\2"+
		"\u025be\3\2\2\2\u025c\u025d\7\f\2\2\u025d\u025e\5b\62\2\u025eg\3\2\2\2"+
		"\u025f\u0260\7\60\2\2\u0260\u0261\7=\2\2\u0261\u0262\7\25\2\2\u0262\u0263"+
		"\7\26\2\2\u0263i\3\2\2\2\u0264\u0265\7\60\2\2\u0265\u0266\7#\2\2\u0266"+
		"\u0267\7\27\2\2\u0267\u0268\5X-\2\u0268\u0269\7\30\2\2\u0269k\3\2\2\2"+
		"\u026a\u026b\5\u0090I\2\u026bm\3\2\2\2\u026c\u026d\5\u0090I\2\u026d\u026e"+
		"\7\27\2\2\u026e\u026f\5X-\2\u026f\u0270\7\30\2\2\u0270o\3\2\2\2\u0271"+
		"\u0272\7\25\2\2\u0272\u0273\5X-\2\u0273\u0274\7\26\2\2\u0274q\3\2\2\2"+
		"\u0275\u0276\7\33\2\2\u0276s\3\2\2\2\u0277\u0278\7\34\2\2\u0278u\3\2\2"+
		"\2\u0279\u027a\7>\2\2\u027aw\3\2\2\2\u027b\u027c\7A\2\2\u027cy\3\2\2\2"+
		"\u027d\u027e\7@\2\2\u027e{\3\2\2\2\u027f\u0280\7?\2\2\u0280}\3\2\2\2\u0281"+
		"\u0282\5\u0090I\2\u0282\u0283\7\20\2\2\u0283\u0285\3\2\2\2\u0284\u0281"+
		"\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\7=\2\2\u0287"+
		"\u0290\7\25\2\2\u0288\u028d\5X-\2\u0289\u028a\7\16\2\2\u028a\u028c\5X"+
		"-\2\u028b\u0289\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0288\3\2"+
		"\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\7\26\2\2\u0293"+
		"\177\3\2\2\2\u0294\u0295\5\u0090I\2\u0295\u0296\7\23\2\2\u0296\u0081\3"+
		"\2\2\2\u0297\u0298\5\u0090I\2\u0298\u0299\7\24\2\2\u0299\u0083\3\2\2\2"+
		"\u029a\u029b\7\23\2\2\u029b\u029c\5\u0090I\2\u029c\u0085\3\2\2\2\u029d"+
		"\u029e\7\24\2\2\u029e\u029f\5\u0090I\2\u029f\u0087\3\2\2\2\u02a0\u02a1"+
		"\7\25\2\2\u02a1\u02a2\5X-\2\u02a2\u02a3\7\26\2\2\u02a3\u02a4\7\21\2\2"+
		"\u02a4\u02a5\5X-\2\u02a5\u02a6\7\22\2\2\u02a6\u02a7\5X-\2\u02a7\u0089"+
		"\3\2\2\2\u02a8\u02a9\7.\2\2\u02a9\u02aa\7\25\2\2\u02aa\u02ab\5X-\2\u02ab"+
		"\u02ac\7\26\2\2\u02ac\u008b\3\2\2\2\u02ad\u02ae\5\26\f\2\u02ae\u02af\5"+
		"X-\2\u02af\u008d\3\2\2\2\u02b0\u02b1\79\2\2\u02b1\u02b2\7=\2\2\u02b2\u02b3"+
		"\7:\2\2\u02b3\u02b4\5X-\2\u02b4\u02b5\7;\2\2\u02b5\u02b6\5X-\2\u02b6\u02b7"+
		"\7<\2\2\u02b7\u02b8\5X-\2\u02b8\u008f\3\2\2\2\u02b9\u02ba\5\u0092J\2\u02ba"+
		"\u0091\3\2\2\2\u02bb\u02c0\5\u0094K\2\u02bc\u02bd\7\20\2\2\u02bd\u02bf"+
		"\7=\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u0093\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c6\5\u0096"+
		"L\2\u02c4\u02c6\5\u0098M\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6"+
		"\u0095\3\2\2\2\u02c7\u02c8\7\'\2\2\u02c8\u0097\3\2\2\2\u02c9\u02ca\7="+
		"\2\2\u02ca\u0099\3\2\2\29\u009e\u00a4\u00ab\u00b1\u00b7\u00bd\u00c3\u00ce"+
		"\u00d4\u00da\u00e0\u00e3\u00f1\u00f7\u00ff\u0105\u010d\u0110\u011a\u0121"+
		"\u0134\u0137\u0141\u0144\u0149\u014f\u0155\u015c\u015f\u0168\u016b\u0170"+
		"\u0175\u017b\u0183\u018d\u01a6\u01b7\u01e3\u01ea\u01ee\u01f2\u0211\u0214"+
		"\u021e\u0226\u022e\u0236\u023e\u0257\u0284\u028d\u0290\u02c0\u02c5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}