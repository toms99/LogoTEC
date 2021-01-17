// Generated from TEC\Proyecto_LogoTEC\LogoTEC.g4 by ANTLR 4.5.1
package TEC.Proyecto_LogoTEC;



	import java.util.Map;
	import java.util.HashMap;
	import java.util.Random; 
	import TEC.Proyecto_LogoTEC.interprete.ast.ASTNode;
	import TEC.Proyecto_LogoTEC.tortuga.Lector;
	import TEC.Proyecto_LogoTEC.interprete.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoTECParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_programa = 0, RULE_ejecuta = 1, RULE_repite = 2, RULE_sentencia_logoTEC = 3, 
		RULE_ordenes_variables = 4, RULE_asignacion = 5, RULE_reasignacion = 6, 
		RULE_incrementa = 7, RULE_referencia = 8, RULE_operacion_aritmetica = 9, 
		RULE_suma = 10, RULE_diferencia = 11, RULE_producto = 12, RULE_potencia = 13, 
		RULE_division = 14, RULE_residuo = 15, RULE_redondear = 16, RULE_azar = 17, 
		RULE_menos = 18, RULE_ordenes_listas = 19, RULE_elegir = 20, RULE_elemento_n = 21, 
		RULE_largo = 22, RULE_primero = 23, RULE_ultimo = 24, RULE_ordenes_tortuga = 25, 
		RULE_avanzar = 26, RULE_retroceder = 27, RULE_girar_derecha = 28, RULE_girar_izquierda = 29, 
		RULE_definir_coord = 30, RULE_definir_x = 31, RULE_definir_y = 32, RULE_definir_dir = 33, 
		RULE_esperar = 34, RULE_ocultar_tortuga = 35, RULE_aparecer_tortuga = 36, 
		RULE_rumbo = 37, RULE_centrar = 38, RULE_ordenes_lienzo = 39, RULE_borrar = 40, 
		RULE_dibujar = 41, RULE_no_dibujar = 42, RULE_borra_pantalla = 43, RULE_dato = 44, 
		RULE_numero = 45;
	public static final String[] ruleNames = {
		"programa", "ejecuta", "repite", "sentencia_logoTEC", "ordenes_variables", 
		"asignacion", "reasignacion", "incrementa", "referencia", "operacion_aritmetica", 
		"suma", "diferencia", "producto", "potencia", "division", "residuo", "redondear", 
		"azar", "menos", "ordenes_listas", "elegir", "elemento_n", "largo", "primero", 
		"ultimo", "ordenes_tortuga", "avanzar", "retroceder", "girar_derecha", 
		"girar_izquierda", "definir_coord", "definir_x", "definir_y", "definir_dir", 
		"esperar", "ocultar_tortuga", "aparecer_tortuga", "rumbo", "centrar", 
		"ordenes_lienzo", "borrar", "dibujar", "no_dibujar", "borra_pantalla", 
		"dato", "numero"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Programa'", "'Haz'", "'INIC'", "'INC'", "'print'", null, null, 
		null, null, null, null, null, null, null, null, null, "'Y'", "'O'", null, 
		null, null, null, null, null, null, null, "'SISINO'", "'SI'", null, null, 
		null, null, null, null, null, null, null, null, null, "'PonX'", "'PonY'", 
		null, null, null, null, null, null, "'borrapantalla'", "'TRUE'", "'FALSE'", 
		"'+'", "'*'", "'/'", "'>'", "'<'", "'='", "'!'", "'>='", "'<='", "'!='", 
		"'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "':'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAMA", "HAZ", "INIC", "INC", "PRINTLN", "SUMA", "RESIDUO", 
		"DIVISION", "POTENCIA", "PRODUCTO", "NEGATIVO", "DIFERENCIA", "REDONDEO", 
		"AZAR", "MAYOR", "MENOR", "AND", "OR", "IGUALES", "ELEMENTO_AZAR", "LONGITUD", 
		"ULTIMO", "ELEMENTO_N", "PRIMERO_LISTA", "WHILE", "DO_WHILE", "IF_ELSE", 
		"IF", "DO_N", "DO", "AVANZA", "RETROCEDE", "ESPERA", "GIRA_DERECHA", "GIRA_IZQUIERDA", 
		"OCULTA_TORTUGA", "APARECE_TORTUGA", "CENTRO", "PON_POS", "PONX", "PONY", 
		"PON_RUMBO", "RUMBO", "COLOR", "SUBE_LAPIZ", "BAJA_LAPIZ", "BORRADOR", 
		"BORRA_PANTALLA", "TRUE", "FALSE", "MAS", "MULTI", "DIV", "MY", "MN", 
		"ASIGNAR", "NOT", "MYI", "MNI", "NEQ", "BRACKET_ABIERTO", "BRACKET_CERRADO", 
		"PAR_ABIERTO", "PAR_CERRADO", "PAR_CUAD_ABIERTO", "PAR_CUAD_CERRADO", 
		"SEMICOLON", "DOS_PUNTOS", "COMILLA", "ID", "ENTERO", "FLOAT", "ESPACIO_BLANCO"
	};
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

	@Override
	public String getGrammarFileName() { return "LogoTEC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




		Map<String, Object> tablaSimbolos = new HashMap<String, Object>(); 
		Lector lectorTortuga;

	public LogoTECParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public ASTNode node;
		public Sentencia_logoTECContext sentencia_logoTEC;
		public List<Sentencia_logoTECContext> sentencia_logoTEC() {
			return getRuleContexts(Sentencia_logoTECContext.class);
		}
		public Sentencia_logoTECContext sentencia_logoTEC(int i) {
			return getRuleContext(Sentencia_logoTECContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

				List<ASTNode> body = new ArrayList<ASTNode>();

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAZ) | (1L << INIC) | (1L << INC) | (1L << DO_N) | (1L << DO) | (1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0) || _la==ID) {
				{
				{
				setState(93);
				((ProgramaContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				body.add(((ProgramaContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

				for (ASTNode n : body) {
						n.execute(tablaSimbolos, lectorTortuga);
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

	public static class EjecutaContext extends ParserRuleContext {
		public ASTNode node;
		public Ordenes_tortugaContext ordenes_tortuga;
		public TerminalNode DO() { return getToken(LogoTECParser.DO, 0); }
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
		public List<Ordenes_tortugaContext> ordenes_tortuga() {
			return getRuleContexts(Ordenes_tortugaContext.class);
		}
		public Ordenes_tortugaContext ordenes_tortuga(int i) {
			return getRuleContext(Ordenes_tortugaContext.class,i);
		}
		public EjecutaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ejecuta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterEjecuta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitEjecuta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitEjecuta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EjecutaContext ejecuta() throws RecognitionException {
		EjecutaContext _localctx = new EjecutaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ejecuta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(DO);
			setState(104);
			match(PAR_CUAD_ABIERTO);

									List<ASTNode> body = new ArrayList<ASTNode>();
									
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0)) {
				{
				{
				setState(106);
				((EjecutaContext)_localctx).ordenes_tortuga = ordenes_tortuga();
				body.add(((EjecutaContext)_localctx).ordenes_tortuga.node);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(PAR_CUAD_CERRADO);
			((EjecutaContext)_localctx).node =  new Ejecuta(body);
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

	public static class RepiteContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public Ordenes_tortugaContext ordenes_tortuga;
		public TerminalNode DO_N() { return getToken(LogoTECParser.DO_N, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
		public List<Ordenes_tortugaContext> ordenes_tortuga() {
			return getRuleContexts(Ordenes_tortugaContext.class);
		}
		public Ordenes_tortugaContext ordenes_tortuga(int i) {
			return getRuleContext(Ordenes_tortugaContext.class,i);
		}
		public RepiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterRepite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitRepite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitRepite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepiteContext repite() throws RecognitionException {
		RepiteContext _localctx = new RepiteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_repite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(DO_N);
			setState(118);
			((RepiteContext)_localctx).numero = numero();
			setState(119);
			match(PAR_CUAD_ABIERTO);

									List<ASTNode> body = new ArrayList<ASTNode>();
									
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0)) {
				{
				{
				setState(121);
				((RepiteContext)_localctx).ordenes_tortuga = ordenes_tortuga();
				body.add(((RepiteContext)_localctx).ordenes_tortuga.node);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(PAR_CUAD_CERRADO);
			((RepiteContext)_localctx).node =  new Repite(body, ((RepiteContext)_localctx).numero.node);
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

	public static class Sentencia_logoTECContext extends ParserRuleContext {
		public ASTNode node;
		public Ordenes_tortugaContext ordenes_tortuga;
		public Ordenes_variablesContext ordenes_variables;
		public EjecutaContext ejecuta;
		public RepiteContext repite;
		public Ordenes_tortugaContext ordenes_tortuga() {
			return getRuleContext(Ordenes_tortugaContext.class,0);
		}
		public Ordenes_variablesContext ordenes_variables() {
			return getRuleContext(Ordenes_variablesContext.class,0);
		}
		public EjecutaContext ejecuta() {
			return getRuleContext(EjecutaContext.class,0);
		}
		public RepiteContext repite() {
			return getRuleContext(RepiteContext.class,0);
		}
		public Sentencia_logoTECContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_logoTEC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterSentencia_logoTEC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitSentencia_logoTEC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitSentencia_logoTEC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_logoTECContext sentencia_logoTEC() throws RecognitionException {
		Sentencia_logoTECContext _localctx = new Sentencia_logoTECContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia_logoTEC);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case AVANZA:
			case RETROCEDE:
			case ESPERA:
			case GIRA_DERECHA:
			case GIRA_IZQUIERDA:
			case OCULTA_TORTUGA:
			case APARECE_TORTUGA:
			case CENTRO:
			case PON_POS:
			case PONX:
			case PONY:
			case PON_RUMBO:
			case RUMBO:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				((Sentencia_logoTECContext)_localctx).ordenes_tortuga = ordenes_tortuga();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ordenes_tortuga.node;
				}
				break;
			case HAZ:
			case INIC:
			case INC:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				((Sentencia_logoTECContext)_localctx).ordenes_variables = ordenes_variables();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ordenes_variables.node;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				((Sentencia_logoTECContext)_localctx).ejecuta = ejecuta();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ejecuta.node;
				}
				break;
			case DO_N:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				((Sentencia_logoTECContext)_localctx).repite = repite();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).repite.node;
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

	public static class Ordenes_variablesContext extends ParserRuleContext {
		public ASTNode node;
		public AsignacionContext asignacion;
		public ReasignacionContext reasignacion;
		public IncrementaContext incrementa;
		public ReferenciaContext referencia;
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ReasignacionContext reasignacion() {
			return getRuleContext(ReasignacionContext.class,0);
		}
		public IncrementaContext incrementa() {
			return getRuleContext(IncrementaContext.class,0);
		}
		public ReferenciaContext referencia() {
			return getRuleContext(ReferenciaContext.class,0);
		}
		public Ordenes_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenes_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOrdenes_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOrdenes_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOrdenes_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordenes_variablesContext ordenes_variables() throws RecognitionException {
		Ordenes_variablesContext _localctx = new Ordenes_variablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ordenes_variables);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case HAZ:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((Ordenes_variablesContext)_localctx).asignacion = asignacion();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).asignacion.node;
				}
				break;
			case INIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				((Ordenes_variablesContext)_localctx).reasignacion = reasignacion();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).reasignacion.node;
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				((Ordenes_variablesContext)_localctx).incrementa = incrementa();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).incrementa.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				((Ordenes_variablesContext)_localctx).referencia = referencia();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).referencia.node;
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

	public static class AsignacionContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public DatoContext dato;
		public TerminalNode HAZ() { return getToken(LogoTECParser.HAZ, 0); }
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(HAZ);
			setState(161);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(162);
			((AsignacionContext)_localctx).dato = dato();
			((AsignacionContext)_localctx).node =   new Asignacion((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), ((AsignacionContext)_localctx).dato.node);
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

	public static class ReasignacionContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public DatoContext dato;
		public TerminalNode INIC() { return getToken(LogoTECParser.INIC, 0); }
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(LogoTECParser.ASIGNAR, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public ReasignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reasignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterReasignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitReasignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitReasignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReasignacionContext reasignacion() throws RecognitionException {
		ReasignacionContext _localctx = new ReasignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_reasignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(INIC);
			setState(166);
			((ReasignacionContext)_localctx).ID = match(ID);
			setState(167);
			match(ASIGNAR);
			setState(168);
			((ReasignacionContext)_localctx).dato = dato();
			((ReasignacionContext)_localctx).node =   new Reasignacion((((ReasignacionContext)_localctx).ID!=null?((ReasignacionContext)_localctx).ID.getText():null), ((ReasignacionContext)_localctx).dato.node);
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

	public static class IncrementaContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public DatoContext dato;
		public TerminalNode INC() { return getToken(LogoTECParser.INC, 0); }
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public IncrementaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterIncrementa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitIncrementa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitIncrementa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementaContext incrementa() throws RecognitionException {
		IncrementaContext _localctx = new IncrementaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_incrementa);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(INC);
				setState(172);
				match(PAR_CUAD_ABIERTO);
				setState(173);
				((IncrementaContext)_localctx).ID = match(ID);
				setState(174);
				match(PAR_CUAD_CERRADO);
				((IncrementaContext)_localctx).node =   new IncrementaUno((((IncrementaContext)_localctx).ID!=null?((IncrementaContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(INC);
				setState(177);
				match(PAR_CUAD_ABIERTO);
				setState(178);
				((IncrementaContext)_localctx).ID = match(ID);
				setState(179);
				((IncrementaContext)_localctx).dato = dato();
				setState(180);
				match(PAR_CUAD_CERRADO);
				((IncrementaContext)_localctx).node =   new IncrementaTres((((IncrementaContext)_localctx).ID!=null?((IncrementaContext)_localctx).ID.getText():null), (((IncrementaContext)_localctx).dato!=null?_input.getText(((IncrementaContext)_localctx).dato.start,((IncrementaContext)_localctx).dato.stop):null));
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

	public static class ReferenciaContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public ReferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterReferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitReferencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitReferencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenciaContext referencia() throws RecognitionException {
		ReferenciaContext _localctx = new ReferenciaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_referencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			((ReferenciaContext)_localctx).ID = match(ID);
			((ReferenciaContext)_localctx).node =  new ConstRef((((ReferenciaContext)_localctx).ID!=null?((ReferenciaContext)_localctx).ID.getText():null));
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

	public static class Operacion_aritmeticaContext extends ParserRuleContext {
		public ASTNode node;
		public SumaContext suma;
		public DiferenciaContext diferencia;
		public ProductoContext producto;
		public PotenciaContext potencia;
		public DivisionContext division;
		public ResiduoContext residuo;
		public RedondearContext redondear;
		public AzarContext azar;
		public MenosContext menos;
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public DiferenciaContext diferencia() {
			return getRuleContext(DiferenciaContext.class,0);
		}
		public ProductoContext producto() {
			return getRuleContext(ProductoContext.class,0);
		}
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public ResiduoContext residuo() {
			return getRuleContext(ResiduoContext.class,0);
		}
		public RedondearContext redondear() {
			return getRuleContext(RedondearContext.class,0);
		}
		public AzarContext azar() {
			return getRuleContext(AzarContext.class,0);
		}
		public MenosContext menos() {
			return getRuleContext(MenosContext.class,0);
		}
		public Operacion_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOperacion_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOperacion_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOperacion_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operacion_aritmeticaContext operacion_aritmetica() throws RecognitionException {
		Operacion_aritmeticaContext _localctx = new Operacion_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operacion_aritmetica);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				((Operacion_aritmeticaContext)_localctx).suma = suma();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).suma.node;
				}
				break;
			case DIFERENCIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				((Operacion_aritmeticaContext)_localctx).diferencia = diferencia();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).diferencia.node;
				}
				break;
			case PRODUCTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				((Operacion_aritmeticaContext)_localctx).producto = producto();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).producto.node;
				}
				break;
			case POTENCIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				((Operacion_aritmeticaContext)_localctx).potencia = potencia();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).potencia.node;
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				((Operacion_aritmeticaContext)_localctx).division = division();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).division.node;
				}
				break;
			case RESIDUO:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				((Operacion_aritmeticaContext)_localctx).residuo = residuo();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).residuo.node;
				}
				break;
			case REDONDEO:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				((Operacion_aritmeticaContext)_localctx).redondear = redondear();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).redondear.node;
				}
				break;
			case AZAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				((Operacion_aritmeticaContext)_localctx).azar = azar();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).azar.node;
				}
				break;
			case NEGATIVO:
				enterOuterAlt(_localctx, 9);
				{
				setState(212);
				((Operacion_aritmeticaContext)_localctx).menos = menos();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).menos.node;
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

	public static class SumaContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext n1;
		public NumeroContext n2;
		public TerminalNode SUMA() { return getToken(LogoTECParser.SUMA, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_suma);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(SUMA);
			setState(218);
			((SumaContext)_localctx).n1 = numero();
			((SumaContext)_localctx).node =  ((SumaContext)_localctx).n1.node;
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					((SumaContext)_localctx).n2 = numero();
					((SumaContext)_localctx).node =  new Suma(_localctx.node, ((SumaContext)_localctx).n2.node);
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class DiferenciaContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext n1;
		public NumeroContext n2;
		public TerminalNode DIFERENCIA() { return getToken(LogoTECParser.DIFERENCIA, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public DiferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diferencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterDiferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitDiferencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitDiferencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiferenciaContext diferencia() throws RecognitionException {
		DiferenciaContext _localctx = new DiferenciaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_diferencia);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(DIFERENCIA);
			setState(229);
			((DiferenciaContext)_localctx).n1 = numero();
			((DiferenciaContext)_localctx).node =  ((DiferenciaContext)_localctx).n1.node;
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					((DiferenciaContext)_localctx).n2 = numero();
					((DiferenciaContext)_localctx).node =  new Diferencia(_localctx.node, ((DiferenciaContext)_localctx).n2.node);
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ProductoContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext n1;
		public NumeroContext n2;
		public TerminalNode PRODUCTO() { return getToken(LogoTECParser.PRODUCTO, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public ProductoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_producto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterProducto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitProducto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitProducto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductoContext producto() throws RecognitionException {
		ProductoContext _localctx = new ProductoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_producto);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(PRODUCTO);
			setState(240);
			((ProductoContext)_localctx).n1 = numero();
			((ProductoContext)_localctx).node =  ((ProductoContext)_localctx).n1.node;
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242);
					((ProductoContext)_localctx).n2 = numero();
					((ProductoContext)_localctx).node =  new Producto(_localctx.node, ((ProductoContext)_localctx).n2.node);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class PotenciaContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext n1;
		public NumeroContext n2;
		public TerminalNode POTENCIA() { return getToken(LogoTECParser.POTENCIA, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitPotencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitPotencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(POTENCIA);
			setState(251);
			((PotenciaContext)_localctx).n1 = numero();
			((PotenciaContext)_localctx).node =  ((PotenciaContext)_localctx).n1.node;
			{
			setState(253);
			((PotenciaContext)_localctx).n2 = numero();
			((PotenciaContext)_localctx).node =  new Potencia(_localctx.node, ((PotenciaContext)_localctx).n2.node);
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

	public static class DivisionContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext n1;
		public NumeroContext n2;
		public TerminalNode DIVISION() { return getToken(LogoTECParser.DIVISION, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(DIVISION);
			setState(257);
			((DivisionContext)_localctx).n1 = numero();
			((DivisionContext)_localctx).node =  ((DivisionContext)_localctx).n1.node;
			{
			setState(259);
			((DivisionContext)_localctx).n2 = numero();
			((DivisionContext)_localctx).node =  new Division(_localctx.node, ((DivisionContext)_localctx).n2.node);
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

	public static class ResiduoContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext n1;
		public NumeroContext n2;
		public TerminalNode RESIDUO() { return getToken(LogoTECParser.RESIDUO, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public ResiduoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_residuo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterResiduo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitResiduo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitResiduo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResiduoContext residuo() throws RecognitionException {
		ResiduoContext _localctx = new ResiduoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_residuo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(RESIDUO);
			setState(263);
			((ResiduoContext)_localctx).n1 = numero();
			((ResiduoContext)_localctx).node =  ((ResiduoContext)_localctx).n1.node;
			{
			setState(265);
			((ResiduoContext)_localctx).n2 = numero();
			((ResiduoContext)_localctx).node =  new Residuo(_localctx.node, ((ResiduoContext)_localctx).n2.node);
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

	public static class RedondearContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode REDONDEO() { return getToken(LogoTECParser.REDONDEO, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public RedondearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redondear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterRedondear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitRedondear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitRedondear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedondearContext redondear() throws RecognitionException {
		RedondearContext _localctx = new RedondearContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_redondear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(REDONDEO);
			setState(269);
			((RedondearContext)_localctx).numero = numero();
			((RedondearContext)_localctx).node =  new Redondear(((RedondearContext)_localctx).numero.node);
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

	public static class AzarContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode AZAR() { return getToken(LogoTECParser.AZAR, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public AzarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_azar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterAzar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitAzar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitAzar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AzarContext azar() throws RecognitionException {
		AzarContext _localctx = new AzarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(AZAR);
			setState(273);
			((AzarContext)_localctx).numero = numero();
			((AzarContext)_localctx).node =  new Azar(((AzarContext)_localctx).numero.node);
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

	public static class MenosContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode NEGATIVO() { return getToken(LogoTECParser.NEGATIVO, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public MenosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterMenos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitMenos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitMenos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenosContext menos() throws RecognitionException {
		MenosContext _localctx = new MenosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(NEGATIVO);
			setState(277);
			((MenosContext)_localctx).numero = numero();
			((MenosContext)_localctx).node =  new Menos(((MenosContext)_localctx).numero.node);
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

	public static class Ordenes_listasContext extends ParserRuleContext {
		public ASTNode node;
		public ElegirContext elegir;
		public Elemento_nContext elemento_n;
		public LargoContext largo;
		public PrimeroContext primero;
		public UltimoContext ultimo;
		public ElegirContext elegir() {
			return getRuleContext(ElegirContext.class,0);
		}
		public Elemento_nContext elemento_n() {
			return getRuleContext(Elemento_nContext.class,0);
		}
		public LargoContext largo() {
			return getRuleContext(LargoContext.class,0);
		}
		public PrimeroContext primero() {
			return getRuleContext(PrimeroContext.class,0);
		}
		public UltimoContext ultimo() {
			return getRuleContext(UltimoContext.class,0);
		}
		public Ordenes_listasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenes_listas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOrdenes_listas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOrdenes_listas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOrdenes_listas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordenes_listasContext ordenes_listas() throws RecognitionException {
		Ordenes_listasContext _localctx = new Ordenes_listasContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ordenes_listas);
		try {
			setState(295);
			switch (_input.LA(1)) {
			case ELEMENTO_AZAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				((Ordenes_listasContext)_localctx).elegir = elegir();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).elegir.node;
				}
				break;
			case ELEMENTO_N:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				((Ordenes_listasContext)_localctx).elemento_n = elemento_n();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).elemento_n.node;
				}
				break;
			case LONGITUD:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				((Ordenes_listasContext)_localctx).largo = largo();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).largo.node;
				}
				break;
			case PRIMERO_LISTA:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				((Ordenes_listasContext)_localctx).primero = primero();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).primero.node;
				}
				break;
			case ULTIMO:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				((Ordenes_listasContext)_localctx).ultimo = ultimo();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).ultimo.node;
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

	public static class ElegirContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode ELEMENTO_AZAR() { return getToken(LogoTECParser.ELEMENTO_AZAR, 0); }
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public ElegirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elegir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterElegir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitElegir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitElegir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElegirContext elegir() throws RecognitionException {
		ElegirContext _localctx = new ElegirContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elegir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(ELEMENTO_AZAR);
			setState(298);
			match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ID - 70)) | (1L << (ENTERO - 70)) | (1L << (FLOAT - 70)))) != 0)) {
				{
				{
				setState(300);
				((ElegirContext)_localctx).numero = numero();
				body.add(((ElegirContext)_localctx).numero.node);
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	Random rand = new Random(); 
				   							((ElegirContext)_localctx).node =  body.get(rand.nextInt(body.size()));
										   
			setState(309);
			match(PAR_CUAD_CERRADO);
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

	public static class Elemento_nContext extends ParserRuleContext {
		public ASTNode node;
		public Token ELEMENTO_N;
		public NumeroContext numero;
		public TerminalNode ELEMENTO_N() { return getToken(LogoTECParser.ELEMENTO_N, 0); }
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public Elemento_nContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterElemento_n(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitElemento_n(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitElemento_n(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elemento_nContext elemento_n() throws RecognitionException {
		Elemento_nContext _localctx = new Elemento_nContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elemento_n);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			((Elemento_nContext)_localctx).ELEMENTO_N = match(ELEMENTO_N);
			setState(312);
			match(ENTERO);
			setState(313);
			match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ID - 70)) | (1L << (ENTERO - 70)) | (1L << (FLOAT - 70)))) != 0)) {
				{
				{
				setState(315);
				((Elemento_nContext)_localctx).numero = numero();
				body.add(((Elemento_nContext)_localctx).numero.node);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((Elemento_nContext)_localctx).node =  body.get(Integer.parseInt((((Elemento_nContext)_localctx).ELEMENTO_N!=null?((Elemento_nContext)_localctx).ELEMENTO_N.getText():null)));
										   
			setState(324);
			match(PAR_CUAD_CERRADO);
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

	public static class LargoContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode LONGITUD() { return getToken(LogoTECParser.LONGITUD, 0); }
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public LargoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_largo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterLargo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitLargo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitLargo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LargoContext largo() throws RecognitionException {
		LargoContext _localctx = new LargoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_largo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(LONGITUD);
			setState(327);
			match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ID - 70)) | (1L << (ENTERO - 70)) | (1L << (FLOAT - 70)))) != 0)) {
				{
				{
				setState(329);
				((LargoContext)_localctx).numero = numero();
				body.add(((LargoContext)_localctx).numero.node);
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((LargoContext)_localctx).node =  new Constante(body.size());
										   
			setState(338);
			match(PAR_CUAD_CERRADO);
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

	public static class PrimeroContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode PRIMERO_LISTA() { return getToken(LogoTECParser.PRIMERO_LISTA, 0); }
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public PrimeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterPrimero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitPrimero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitPrimero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimeroContext primero() throws RecognitionException {
		PrimeroContext _localctx = new PrimeroContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(PRIMERO_LISTA);
			setState(341);
			match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ID - 70)) | (1L << (ENTERO - 70)) | (1L << (FLOAT - 70)))) != 0)) {
				{
				{
				setState(343);
				((PrimeroContext)_localctx).numero = numero();
				body.add(((PrimeroContext)_localctx).numero.node);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((PrimeroContext)_localctx).node =  body.get(0);
										   
			setState(352);
			match(PAR_CUAD_CERRADO);
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

	public static class UltimoContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode ULTIMO() { return getToken(LogoTECParser.ULTIMO, 0); }
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public UltimoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ultimo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterUltimo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitUltimo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitUltimo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UltimoContext ultimo() throws RecognitionException {
		UltimoContext _localctx = new UltimoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ultimo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(ULTIMO);
			setState(355);
			match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ID - 70)) | (1L << (ENTERO - 70)) | (1L << (FLOAT - 70)))) != 0)) {
				{
				{
				setState(357);
				((UltimoContext)_localctx).numero = numero();
				body.add(((UltimoContext)_localctx).numero.node);
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((UltimoContext)_localctx).node =  body.get(body.size()-1);
										   
			setState(366);
			match(PAR_CUAD_CERRADO);
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

	public static class Ordenes_tortugaContext extends ParserRuleContext {
		public ASTNode node;
		public AvanzarContext avanzar;
		public RetrocederContext retroceder;
		public Girar_derechaContext girar_derecha;
		public Girar_izquierdaContext girar_izquierda;
		public Ocultar_tortugaContext ocultar_tortuga;
		public Aparecer_tortugaContext aparecer_tortuga;
		public Definir_coordContext definir_coord;
		public Definir_xContext definir_x;
		public Definir_yContext definir_y;
		public Definir_dirContext definir_dir;
		public RumboContext rumbo;
		public CentrarContext centrar;
		public EsperarContext esperar;
		public AvanzarContext avanzar() {
			return getRuleContext(AvanzarContext.class,0);
		}
		public RetrocederContext retroceder() {
			return getRuleContext(RetrocederContext.class,0);
		}
		public Girar_derechaContext girar_derecha() {
			return getRuleContext(Girar_derechaContext.class,0);
		}
		public Girar_izquierdaContext girar_izquierda() {
			return getRuleContext(Girar_izquierdaContext.class,0);
		}
		public Ocultar_tortugaContext ocultar_tortuga() {
			return getRuleContext(Ocultar_tortugaContext.class,0);
		}
		public Aparecer_tortugaContext aparecer_tortuga() {
			return getRuleContext(Aparecer_tortugaContext.class,0);
		}
		public Definir_coordContext definir_coord() {
			return getRuleContext(Definir_coordContext.class,0);
		}
		public Definir_xContext definir_x() {
			return getRuleContext(Definir_xContext.class,0);
		}
		public Definir_yContext definir_y() {
			return getRuleContext(Definir_yContext.class,0);
		}
		public Definir_dirContext definir_dir() {
			return getRuleContext(Definir_dirContext.class,0);
		}
		public RumboContext rumbo() {
			return getRuleContext(RumboContext.class,0);
		}
		public CentrarContext centrar() {
			return getRuleContext(CentrarContext.class,0);
		}
		public EsperarContext esperar() {
			return getRuleContext(EsperarContext.class,0);
		}
		public Ordenes_tortugaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenes_tortuga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOrdenes_tortuga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOrdenes_tortuga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOrdenes_tortuga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordenes_tortugaContext ordenes_tortuga() throws RecognitionException {
		Ordenes_tortugaContext _localctx = new Ordenes_tortugaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ordenes_tortuga);
		try {
			setState(407);
			switch (_input.LA(1)) {
			case AVANZA:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				((Ordenes_tortugaContext)_localctx).avanzar = avanzar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).avanzar.node;
				}
				break;
			case RETROCEDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				((Ordenes_tortugaContext)_localctx).retroceder = retroceder();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).retroceder.node;
				}
				break;
			case GIRA_DERECHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				((Ordenes_tortugaContext)_localctx).girar_derecha = girar_derecha();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).girar_derecha.node;
				}
				break;
			case GIRA_IZQUIERDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				((Ordenes_tortugaContext)_localctx).girar_izquierda = girar_izquierda();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).girar_izquierda.node;
				}
				break;
			case OCULTA_TORTUGA:
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				((Ordenes_tortugaContext)_localctx).ocultar_tortuga = ocultar_tortuga();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).ocultar_tortuga.node;
				}
				break;
			case APARECE_TORTUGA:
				enterOuterAlt(_localctx, 6);
				{
				setState(383);
				((Ordenes_tortugaContext)_localctx).aparecer_tortuga = aparecer_tortuga();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).aparecer_tortuga.node;
				}
				break;
			case PON_POS:
				enterOuterAlt(_localctx, 7);
				{
				setState(386);
				((Ordenes_tortugaContext)_localctx).definir_coord = definir_coord();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_coord.node;
				}
				break;
			case PONX:
				enterOuterAlt(_localctx, 8);
				{
				setState(389);
				((Ordenes_tortugaContext)_localctx).definir_x = definir_x();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_x.node;
				}
				break;
			case PONY:
				enterOuterAlt(_localctx, 9);
				{
				setState(392);
				((Ordenes_tortugaContext)_localctx).definir_y = definir_y();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_y.node;
				}
				break;
			case PON_RUMBO:
				enterOuterAlt(_localctx, 10);
				{
				setState(395);
				((Ordenes_tortugaContext)_localctx).definir_dir = definir_dir();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_dir.node;
				}
				break;
			case RUMBO:
				enterOuterAlt(_localctx, 11);
				{
				setState(398);
				((Ordenes_tortugaContext)_localctx).rumbo = rumbo();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).rumbo.node;
				}
				break;
			case CENTRO:
				enterOuterAlt(_localctx, 12);
				{
				setState(401);
				((Ordenes_tortugaContext)_localctx).centrar = centrar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).centrar.node;
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 13);
				{
				setState(404);
				((Ordenes_tortugaContext)_localctx).esperar = esperar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).esperar.node;
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

	public static class AvanzarContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode AVANZA() { return getToken(LogoTECParser.AVANZA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public AvanzarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avanzar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterAvanzar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitAvanzar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitAvanzar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvanzarContext avanzar() throws RecognitionException {
		AvanzarContext _localctx = new AvanzarContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_avanzar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(AVANZA);
			setState(410);
			((AvanzarContext)_localctx).numero = numero();
			((AvanzarContext)_localctx).node =  new TortugaAvanza(((AvanzarContext)_localctx).numero.node);
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

	public static class RetrocederContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode RETROCEDE() { return getToken(LogoTECParser.RETROCEDE, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public RetrocederContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retroceder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterRetroceder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitRetroceder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitRetroceder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetrocederContext retroceder() throws RecognitionException {
		RetrocederContext _localctx = new RetrocederContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_retroceder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(RETROCEDE);
			setState(414);
			((RetrocederContext)_localctx).numero = numero();
			((RetrocederContext)_localctx).node =  new TortugaRetrocede(((RetrocederContext)_localctx).numero.node);
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

	public static class Girar_derechaContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode GIRA_DERECHA() { return getToken(LogoTECParser.GIRA_DERECHA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Girar_derechaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girar_derecha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterGirar_derecha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitGirar_derecha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitGirar_derecha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Girar_derechaContext girar_derecha() throws RecognitionException {
		Girar_derechaContext _localctx = new Girar_derechaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_girar_derecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(GIRA_DERECHA);
			setState(418);
			((Girar_derechaContext)_localctx).numero = numero();
			((Girar_derechaContext)_localctx).node =  new TortugaGiraDerecha(((Girar_derechaContext)_localctx).numero.node);
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

	public static class Girar_izquierdaContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode GIRA_IZQUIERDA() { return getToken(LogoTECParser.GIRA_IZQUIERDA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Girar_izquierdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girar_izquierda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterGirar_izquierda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitGirar_izquierda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitGirar_izquierda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Girar_izquierdaContext girar_izquierda() throws RecognitionException {
		Girar_izquierdaContext _localctx = new Girar_izquierdaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_girar_izquierda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(GIRA_IZQUIERDA);
			setState(422);
			((Girar_izquierdaContext)_localctx).numero = numero();
			((Girar_izquierdaContext)_localctx).node =  new TortugaGiraIzquierda(((Girar_izquierdaContext)_localctx).numero.node);
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

	public static class Definir_coordContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext n1;
		public NumeroContext n2;
		public TerminalNode PON_POS() { return getToken(LogoTECParser.PON_POS, 0); }
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public Definir_coordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir_coord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterDefinir_coord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitDefinir_coord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitDefinir_coord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definir_coordContext definir_coord() throws RecognitionException {
		Definir_coordContext _localctx = new Definir_coordContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_definir_coord);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(PON_POS);
				setState(426);
				match(PAR_CUAD_ABIERTO);
				setState(427);
				((Definir_coordContext)_localctx).n1 = numero();
				((Definir_coordContext)_localctx).node =  ((Definir_coordContext)_localctx).n1.node;
				setState(429);
				((Definir_coordContext)_localctx).n2 = numero();
				((Definir_coordContext)_localctx).node =  new TortugaDefinirCoord(_localctx.node, ((Definir_coordContext)_localctx).n2.node);
				setState(431);
				match(PAR_CUAD_CERRADO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(PON_POS);
				setState(434);
				((Definir_coordContext)_localctx).n1 = numero();
				((Definir_coordContext)_localctx).node =  ((Definir_coordContext)_localctx).n1.node;
				setState(436);
				((Definir_coordContext)_localctx).n2 = numero();
				((Definir_coordContext)_localctx).node =  new TortugaDefinirCoord(_localctx.node, ((Definir_coordContext)_localctx).n2.node);
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

	public static class Definir_xContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode PONX() { return getToken(LogoTECParser.PONX, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Definir_xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterDefinir_x(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitDefinir_x(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitDefinir_x(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definir_xContext definir_x() throws RecognitionException {
		Definir_xContext _localctx = new Definir_xContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_definir_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(PONX);
			setState(442);
			((Definir_xContext)_localctx).numero = numero();
			((Definir_xContext)_localctx).node =  new TortugaDefinirX(((Definir_xContext)_localctx).numero.node);
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

	public static class Definir_yContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode PONY() { return getToken(LogoTECParser.PONY, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Definir_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterDefinir_y(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitDefinir_y(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitDefinir_y(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definir_yContext definir_y() throws RecognitionException {
		Definir_yContext _localctx = new Definir_yContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_definir_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(PONY);
			setState(446);
			((Definir_yContext)_localctx).numero = numero();
			((Definir_yContext)_localctx).node =  new TortugaDefinirY(((Definir_yContext)_localctx).numero.node);
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

	public static class Definir_dirContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode PON_RUMBO() { return getToken(LogoTECParser.PON_RUMBO, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Definir_dirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir_dir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterDefinir_dir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitDefinir_dir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitDefinir_dir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definir_dirContext definir_dir() throws RecognitionException {
		Definir_dirContext _localctx = new Definir_dirContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_definir_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(PON_RUMBO);
			setState(450);
			((Definir_dirContext)_localctx).numero = numero();
			((Definir_dirContext)_localctx).node =  new TortugaDefinirDir(((Definir_dirContext)_localctx).numero.node);
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

	public static class EsperarContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext numero;
		public TerminalNode ESPERA() { return getToken(LogoTECParser.ESPERA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public EsperarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esperar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterEsperar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitEsperar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitEsperar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsperarContext esperar() throws RecognitionException {
		EsperarContext _localctx = new EsperarContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_esperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(ESPERA);
			setState(454);
			((EsperarContext)_localctx).numero = numero();
			((EsperarContext)_localctx).node =  new TortugaDefinirEsperar(((EsperarContext)_localctx).numero.node);
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

	public static class Ocultar_tortugaContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode OCULTA_TORTUGA() { return getToken(LogoTECParser.OCULTA_TORTUGA, 0); }
		public Ocultar_tortugaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ocultar_tortuga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOcultar_tortuga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOcultar_tortuga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOcultar_tortuga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ocultar_tortugaContext ocultar_tortuga() throws RecognitionException {
		Ocultar_tortugaContext _localctx = new Ocultar_tortugaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ocultar_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(OCULTA_TORTUGA);
			((Ocultar_tortugaContext)_localctx).node =  new TortugaOcultar();
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

	public static class Aparecer_tortugaContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode APARECE_TORTUGA() { return getToken(LogoTECParser.APARECE_TORTUGA, 0); }
		public Aparecer_tortugaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aparecer_tortuga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterAparecer_tortuga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitAparecer_tortuga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitAparecer_tortuga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aparecer_tortugaContext aparecer_tortuga() throws RecognitionException {
		Aparecer_tortugaContext _localctx = new Aparecer_tortugaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_aparecer_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(APARECE_TORTUGA);
			((Aparecer_tortugaContext)_localctx).node =  new TortugaAparecer();
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

	public static class RumboContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode RUMBO() { return getToken(LogoTECParser.RUMBO, 0); }
		public RumboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rumbo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterRumbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitRumbo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitRumbo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RumboContext rumbo() throws RecognitionException {
		RumboContext _localctx = new RumboContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(RUMBO);
			((RumboContext)_localctx).node =  new TortugaRumbo();
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

	public static class CentrarContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode CENTRO() { return getToken(LogoTECParser.CENTRO, 0); }
		public CentrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterCentrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitCentrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitCentrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CentrarContext centrar() throws RecognitionException {
		CentrarContext _localctx = new CentrarContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_centrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(CENTRO);
			((CentrarContext)_localctx).node =  new TortugaCentro();
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

	public static class Ordenes_lienzoContext extends ParserRuleContext {
		public ASTNode node;
		public BorrarContext borrar;
		public DibujarContext dibujar;
		public No_dibujarContext no_dibujar;
		public Borra_pantallaContext borra_pantalla;
		public BorrarContext borrar() {
			return getRuleContext(BorrarContext.class,0);
		}
		public DibujarContext dibujar() {
			return getRuleContext(DibujarContext.class,0);
		}
		public No_dibujarContext no_dibujar() {
			return getRuleContext(No_dibujarContext.class,0);
		}
		public Borra_pantallaContext borra_pantalla() {
			return getRuleContext(Borra_pantallaContext.class,0);
		}
		public Ordenes_lienzoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenes_lienzo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOrdenes_lienzo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOrdenes_lienzo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOrdenes_lienzo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordenes_lienzoContext ordenes_lienzo() throws RecognitionException {
		Ordenes_lienzoContext _localctx = new Ordenes_lienzoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ordenes_lienzo);
		try {
			setState(481);
			switch (_input.LA(1)) {
			case BORRADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				((Ordenes_lienzoContext)_localctx).borrar = borrar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).borrar.node;
				}
				break;
			case BAJA_LAPIZ:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				((Ordenes_lienzoContext)_localctx).dibujar = dibujar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).dibujar.node;
				}
				break;
			case SUBE_LAPIZ:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				((Ordenes_lienzoContext)_localctx).no_dibujar = no_dibujar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).no_dibujar.node;
				}
				break;
			case BORRA_PANTALLA:
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
				((Ordenes_lienzoContext)_localctx).borra_pantalla = borra_pantalla();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).borra_pantalla.node;
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

	public static class BorrarContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode BORRADOR() { return getToken(LogoTECParser.BORRADOR, 0); }
		public BorrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterBorrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitBorrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitBorrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorrarContext borrar() throws RecognitionException {
		BorrarContext _localctx = new BorrarContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_borrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(BORRADOR);
			((BorrarContext)_localctx).node =  new LienzoBorrar();
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

	public static class DibujarContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode BAJA_LAPIZ() { return getToken(LogoTECParser.BAJA_LAPIZ, 0); }
		public DibujarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dibujar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterDibujar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitDibujar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitDibujar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DibujarContext dibujar() throws RecognitionException {
		DibujarContext _localctx = new DibujarContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(BAJA_LAPIZ);
			((DibujarContext)_localctx).node =  new LienzoDibujar();
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

	public static class No_dibujarContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode SUBE_LAPIZ() { return getToken(LogoTECParser.SUBE_LAPIZ, 0); }
		public No_dibujarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_dibujar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterNo_dibujar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitNo_dibujar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitNo_dibujar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_dibujarContext no_dibujar() throws RecognitionException {
		No_dibujarContext _localctx = new No_dibujarContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_no_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(SUBE_LAPIZ);
			((No_dibujarContext)_localctx).node =  new LienzoNoDibujar();
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

	public static class Borra_pantallaContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode BORRA_PANTALLA() { return getToken(LogoTECParser.BORRA_PANTALLA, 0); }
		public Borra_pantallaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borra_pantalla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterBorra_pantalla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitBorra_pantalla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitBorra_pantalla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Borra_pantallaContext borra_pantalla() throws RecognitionException {
		Borra_pantallaContext _localctx = new Borra_pantallaContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_borra_pantalla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(BORRA_PANTALLA);
			((Borra_pantallaContext)_localctx).node =  new LienzoBorrarPantalla();
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

	public static class DatoContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public Token TRUE;
		public Token FALSE;
		public NumeroContext numero;
		public List<TerminalNode> COMILLA() { return getTokens(LogoTECParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(LogoTECParser.COMILLA, i);
		}
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode TRUE() { return getToken(LogoTECParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LogoTECParser.FALSE, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dato);
		try {
			setState(506);
			switch (_input.LA(1)) {
			case COMILLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(COMILLA);
				setState(496);
				((DatoContext)_localctx).ID = match(ID);
				setState(497);
				match(COMILLA);
				((DatoContext)_localctx).node =  new Constante((((DatoContext)_localctx).ID!=null?((DatoContext)_localctx).ID.getText():null));
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				((DatoContext)_localctx).TRUE = match(TRUE);
				((DatoContext)_localctx).node =  new Constante(Boolean.parseBoolean((((DatoContext)_localctx).TRUE!=null?((DatoContext)_localctx).TRUE.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				((DatoContext)_localctx).FALSE = match(FALSE);
				((DatoContext)_localctx).node =  new Constante(Boolean.parseBoolean((((DatoContext)_localctx).FALSE!=null?((DatoContext)_localctx).FALSE.getText():null)));
				}
				break;
			case SUMA:
			case RESIDUO:
			case DIVISION:
			case POTENCIA:
			case PRODUCTO:
			case NEGATIVO:
			case DIFERENCIA:
			case REDONDEO:
			case AZAR:
			case ELEMENTO_AZAR:
			case LONGITUD:
			case ULTIMO:
			case ELEMENTO_N:
			case PRIMERO_LISTA:
			case ID:
			case ENTERO:
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(503);
				((DatoContext)_localctx).numero = numero();
				((DatoContext)_localctx).node =  ((DatoContext)_localctx).numero.node;
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

	public static class NumeroContext extends ParserRuleContext {
		public ASTNode node;
		public Token ENTERO;
		public Token FLOAT;
		public Ordenes_listasContext ordenes_listas;
		public ReferenciaContext referencia;
		public Operacion_aritmeticaContext operacion_aritmetica;
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
		public TerminalNode FLOAT() { return getToken(LogoTECParser.FLOAT, 0); }
		public Ordenes_listasContext ordenes_listas() {
			return getRuleContext(Ordenes_listasContext.class,0);
		}
		public ReferenciaContext referencia() {
			return getRuleContext(ReferenciaContext.class,0);
		}
		public Operacion_aritmeticaContext operacion_aritmetica() {
			return getRuleContext(Operacion_aritmeticaContext.class,0);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_numero);
		try {
			setState(521);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				((NumeroContext)_localctx).ENTERO = match(ENTERO);
				((NumeroContext)_localctx).node =  new Constante(Integer.parseInt((((NumeroContext)_localctx).ENTERO!=null?((NumeroContext)_localctx).ENTERO.getText():null)));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				((NumeroContext)_localctx).FLOAT = match(FLOAT);
				((NumeroContext)_localctx).node =  new Constante(Float.parseFloat((((NumeroContext)_localctx).FLOAT!=null?((NumeroContext)_localctx).FLOAT.getText():null)));
				}
				break;
			case ELEMENTO_AZAR:
			case LONGITUD:
			case ULTIMO:
			case ELEMENTO_N:
			case PRIMERO_LISTA:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				((NumeroContext)_localctx).ordenes_listas = ordenes_listas();
				((NumeroContext)_localctx).node =  ((NumeroContext)_localctx).ordenes_listas.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				((NumeroContext)_localctx).referencia = referencia();
				((NumeroContext)_localctx).node =  ((NumeroContext)_localctx).referencia.node;
				}
				break;
			case SUMA:
			case RESIDUO:
			case DIVISION:
			case POTENCIA:
			case PRODUCTO:
			case NEGATIVO:
			case DIFERENCIA:
			case REDONDEO:
			case AZAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(518);
				((NumeroContext)_localctx).operacion_aritmetica = operacion_aritmetica();
				((NumeroContext)_localctx).node =  ((NumeroContext)_localctx).operacion_aritmetica.node;
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u020e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\7\2c\n\2\f\2\16\2f\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4\177\n\4\f\4\16\4\u0082\13\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0093\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a1\n\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00ba\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00da\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e2"+
		"\n\f\f\f\16\f\u00e5\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ed\n\r\f\r\16"+
		"\r\u00f0\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00f8\n\16\f\16\16\16"+
		"\u00fb\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u012a\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u0132\n\26\f\26\16\26\u0135\13\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u0141\n\27\f\27\16\27\u0144\13\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u014f\n\30\f\30\16\30\u0152"+
		"\13\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u015d\n\31\f"+
		"\31\16\31\u0160\13\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u016b\n\32\f\32\16\32\u016e\13\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u019a\n\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01ba\n \3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01e4\n)\3*\3*\3*\3+\3+\3+\3,\3"+
		",\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01fd\n.\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u020c\n/\3/\2\2\60\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\2\u0214"+
		"\2^\3\2\2\2\4i\3\2\2\2\6w\3\2\2\2\b\u0092\3\2\2\2\n\u00a0\3\2\2\2\f\u00a2"+
		"\3\2\2\2\16\u00a7\3\2\2\2\20\u00b9\3\2\2\2\22\u00bb\3\2\2\2\24\u00d9\3"+
		"\2\2\2\26\u00db\3\2\2\2\30\u00e6\3\2\2\2\32\u00f1\3\2\2\2\34\u00fc\3\2"+
		"\2\2\36\u0102\3\2\2\2 \u0108\3\2\2\2\"\u010e\3\2\2\2$\u0112\3\2\2\2&\u0116"+
		"\3\2\2\2(\u0129\3\2\2\2*\u012b\3\2\2\2,\u0139\3\2\2\2.\u0148\3\2\2\2\60"+
		"\u0156\3\2\2\2\62\u0164\3\2\2\2\64\u0199\3\2\2\2\66\u019b\3\2\2\28\u019f"+
		"\3\2\2\2:\u01a3\3\2\2\2<\u01a7\3\2\2\2>\u01b9\3\2\2\2@\u01bb\3\2\2\2B"+
		"\u01bf\3\2\2\2D\u01c3\3\2\2\2F\u01c7\3\2\2\2H\u01cb\3\2\2\2J\u01ce\3\2"+
		"\2\2L\u01d1\3\2\2\2N\u01d4\3\2\2\2P\u01e3\3\2\2\2R\u01e5\3\2\2\2T\u01e8"+
		"\3\2\2\2V\u01eb\3\2\2\2X\u01ee\3\2\2\2Z\u01fc\3\2\2\2\\\u020b\3\2\2\2"+
		"^d\b\2\1\2_`\5\b\5\2`a\b\2\1\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\b\2\1\2h\3\3\2\2\2ij\7 \2\2jk\7C\2\2"+
		"kq\b\3\1\2lm\5\64\33\2mn\b\3\1\2np\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2"+
		"\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7D\2\2uv\b\3\1\2v\5\3\2\2\2wx\7\37"+
		"\2\2xy\5\\/\2yz\7C\2\2z\u0080\b\4\1\2{|\5\64\33\2|}\b\4\1\2}\177\3\2\2"+
		"\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7D\2\2\u0084\u0085\b\4"+
		"\1\2\u0085\7\3\2\2\2\u0086\u0087\5\64\33\2\u0087\u0088\b\5\1\2\u0088\u0093"+
		"\3\2\2\2\u0089\u008a\5\n\6\2\u008a\u008b\b\5\1\2\u008b\u0093\3\2\2\2\u008c"+
		"\u008d\5\4\3\2\u008d\u008e\b\5\1\2\u008e\u0093\3\2\2\2\u008f\u0090\5\6"+
		"\4\2\u0090\u0091\b\5\1\2\u0091\u0093\3\2\2\2\u0092\u0086\3\2\2\2\u0092"+
		"\u0089\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u008f\3\2\2\2\u0093\t\3\2\2\2"+
		"\u0094\u0095\5\f\7\2\u0095\u0096\b\6\1\2\u0096\u00a1\3\2\2\2\u0097\u0098"+
		"\5\16\b\2\u0098\u0099\b\6\1\2\u0099\u00a1\3\2\2\2\u009a\u009b\5\20\t\2"+
		"\u009b\u009c\b\6\1\2\u009c\u00a1\3\2\2\2\u009d\u009e\5\22\n\2\u009e\u009f"+
		"\b\6\1\2\u009f\u00a1\3\2\2\2\u00a0\u0094\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0"+
		"\u009a\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\13\3\2\2\2\u00a2\u00a3\7\4\2"+
		"\2\u00a3\u00a4\7H\2\2\u00a4\u00a5\5Z.\2\u00a5\u00a6\b\7\1\2\u00a6\r\3"+
		"\2\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\7H\2\2\u00a9\u00aa\7:\2\2\u00aa"+
		"\u00ab\5Z.\2\u00ab\u00ac\b\b\1\2\u00ac\17\3\2\2\2\u00ad\u00ae\7\6\2\2"+
		"\u00ae\u00af\7C\2\2\u00af\u00b0\7H\2\2\u00b0\u00b1\7D\2\2\u00b1\u00ba"+
		"\b\t\1\2\u00b2\u00b3\7\6\2\2\u00b3\u00b4\7C\2\2\u00b4\u00b5\7H\2\2\u00b5"+
		"\u00b6\5Z.\2\u00b6\u00b7\7D\2\2\u00b7\u00b8\b\t\1\2\u00b8\u00ba\3\2\2"+
		"\2\u00b9\u00ad\3\2\2\2\u00b9\u00b2\3\2\2\2\u00ba\21\3\2\2\2\u00bb\u00bc"+
		"\7H\2\2\u00bc\u00bd\b\n\1\2\u00bd\23\3\2\2\2\u00be\u00bf\5\26\f\2\u00bf"+
		"\u00c0\b\13\1\2\u00c0\u00da\3\2\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3\b"+
		"\13\1\2\u00c3\u00da\3\2\2\2\u00c4\u00c5\5\32\16\2\u00c5\u00c6\b\13\1\2"+
		"\u00c6\u00da\3\2\2\2\u00c7\u00c8\5\34\17\2\u00c8\u00c9\b\13\1\2\u00c9"+
		"\u00da\3\2\2\2\u00ca\u00cb\5\36\20\2\u00cb\u00cc\b\13\1\2\u00cc\u00da"+
		"\3\2\2\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\b\13\1\2\u00cf\u00da\3\2\2\2"+
		"\u00d0\u00d1\5\"\22\2\u00d1\u00d2\b\13\1\2\u00d2\u00da\3\2\2\2\u00d3\u00d4"+
		"\5$\23\2\u00d4\u00d5\b\13\1\2\u00d5\u00da\3\2\2\2\u00d6\u00d7\5&\24\2"+
		"\u00d7\u00d8\b\13\1\2\u00d8\u00da\3\2\2\2\u00d9\u00be\3\2\2\2\u00d9\u00c1"+
		"\3\2\2\2\u00d9\u00c4\3\2\2\2\u00d9\u00c7\3\2\2\2\u00d9\u00ca\3\2\2\2\u00d9"+
		"\u00cd\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d6\3\2"+
		"\2\2\u00da\25\3\2\2\2\u00db\u00dc\7\b\2\2\u00dc\u00dd\5\\/\2\u00dd\u00e3"+
		"\b\f\1\2\u00de\u00df\5\\/\2\u00df\u00e0\b\f\1\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\27\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\16\2\2\u00e7\u00e8"+
		"\5\\/\2\u00e8\u00ee\b\r\1\2\u00e9\u00ea\5\\/\2\u00ea\u00eb\b\r\1\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\31\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2"+
		"\7\f\2\2\u00f2\u00f3\5\\/\2\u00f3\u00f9\b\16\1\2\u00f4\u00f5\5\\/\2\u00f5"+
		"\u00f6\b\16\1\2\u00f6\u00f8\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\33\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe\5\\/\2\u00fe\u00ff\b\17"+
		"\1\2\u00ff\u0100\5\\/\2\u0100\u0101\b\17\1\2\u0101\35\3\2\2\2\u0102\u0103"+
		"\7\n\2\2\u0103\u0104\5\\/\2\u0104\u0105\b\20\1\2\u0105\u0106\5\\/\2\u0106"+
		"\u0107\b\20\1\2\u0107\37\3\2\2\2\u0108\u0109\7\t\2\2\u0109\u010a\5\\/"+
		"\2\u010a\u010b\b\21\1\2\u010b\u010c\5\\/\2\u010c\u010d\b\21\1\2\u010d"+
		"!\3\2\2\2\u010e\u010f\7\17\2\2\u010f\u0110\5\\/\2\u0110\u0111\b\22\1\2"+
		"\u0111#\3\2\2\2\u0112\u0113\7\20\2\2\u0113\u0114\5\\/\2\u0114\u0115\b"+
		"\23\1\2\u0115%\3\2\2\2\u0116\u0117\7\r\2\2\u0117\u0118\5\\/\2\u0118\u0119"+
		"\b\24\1\2\u0119\'\3\2\2\2\u011a\u011b\5*\26\2\u011b\u011c\b\25\1\2\u011c"+
		"\u012a\3\2\2\2\u011d\u011e\5,\27\2\u011e\u011f\b\25\1\2\u011f\u012a\3"+
		"\2\2\2\u0120\u0121\5.\30\2\u0121\u0122\b\25\1\2\u0122\u012a\3\2\2\2\u0123"+
		"\u0124\5\60\31\2\u0124\u0125\b\25\1\2\u0125\u012a\3\2\2\2\u0126\u0127"+
		"\5\62\32\2\u0127\u0128\b\25\1\2\u0128\u012a\3\2\2\2\u0129\u011a\3\2\2"+
		"\2\u0129\u011d\3\2\2\2\u0129\u0120\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0126"+
		"\3\2\2\2\u012a)\3\2\2\2\u012b\u012c\7\26\2\2\u012c\u012d\7C\2\2\u012d"+
		"\u0133\b\26\1\2\u012e\u012f\5\\/\2\u012f\u0130\b\26\1\2\u0130\u0132\3"+
		"\2\2\2\u0131\u012e\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\b\26"+
		"\1\2\u0137\u0138\7D\2\2\u0138+\3\2\2\2\u0139\u013a\7\31\2\2\u013a\u013b"+
		"\7I\2\2\u013b\u013c\7C\2\2\u013c\u0142\b\27\1\2\u013d\u013e\5\\/\2\u013e"+
		"\u013f\b\27\1\2\u013f\u0141\3\2\2\2\u0140\u013d\3\2\2\2\u0141\u0144\3"+
		"\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\b\27\1\2\u0146\u0147\7D\2\2\u0147-\3\2\2\2"+
		"\u0148\u0149\7\27\2\2\u0149\u014a\7C\2\2\u014a\u0150\b\30\1\2\u014b\u014c"+
		"\5\\/\2\u014c\u014d\b\30\1\2\u014d\u014f\3\2\2\2\u014e\u014b\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0154\b\30\1\2\u0154\u0155\7D\2\2\u0155"+
		"/\3\2\2\2\u0156\u0157\7\32\2\2\u0157\u0158\7C\2\2\u0158\u015e\b\31\1\2"+
		"\u0159\u015a\5\\/\2\u015a\u015b\b\31\1\2\u015b\u015d\3\2\2\2\u015c\u0159"+
		"\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\b\31\1\2\u0162\u0163\7"+
		"D\2\2\u0163\61\3\2\2\2\u0164\u0165\7\30\2\2\u0165\u0166\7C\2\2\u0166\u016c"+
		"\b\32\1\2\u0167\u0168\5\\/\2\u0168\u0169\b\32\1\2\u0169\u016b\3\2\2\2"+
		"\u016a\u0167\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\b\32\1\2"+
		"\u0170\u0171\7D\2\2\u0171\63\3\2\2\2\u0172\u0173\5\66\34\2\u0173\u0174"+
		"\b\33\1\2\u0174\u019a\3\2\2\2\u0175\u0176\58\35\2\u0176\u0177\b\33\1\2"+
		"\u0177\u019a\3\2\2\2\u0178\u0179\5:\36\2\u0179\u017a\b\33\1\2\u017a\u019a"+
		"\3\2\2\2\u017b\u017c\5<\37\2\u017c\u017d\b\33\1\2\u017d\u019a\3\2\2\2"+
		"\u017e\u017f\5H%\2\u017f\u0180\b\33\1\2\u0180\u019a\3\2\2\2\u0181\u0182"+
		"\5J&\2\u0182\u0183\b\33\1\2\u0183\u019a\3\2\2\2\u0184\u0185\5> \2\u0185"+
		"\u0186\b\33\1\2\u0186\u019a\3\2\2\2\u0187\u0188\5@!\2\u0188\u0189\b\33"+
		"\1\2\u0189\u019a\3\2\2\2\u018a\u018b\5B\"\2\u018b\u018c\b\33\1\2\u018c"+
		"\u019a\3\2\2\2\u018d\u018e\5D#\2\u018e\u018f\b\33\1\2\u018f\u019a\3\2"+
		"\2\2\u0190\u0191\5L\'\2\u0191\u0192\b\33\1\2\u0192\u019a\3\2\2\2\u0193"+
		"\u0194\5N(\2\u0194\u0195\b\33\1\2\u0195\u019a\3\2\2\2\u0196\u0197\5F$"+
		"\2\u0197\u0198\b\33\1\2\u0198\u019a\3\2\2\2\u0199\u0172\3\2\2\2\u0199"+
		"\u0175\3\2\2\2\u0199\u0178\3\2\2\2\u0199\u017b\3\2\2\2\u0199\u017e\3\2"+
		"\2\2\u0199\u0181\3\2\2\2\u0199\u0184\3\2\2\2\u0199\u0187\3\2\2\2\u0199"+
		"\u018a\3\2\2\2\u0199\u018d\3\2\2\2\u0199\u0190\3\2\2\2\u0199\u0193\3\2"+
		"\2\2\u0199\u0196\3\2\2\2\u019a\65\3\2\2\2\u019b\u019c\7!\2\2\u019c\u019d"+
		"\5\\/\2\u019d\u019e\b\34\1\2\u019e\67\3\2\2\2\u019f\u01a0\7\"\2\2\u01a0"+
		"\u01a1\5\\/\2\u01a1\u01a2\b\35\1\2\u01a29\3\2\2\2\u01a3\u01a4\7$\2\2\u01a4"+
		"\u01a5\5\\/\2\u01a5\u01a6\b\36\1\2\u01a6;\3\2\2\2\u01a7\u01a8\7%\2\2\u01a8"+
		"\u01a9\5\\/\2\u01a9\u01aa\b\37\1\2\u01aa=\3\2\2\2\u01ab\u01ac\7)\2\2\u01ac"+
		"\u01ad\7C\2\2\u01ad\u01ae\5\\/\2\u01ae\u01af\b \1\2\u01af\u01b0\5\\/\2"+
		"\u01b0\u01b1\b \1\2\u01b1\u01b2\7D\2\2\u01b2\u01ba\3\2\2\2\u01b3\u01b4"+
		"\7)\2\2\u01b4\u01b5\5\\/\2\u01b5\u01b6\b \1\2\u01b6\u01b7\5\\/\2\u01b7"+
		"\u01b8\b \1\2\u01b8\u01ba\3\2\2\2\u01b9\u01ab\3\2\2\2\u01b9\u01b3\3\2"+
		"\2\2\u01ba?\3\2\2\2\u01bb\u01bc\7*\2\2\u01bc\u01bd\5\\/\2\u01bd\u01be"+
		"\b!\1\2\u01beA\3\2\2\2\u01bf\u01c0\7+\2\2\u01c0\u01c1\5\\/\2\u01c1\u01c2"+
		"\b\"\1\2\u01c2C\3\2\2\2\u01c3\u01c4\7,\2\2\u01c4\u01c5\5\\/\2\u01c5\u01c6"+
		"\b#\1\2\u01c6E\3\2\2\2\u01c7\u01c8\7#\2\2\u01c8\u01c9\5\\/\2\u01c9\u01ca"+
		"\b$\1\2\u01caG\3\2\2\2\u01cb\u01cc\7&\2\2\u01cc\u01cd\b%\1\2\u01cdI\3"+
		"\2\2\2\u01ce\u01cf\7\'\2\2\u01cf\u01d0\b&\1\2\u01d0K\3\2\2\2\u01d1\u01d2"+
		"\7-\2\2\u01d2\u01d3\b\'\1\2\u01d3M\3\2\2\2\u01d4\u01d5\7(\2\2\u01d5\u01d6"+
		"\b(\1\2\u01d6O\3\2\2\2\u01d7\u01d8\5R*\2\u01d8\u01d9\b)\1\2\u01d9\u01e4"+
		"\3\2\2\2\u01da\u01db\5T+\2\u01db\u01dc\b)\1\2\u01dc\u01e4\3\2\2\2\u01dd"+
		"\u01de\5V,\2\u01de\u01df\b)\1\2\u01df\u01e4\3\2\2\2\u01e0\u01e1\5X-\2"+
		"\u01e1\u01e2\b)\1\2\u01e2\u01e4\3\2\2\2\u01e3\u01d7\3\2\2\2\u01e3\u01da"+
		"\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e4Q\3\2\2\2\u01e5"+
		"\u01e6\7\61\2\2\u01e6\u01e7\b*\1\2\u01e7S\3\2\2\2\u01e8\u01e9\7\60\2\2"+
		"\u01e9\u01ea\b+\1\2\u01eaU\3\2\2\2\u01eb\u01ec\7/\2\2\u01ec\u01ed\b,\1"+
		"\2\u01edW\3\2\2\2\u01ee\u01ef\7\62\2\2\u01ef\u01f0\b-\1\2\u01f0Y\3\2\2"+
		"\2\u01f1\u01f2\7G\2\2\u01f2\u01f3\7H\2\2\u01f3\u01f4\7G\2\2\u01f4\u01fd"+
		"\b.\1\2\u01f5\u01f6\7\63\2\2\u01f6\u01fd\b.\1\2\u01f7\u01f8\7\64\2\2\u01f8"+
		"\u01fd\b.\1\2\u01f9\u01fa\5\\/\2\u01fa\u01fb\b.\1\2\u01fb\u01fd\3\2\2"+
		"\2\u01fc\u01f1\3\2\2\2\u01fc\u01f5\3\2\2\2\u01fc\u01f7\3\2\2\2\u01fc\u01f9"+
		"\3\2\2\2\u01fd[\3\2\2\2\u01fe\u01ff\7I\2\2\u01ff\u020c\b/\1\2\u0200\u0201"+
		"\7J\2\2\u0201\u020c\b/\1\2\u0202\u0203\5(\25\2\u0203\u0204\b/\1\2\u0204"+
		"\u020c\3\2\2\2\u0205\u0206\5\22\n\2\u0206\u0207\b/\1\2\u0207\u020c\3\2"+
		"\2\2\u0208\u0209\5\24\13\2\u0209\u020a\b/\1\2\u020a\u020c\3\2\2\2\u020b"+
		"\u01fe\3\2\2\2\u020b\u0200\3\2\2\2\u020b\u0202\3\2\2\2\u020b\u0205\3\2"+
		"\2\2\u020b\u0208\3\2\2\2\u020c]\3\2\2\2\27dq\u0080\u0092\u00a0\u00b9\u00d9"+
		"\u00e3\u00ee\u00f9\u0129\u0133\u0142\u0150\u015e\u016c\u0199\u01b9\u01e3"+
		"\u01fc\u020b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}