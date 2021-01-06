// Generated from C:/Users/anom/IdeaProjects/ANTLR_Tests/src\simple.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, HAZ=2, INIC=3, INC=4, SUMA=5, RESIDUO=6, DIVISION=7, POTENCIA=8, 
		PRODUCTO=9, NEGATIVO=10, DIFERENCIA=11, REDONDEO=12, AZAR=13, MAYOR=14, 
		MENOR=15, AND=16, OR=17, IGUALES=18, ELEMENTO_AZAR=19, LONGITUD=20, ULTIMO=21, 
		ELEMENTO_N=22, PRIMERO_LISTA=23, WHILE=24, DO_WHILE=25, IF_ELSE=26, IF=27, 
		DO_N=28, DO=29, AVANZA=30, RETROCEDE=31, ESPERA=32, GIRA_DERECHA=33, GIRA_IZQUIERDA=34, 
		OCULTA_TORTUGA=35, APARECE_TORTUGA=36, CENTRO=37, PON_POS=38, PONX=39, 
		PONY=40, PON_RUMBO=41, RUMBO=42, COLOR=43, SUBE_LAPIZ=44, BAJA_LAPIZ=45, 
		BORRADOR=46, BORRA_PANTALLA=47, TRUE=48, FALSE=49, MAS=50, MENOS=51, MULTI=52, 
		DIV=53, MY=54, MN=55, ASIGNAR=56, NOT=57, MYI=58, MNI=59, NEQ=60, BRACKET_ABIERTO=61, 
		BRACKET_CERRADO=62, PAR_ABIERTO=63, PAR_CERRADO=64, PAR_CUAD_ABIERTO=65, 
		PAR_CUAD_CERRADO=66, SEMICOLON=67, DOS_PUNTOS=68, COMILLA=69, ID=70, ENTERO=71, 
		ESPACIO_BLANCO=72;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAMA", "HAZ", "INIC", "INC", "SUMA", "RESIDUO", "DIVISION", "POTENCIA", 
			"PRODUCTO", "NEGATIVO", "DIFERENCIA", "REDONDEO", "AZAR", "MAYOR", "MENOR", 
			"AND", "OR", "IGUALES", "ELEMENTO_AZAR", "LONGITUD", "ULTIMO", "ELEMENTO_N", 
			"PRIMERO_LISTA", "WHILE", "DO_WHILE", "IF_ELSE", "IF", "DO_N", "DO", 
			"AVANZA", "RETROCEDE", "ESPERA", "GIRA_DERECHA", "GIRA_IZQUIERDA", "OCULTA_TORTUGA", 
			"APARECE_TORTUGA", "CENTRO", "PON_POS", "PONX", "PONY", "PON_RUMBO", 
			"RUMBO", "COLOR", "SUBE_LAPIZ", "BAJA_LAPIZ", "BORRADOR", "BORRA_PANTALLA", 
			"TRUE", "FALSE", "MAS", "MENOS", "MULTI", "DIV", "MY", "MN", "ASIGNAR", 
			"NOT", "MYI", "MNI", "NEQ", "BRACKET_ABIERTO", "BRACKET_CERRADO", "PAR_ABIERTO", 
			"PAR_CERRADO", "PAR_CUAD_ABIERTO", "PAR_CUAD_CERRADO", "SEMICOLON", "DOS_PUNTOS", 
			"COMILLA", "ID", "ENTERO", "ESPACIO_BLANCO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Programa'", "'Haz'", "'INIC'", "'INC'", "'Suma'", "'Resto'", 
			"'Division'", "'Potencia'", "'Producto'", "'Menos'", "'Diferencia'", 
			"'Redondea'", "'Azar'", null, null, "'Y'", "'O'", null, "'Elegir'", "'Cuenta'", 
			null, "'Elemento'", null, null, null, "'SISINO'", "'SI'", "'REPITE'", 
			"'Ejecuta'", null, null, null, null, null, null, null, null, null, "'PonX'", 
			"'PonY'", "'PonRumbo'", "'Muestra RUMBO'", null, null, null, null, "'borrapantalla'", 
			"'TRUE'", "'FALSE'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'='", 
			"'!'", "'>='", "'<='", "'!='", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"';'", "':'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "HAZ", "INIC", "INC", "SUMA", "RESIDUO", "DIVISION", 
			"POTENCIA", "PRODUCTO", "NEGATIVO", "DIFERENCIA", "REDONDEO", "AZAR", 
			"MAYOR", "MENOR", "AND", "OR", "IGUALES", "ELEMENTO_AZAR", "LONGITUD", 
			"ULTIMO", "ELEMENTO_N", "PRIMERO_LISTA", "WHILE", "DO_WHILE", "IF_ELSE", 
			"IF", "DO_N", "DO", "AVANZA", "RETROCEDE", "ESPERA", "GIRA_DERECHA", 
			"GIRA_IZQUIERDA", "OCULTA_TORTUGA", "APARECE_TORTUGA", "CENTRO", "PON_POS", 
			"PONX", "PONY", "PON_RUMBO", "RUMBO", "COLOR", "SUBE_LAPIZ", "BAJA_LAPIZ", 
			"BORRADOR", "BORRA_PANTALLA", "TRUE", "FALSE", "MAS", "MENOS", "MULTI", 
			"DIV", "MY", "MN", "ASIGNAR", "NOT", "MYI", "MNI", "NEQ", "BRACKET_ABIERTO", 
			"BRACKET_CERRADO", "PAR_ABIERTO", "PAR_CERRADO", "PAR_CUAD_ABIERTO", 
			"PAR_CUAD_CERRADO", "SEMICOLON", "DOS_PUNTOS", "COMILLA", "ID", "ENTERO", 
			"ESPACIO_BLANCO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public simpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u02f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0101\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0115\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012b"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0143\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0158\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0167\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u017e\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01a1\n\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01ae\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\5!\u01bc\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u01cb\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01dc\n#"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01ed\n$\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01ff\n%\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\5&\u020d\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u021a\n\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\5,\u0261\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\5-\u0277\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\5.\u028d\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0299"+
		"\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3"+
		"<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3"+
		"G\3G\7G\u02e1\nG\fG\16G\u02e4\13G\3H\6H\u02e7\nH\rH\16H\u02e8\3I\6I\u02ec"+
		"\nI\rI\16I\u02ed\3I\3I\2\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3"+
		"\2\62;\5\2\13\f\17\17\"\"\2\u030c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\3\u0093\3\2\2\2\5\u009c\3\2\2\2\7\u00a0\3\2\2\2\t\u00a5\3\2\2\2\13"+
		"\u00a9\3\2\2\2\r\u00ae\3\2\2\2\17\u00b4\3\2\2\2\21\u00bd\3\2\2\2\23\u00c6"+
		"\3\2\2\2\25\u00cf\3\2\2\2\27\u00d5\3\2\2\2\31\u00e0\3\2\2\2\33\u00e9\3"+
		"\2\2\2\35\u0100\3\2\2\2\37\u0114\3\2\2\2!\u0116\3\2\2\2#\u0118\3\2\2\2"+
		"%\u012a\3\2\2\2\'\u012c\3\2\2\2)\u0133\3\2\2\2+\u0142\3\2\2\2-\u0144\3"+
		"\2\2\2/\u0157\3\2\2\2\61\u0166\3\2\2\2\63\u017d\3\2\2\2\65\u017f\3\2\2"+
		"\2\67\u0186\3\2\2\29\u0189\3\2\2\2;\u0190\3\2\2\2=\u01a0\3\2\2\2?\u01ad"+
		"\3\2\2\2A\u01bb\3\2\2\2C\u01ca\3\2\2\2E\u01db\3\2\2\2G\u01ec\3\2\2\2I"+
		"\u01fe\3\2\2\2K\u020c\3\2\2\2M\u0219\3\2\2\2O\u021b\3\2\2\2Q\u0220\3\2"+
		"\2\2S\u0225\3\2\2\2U\u022e\3\2\2\2W\u0260\3\2\2\2Y\u0276\3\2\2\2[\u028c"+
		"\3\2\2\2]\u0298\3\2\2\2_\u029a\3\2\2\2a\u02a8\3\2\2\2c\u02ad\3\2\2\2e"+
		"\u02b3\3\2\2\2g\u02b5\3\2\2\2i\u02b7\3\2\2\2k\u02b9\3\2\2\2m\u02bb\3\2"+
		"\2\2o\u02bd\3\2\2\2q\u02bf\3\2\2\2s\u02c1\3\2\2\2u\u02c3\3\2\2\2w\u02c6"+
		"\3\2\2\2y\u02c9\3\2\2\2{\u02cc\3\2\2\2}\u02ce\3\2\2\2\177\u02d0\3\2\2"+
		"\2\u0081\u02d2\3\2\2\2\u0083\u02d4\3\2\2\2\u0085\u02d6\3\2\2\2\u0087\u02d8"+
		"\3\2\2\2\u0089\u02da\3\2\2\2\u008b\u02dc\3\2\2\2\u008d\u02de\3\2\2\2\u008f"+
		"\u02e6\3\2\2\2\u0091\u02eb\3\2\2\2\u0093\u0094\7R\2\2\u0094\u0095\7t\2"+
		"\2\u0095\u0096\7q\2\2\u0096\u0097\7i\2\2\u0097\u0098\7t\2\2\u0098\u0099"+
		"\7c\2\2\u0099\u009a\7o\2\2\u009a\u009b\7c\2\2\u009b\4\3\2\2\2\u009c\u009d"+
		"\7J\2\2\u009d\u009e\7c\2\2\u009e\u009f\7|\2\2\u009f\6\3\2\2\2\u00a0\u00a1"+
		"\7K\2\2\u00a1\u00a2\7P\2\2\u00a2\u00a3\7K\2\2\u00a3\u00a4\7E\2\2\u00a4"+
		"\b\3\2\2\2\u00a5\u00a6\7K\2\2\u00a6\u00a7\7P\2\2\u00a7\u00a8\7E\2\2\u00a8"+
		"\n\3\2\2\2\u00a9\u00aa\7U\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7o\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\f\3\2\2\2\u00ae\u00af\7T\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7q\2\2\u00b3\16\3\2\2\2\u00b4"+
		"\u00b5\7F\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7x\2\2\u00b7\u00b8\7k\2\2"+
		"\u00b8\u00b9\7u\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc"+
		"\7p\2\2\u00bc\20\3\2\2\2\u00bd\u00be\7R\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7e\2\2\u00c3"+
		"\u00c4\7k\2\2\u00c4\u00c5\7c\2\2\u00c5\22\3\2\2\2\u00c6\u00c7\7R\2\2\u00c7"+
		"\u00c8\7t\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7w\2\2"+
		"\u00cb\u00cc\7e\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7q\2\2\u00ce\24\3\2"+
		"\2\2\u00cf\u00d0\7O\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3"+
		"\7q\2\2\u00d3\u00d4\7u\2\2\u00d4\26\3\2\2\2\u00d5\u00d6\7F\2\2\u00d6\u00d7"+
		"\7k\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7g\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7k\2\2"+
		"\u00de\u00df\7c\2\2\u00df\30\3\2\2\2\u00e0\u00e1\7T\2\2\u00e1\u00e2\7"+
		"g\2\2\u00e2\u00e3\7f\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6"+
		"\7f\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7c\2\2\u00e8\32\3\2\2\2\u00e9\u00ea"+
		"\7C\2\2\u00ea\u00eb\7|\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7t\2\2\u00ed"+
		"\34\3\2\2\2\u00ee\u00ef\7O\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7{\2\2\u00f1"+
		"\u00f2\7q\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7S\2\2\u00f4\u00f5\7w\2\2"+
		"\u00f5\u00f6\7g\2\2\u00f6\u0101\7A\2\2\u00f7\u00f8\7o\2\2\u00f8\u00f9"+
		"\7c\2\2\u00f9\u00fa\7{\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7t\2\2\u00fc"+
		"\u00fd\7s\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7g\2\2\u00ff\u0101\7A\2\2"+
		"\u0100\u00ee\3\2\2\2\u0100\u00f7\3\2\2\2\u0101\36\3\2\2\2\u0102\u0103"+
		"\7O\2\2\u0103\u0104\7g\2\2\u0104\u0105\7p\2\2\u0105\u0106\7q\2\2\u0106"+
		"\u0107\7t\2\2\u0107\u0108\7S\2\2\u0108\u0109\7w\2\2\u0109\u010a\7g\2\2"+
		"\u010a\u0115\7A\2\2\u010b\u010c\7o\2\2\u010c\u010d\7g\2\2\u010d\u010e"+
		"\7p\2\2\u010e\u010f\7q\2\2\u010f\u0110\7t\2\2\u0110\u0111\7s\2\2\u0111"+
		"\u0112\7w\2\2\u0112\u0113\7g\2\2\u0113\u0115\7A\2\2\u0114\u0102\3\2\2"+
		"\2\u0114\u010b\3\2\2\2\u0115 \3\2\2\2\u0116\u0117\7[\2\2\u0117\"\3\2\2"+
		"\2\u0118\u0119\7Q\2\2\u0119$\3\2\2\2\u011a\u011b\7k\2\2\u011b\u011c\7"+
		"i\2\2\u011c\u011d\7w\2\2\u011d\u011e\7c\2\2\u011e\u011f\7n\2\2\u011f\u0120"+
		"\7g\2\2\u0120\u0121\7u\2\2\u0121\u012b\7A\2\2\u0122\u0123\7K\2\2\u0123"+
		"\u0124\7i\2\2\u0124\u0125\7w\2\2\u0125\u0126\7c\2\2\u0126\u0127\7n\2\2"+
		"\u0127\u0128\7g\2\2\u0128\u0129\7u\2\2\u0129\u012b\7A\2\2\u012a\u011a"+
		"\3\2\2\2\u012a\u0122\3\2\2\2\u012b&\3\2\2\2\u012c\u012d\7G\2\2\u012d\u012e"+
		"\7n\2\2\u012e\u012f\7g\2\2\u012f\u0130\7i\2\2\u0130\u0131\7k\2\2\u0131"+
		"\u0132\7t\2\2\u0132(\3\2\2\2\u0133\u0134\7E\2\2\u0134\u0135\7w\2\2\u0135"+
		"\u0136\7g\2\2\u0136\u0137\7p\2\2\u0137\u0138\7v\2\2\u0138\u0139\7c\2\2"+
		"\u0139*\3\2\2\2\u013a\u013b\7W\2\2\u013b\u013c\7n\2\2\u013c\u013d\7v\2"+
		"\2\u013d\u013e\7k\2\2\u013e\u013f\7o\2\2\u013f\u0143\7q\2\2\u0140\u0141"+
		"\7w\2\2\u0141\u0143\7n\2\2\u0142\u013a\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		",\3\2\2\2\u0144\u0145\7G\2\2\u0145\u0146\7n\2\2\u0146\u0147\7g\2\2\u0147"+
		"\u0148\7o\2\2\u0148\u0149\7g\2\2\u0149\u014a\7p\2\2\u014a\u014b\7v\2\2"+
		"\u014b\u014c\7q\2\2\u014c.\3\2\2\2\u014d\u014e\7R\2\2\u014e\u014f\7t\2"+
		"\2\u014f\u0158\7k\2\2\u0150\u0151\7R\2\2\u0151\u0152\7t\2\2\u0152\u0153"+
		"\7k\2\2\u0153\u0154\7o\2\2\u0154\u0155\7g\2\2\u0155\u0156\7t\2\2\u0156"+
		"\u0158\7q\2\2\u0157\u014d\3\2\2\2\u0157\u0150\3\2\2\2\u0158\60\3\2\2\2"+
		"\u0159\u015a\7O\2\2\u015a\u015b\7K\2\2\u015b\u015c\7G\2\2\u015c\u015d"+
		"\7P\2\2\u015d\u015e\7V\2\2\u015e\u015f\7T\2\2\u015f\u0160\7C\2\2\u0160"+
		"\u0167\7U\2\2\u0161\u0162\7J\2\2\u0162\u0163\7C\2\2\u0163\u0164\7U\2\2"+
		"\u0164\u0165\7V\2\2\u0165\u0167\7C\2\2\u0166\u0159\3\2\2\2\u0166\u0161"+
		"\3\2\2\2\u0167\62\3\2\2\2\u0168\u0169\7J\2\2\u0169\u016a\7C\2\2\u016a"+
		"\u016b\7\\\2\2\u016b\u016c\7\60\2\2\u016c\u016d\7O\2\2\u016d\u016e\7K"+
		"\2\2\u016e\u016f\7G\2\2\u016f\u0170\7P\2\2\u0170\u0171\7V\2\2\u0171\u0172"+
		"\7T\2\2\u0172\u0173\7C\2\2\u0173\u017e\7U\2\2\u0174\u0175\7J\2\2\u0175"+
		"\u0176\7C\2\2\u0176\u0177\7\\\2\2\u0177\u0178\7\60\2\2\u0178\u0179\7J"+
		"\2\2\u0179\u017a\7C\2\2\u017a\u017b\7U\2\2\u017b\u017c\7V\2\2\u017c\u017e"+
		"\7C\2\2\u017d\u0168\3\2\2\2\u017d\u0174\3\2\2\2\u017e\64\3\2\2\2\u017f"+
		"\u0180\7U\2\2\u0180\u0181\7K\2\2\u0181\u0182\7U\2\2\u0182\u0183\7K\2\2"+
		"\u0183\u0184\7P\2\2\u0184\u0185\7Q\2\2\u0185\66\3\2\2\2\u0186\u0187\7"+
		"U\2\2\u0187\u0188\7K\2\2\u01888\3\2\2\2\u0189\u018a\7T\2\2\u018a\u018b"+
		"\7G\2\2\u018b\u018c\7R\2\2\u018c\u018d\7K\2\2\u018d\u018e\7V\2\2\u018e"+
		"\u018f\7G\2\2\u018f:\3\2\2\2\u0190\u0191\7G\2\2\u0191\u0192\7l\2\2\u0192"+
		"\u0193\7g\2\2\u0193\u0194\7e\2\2\u0194\u0195\7w\2\2\u0195\u0196\7v\2\2"+
		"\u0196\u0197\7c\2\2\u0197<\3\2\2\2\u0198\u0199\7C\2\2\u0199\u019a\7X\2"+
		"\2\u019a\u019b\7C\2\2\u019b\u019c\7P\2\2\u019c\u019d\7\\\2\2\u019d\u01a1"+
		"\7C\2\2\u019e\u019f\7C\2\2\u019f\u01a1\7X\2\2\u01a0\u0198\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1>\3\2\2\2\u01a2\u01a3\7T\2\2\u01a3\u01a4\7G\2\2\u01a4"+
		"\u01a5\7V\2\2\u01a5\u01a6\7T\2\2\u01a6\u01a7\7Q\2\2\u01a7\u01a8\7E\2\2"+
		"\u01a8\u01a9\7G\2\2\u01a9\u01aa\7F\2\2\u01aa\u01ae\7G\2\2\u01ab\u01ac"+
		"\7T\2\2\u01ac\u01ae\7G\2\2\u01ad\u01a2\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"@\3\2\2\2\u01af\u01b0\7G\2\2\u01b0\u01b1\7U\2\2\u01b1\u01b2\7R\2\2\u01b2"+
		"\u01b3\7G\2\2\u01b3\u01b4\7T\2\2\u01b4\u01bc\7C\2\2\u01b5\u01b6\7G\2\2"+
		"\u01b6\u01b7\7u\2\2\u01b7\u01b8\7r\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba"+
		"\7t\2\2\u01ba\u01bc\7c\2\2\u01bb\u01af\3\2\2\2\u01bb\u01b5\3\2\2\2\u01bc"+
		"B\3\2\2\2\u01bd\u01be\7I\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0\7t\2\2\u01c0"+
		"\u01c1\7c\2\2\u01c1\u01c2\7F\2\2\u01c2\u01c3\7g\2\2\u01c3\u01c4\7t\2\2"+
		"\u01c4\u01c5\7g\2\2\u01c5\u01c6\7e\2\2\u01c6\u01c7\7j\2\2\u01c7\u01cb"+
		"\7c\2\2\u01c8\u01c9\7I\2\2\u01c9\u01cb\7F\2\2\u01ca\u01bd\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01cbD\3\2\2\2\u01cc\u01cd\7I\2\2\u01cd\u01ce\7k\2\2\u01ce"+
		"\u01cf\7t\2\2\u01cf\u01d0\7c\2\2\u01d0\u01d1\7K\2\2\u01d1\u01d2\7|\2\2"+
		"\u01d2\u01d3\7s\2\2\u01d3\u01d4\7w\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6"+
		"\7g\2\2\u01d6\u01d7\7t\2\2\u01d7\u01d8\7f\2\2\u01d8\u01dc\7c\2\2\u01d9"+
		"\u01da\7I\2\2\u01da\u01dc\7K\2\2\u01db\u01cc\3\2\2\2\u01db\u01d9\3\2\2"+
		"\2\u01dcF\3\2\2\2\u01dd\u01de\7Q\2\2\u01de\u01df\7e\2\2\u01df\u01e0\7"+
		"w\2\2\u01e0\u01e1\7n\2\2\u01e1\u01e2\7v\2\2\u01e2\u01e3\7c\2\2\u01e3\u01e4"+
		"\7V\2\2\u01e4\u01e5\7q\2\2\u01e5\u01e6\7t\2\2\u01e6\u01e7\7v\2\2\u01e7"+
		"\u01e8\7w\2\2\u01e8\u01e9\7i\2\2\u01e9\u01ed\7c\2\2\u01ea\u01eb\7Q\2\2"+
		"\u01eb\u01ed\7V\2\2\u01ec\u01dd\3\2\2\2\u01ec\u01ea\3\2\2\2\u01edH\3\2"+
		"\2\2\u01ee\u01ef\7C\2\2\u01ef\u01f0\7r\2\2\u01f0\u01f1\7c\2\2\u01f1\u01f2"+
		"\7t\2\2\u01f2\u01f3\7g\2\2\u01f3\u01f4\7e\2\2\u01f4\u01f5\7g\2\2\u01f5"+
		"\u01f6\7V\2\2\u01f6\u01f7\7q\2\2\u01f7\u01f8\7t\2\2\u01f8\u01f9\7v\2\2"+
		"\u01f9\u01fa\7w\2\2\u01fa\u01fb\7i\2\2\u01fb\u01ff\7c\2\2\u01fc\u01fd"+
		"\7C\2\2\u01fd\u01ff\7V\2\2\u01fe\u01ee\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff"+
		"J\3\2\2\2\u0200\u0201\7E\2\2\u0201\u0202\7g\2\2\u0202\u0203\7p\2\2\u0203"+
		"\u0204\7v\2\2\u0204\u0205\7t\2\2\u0205\u020d\7q\2\2\u0206\u0207\7e\2\2"+
		"\u0207\u0208\7g\2\2\u0208\u0209\7p\2\2\u0209\u020a\7v\2\2\u020a\u020b"+
		"\7t\2\2\u020b\u020d\7q\2\2\u020c\u0200\3\2\2\2\u020c\u0206\3\2\2\2\u020d"+
		"L\3\2\2\2\u020e\u020f\7R\2\2\u020f\u0210\7q\2\2\u0210\u0211\7p\2\2\u0211"+
		"\u0212\7R\2\2\u0212\u0213\7Q\2\2\u0213\u021a\7U\2\2\u0214\u0215\7R\2\2"+
		"\u0215\u0216\7q\2\2\u0216\u0217\7p\2\2\u0217\u0218\7Z\2\2\u0218\u021a"+
		"\7[\2\2\u0219\u020e\3\2\2\2\u0219\u0214\3\2\2\2\u021aN\3\2\2\2\u021b\u021c"+
		"\7R\2\2\u021c\u021d\7q\2\2\u021d\u021e\7p\2\2\u021e\u021f\7Z\2\2\u021f"+
		"P\3\2\2\2\u0220\u0221\7R\2\2\u0221\u0222\7q\2\2\u0222\u0223\7p\2\2\u0223"+
		"\u0224\7[\2\2\u0224R\3\2\2\2\u0225\u0226\7R\2\2\u0226\u0227\7q\2\2\u0227"+
		"\u0228\7p\2\2\u0228\u0229\7T\2\2\u0229\u022a\7w\2\2\u022a\u022b\7o\2\2"+
		"\u022b\u022c\7d\2\2\u022c\u022d\7q\2\2\u022dT\3\2\2\2\u022e\u022f\7O\2"+
		"\2\u022f\u0230\7w\2\2\u0230\u0231\7g\2\2\u0231\u0232\7u\2\2\u0232\u0233"+
		"\7v\2\2\u0233\u0234\7t\2\2\u0234\u0235\7c\2\2\u0235\u0236\7\"\2\2\u0236"+
		"\u0237\7T\2\2\u0237\u0238\7W\2\2\u0238\u0239\7O\2\2\u0239\u023a\7D\2\2"+
		"\u023a\u023b\7Q\2\2\u023bV\3\2\2\2\u023c\u023d\7r\2\2\u023d\u023e\7q\2"+
		"\2\u023e\u023f\7p\2\2\u023f\u0240\7e\2\2\u0240\u0241\7q\2\2\u0241\u0242"+
		"\7n\2\2\u0242\u0243\7q\2\2\u0243\u0244\7t\2\2\u0244\u0245\7n\2\2\u0245"+
		"\u0246\7c\2\2\u0246\u0247\7r\2\2\u0247\u0248\7k\2\2\u0248\u0261\7|\2\2"+
		"\u0249\u024a\7R\2\2\u024a\u024b\7q\2\2\u024b\u024c\7p\2\2\u024c\u024d"+
		"\7E\2\2\u024d\u024e\7q\2\2\u024e\u024f\7n\2\2\u024f\u0250\7q\2\2\u0250"+
		"\u0251\7t\2\2\u0251\u0252\7N\2\2\u0252\u0253\7c\2\2\u0253\u0254\7r\2\2"+
		"\u0254\u0255\7k\2\2\u0255\u0261\7|\2\2\u0256\u0257\7r\2\2\u0257\u0258"+
		"\7q\2\2\u0258\u0259\7p\2\2\u0259\u025a\7e\2\2\u025a\u0261\7n\2\2\u025b"+
		"\u025c\7R\2\2\u025c\u025d\7q\2\2\u025d\u025e\7p\2\2\u025e\u025f\7E\2\2"+
		"\u025f\u0261\7N\2\2\u0260\u023c\3\2\2\2\u0260\u0249\3\2\2\2\u0260\u0256"+
		"\3\2\2\2\u0260\u025b\3\2\2\2\u0261X\3\2\2\2\u0262\u0263\7U\2\2\u0263\u0264"+
		"\7w\2\2\u0264\u0265\7d\2\2\u0265\u0266\7g\2\2\u0266\u0267\7N\2\2\u0267"+
		"\u0268\7c\2\2\u0268\u0269\7r\2\2\u0269\u026a\7k\2\2\u026a\u0277\7|\2\2"+
		"\u026b\u026c\7u\2\2\u026c\u026d\7w\2\2\u026d\u026e\7d\2\2\u026e\u026f"+
		"\7g\2\2\u026f\u0270\7n\2\2\u0270\u0271\7c\2\2\u0271\u0272\7r\2\2\u0272"+
		"\u0273\7k\2\2\u0273\u0277\7|\2\2\u0274\u0275\7u\2\2\u0275\u0277\7d\2\2"+
		"\u0276\u0262\3\2\2\2\u0276\u026b\3\2\2\2\u0276\u0274\3\2\2\2\u0277Z\3"+
		"\2\2\2\u0278\u0279\7D\2\2\u0279\u027a\7c\2\2\u027a\u027b\7l\2\2\u027b"+
		"\u027c\7c\2\2\u027c\u027d\7N\2\2\u027d\u027e\7c\2\2\u027e\u027f\7r\2\2"+
		"\u027f\u0280\7k\2\2\u0280\u028d\7|\2\2\u0281\u0282\7d\2\2\u0282\u0283"+
		"\7c\2\2\u0283\u0284\7l\2\2\u0284\u0285\7c\2\2\u0285\u0286\7n\2\2\u0286"+
		"\u0287\7c\2\2\u0287\u0288\7r\2\2\u0288\u0289\7k\2\2\u0289\u028d\7|\2\2"+
		"\u028a\u028b\7d\2\2\u028b\u028d\7n\2\2\u028c\u0278\3\2\2\2\u028c\u0281"+
		"\3\2\2\2\u028c\u028a\3\2\2\2\u028d\\\3\2\2\2\u028e\u028f\7i\2\2\u028f"+
		"\u0290\7q\2\2\u0290\u0291\7o\2\2\u0291\u0299\7c\2\2\u0292\u0293\7I\2\2"+
		"\u0293\u0294\7Q\2\2\u0294\u0295\7O\2\2\u0295\u0299\7C\2\2\u0296\u0297"+
		"\7I\2\2\u0297\u0299\7Q\2\2\u0298\u028e\3\2\2\2\u0298\u0292\3\2\2\2\u0298"+
		"\u0296\3\2\2\2\u0299^\3\2\2\2\u029a\u029b\7d\2\2\u029b\u029c\7q\2\2\u029c"+
		"\u029d\7t\2\2\u029d\u029e\7t\2\2\u029e\u029f\7c\2\2\u029f\u02a0\7r\2\2"+
		"\u02a0\u02a1\7c\2\2\u02a1\u02a2\7p\2\2\u02a2\u02a3\7v\2\2\u02a3\u02a4"+
		"\7c\2\2\u02a4\u02a5\7n\2\2\u02a5\u02a6\7n\2\2\u02a6\u02a7\7c\2\2\u02a7"+
		"`\3\2\2\2\u02a8\u02a9\7V\2\2\u02a9\u02aa\7T\2\2\u02aa\u02ab\7W\2\2\u02ab"+
		"\u02ac\7G\2\2\u02acb\3\2\2\2\u02ad\u02ae\7H\2\2\u02ae\u02af\7C\2\2\u02af"+
		"\u02b0\7N\2\2\u02b0\u02b1\7U\2\2\u02b1\u02b2\7G\2\2\u02b2d\3\2\2\2\u02b3"+
		"\u02b4\7-\2\2\u02b4f\3\2\2\2\u02b5\u02b6\7/\2\2\u02b6h\3\2\2\2\u02b7\u02b8"+
		"\7,\2\2\u02b8j\3\2\2\2\u02b9\u02ba\7\61\2\2\u02bal\3\2\2\2\u02bb\u02bc"+
		"\7@\2\2\u02bcn\3\2\2\2\u02bd\u02be\7>\2\2\u02bep\3\2\2\2\u02bf\u02c0\7"+
		"?\2\2\u02c0r\3\2\2\2\u02c1\u02c2\7#\2\2\u02c2t\3\2\2\2\u02c3\u02c4\7@"+
		"\2\2\u02c4\u02c5\7?\2\2\u02c5v\3\2\2\2\u02c6\u02c7\7>\2\2\u02c7\u02c8"+
		"\7?\2\2\u02c8x\3\2\2\2\u02c9\u02ca\7#\2\2\u02ca\u02cb\7?\2\2\u02cbz\3"+
		"\2\2\2\u02cc\u02cd\7}\2\2\u02cd|\3\2\2\2\u02ce\u02cf\7\177\2\2\u02cf~"+
		"\3\2\2\2\u02d0\u02d1\7*\2\2\u02d1\u0080\3\2\2\2\u02d2\u02d3\7+\2\2\u02d3"+
		"\u0082\3\2\2\2\u02d4\u02d5\7]\2\2\u02d5\u0084\3\2\2\2\u02d6\u02d7\7_\2"+
		"\2\u02d7\u0086\3\2\2\2\u02d8\u02d9\7=\2\2\u02d9\u0088\3\2\2\2\u02da\u02db"+
		"\7<\2\2\u02db\u008a\3\2\2\2\u02dc\u02dd\7$\2\2\u02dd\u008c\3\2\2\2\u02de"+
		"\u02e2\t\2\2\2\u02df\u02e1\t\3\2\2\u02e0\u02df\3\2\2\2\u02e1\u02e4\3\2"+
		"\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u008e\3\2\2\2\u02e4"+
		"\u02e2\3\2\2\2\u02e5\u02e7\t\4\2\2\u02e6\u02e5\3\2\2\2\u02e7\u02e8\3\2"+
		"\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u0090\3\2\2\2\u02ea"+
		"\u02ec\t\5\2\2\u02eb\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02eb\3\2"+
		"\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\bI\2\2\u02f0"+
		"\u0092\3\2\2\2\32\2\u0100\u0114\u012a\u0142\u0157\u0166\u017d\u01a0\u01ad"+
		"\u01bb\u01ca\u01db\u01ec\u01fe\u020c\u0219\u0260\u0276\u028c\u0298\u02e2"+
		"\u02e8\u02ed\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}