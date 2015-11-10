// Generated from /Users/probst/workspace/MiniJava_Analysis/src/compiler/Frontend/MiniJava.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'-'", "'&&'", "'=='", "'<'", "'>'", "'+'", "'*'", "'/'", "'%'", "'!'", 
		"';'", "','", "'='", "'.'", "'?'", "':'", "PLUSPLUS", "MINUSMINUS", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'true'", "'false'", "'class'", "'extends'", 
		"'boolean'", "'void'", "'char'", "'double'", "'int'", "'public'", "'private'", 
		"'static'", "'this'", "'if'", "'else'", "'while'", "'for'", "'System.out.print'", 
		"'System.out.println'", "'Math.sqrt'", "'return'", "'new'", "'var'", "'try'", 
		"'catch'", "'throw'", "'throws'", "'super'", "'typedef'", "'struct'", 
		"'from'", "'in'", "'where'", "'select'", "IDENT", "INT", "DOUBLE", "CHARVALUE", 
		"STRING", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"MINUS", "AND", "EQUALS", "LESSTHAN", "GREATERTHAN", "PLUS", "TIMES", 
		"DIVIDE", "MODULO", "EXCLAMATION", "SEMICOLON", "COMMA", "EQUAL", "DOT", 
		"QUESTION", "COLON", "PLUSPLUS", "MINUSMINUS", "ROUNDOPEN", "ROUNDCLOSE", 
		"SQUAREOPEN", "SQUARECLOSE", "CURLYOPEN", "CURLYCLOSE", "TRUE", "FALSE", 
		"CLASS", "EXTENDS", "TYPEBOOLEAN", "TYPEVOID", "TYPECHAR", "TYPEDOUBLE", 
		"TYPEINT", "PUBLIC", "PRIVATE", "STATIC", "THIS", "IF", "ELSE", "WHILE", 
		"FOR", "PRINT", "PRINTLN", "SQRT", "RETURN", "NEW", "VAR", "TRY", "CATCH", 
		"THROW", "THROWS", "SUPER", "TYPEDEF", "STRUCT", "FROM", "IN", "WHERE", 
		"SELECT", "LOWER", "UPPER", "NONNULL", "NUMBER", "IDENT", "INT", "DOUBLE", 
		"CHAR", "CHARVALUE", "STRING", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
	};


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 68: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 69: MULTILINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 70: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void MULTILINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2D\u0209\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\3"+
		"9\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\5"+
		"?\u01af\n?\3@\3@\5@\u01b3\n@\3@\3@\3@\3@\7@\u01b9\n@\f@\16@\u01bc\13@"+
		"\3A\3A\3A\7A\u01c1\nA\fA\16A\u01c4\13A\5A\u01c6\nA\3B\3B\3B\7B\u01cb\n"+
		"B\fB\16B\u01ce\13B\5B\u01d0\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u01db\nC"+
		"\3D\3D\3D\3D\3E\3E\7E\u01e3\nE\fE\16E\u01e6\13E\3E\3E\3F\3F\3F\3F\7F\u01ee"+
		"\nF\fF\16F\u01f1\13F\3F\3F\3G\3G\3G\3G\7G\u01f9\nG\fG\16G\u01fc\13G\3"+
		"G\3G\3G\3G\3G\3H\6H\u0204\nH\rH\16H\u0205\3H\3H\4\u01e4\u01faI\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$"+
		"\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63"+
		"\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s;\1u<\1w\2\1y\2\1{\2\1}\2\1\177"+
		"=\1\u0081>\1\u0083?\1\u0085\2\1\u0087@\1\u0089A\1\u008bB\2\u008dC\3\u008f"+
		"D\4\3\2\5\5\2\"#%]_\u0080\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u0215\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u0093\3\2\2\2\7\u0096\3\2\2"+
		"\2\t\u0099\3\2\2\2\13\u009b\3\2\2\2\r\u009d\3\2\2\2\17\u009f\3\2\2\2\21"+
		"\u00a1\3\2\2\2\23\u00a3\3\2\2\2\25\u00a5\3\2\2\2\27\u00a7\3\2\2\2\31\u00a9"+
		"\3\2\2\2\33\u00ab\3\2\2\2\35\u00ad\3\2\2\2\37\u00af\3\2\2\2!\u00b1\3\2"+
		"\2\2#\u00b3\3\2\2\2%\u00b6\3\2\2\2\'\u00b9\3\2\2\2)\u00bb\3\2\2\2+\u00bd"+
		"\3\2\2\2-\u00bf\3\2\2\2/\u00c1\3\2\2\2\61\u00c3\3\2\2\2\63\u00c5\3\2\2"+
		"\2\65\u00ca\3\2\2\2\67\u00d0\3\2\2\29\u00d6\3\2\2\2;\u00de\3\2\2\2=\u00e6"+
		"\3\2\2\2?\u00eb\3\2\2\2A\u00f0\3\2\2\2C\u00f7\3\2\2\2E\u00fb\3\2\2\2G"+
		"\u0102\3\2\2\2I\u010a\3\2\2\2K\u0111\3\2\2\2M\u0116\3\2\2\2O\u0119\3\2"+
		"\2\2Q\u011e\3\2\2\2S\u0124\3\2\2\2U\u0128\3\2\2\2W\u0139\3\2\2\2Y\u014c"+
		"\3\2\2\2[\u0156\3\2\2\2]\u015d\3\2\2\2_\u0161\3\2\2\2a\u0165\3\2\2\2c"+
		"\u0169\3\2\2\2e\u016f\3\2\2\2g\u0175\3\2\2\2i\u017c\3\2\2\2k\u0182\3\2"+
		"\2\2m\u018a\3\2\2\2o\u0191\3\2\2\2q\u0196\3\2\2\2s\u0199\3\2\2\2u\u019f"+
		"\3\2\2\2w\u01a6\3\2\2\2y\u01a8\3\2\2\2{\u01aa\3\2\2\2}\u01ae\3\2\2\2\177"+
		"\u01b2\3\2\2\2\u0081\u01c5\3\2\2\2\u0083\u01c7\3\2\2\2\u0085\u01da\3\2"+
		"\2\2\u0087\u01dc\3\2\2\2\u0089\u01e0\3\2\2\2\u008b\u01e9\3\2\2\2\u008d"+
		"\u01f4\3\2\2\2\u008f\u0203\3\2\2\2\u0091\u0092\7/\2\2\u0092\4\3\2\2\2"+
		"\u0093\u0094\7(\2\2\u0094\u0095\7(\2\2\u0095\6\3\2\2\2\u0096\u0097\7?"+
		"\2\2\u0097\u0098\7?\2\2\u0098\b\3\2\2\2\u0099\u009a\7>\2\2\u009a\n\3\2"+
		"\2\2\u009b\u009c\7@\2\2\u009c\f\3\2\2\2\u009d\u009e\7-\2\2\u009e\16\3"+
		"\2\2\2\u009f\u00a0\7,\2\2\u00a0\20\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2"+
		"\22\3\2\2\2\u00a3\u00a4\7\'\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6"+
		"\26\3\2\2\2\u00a7\u00a8\7=\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7.\2\2\u00aa"+
		"\32\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7\60\2\2\u00ae"+
		"\36\3\2\2\2\u00af\u00b0\7A\2\2\u00b0 \3\2\2\2\u00b1\u00b2\7<\2\2\u00b2"+
		"\"\3\2\2\2\u00b3\u00b4\5\r\7\2\u00b4\u00b5\5\r\7\2\u00b5$\3\2\2\2\u00b6"+
		"\u00b7\5\3\2\2\u00b7\u00b8\5\3\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba"+
		"(\3\2\2\2\u00bb\u00bc\7+\2\2\u00bc*\3\2\2\2\u00bd\u00be\7]\2\2\u00be,"+
		"\3\2\2\2\u00bf\u00c0\7_\2\2\u00c0.\3\2\2\2\u00c1\u00c2\7}\2\2\u00c2\60"+
		"\3\2\2\2\u00c3\u00c4\7\177\2\2\u00c4\62\3\2\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"\u00c7\7t\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7g\2\2\u00c9\64\3\2\2\2\u00ca"+
		"\u00cb\7h\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7u\2\2"+
		"\u00ce\u00cf\7g\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7"+
		"n\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7u\2\2\u00d58"+
		"\3\2\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7z\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7u\2\2"+
		"\u00dd:\3\2\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7q\2"+
		"\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5"+
		"\7p\2\2\u00e5<\3\2\2\2\u00e6\u00e7\7x\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9"+
		"\7k\2\2\u00e9\u00ea\7f\2\2\u00ea>\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed"+
		"\7j\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7t\2\2\u00ef@\3\2\2\2\u00f0\u00f1"+
		"\7f\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7d\2\2\u00f4"+
		"\u00f5\7n\2\2\u00f5\u00f6\7g\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7k\2\2\u00f8"+
		"\u00f9\7p\2\2\u00f9\u00fa\7v\2\2\u00faD\3\2\2\2\u00fb\u00fc\7r\2\2\u00fc"+
		"\u00fd\7w\2\2\u00fd\u00fe\7d\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7k\2\2"+
		"\u0100\u0101\7e\2\2\u0101F\3\2\2\2\u0102\u0103\7r\2\2\u0103\u0104\7t\2"+
		"\2\u0104\u0105\7k\2\2\u0105\u0106\7x\2\2\u0106\u0107\7c\2\2\u0107\u0108"+
		"\7v\2\2\u0108\u0109\7g\2\2\u0109H\3\2\2\2\u010a\u010b\7u\2\2\u010b\u010c"+
		"\7v\2\2\u010c\u010d\7c\2\2\u010d\u010e\7v\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7e\2\2\u0110J\3\2\2\2\u0111\u0112\7v\2\2\u0112\u0113\7j\2\2\u0113"+
		"\u0114\7k\2\2\u0114\u0115\7u\2\2\u0115L\3\2\2\2\u0116\u0117\7k\2\2\u0117"+
		"\u0118\7h\2\2\u0118N\3\2\2\2\u0119\u011a\7g\2\2\u011a\u011b\7n\2\2\u011b"+
		"\u011c\7u\2\2\u011c\u011d\7g\2\2\u011dP\3\2\2\2\u011e\u011f\7y\2\2\u011f"+
		"\u0120\7j\2\2\u0120\u0121\7k\2\2\u0121\u0122\7n\2\2\u0122\u0123\7g\2\2"+
		"\u0123R\3\2\2\2\u0124\u0125\7h\2\2\u0125\u0126\7q\2\2\u0126\u0127\7t\2"+
		"\2\u0127T\3\2\2\2\u0128\u0129\7U\2\2\u0129\u012a\7{\2\2\u012a\u012b\7"+
		"u\2\2\u012b\u012c\7v\2\2\u012c\u012d\7g\2\2\u012d\u012e\7o\2\2\u012e\u012f"+
		"\7\60\2\2\u012f\u0130\7q\2\2\u0130\u0131\7w\2\2\u0131\u0132\7v\2\2\u0132"+
		"\u0133\7\60\2\2\u0133\u0134\7r\2\2\u0134\u0135\7t\2\2\u0135\u0136\7k\2"+
		"\2\u0136\u0137\7p\2\2\u0137\u0138\7v\2\2\u0138V\3\2\2\2\u0139\u013a\7"+
		"U\2\2\u013a\u013b\7{\2\2\u013b\u013c\7u\2\2\u013c\u013d\7v\2\2\u013d\u013e"+
		"\7g\2\2\u013e\u013f\7o\2\2\u013f\u0140\7\60\2\2\u0140\u0141\7q\2\2\u0141"+
		"\u0142\7w\2\2\u0142\u0143\7v\2\2\u0143\u0144\7\60\2\2\u0144\u0145\7r\2"+
		"\2\u0145\u0146\7t\2\2\u0146\u0147\7k\2\2\u0147\u0148\7p\2\2\u0148\u0149"+
		"\7v\2\2\u0149\u014a\7n\2\2\u014a\u014b\7p\2\2\u014bX\3\2\2\2\u014c\u014d"+
		"\7O\2\2\u014d\u014e\7c\2\2\u014e\u014f\7v\2\2\u014f\u0150\7j\2\2\u0150"+
		"\u0151\7\60\2\2\u0151\u0152\7u\2\2\u0152\u0153\7s\2\2\u0153\u0154\7t\2"+
		"\2\u0154\u0155\7v\2\2\u0155Z\3\2\2\2\u0156\u0157\7t\2\2\u0157\u0158\7"+
		"g\2\2\u0158\u0159\7v\2\2\u0159\u015a\7w\2\2\u015a\u015b\7t\2\2\u015b\u015c"+
		"\7p\2\2\u015c\\\3\2\2\2\u015d\u015e\7p\2\2\u015e\u015f\7g\2\2\u015f\u0160"+
		"\7y\2\2\u0160^\3\2\2\2\u0161\u0162\7x\2\2\u0162\u0163\7c\2\2\u0163\u0164"+
		"\7t\2\2\u0164`\3\2\2\2\u0165\u0166\7v\2\2\u0166\u0167\7t\2\2\u0167\u0168"+
		"\7{\2\2\u0168b\3\2\2\2\u0169\u016a\7e\2\2\u016a\u016b\7c\2\2\u016b\u016c"+
		"\7v\2\2\u016c\u016d\7e\2\2\u016d\u016e\7j\2\2\u016ed\3\2\2\2\u016f\u0170"+
		"\7v\2\2\u0170\u0171\7j\2\2\u0171\u0172\7t\2\2\u0172\u0173\7q\2\2\u0173"+
		"\u0174\7y\2\2\u0174f\3\2\2\2\u0175\u0176\7v\2\2\u0176\u0177\7j\2\2\u0177"+
		"\u0178\7t\2\2\u0178\u0179\7q\2\2\u0179\u017a\7y\2\2\u017a\u017b\7u\2\2"+
		"\u017bh\3\2\2\2\u017c\u017d\7u\2\2\u017d\u017e\7w\2\2\u017e\u017f\7r\2"+
		"\2\u017f\u0180\7g\2\2\u0180\u0181\7t\2\2\u0181j\3\2\2\2\u0182\u0183\7"+
		"v\2\2\u0183\u0184\7{\2\2\u0184\u0185\7r\2\2\u0185\u0186\7g\2\2\u0186\u0187"+
		"\7f\2\2\u0187\u0188\7g\2\2\u0188\u0189\7h\2\2\u0189l\3\2\2\2\u018a\u018b"+
		"\7u\2\2\u018b\u018c\7v\2\2\u018c\u018d\7t\2\2\u018d\u018e\7w\2\2\u018e"+
		"\u018f\7e\2\2\u018f\u0190\7v\2\2\u0190n\3\2\2\2\u0191\u0192\7h\2\2\u0192"+
		"\u0193\7t\2\2\u0193\u0194\7q\2\2\u0194\u0195\7o\2\2\u0195p\3\2\2\2\u0196"+
		"\u0197\7k\2\2\u0197\u0198\7p\2\2\u0198r\3\2\2\2\u0199\u019a\7y\2\2\u019a"+
		"\u019b\7j\2\2\u019b\u019c\7g\2\2\u019c\u019d\7t\2\2\u019d\u019e\7g\2\2"+
		"\u019et\3\2\2\2\u019f\u01a0\7u\2\2\u01a0\u01a1\7g\2\2\u01a1\u01a2\7n\2"+
		"\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7e\2\2\u01a4\u01a5\7v\2\2\u01a5v\3\2"+
		"\2\2\u01a6\u01a7\4c|\2\u01a7x\3\2\2\2\u01a8\u01a9\4C\\\2\u01a9z\3\2\2"+
		"\2\u01aa\u01ab\4\63;\2\u01ab|\3\2\2\2\u01ac\u01af\7\62\2\2\u01ad\u01af"+
		"\5{>\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af~\3\2\2\2\u01b0\u01b3"+
		"\5w<\2\u01b1\u01b3\5y=\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3"+
		"\u01ba\3\2\2\2\u01b4\u01b9\5w<\2\u01b5\u01b9\5y=\2\u01b6\u01b9\5}?\2\u01b7"+
		"\u01b9\7a\2\2\u01b8\u01b4\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b6\3\2"+
		"\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u0080\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01c6\7\62"+
		"\2\2\u01be\u01c2\5{>\2\u01bf\u01c1\5}?\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c5\u01bd\3\2\2\2\u01c5\u01be\3\2\2\2\u01c6\u0082\3\2"+
		"\2\2\u01c7\u01cf\5\u0081A\2\u01c8\u01cc\7\60\2\2\u01c9\u01cb\5}?\2\u01ca"+
		"\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01c8\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u0084\3\2\2\2\u01d1\u01db\t\2\2\2\u01d2\u01d3\7^"+
		"\2\2\u01d3\u01db\7$\2\2\u01d4\u01d5\7^\2\2\u01d5\u01db\7^\2\2\u01d6\u01d7"+
		"\7^\2\2\u01d7\u01db\7v\2\2\u01d8\u01d9\7^\2\2\u01d9\u01db\7p\2\2\u01da"+
		"\u01d1\3\2\2\2\u01da\u01d2\3\2\2\2\u01da\u01d4\3\2\2\2\u01da\u01d6\3\2"+
		"\2\2\u01da\u01d8\3\2\2\2\u01db\u0086\3\2\2\2\u01dc\u01dd\7)\2\2\u01dd"+
		"\u01de\5\u0085C\2\u01de\u01df\7)\2\2\u01df\u0088\3\2\2\2\u01e0\u01e4\7"+
		"$\2\2\u01e1\u01e3\5\u0085C\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e7\u01e8\7$\2\2\u01e8\u008a\3\2\2\2\u01e9\u01ea\7\61\2\2\u01ea"+
		"\u01eb\7\61\2\2\u01eb\u01ef\3\2\2\2\u01ec\u01ee\n\3\2\2\u01ed\u01ec\3"+
		"\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\bF\2\2\u01f3\u008c\3\2"+
		"\2\2\u01f4\u01f5\7\61\2\2\u01f5\u01f6\7,\2\2\u01f6\u01fa\3\2\2\2\u01f7"+
		"\u01f9\13\2\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01fb\3"+
		"\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd"+
		"\u01fe\7,\2\2\u01fe\u01ff\7\61\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\bG"+
		"\3\2\u0201\u008e\3\2\2\2\u0202\u0204\t\4\2\2\u0203\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0208\bH\4\2\u0208\u0090\3\2\2\2\20\2\u01ae\u01b2\u01b8\u01ba"+
		"\u01c2\u01c5\u01cc\u01cf\u01da\u01e4\u01ef\u01fa\u0205";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}