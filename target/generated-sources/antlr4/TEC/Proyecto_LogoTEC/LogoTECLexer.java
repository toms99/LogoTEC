// Generated from LogoTEC.g4 by ANTLR 4.4
package TEC.Proyecto_LogoTEC;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoTECLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, HAZ=2, INIC=3, INC=4, PRINTLN=5, SUMA=6, RESIDUO=7, DIVISION=8, 
		POTENCIA=9, PRODUCTO=10, NEGATIVO=11, DIFERENCIA=12, REDONDEO=13, AZAR=14, 
		MAYOR=15, MENOR=16, AND=17, OR=18, IGUALES=19, ELEMENTO_AZAR=20, LONGITUD=21, 
		ULTIMO=22, ELEMENTO_N=23, PRIMERO_LISTA=24, WHILE=25, DO_WHILE=26, IF_ELSE=27, 
		IF=28, DO_N=29, DO=30, AVANZA=31, RETROCEDE=32, ESPERA=33, GIRA_DERECHA=34, 
		GIRA_IZQUIERDA=35, OCULTA_TORTUGA=36, APARECE_TORTUGA=37, CENTRO=38, PON_POS=39, 
		PONX=40, PONY=41, PON_RUMBO=42, RUMBO=43, COLOR=44, SUBE_LAPIZ=45, BAJA_LAPIZ=46, 
		BORRADOR=47, BORRA_PANTALLA=48, TRUE=49, FALSE=50, MAS=51, MULTI=52, DIV=53, 
		MY=54, MN=55, ASIGNAR=56, NOT=57, MYI=58, MNI=59, NEQ=60, BRACKET_ABIERTO=61, 
		BRACKET_CERRADO=62, PAR_ABIERTO=63, PAR_CERRADO=64, PAR_CUAD_ABIERTO=65, 
		PAR_CUAD_CERRADO=66, SEMICOLON=67, DOS_PUNTOS=68, COMILLA=69, ID=70, ENTERO=71, 
		FLOAT=72, ESPACIO_BLANCO=73;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'", "'@'", "'A'", "'B'", "'C'", "'D'", "'E'", 
		"'F'", "'G'", "'H'", "'I'"
	};
	public static final String[] ruleNames = {
		"PROGRAMA", "HAZ", "INIC", "INC", "PRINTLN", "SUMA", "RESIDUO", "DIVISION", 
		"POTENCIA", "PRODUCTO", "NEGATIVO", "DIFERENCIA", "REDONDEO", "AZAR", 
		"MAYOR", "MENOR", "AND", "OR", "IGUALES", "ELEMENTO_AZAR", "LONGITUD", 
		"ULTIMO", "ELEMENTO_N", "PRIMERO_LISTA", "WHILE", "DO_WHILE", "IF_ELSE", 
		"IF", "DO_N", "DO", "AVANZA", "RETROCEDE", "ESPERA", "GIRA_DERECHA", "GIRA_IZQUIERDA", 
		"OCULTA_TORTUGA", "APARECE_TORTUGA", "CENTRO", "PON_POS", "PONX", "PONY", 
		"PON_RUMBO", "RUMBO", "COLOR", "SUBE_LAPIZ", "BAJA_LAPIZ", "BORRADOR", 
		"BORRA_PANTALLA", "TRUE", "FALSE", "MAS", "MULTI", "DIV", "MY", "MN", 
		"ASIGNAR", "NOT", "MYI", "MNI", "NEQ", "BRACKET_ABIERTO", "BRACKET_CERRADO", 
		"PAR_ABIERTO", "PAR_CERRADO", "PAR_CUAD_ABIERTO", "PAR_CUAD_CERRADO", 
		"SEMICOLON", "DOS_PUNTOS", "COMILLA", "ID", "ENTERO", "FLOAT", "ESPACIO_BLANCO"
	};


	public LogoTECLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LogoTEC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2K\u03dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00ba\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00c6\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u00d8\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00ea\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00fc\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0108\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u011e\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u0130\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u013a"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u014e\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0162"+
		"\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0178\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0186\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0194\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01a4"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u01b6\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u01c2\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u01d1\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u01e8\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0206\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u021d\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u022d\n \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0243\n!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0257\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\5#\u0271\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u028f\n$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\5%\u02ad\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u02cd\n&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02e1\n\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02ee\n(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u030a\n+\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0323\n"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0349\n-\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u035f\n.\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0375\n/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0381\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\7G\u03c7\nG\fG\16G\u03ca"+
		"\13G\3H\6H\u03cd\nH\rH\16H\u03ce\3I\3I\3I\5I\u03d4\nI\3J\6J\u03d7\nJ\r"+
		"J\16J\u03d8\3J\3J\2\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3"+
		"\2\62;\5\2\13\f\17\17\"\"\u0414\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\3\u0095\3\2\2\2\5\u009e\3\2\2\2\7\u00a2\3\2\2\2\t\u00a7\3\2\2"+
		"\2\13\u00ab\3\2\2\2\r\u00b9\3\2\2\2\17\u00c5\3\2\2\2\21\u00d7\3\2\2\2"+
		"\23\u00e9\3\2\2\2\25\u00fb\3\2\2\2\27\u0107\3\2\2\2\31\u011d\3\2\2\2\33"+
		"\u012f\3\2\2\2\35\u0139\3\2\2\2\37\u014d\3\2\2\2!\u0161\3\2\2\2#\u0163"+
		"\3\2\2\2%\u0165\3\2\2\2\'\u0177\3\2\2\2)\u0185\3\2\2\2+\u0193\3\2\2\2"+
		"-\u01a3\3\2\2\2/\u01b5\3\2\2\2\61\u01c1\3\2\2\2\63\u01d0\3\2\2\2\65\u01e7"+
		"\3\2\2\2\67\u01e9\3\2\2\29\u01f0\3\2\2\2;\u0205\3\2\2\2=\u021c\3\2\2\2"+
		"?\u022c\3\2\2\2A\u0242\3\2\2\2C\u0256\3\2\2\2E\u0270\3\2\2\2G\u028e\3"+
		"\2\2\2I\u02ac\3\2\2\2K\u02cc\3\2\2\2M\u02e0\3\2\2\2O\u02ed\3\2\2\2Q\u02ef"+
		"\3\2\2\2S\u02f4\3\2\2\2U\u0309\3\2\2\2W\u0322\3\2\2\2Y\u0348\3\2\2\2["+
		"\u035e\3\2\2\2]\u0374\3\2\2\2_\u0380\3\2\2\2a\u0382\3\2\2\2c\u0390\3\2"+
		"\2\2e\u0395\3\2\2\2g\u039b\3\2\2\2i\u039d\3\2\2\2k\u039f\3\2\2\2m\u03a1"+
		"\3\2\2\2o\u03a3\3\2\2\2q\u03a5\3\2\2\2s\u03a7\3\2\2\2u\u03a9\3\2\2\2w"+
		"\u03ac\3\2\2\2y\u03af\3\2\2\2{\u03b2\3\2\2\2}\u03b4\3\2\2\2\177\u03b6"+
		"\3\2\2\2\u0081\u03b8\3\2\2\2\u0083\u03ba\3\2\2\2\u0085\u03bc\3\2\2\2\u0087"+
		"\u03be\3\2\2\2\u0089\u03c0\3\2\2\2\u008b\u03c2\3\2\2\2\u008d\u03c4\3\2"+
		"\2\2\u008f\u03cc\3\2\2\2\u0091\u03d0\3\2\2\2\u0093\u03d6\3\2\2\2\u0095"+
		"\u0096\7R\2\2\u0096\u0097\7t\2\2\u0097\u0098\7q\2\2\u0098\u0099\7i\2\2"+
		"\u0099\u009a\7t\2\2\u009a\u009b\7c\2\2\u009b\u009c\7o\2\2\u009c\u009d"+
		"\7c\2\2\u009d\4\3\2\2\2\u009e\u009f\7J\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1"+
		"\7|\2\2\u00a1\6\3\2\2\2\u00a2\u00a3\7K\2\2\u00a3\u00a4\7P\2\2\u00a4\u00a5"+
		"\7K\2\2\u00a5\u00a6\7E\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7K\2\2\u00a8\u00a9"+
		"\7P\2\2\u00a9\u00aa\7E\2\2\u00aa\n\3\2\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad"+
		"\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\f\3\2\2\2\u00b1\u00b2\7U\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7o\2\2\u00b4"+
		"\u00ba\7c\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7o\2\2"+
		"\u00b8\u00ba\7c\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\16\3"+
		"\2\2\2\u00bb\u00bc\7T\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7u\2\2\u00be"+
		"\u00bf\7v\2\2\u00bf\u00c6\7q\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7g\2\2"+
		"\u00c2\u00c3\7u\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c6\7q\2\2\u00c5\u00bb"+
		"\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c6\20\3\2\2\2\u00c7\u00c8\7F\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9\u00ca\7x\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7u\2\2"+
		"\u00cc\u00cd\7k\2\2\u00cd\u00ce\7q\2\2\u00ce\u00d8\7p\2\2\u00cf\u00d0"+
		"\7f\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7x\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7u\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d8\7p\2\2"+
		"\u00d7\u00c7\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d8\22\3\2\2\2\u00d9\u00da"+
		"\7R\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7g\2\2\u00dd"+
		"\u00de\7p\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7k\2\2\u00e0\u00ea\7c\2\2"+
		"\u00e1\u00e2\7r\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5"+
		"\7g\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00ea\7c\2\2\u00e9\u00d9\3\2\2\2\u00e9\u00e1\3\2\2\2\u00ea\24\3\2\2\2"+
		"\u00eb\u00ec\7R\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7f\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\u00fc\7q\2\2\u00f3\u00f4\7r\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7q\2\2"+
		"\u00f6\u00f7\7f\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa"+
		"\7v\2\2\u00fa\u00fc\7q\2\2\u00fb\u00eb\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fc"+
		"\26\3\2\2\2\u00fd\u00fe\7O\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100"+
		"\u0101\7q\2\2\u0101\u0108\7u\2\2\u0102\u0103\7o\2\2\u0103\u0104\7g\2\2"+
		"\u0104\u0105\7p\2\2\u0105\u0106\7q\2\2\u0106\u0108\7u\2\2\u0107\u00fd"+
		"\3\2\2\2\u0107\u0102\3\2\2\2\u0108\30\3\2\2\2\u0109\u010a\7F\2\2\u010a"+
		"\u010b\7k\2\2\u010b\u010c\7h\2\2\u010c\u010d\7g\2\2\u010d\u010e\7t\2\2"+
		"\u010e\u010f\7g\2\2\u010f\u0110\7p\2\2\u0110\u0111\7e\2\2\u0111\u0112"+
		"\7k\2\2\u0112\u011e\7c\2\2\u0113\u0114\7f\2\2\u0114\u0115\7k\2\2\u0115"+
		"\u0116\7h\2\2\u0116\u0117\7g\2\2\u0117\u0118\7t\2\2\u0118\u0119\7g\2\2"+
		"\u0119\u011a\7p\2\2\u011a\u011b\7e\2\2\u011b\u011c\7k\2\2\u011c\u011e"+
		"\7c\2\2\u011d\u0109\3\2\2\2\u011d\u0113\3\2\2\2\u011e\32\3\2\2\2\u011f"+
		"\u0120\7T\2\2\u0120\u0121\7g\2\2\u0121\u0122\7f\2\2\u0122\u0123\7q\2\2"+
		"\u0123\u0124\7p\2\2\u0124\u0125\7f\2\2\u0125\u0126\7g\2\2\u0126\u0130"+
		"\7c\2\2\u0127\u0128\7t\2\2\u0128\u0129\7g\2\2\u0129\u012a\7f\2\2\u012a"+
		"\u012b\7q\2\2\u012b\u012c\7p\2\2\u012c\u012d\7f\2\2\u012d\u012e\7g\2\2"+
		"\u012e\u0130\7c\2\2\u012f\u011f\3\2\2\2\u012f\u0127\3\2\2\2\u0130\34\3"+
		"\2\2\2\u0131\u0132\7C\2\2\u0132\u0133\7|\2\2\u0133\u0134\7c\2\2\u0134"+
		"\u013a\7t\2\2\u0135\u0136\7c\2\2\u0136\u0137\7|\2\2\u0137\u0138\7c\2\2"+
		"\u0138\u013a\7t\2\2\u0139\u0131\3\2\2\2\u0139\u0135\3\2\2\2\u013a\36\3"+
		"\2\2\2\u013b\u013c\7O\2\2\u013c\u013d\7c\2\2\u013d\u013e\7{\2\2\u013e"+
		"\u013f\7q\2\2\u013f\u0140\7t\2\2\u0140\u0141\7S\2\2\u0141\u0142\7w\2\2"+
		"\u0142\u0143\7g\2\2\u0143\u014e\7A\2\2\u0144\u0145\7o\2\2\u0145\u0146"+
		"\7c\2\2\u0146\u0147\7{\2\2\u0147\u0148\7q\2\2\u0148\u0149\7t\2\2\u0149"+
		"\u014a\7s\2\2\u014a\u014b\7w\2\2\u014b\u014c\7g\2\2\u014c\u014e\7A\2\2"+
		"\u014d\u013b\3\2\2\2\u014d\u0144\3\2\2\2\u014e \3\2\2\2\u014f\u0150\7"+
		"O\2\2\u0150\u0151\7g\2\2\u0151\u0152\7p\2\2\u0152\u0153\7q\2\2\u0153\u0154"+
		"\7t\2\2\u0154\u0155\7S\2\2\u0155\u0156\7w\2\2\u0156\u0157\7g\2\2\u0157"+
		"\u0162\7A\2\2\u0158\u0159\7o\2\2\u0159\u015a\7g\2\2\u015a\u015b\7p\2\2"+
		"\u015b\u015c\7q\2\2\u015c\u015d\7t\2\2\u015d\u015e\7s\2\2\u015e\u015f"+
		"\7w\2\2\u015f\u0160\7g\2\2\u0160\u0162\7A\2\2\u0161\u014f\3\2\2\2\u0161"+
		"\u0158\3\2\2\2\u0162\"\3\2\2\2\u0163\u0164\7[\2\2\u0164$\3\2\2\2\u0165"+
		"\u0166\7Q\2\2\u0166&\3\2\2\2\u0167\u0168\7k\2\2\u0168\u0169\7i\2\2\u0169"+
		"\u016a\7w\2\2\u016a\u016b\7c\2\2\u016b\u016c\7n\2\2\u016c\u016d\7g\2\2"+
		"\u016d\u016e\7u\2\2\u016e\u0178\7A\2\2\u016f\u0170\7K\2\2\u0170\u0171"+
		"\7i\2\2\u0171\u0172\7w\2\2\u0172\u0173\7c\2\2\u0173\u0174\7n\2\2\u0174"+
		"\u0175\7g\2\2\u0175\u0176\7u\2\2\u0176\u0178\7A\2\2\u0177\u0167\3\2\2"+
		"\2\u0177\u016f\3\2\2\2\u0178(\3\2\2\2\u0179\u017a\7G\2\2\u017a\u017b\7"+
		"n\2\2\u017b\u017c\7g\2\2\u017c\u017d\7i\2\2\u017d\u017e\7k\2\2\u017e\u0186"+
		"\7t\2\2\u017f\u0180\7g\2\2\u0180\u0181\7n\2\2\u0181\u0182\7g\2\2\u0182"+
		"\u0183\7i\2\2\u0183\u0184\7k\2\2\u0184\u0186\7t\2\2\u0185\u0179\3\2\2"+
		"\2\u0185\u017f\3\2\2\2\u0186*\3\2\2\2\u0187\u0188\7E\2\2\u0188\u0189\7"+
		"w\2\2\u0189\u018a\7g\2\2\u018a\u018b\7p\2\2\u018b\u018c\7v\2\2\u018c\u0194"+
		"\7c\2\2\u018d\u018e\7e\2\2\u018e\u018f\7w\2\2\u018f\u0190\7g\2\2\u0190"+
		"\u0191\7p\2\2\u0191\u0192\7v\2\2\u0192\u0194\7c\2\2\u0193\u0187\3\2\2"+
		"\2\u0193\u018d\3\2\2\2\u0194,\3\2\2\2\u0195\u0196\7W\2\2\u0196\u0197\7"+
		"n\2\2\u0197\u0198\7v\2\2\u0198\u0199\7k\2\2\u0199\u019a\7o\2\2\u019a\u01a4"+
		"\7q\2\2\u019b\u019c\7w\2\2\u019c\u01a4\7n\2\2\u019d\u019e\7w\2\2\u019e"+
		"\u019f\7n\2\2\u019f\u01a0\7v\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a2\7o\2\2"+
		"\u01a2\u01a4\7q\2\2\u01a3\u0195\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019d"+
		"\3\2\2\2\u01a4.\3\2\2\2\u01a5\u01a6\7G\2\2\u01a6\u01a7\7n\2\2\u01a7\u01a8"+
		"\7g\2\2\u01a8\u01a9\7o\2\2\u01a9\u01aa\7g\2\2\u01aa\u01ab\7p\2\2\u01ab"+
		"\u01ac\7v\2\2\u01ac\u01b6\7q\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af\7n\2\2"+
		"\u01af\u01b0\7g\2\2\u01b0\u01b1\7o\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b3"+
		"\7p\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b6\7q\2\2\u01b5\u01a5\3\2\2\2\u01b5"+
		"\u01ad\3\2\2\2\u01b6\60\3\2\2\2\u01b7\u01b8\7R\2\2\u01b8\u01b9\7t\2\2"+
		"\u01b9\u01c2\7k\2\2\u01ba\u01bb\7R\2\2\u01bb\u01bc\7t\2\2\u01bc\u01bd"+
		"\7k\2\2\u01bd\u01be\7o\2\2\u01be\u01bf\7g\2\2\u01bf\u01c0\7t\2\2\u01c0"+
		"\u01c2\7q\2\2\u01c1\u01b7\3\2\2\2\u01c1\u01ba\3\2\2\2\u01c2\62\3\2\2\2"+
		"\u01c3\u01c4\7O\2\2\u01c4\u01c5\7K\2\2\u01c5\u01c6\7G\2\2\u01c6\u01c7"+
		"\7P\2\2\u01c7\u01c8\7V\2\2\u01c8\u01c9\7T\2\2\u01c9\u01ca\7C\2\2\u01ca"+
		"\u01d1\7U\2\2\u01cb\u01cc\7J\2\2\u01cc\u01cd\7C\2\2\u01cd\u01ce\7U\2\2"+
		"\u01ce\u01cf\7V\2\2\u01cf\u01d1\7C\2\2\u01d0\u01c3\3\2\2\2\u01d0\u01cb"+
		"\3\2\2\2\u01d1\64\3\2\2\2\u01d2\u01d3\7J\2\2\u01d3\u01d4\7C\2\2\u01d4"+
		"\u01d5\7\\\2\2\u01d5\u01d6\7\60\2\2\u01d6\u01d7\7O\2\2\u01d7\u01d8\7K"+
		"\2\2\u01d8\u01d9\7G\2\2\u01d9\u01da\7P\2\2\u01da\u01db\7V\2\2\u01db\u01dc"+
		"\7T\2\2\u01dc\u01dd\7C\2\2\u01dd\u01e8\7U\2\2\u01de\u01df\7J\2\2\u01df"+
		"\u01e0\7C\2\2\u01e0\u01e1\7\\\2\2\u01e1\u01e2\7\60\2\2\u01e2\u01e3\7J"+
		"\2\2\u01e3\u01e4\7C\2\2\u01e4\u01e5\7U\2\2\u01e5\u01e6\7V\2\2\u01e6\u01e8"+
		"\7C\2\2\u01e7\u01d2\3\2\2\2\u01e7\u01de\3\2\2\2\u01e8\66\3\2\2\2\u01e9"+
		"\u01ea\7U\2\2\u01ea\u01eb\7K\2\2\u01eb\u01ec\7U\2\2\u01ec\u01ed\7K\2\2"+
		"\u01ed\u01ee\7P\2\2\u01ee\u01ef\7Q\2\2\u01ef8\3\2\2\2\u01f0\u01f1\7U\2"+
		"\2\u01f1\u01f2\7K\2\2\u01f2:\3\2\2\2\u01f3\u01f4\7T\2\2\u01f4\u01f5\7"+
		"G\2\2\u01f5\u01f6\7R\2\2\u01f6\u01f7\7K\2\2\u01f7\u01f8\7V\2\2\u01f8\u0206"+
		"\7G\2\2\u01f9\u01fa\7T\2\2\u01fa\u01fb\7g\2\2\u01fb\u01fc\7r\2\2\u01fc"+
		"\u01fd\7k\2\2\u01fd\u01fe\7v\2\2\u01fe\u0206\7g\2\2\u01ff\u0200\7t\2\2"+
		"\u0200\u0201\7g\2\2\u0201\u0202\7r\2\2\u0202\u0203\7k\2\2\u0203\u0204"+
		"\7v\2\2\u0204\u0206\7g\2\2\u0205\u01f3\3\2\2\2\u0205\u01f9\3\2\2\2\u0205"+
		"\u01ff\3\2\2\2\u0206<\3\2\2\2\u0207\u0208\7G\2\2\u0208\u0209\7l\2\2\u0209"+
		"\u020a\7g\2\2\u020a\u020b\7e\2\2\u020b\u020c\7w\2\2\u020c\u020d\7v\2\2"+
		"\u020d\u021d\7c\2\2\u020e\u020f\7G\2\2\u020f\u0210\7L\2\2\u0210\u0211"+
		"\7G\2\2\u0211\u0212\7E\2\2\u0212\u0213\7W\2\2\u0213\u0214\7V\2\2\u0214"+
		"\u021d\7C\2\2\u0215\u0216\7g\2\2\u0216\u0217\7l\2\2\u0217\u0218\7g\2\2"+
		"\u0218\u0219\7e\2\2\u0219\u021a\7w\2\2\u021a\u021b\7v\2\2\u021b\u021d"+
		"\7c\2\2\u021c\u0207\3\2\2\2\u021c\u020e\3\2\2\2\u021c\u0215\3\2\2\2\u021d"+
		">\3\2\2\2\u021e\u021f\7C\2\2\u021f\u0220\7X\2\2\u0220\u0221\7C\2\2\u0221"+
		"\u0222\7P\2\2\u0222\u0223\7\\\2\2\u0223\u022d\7C\2\2\u0224\u0225\7C\2"+
		"\2\u0225\u022d\7X\2\2\u0226\u0227\7c\2\2\u0227\u0228\7x\2\2\u0228\u0229"+
		"\7c\2\2\u0229\u022a\7p\2\2\u022a\u022b\7|\2\2\u022b\u022d\7c\2\2\u022c"+
		"\u021e\3\2\2\2\u022c\u0224\3\2\2\2\u022c\u0226\3\2\2\2\u022d@\3\2\2\2"+
		"\u022e\u022f\7T\2\2\u022f\u0230\7G\2\2\u0230\u0231\7V\2\2\u0231\u0232"+
		"\7T\2\2\u0232\u0233\7Q\2\2\u0233\u0234\7E\2\2\u0234\u0235\7G\2\2\u0235"+
		"\u0236\7F\2\2\u0236\u0243\7G\2\2\u0237\u0238\7T\2\2\u0238\u0243\7G\2\2"+
		"\u0239\u023a\7t\2\2\u023a\u023b\7g\2\2\u023b\u023c\7v\2\2\u023c\u023d"+
		"\7t\2\2\u023d\u023e\7q\2\2\u023e\u023f\7e\2\2\u023f\u0240\7g\2\2\u0240"+
		"\u0241\7f\2\2\u0241\u0243\7g\2\2\u0242\u022e\3\2\2\2\u0242\u0237\3\2\2"+
		"\2\u0242\u0239\3\2\2\2\u0243B\3\2\2\2\u0244\u0245\7G\2\2\u0245\u0246\7"+
		"U\2\2\u0246\u0247\7R\2\2\u0247\u0248\7G\2\2\u0248\u0249\7T\2\2\u0249\u0257"+
		"\7C\2\2\u024a\u024b\7G\2\2\u024b\u024c\7u\2\2\u024c\u024d\7r\2\2\u024d"+
		"\u024e\7g\2\2\u024e\u024f\7t\2\2\u024f\u0257\7c\2\2\u0250\u0251\7g\2\2"+
		"\u0251\u0252\7u\2\2\u0252\u0253\7r\2\2\u0253\u0254\7g\2\2\u0254\u0255"+
		"\7t\2\2\u0255\u0257\7c\2\2\u0256\u0244\3\2\2\2\u0256\u024a\3\2\2\2\u0256"+
		"\u0250\3\2\2\2\u0257D\3\2\2\2\u0258\u0259\7I\2\2\u0259\u025a\7k\2\2\u025a"+
		"\u025b\7t\2\2\u025b\u025c\7c\2\2\u025c\u025d\7F\2\2\u025d\u025e\7g\2\2"+
		"\u025e\u025f\7t\2\2\u025f\u0260\7g\2\2\u0260\u0261\7e\2\2\u0261\u0262"+
		"\7j\2\2\u0262\u0271\7c\2\2\u0263\u0264\7I\2\2\u0264\u0271\7F\2\2\u0265"+
		"\u0266\7i\2\2\u0266\u0267\7k\2\2\u0267\u0268\7t\2\2\u0268\u0269\7c\2\2"+
		"\u0269\u026a\7f\2\2\u026a\u026b\7g\2\2\u026b\u026c\7t\2\2\u026c\u026d"+
		"\7g\2\2\u026d\u026e\7e\2\2\u026e\u026f\7j\2\2\u026f\u0271\7c\2\2\u0270"+
		"\u0258\3\2\2\2\u0270\u0263\3\2\2\2\u0270\u0265\3\2\2\2\u0271F\3\2\2\2"+
		"\u0272\u0273\7I\2\2\u0273\u0274\7k\2\2\u0274\u0275\7t\2\2\u0275\u0276"+
		"\7c\2\2\u0276\u0277\7K\2\2\u0277\u0278\7|\2\2\u0278\u0279\7s\2\2\u0279"+
		"\u027a\7w\2\2\u027a\u027b\7k\2\2\u027b\u027c\7g\2\2\u027c\u027d\7t\2\2"+
		"\u027d\u027e\7f\2\2\u027e\u028f\7c\2\2\u027f\u0280\7I\2\2\u0280\u028f"+
		"\7K\2\2\u0281\u0282\7i\2\2\u0282\u0283\7k\2\2\u0283\u0284\7t\2\2\u0284"+
		"\u0285\7c\2\2\u0285\u0286\7k\2\2\u0286\u0287\7|\2\2\u0287\u0288\7s\2\2"+
		"\u0288\u0289\7w\2\2\u0289\u028a\7k\2\2\u028a\u028b\7g\2\2\u028b\u028c"+
		"\7t\2\2\u028c\u028d\7f\2\2\u028d\u028f\7c\2\2\u028e\u0272\3\2\2\2\u028e"+
		"\u027f\3\2\2\2\u028e\u0281\3\2\2\2\u028fH\3\2\2\2\u0290\u0291\7Q\2\2\u0291"+
		"\u0292\7e\2\2\u0292\u0293\7w\2\2\u0293\u0294\7n\2\2\u0294\u0295\7v\2\2"+
		"\u0295\u0296\7c\2\2\u0296\u0297\7V\2\2\u0297\u0298\7q\2\2\u0298\u0299"+
		"\7t\2\2\u0299\u029a\7v\2\2\u029a\u029b\7w\2\2\u029b\u029c\7i\2\2\u029c"+
		"\u02ad\7c\2\2\u029d\u029e\7Q\2\2\u029e\u02ad\7V\2\2\u029f\u02a0\7q\2\2"+
		"\u02a0\u02a1\7e\2\2\u02a1\u02a2\7w\2\2\u02a2\u02a3\7n\2\2\u02a3\u02a4"+
		"\7v\2\2\u02a4\u02a5\7c\2\2\u02a5\u02a6\7v\2\2\u02a6\u02a7\7q\2\2\u02a7"+
		"\u02a8\7t\2\2\u02a8\u02a9\7v\2\2\u02a9\u02aa\7w\2\2\u02aa\u02ab\7i\2\2"+
		"\u02ab\u02ad\7c\2\2\u02ac\u0290\3\2\2\2\u02ac\u029d\3\2\2\2\u02ac\u029f"+
		"\3\2\2\2\u02adJ\3\2\2\2\u02ae\u02af\7C\2\2\u02af\u02b0\7r\2\2\u02b0\u02b1"+
		"\7c\2\2\u02b1\u02b2\7t\2\2\u02b2\u02b3\7g\2\2\u02b3\u02b4\7e\2\2\u02b4"+
		"\u02b5\7g\2\2\u02b5\u02b6\7V\2\2\u02b6\u02b7\7q\2\2\u02b7\u02b8\7t\2\2"+
		"\u02b8\u02b9\7v\2\2\u02b9\u02ba\7w\2\2\u02ba\u02bb\7i\2\2\u02bb\u02cd"+
		"\7c\2\2\u02bc\u02bd\7C\2\2\u02bd\u02cd\7V\2\2\u02be\u02bf\7c\2\2\u02bf"+
		"\u02c0\7r\2\2\u02c0\u02c1\7c\2\2\u02c1\u02c2\7t\2\2\u02c2\u02c3\7g\2\2"+
		"\u02c3\u02c4\7e\2\2\u02c4\u02c5\7g\2\2\u02c5\u02c6\7v\2\2\u02c6\u02c7"+
		"\7q\2\2\u02c7\u02c8\7t\2\2\u02c8\u02c9\7v\2\2\u02c9\u02ca\7w\2\2\u02ca"+
		"\u02cb\7i\2\2\u02cb\u02cd\7c\2\2\u02cc\u02ae\3\2\2\2\u02cc\u02bc\3\2\2"+
		"\2\u02cc\u02be\3\2\2\2\u02cdL\3\2\2\2\u02ce\u02cf\7E\2\2\u02cf\u02d0\7"+
		"g\2\2\u02d0\u02d1\7p\2\2\u02d1\u02d2\7v\2\2\u02d2\u02d3\7t\2\2\u02d3\u02e1"+
		"\7q\2\2\u02d4\u02d5\7e\2\2\u02d5\u02d6\7g\2\2\u02d6\u02d7\7p\2\2\u02d7"+
		"\u02d8\7v\2\2\u02d8\u02d9\7t\2\2\u02d9\u02e1\7q\2\2\u02da\u02db\7e\2\2"+
		"\u02db\u02dc\7g\2\2\u02dc\u02dd\7p\2\2\u02dd\u02de\7v\2\2\u02de\u02df"+
		"\7t\2\2\u02df\u02e1\7q\2\2\u02e0\u02ce\3\2\2\2\u02e0\u02d4\3\2\2\2\u02e0"+
		"\u02da\3\2\2\2\u02e1N\3\2\2\2\u02e2\u02e3\7R\2\2\u02e3\u02e4\7q\2\2\u02e4"+
		"\u02e5\7p\2\2\u02e5\u02e6\7R\2\2\u02e6\u02e7\7Q\2\2\u02e7\u02ee\7U\2\2"+
		"\u02e8\u02e9\7R\2\2\u02e9\u02ea\7q\2\2\u02ea\u02eb\7p\2\2\u02eb\u02ec"+
		"\7Z\2\2\u02ec\u02ee\7[\2\2\u02ed\u02e2\3\2\2\2\u02ed\u02e8\3\2\2\2\u02ee"+
		"P\3\2\2\2\u02ef\u02f0\7R\2\2\u02f0\u02f1\7q\2\2\u02f1\u02f2\7p\2\2\u02f2"+
		"\u02f3\7Z\2\2\u02f3R\3\2\2\2\u02f4\u02f5\7R\2\2\u02f5\u02f6\7q\2\2\u02f6"+
		"\u02f7\7p\2\2\u02f7\u02f8\7[\2\2\u02f8T\3\2\2\2\u02f9\u02fa\7R\2\2\u02fa"+
		"\u02fb\7q\2\2\u02fb\u02fc\7p\2\2\u02fc\u02fd\7T\2\2\u02fd\u02fe\7w\2\2"+
		"\u02fe\u02ff\7o\2\2\u02ff\u0300\7d\2\2\u0300\u030a\7q\2\2\u0301\u0302"+
		"\7r\2\2\u0302\u0303\7q\2\2\u0303\u0304\7p\2\2\u0304\u0305\7t\2\2\u0305"+
		"\u0306\7w\2\2\u0306\u0307\7o\2\2\u0307\u0308\7d\2\2\u0308\u030a\7q\2\2"+
		"\u0309\u02f9\3\2\2\2\u0309\u0301\3\2\2\2\u030aV\3\2\2\2\u030b\u030c\7"+
		"O\2\2\u030c\u030d\7w\2\2\u030d\u030e\7g\2\2\u030e\u030f\7u\2\2\u030f\u0310"+
		"\7v\2\2\u0310\u0311\7t\2\2\u0311\u0312\7c\2\2\u0312\u0313\7\"\2\2\u0313"+
		"\u0314\7T\2\2\u0314\u0315\7W\2\2\u0315\u0316\7O\2\2\u0316\u0317\7D\2\2"+
		"\u0317\u0323\7Q\2\2\u0318\u0319\7t\2\2\u0319\u031a\7w\2\2\u031a\u031b"+
		"\7o\2\2\u031b\u031c\7d\2\2\u031c\u0323\7q\2\2\u031d\u031e\7T\2\2\u031e"+
		"\u031f\7W\2\2\u031f\u0320\7O\2\2\u0320\u0321\7D\2\2\u0321\u0323\7Q\2\2"+
		"\u0322\u030b\3\2\2\2\u0322\u0318\3\2\2\2\u0322\u031d\3\2\2\2\u0323X\3"+
		"\2\2\2\u0324\u0325\7r\2\2\u0325\u0326\7q\2\2\u0326\u0327\7p\2\2\u0327"+
		"\u0328\7e\2\2\u0328\u0329\7q\2\2\u0329\u032a\7n\2\2\u032a\u032b\7q\2\2"+
		"\u032b\u032c\7t\2\2\u032c\u032d\7n\2\2\u032d\u032e\7c\2\2\u032e\u032f"+
		"\7r\2\2\u032f\u0330\7k\2\2\u0330\u0349\7|\2\2\u0331\u0332\7R\2\2\u0332"+
		"\u0333\7q\2\2\u0333\u0334\7p\2\2\u0334\u0335\7E\2\2\u0335\u0336\7q\2\2"+
		"\u0336\u0337\7n\2\2\u0337\u0338\7q\2\2\u0338\u0339\7t\2\2\u0339\u033a"+
		"\7N\2\2\u033a\u033b\7c\2\2\u033b\u033c\7r\2\2\u033c\u033d\7k\2\2\u033d"+
		"\u0349\7|\2\2\u033e\u033f\7r\2\2\u033f\u0340\7q\2\2\u0340\u0341\7p\2\2"+
		"\u0341\u0342\7e\2\2\u0342\u0349\7n\2\2\u0343\u0344\7R\2\2\u0344\u0345"+
		"\7q\2\2\u0345\u0346\7p\2\2\u0346\u0347\7E\2\2\u0347\u0349\7N\2\2\u0348"+
		"\u0324\3\2\2\2\u0348\u0331\3\2\2\2\u0348\u033e\3\2\2\2\u0348\u0343\3\2"+
		"\2\2\u0349Z\3\2\2\2\u034a\u034b\7U\2\2\u034b\u034c\7w\2\2\u034c\u034d"+
		"\7d\2\2\u034d\u034e\7g\2\2\u034e\u034f\7N\2\2\u034f\u0350\7c\2\2\u0350"+
		"\u0351\7r\2\2\u0351\u0352\7k\2\2\u0352\u035f\7|\2\2\u0353\u0354\7u\2\2"+
		"\u0354\u0355\7w\2\2\u0355\u0356\7d\2\2\u0356\u0357\7g\2\2\u0357\u0358"+
		"\7n\2\2\u0358\u0359\7c\2\2\u0359\u035a\7r\2\2\u035a\u035b\7k\2\2\u035b"+
		"\u035f\7|\2\2\u035c\u035d\7u\2\2\u035d\u035f\7d\2\2\u035e\u034a\3\2\2"+
		"\2\u035e\u0353\3\2\2\2\u035e\u035c\3\2\2\2\u035f\\\3\2\2\2\u0360\u0361"+
		"\7D\2\2\u0361\u0362\7c\2\2\u0362\u0363\7l\2\2\u0363\u0364\7c\2\2\u0364"+
		"\u0365\7N\2\2\u0365\u0366\7c\2\2\u0366\u0367\7r\2\2\u0367\u0368\7k\2\2"+
		"\u0368\u0375\7|\2\2\u0369\u036a\7d\2\2\u036a\u036b\7c\2\2\u036b\u036c"+
		"\7l\2\2\u036c\u036d\7c\2\2\u036d\u036e\7n\2\2\u036e\u036f\7c\2\2\u036f"+
		"\u0370\7r\2\2\u0370\u0371\7k\2\2\u0371\u0375\7|\2\2\u0372\u0373\7d\2\2"+
		"\u0373\u0375\7n\2\2\u0374\u0360\3\2\2\2\u0374\u0369\3\2\2\2\u0374\u0372"+
		"\3\2\2\2\u0375^\3\2\2\2\u0376\u0377\7i\2\2\u0377\u0378\7q\2\2\u0378\u0379"+
		"\7o\2\2\u0379\u0381\7c\2\2\u037a\u037b\7I\2\2\u037b\u037c\7Q\2\2\u037c"+
		"\u037d\7O\2\2\u037d\u0381\7C\2\2\u037e\u037f\7I\2\2\u037f\u0381\7Q\2\2"+
		"\u0380\u0376\3\2\2\2\u0380\u037a\3\2\2\2\u0380\u037e\3\2\2\2\u0381`\3"+
		"\2\2\2\u0382\u0383\7d\2\2\u0383\u0384\7q\2\2\u0384\u0385\7t\2\2\u0385"+
		"\u0386\7t\2\2\u0386\u0387\7c\2\2\u0387\u0388\7r\2\2\u0388\u0389\7c\2\2"+
		"\u0389\u038a\7p\2\2\u038a\u038b\7v\2\2\u038b\u038c\7c\2\2\u038c\u038d"+
		"\7n\2\2\u038d\u038e\7n\2\2\u038e\u038f\7c\2\2\u038fb\3\2\2\2\u0390\u0391"+
		"\7V\2\2\u0391\u0392\7T\2\2\u0392\u0393\7W\2\2\u0393\u0394\7G\2\2\u0394"+
		"d\3\2\2\2\u0395\u0396\7H\2\2\u0396\u0397\7C\2\2\u0397\u0398\7N\2\2\u0398"+
		"\u0399\7U\2\2\u0399\u039a\7G\2\2\u039af\3\2\2\2\u039b\u039c\7-\2\2\u039c"+
		"h\3\2\2\2\u039d\u039e\7,\2\2\u039ej\3\2\2\2\u039f\u03a0\7\61\2\2\u03a0"+
		"l\3\2\2\2\u03a1\u03a2\7@\2\2\u03a2n\3\2\2\2\u03a3\u03a4\7>\2\2\u03a4p"+
		"\3\2\2\2\u03a5\u03a6\7?\2\2\u03a6r\3\2\2\2\u03a7\u03a8\7#\2\2\u03a8t\3"+
		"\2\2\2\u03a9\u03aa\7@\2\2\u03aa\u03ab\7?\2\2\u03abv\3\2\2\2\u03ac\u03ad"+
		"\7>\2\2\u03ad\u03ae\7?\2\2\u03aex\3\2\2\2\u03af\u03b0\7#\2\2\u03b0\u03b1"+
		"\7?\2\2\u03b1z\3\2\2\2\u03b2\u03b3\7}\2\2\u03b3|\3\2\2\2\u03b4\u03b5\7"+
		"\177\2\2\u03b5~\3\2\2\2\u03b6\u03b7\7*\2\2\u03b7\u0080\3\2\2\2\u03b8\u03b9"+
		"\7+\2\2\u03b9\u0082\3\2\2\2\u03ba\u03bb\7]\2\2\u03bb\u0084\3\2\2\2\u03bc"+
		"\u03bd\7_\2\2\u03bd\u0086\3\2\2\2\u03be\u03bf\7=\2\2\u03bf\u0088\3\2\2"+
		"\2\u03c0\u03c1\7<\2\2\u03c1\u008a\3\2\2\2\u03c2\u03c3\7$\2\2\u03c3\u008c"+
		"\3\2\2\2\u03c4\u03c8\t\2\2\2\u03c5\u03c7\t\3\2\2\u03c6\u03c5\3\2\2\2\u03c7"+
		"\u03ca\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u008e\3\2"+
		"\2\2\u03ca\u03c8\3\2\2\2\u03cb\u03cd\t\4\2\2\u03cc\u03cb\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u0090\3\2"+
		"\2\2\u03d0\u03d3\5\u008fH\2\u03d1\u03d2\7\60\2\2\u03d2\u03d4\5\u008fH"+
		"\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u0092\3\2\2\2\u03d5\u03d7"+
		"\t\5\2\2\u03d6\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8"+
		"\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db\bJ\2\2\u03db\u0094\3\2"+
		"\2\2+\2\u00b9\u00c5\u00d7\u00e9\u00fb\u0107\u011d\u012f\u0139\u014d\u0161"+
		"\u0177\u0185\u0193\u01a3\u01b5\u01c1\u01d0\u01e7\u0205\u021c\u022c\u0242"+
		"\u0256\u0270\u028e\u02ac\u02cc\u02e0\u02ed\u0309\u0322\u0348\u035e\u0374"+
		"\u0380\u03c8\u03ce\u03d3\u03d8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}