// Generated from LogoTEC.g4 by ANTLR 4.4
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
	public static final String[] tokenNames = {
		"<INVALID>", "'Programa'", "'Haz'", "'INIC'", "'INC'", "'print'", "SUMA", 
		"RESIDUO", "DIVISION", "POTENCIA", "PRODUCTO", "NEGATIVO", "DIFERENCIA", 
		"REDONDEO", "AZAR", "MAYOR", "MENOR", "'Y'", "'O'", "IGUALES", "ELEMENTO_AZAR", 
		"LONGITUD", "ULTIMO", "ELEMENTO_N", "PRIMERO_LISTA", "WHILE", "DO_WHILE", 
		"'SISINO'", "'SI'", "DO_N", "DO", "AVANZA", "RETROCEDE", "ESPERA", "GIRA_DERECHA", 
		"GIRA_IZQUIERDA", "OCULTA_TORTUGA", "APARECE_TORTUGA", "CENTRO", "PON_POS", 
		"'PonX'", "'PonY'", "PON_RUMBO", "RUMBO", "COLOR", "SUBE_LAPIZ", "BAJA_LAPIZ", 
		"BORRADOR", "'borrapantalla'", "'TRUE'", "'FALSE'", "'+'", "'*'", "'/'", 
		"'>'", "'<'", "'='", "'!'", "'>='", "'<='", "'!='", "'{'", "'}'", "'('", 
		"')'", "'['", "']'", "';'", "':'", "'\"'", "ID", "ENTERO", "FLOAT", "ESPACIO_BLANCO"
	};
	public static final int
		RULE_programa = 0, RULE_ejecuta = 1, RULE_repite = 2, RULE_sentencia_logoTEC = 3, 
		RULE_ordenes_variables = 4, RULE_asignacion = 5, RULE_reasignacion = 6, 
		RULE_incrementa = 7, RULE_referencia = 8, RULE_condicion = 9, RULE_ordenes_logicas = 10, 
		RULE_iguales = 11, RULE_and = 12, RULE_or = 13, RULE_mayor = 14, RULE_menor = 15, 
		RULE_operacion_aritmetica = 16, RULE_suma = 17, RULE_diferencia = 18, 
		RULE_producto = 19, RULE_potencia = 20, RULE_division = 21, RULE_residuo = 22, 
		RULE_redondear = 23, RULE_azar = 24, RULE_menos = 25, RULE_ordenes_listas = 26, 
		RULE_elegir = 27, RULE_elemento_n = 28, RULE_largo = 29, RULE_primero = 30, 
		RULE_ultimo = 31, RULE_ordenes_tortuga = 32, RULE_avanzar = 33, RULE_retroceder = 34, 
		RULE_girar_derecha = 35, RULE_girar_izquierda = 36, RULE_definir_coord = 37, 
		RULE_definir_x = 38, RULE_definir_y = 39, RULE_definir_dir = 40, RULE_esperar = 41, 
		RULE_ocultar_tortuga = 42, RULE_aparecer_tortuga = 43, RULE_rumbo = 44, 
		RULE_centrar = 45, RULE_ordenes_lienzo = 46, RULE_borrar = 47, RULE_dibujar = 48, 
		RULE_no_dibujar = 49, RULE_borra_pantalla = 50, RULE_dato = 51, RULE_numero = 52;
	public static final String[] ruleNames = {
		"programa", "ejecuta", "repite", "sentencia_logoTEC", "ordenes_variables", 
		"asignacion", "reasignacion", "incrementa", "referencia", "condicion", 
		"ordenes_logicas", "iguales", "and", "or", "mayor", "menor", "operacion_aritmetica", 
		"suma", "diferencia", "producto", "potencia", "division", "residuo", "redondear", 
		"azar", "menos", "ordenes_listas", "elegir", "elemento_n", "largo", "primero", 
		"ultimo", "ordenes_tortuga", "avanzar", "retroceder", "girar_derecha", 
		"girar_izquierda", "definir_coord", "definir_x", "definir_y", "definir_dir", 
		"esperar", "ocultar_tortuga", "aparecer_tortuga", "rumbo", "centrar", 
		"ordenes_lienzo", "borrar", "dibujar", "no_dibujar", "borra_pantalla", 
		"dato", "numero"
	};

	@Override
	public String getGrammarFileName() { return "LogoTEC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public Sentencia_logoTECContext sentencia_logoTEC(int i) {
			return getRuleContext(Sentencia_logoTECContext.class,i);
		}
		public List<Sentencia_logoTECContext> sentencia_logoTEC() {
			return getRuleContexts(Sentencia_logoTECContext.class);
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

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAZ) | (1L << INIC) | (1L << INC) | (1L << DO_N) | (1L << DO) | (1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0) || _la==ID) {
				{
				{
				setState(107); ((ProgramaContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				body.add(((ProgramaContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(114);
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
		public List<Ordenes_tortugaContext> ordenes_tortuga() {
			return getRuleContexts(Ordenes_tortugaContext.class);
		}
		public Ordenes_tortugaContext ordenes_tortuga(int i) {
			return getRuleContext(Ordenes_tortugaContext.class,i);
		}
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
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
			setState(117); match(DO);
			setState(118); match(PAR_CUAD_ABIERTO);

									List<ASTNode> body = new ArrayList<ASTNode>();
									
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0)) {
				{
				{
				setState(120); ((EjecutaContext)_localctx).ordenes_tortuga = ordenes_tortuga();
				body.add(((EjecutaContext)_localctx).ordenes_tortuga.node);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128); match(PAR_CUAD_CERRADO);
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
		public List<Ordenes_tortugaContext> ordenes_tortuga() {
			return getRuleContexts(Ordenes_tortugaContext.class);
		}
		public Ordenes_tortugaContext ordenes_tortuga(int i) {
			return getRuleContext(Ordenes_tortugaContext.class,i);
		}
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
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
			setState(131); match(DO_N);
			setState(132); ((RepiteContext)_localctx).numero = numero();
			setState(133); match(PAR_CUAD_ABIERTO);

									List<ASTNode> body = new ArrayList<ASTNode>();
									
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0)) {
				{
				{
				setState(135); ((RepiteContext)_localctx).ordenes_tortuga = ordenes_tortuga();
				body.add(((RepiteContext)_localctx).ordenes_tortuga.node);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143); match(PAR_CUAD_CERRADO);
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
		public Ordenes_variablesContext ordenes_variables() {
			return getRuleContext(Ordenes_variablesContext.class,0);
		}
		public RepiteContext repite() {
			return getRuleContext(RepiteContext.class,0);
		}
		public Ordenes_tortugaContext ordenes_tortuga() {
			return getRuleContext(Ordenes_tortugaContext.class,0);
		}
		public EjecutaContext ejecuta() {
			return getRuleContext(EjecutaContext.class,0);
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
			setState(158);
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
				setState(146); ((Sentencia_logoTECContext)_localctx).ordenes_tortuga = ordenes_tortuga();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ordenes_tortuga.node;
				}
				break;
			case HAZ:
			case INIC:
			case INC:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); ((Sentencia_logoTECContext)_localctx).ordenes_variables = ordenes_variables();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ordenes_variables.node;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(152); ((Sentencia_logoTECContext)_localctx).ejecuta = ejecuta();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ejecuta.node;
				}
				break;
			case DO_N:
				enterOuterAlt(_localctx, 4);
				{
				setState(155); ((Sentencia_logoTECContext)_localctx).repite = repite();
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
		public IncrementaContext incrementa() {
			return getRuleContext(IncrementaContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ReasignacionContext reasignacion() {
			return getRuleContext(ReasignacionContext.class,0);
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
			setState(172);
			switch (_input.LA(1)) {
			case HAZ:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); ((Ordenes_variablesContext)_localctx).asignacion = asignacion();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).asignacion.node;
				}
				break;
			case INIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(163); ((Ordenes_variablesContext)_localctx).reasignacion = reasignacion();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).reasignacion.node;
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 3);
				{
				setState(166); ((Ordenes_variablesContext)_localctx).incrementa = incrementa();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).incrementa.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(169); ((Ordenes_variablesContext)_localctx).referencia = referencia();
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
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode HAZ() { return getToken(LogoTECParser.HAZ, 0); }
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
			setState(174); match(HAZ);
			setState(175); ((AsignacionContext)_localctx).ID = match(ID);
			setState(176); ((AsignacionContext)_localctx).dato = dato();
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
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode INIC() { return getToken(LogoTECParser.INIC, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public TerminalNode ASIGNAR() { return getToken(LogoTECParser.ASIGNAR, 0); }
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
			setState(179); match(INIC);
			setState(180); ((ReasignacionContext)_localctx).ID = match(ID);
			setState(181); match(ASIGNAR);
			setState(182); ((ReasignacionContext)_localctx).dato = dato();
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
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode INC() { return getToken(LogoTECParser.INC, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
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
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); match(INC);
				setState(186); match(PAR_CUAD_ABIERTO);
				setState(187); ((IncrementaContext)_localctx).ID = match(ID);
				setState(188); match(PAR_CUAD_CERRADO);
				((IncrementaContext)_localctx).node =   new IncrementaUno((((IncrementaContext)_localctx).ID!=null?((IncrementaContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); match(INC);
				setState(191); match(PAR_CUAD_ABIERTO);
				setState(192); ((IncrementaContext)_localctx).ID = match(ID);
				setState(193); ((IncrementaContext)_localctx).dato = dato();
				setState(194); match(PAR_CUAD_CERRADO);
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
			setState(199); ((ReferenciaContext)_localctx).ID = match(ID);
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

	public static class CondicionContext extends ParserRuleContext {
		public ASTNode node;
		public Ordenes_logicasContext ordenes_logicas;
		public Ordenes_logicasContext ordenes_logicas() {
			return getRuleContext(Ordenes_logicasContext.class,0);
		}
		public TerminalNode PAR_CERRADO() { return getToken(LogoTECParser.PAR_CERRADO, 0); }
		public TerminalNode PAR_ABIERTO() { return getToken(LogoTECParser.PAR_ABIERTO, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(PAR_ABIERTO);
			setState(203); ((CondicionContext)_localctx).ordenes_logicas = ordenes_logicas();
			((CondicionContext)_localctx).node =  ((CondicionContext)_localctx).ordenes_logicas.node;
			setState(205); match(PAR_CERRADO);
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

	public static class Ordenes_logicasContext extends ParserRuleContext {
		public ASTNode node;
		public IgualesContext iguales;
		public AndContext and;
		public OrContext or;
		public MayorContext mayor;
		public MenorContext menor;
		public IgualesContext iguales() {
			return getRuleContext(IgualesContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public MenorContext menor() {
			return getRuleContext(MenorContext.class,0);
		}
		public MayorContext mayor() {
			return getRuleContext(MayorContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public Ordenes_logicasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenes_logicas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOrdenes_logicas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOrdenes_logicas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOrdenes_logicas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordenes_logicasContext ordenes_logicas() throws RecognitionException {
		Ordenes_logicasContext _localctx = new Ordenes_logicasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ordenes_logicas);
		try {
			setState(222);
			switch (_input.LA(1)) {
			case IGUALES:
				enterOuterAlt(_localctx, 1);
				{
				setState(207); ((Ordenes_logicasContext)_localctx).iguales = iguales();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).iguales.node;
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); ((Ordenes_logicasContext)_localctx).and = and();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).and.node;
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(213); ((Ordenes_logicasContext)_localctx).or = or();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).or.node;
				}
				break;
			case MAYOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(216); ((Ordenes_logicasContext)_localctx).mayor = mayor();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).mayor.node;
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(219); ((Ordenes_logicasContext)_localctx).menor = menor();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).menor.node;
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

	public static class IgualesContext extends ParserRuleContext {
		public ASTNode node;
		public DatoContext d1;
		public DatoContext dato;
		public DatoContext d2;
		public List<DatoContext> dato() {
			return getRuleContexts(DatoContext.class);
		}
		public TerminalNode IGUALES() { return getToken(LogoTECParser.IGUALES, 0); }
		public DatoContext dato(int i) {
			return getRuleContext(DatoContext.class,i);
		}
		public IgualesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iguales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterIguales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitIguales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitIguales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualesContext iguales() throws RecognitionException {
		IgualesContext _localctx = new IgualesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_iguales);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(IGUALES);
			setState(225); ((IgualesContext)_localctx).d1 = ((IgualesContext)_localctx).dato = dato();
			((IgualesContext)_localctx).node =  ((IgualesContext)_localctx).dato.node;
			setState(227); ((IgualesContext)_localctx).d2 = ((IgualesContext)_localctx).dato = dato();
			((IgualesContext)_localctx).node =  new CondicionalesIguales(_localctx.node, ((IgualesContext)_localctx).d2.node);
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

	public static class AndContext extends ParserRuleContext {
		public ASTNode node;
		public CondicionContext c1;
		public CondicionContext condicion;
		public CondicionContext c2;
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public TerminalNode AND() { return getToken(LogoTECParser.AND, 0); }
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(AND);
			setState(231); ((AndContext)_localctx).c1 = ((AndContext)_localctx).condicion = condicion();
			((AndContext)_localctx).node =  ((AndContext)_localctx).condicion.node;
			setState(233); ((AndContext)_localctx).c2 = ((AndContext)_localctx).condicion = condicion();
			((AndContext)_localctx).node =  new CondicionalesAnd(_localctx.node, ((AndContext)_localctx).c2.node);
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

	public static class OrContext extends ParserRuleContext {
		public ASTNode node;
		public CondicionContext c1;
		public CondicionContext condicion;
		public CondicionContext c2;
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode OR() { return getToken(LogoTECParser.OR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); match(OR);
			setState(237); ((OrContext)_localctx).c1 = ((OrContext)_localctx).condicion = condicion();
			((OrContext)_localctx).node =  ((OrContext)_localctx).condicion.node;
			setState(239); ((OrContext)_localctx).c2 = ((OrContext)_localctx).condicion = condicion();
			((OrContext)_localctx).node =  new CondicionalesOr(_localctx.node, ((OrContext)_localctx).c2.node);
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

	public static class MayorContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext n1;
		public NumeroContext numero;
		public NumeroContext n2;
		public TerminalNode MAYOR() { return getToken(LogoTECParser.MAYOR, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public MayorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitMayor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitMayor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MayorContext mayor() throws RecognitionException {
		MayorContext _localctx = new MayorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); match(MAYOR);
			setState(243); ((MayorContext)_localctx).n1 = ((MayorContext)_localctx).numero = numero();
			((MayorContext)_localctx).node =  ((MayorContext)_localctx).numero.node;
			setState(245); ((MayorContext)_localctx).n2 = ((MayorContext)_localctx).numero = numero();
			((MayorContext)_localctx).node =  new CondicionalesMayor(_localctx.node, ((MayorContext)_localctx).n2.node);
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

	public static class MenorContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext n1;
		public NumeroContext numero;
		public NumeroContext n2;
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public TerminalNode MENOR() { return getToken(LogoTECParser.MENOR, 0); }
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public MenorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitMenor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenorContext menor() throws RecognitionException {
		MenorContext _localctx = new MenorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(MENOR);
			setState(249); ((MenorContext)_localctx).n1 = ((MenorContext)_localctx).numero = numero();
			((MenorContext)_localctx).node =  ((MenorContext)_localctx).numero.node;
			setState(251); ((MenorContext)_localctx).n2 = ((MenorContext)_localctx).numero = numero();
			((MenorContext)_localctx).node =  new CondicionalesMenor(_localctx.node, ((MenorContext)_localctx).n2.node);
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
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public AzarContext azar() {
			return getRuleContext(AzarContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public ProductoContext producto() {
			return getRuleContext(ProductoContext.class,0);
		}
		public DiferenciaContext diferencia() {
			return getRuleContext(DiferenciaContext.class,0);
		}
		public MenosContext menos() {
			return getRuleContext(MenosContext.class,0);
		}
		public ResiduoContext residuo() {
			return getRuleContext(ResiduoContext.class,0);
		}
		public RedondearContext redondear() {
			return getRuleContext(RedondearContext.class,0);
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
		enterRule(_localctx, 32, RULE_operacion_aritmetica);
		try {
			setState(281);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); ((Operacion_aritmeticaContext)_localctx).suma = suma();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).suma.node;
				}
				break;
			case DIFERENCIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); ((Operacion_aritmeticaContext)_localctx).diferencia = diferencia();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).diferencia.node;
				}
				break;
			case PRODUCTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(260); ((Operacion_aritmeticaContext)_localctx).producto = producto();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).producto.node;
				}
				break;
			case POTENCIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(263); ((Operacion_aritmeticaContext)_localctx).potencia = potencia();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).potencia.node;
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 5);
				{
				setState(266); ((Operacion_aritmeticaContext)_localctx).division = division();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).division.node;
				}
				break;
			case RESIDUO:
				enterOuterAlt(_localctx, 6);
				{
				setState(269); ((Operacion_aritmeticaContext)_localctx).residuo = residuo();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).residuo.node;
				}
				break;
			case REDONDEO:
				enterOuterAlt(_localctx, 7);
				{
				setState(272); ((Operacion_aritmeticaContext)_localctx).redondear = redondear();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).redondear.node;
				}
				break;
			case AZAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(275); ((Operacion_aritmeticaContext)_localctx).azar = azar();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).azar.node;
				}
				break;
			case NEGATIVO:
				enterOuterAlt(_localctx, 9);
				{
				setState(278); ((Operacion_aritmeticaContext)_localctx).menos = menos();
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
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public TerminalNode SUMA() { return getToken(LogoTECParser.SUMA, 0); }
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
		enterRule(_localctx, 34, RULE_suma);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(SUMA);
			setState(284); ((SumaContext)_localctx).n1 = numero();
			((SumaContext)_localctx).node =  ((SumaContext)_localctx).n1.node;
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286); ((SumaContext)_localctx).n2 = numero();
					((SumaContext)_localctx).node =  new Suma(_localctx.node, ((SumaContext)_localctx).n2.node);
					}
					} 
				}
				setState(293);
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

	public static class DiferenciaContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext n1;
		public NumeroContext n2;
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public TerminalNode DIFERENCIA() { return getToken(LogoTECParser.DIFERENCIA, 0); }
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
		enterRule(_localctx, 36, RULE_diferencia);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(DIFERENCIA);
			setState(295); ((DiferenciaContext)_localctx).n1 = numero();
			((DiferenciaContext)_localctx).node =  ((DiferenciaContext)_localctx).n1.node;
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297); ((DiferenciaContext)_localctx).n2 = numero();
					((DiferenciaContext)_localctx).node =  new Diferencia(_localctx.node, ((DiferenciaContext)_localctx).n2.node);
					}
					} 
				}
				setState(304);
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

	public static class ProductoContext extends ParserRuleContext {
		public ASTNode node;
		public NumeroContext n1;
		public NumeroContext n2;
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public TerminalNode PRODUCTO() { return getToken(LogoTECParser.PRODUCTO, 0); }
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
		enterRule(_localctx, 38, RULE_producto);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(PRODUCTO);
			setState(306); ((ProductoContext)_localctx).n1 = numero();
			((ProductoContext)_localctx).node =  ((ProductoContext)_localctx).n1.node;
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308); ((ProductoContext)_localctx).n2 = numero();
					((ProductoContext)_localctx).node =  new Producto(_localctx.node, ((ProductoContext)_localctx).n2.node);
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 40, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); match(POTENCIA);
			setState(317); ((PotenciaContext)_localctx).n1 = numero();
			((PotenciaContext)_localctx).node =  ((PotenciaContext)_localctx).n1.node;
			{
			setState(319); ((PotenciaContext)_localctx).n2 = numero();
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
		enterRule(_localctx, 42, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(DIVISION);
			setState(323); ((DivisionContext)_localctx).n1 = numero();
			((DivisionContext)_localctx).node =  ((DivisionContext)_localctx).n1.node;
			{
			setState(325); ((DivisionContext)_localctx).n2 = numero();
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
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public TerminalNode RESIDUO() { return getToken(LogoTECParser.RESIDUO, 0); }
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
		enterRule(_localctx, 44, RULE_residuo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(RESIDUO);
			setState(329); ((ResiduoContext)_localctx).n1 = numero();
			((ResiduoContext)_localctx).node =  ((ResiduoContext)_localctx).n1.node;
			{
			setState(331); ((ResiduoContext)_localctx).n2 = numero();
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
		public Token FLOAT;
		public TerminalNode REDONDEO() { return getToken(LogoTECParser.REDONDEO, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(LogoTECParser.FLOAT, 0); }
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
		enterRule(_localctx, 46, RULE_redondear);
		try {
			setState(341);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334); match(REDONDEO);
				setState(335); ((RedondearContext)_localctx).numero = numero();
				((RedondearContext)_localctx).node =  new Redondear(((RedondearContext)_localctx).numero.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338); match(REDONDEO);
				setState(339); ((RedondearContext)_localctx).FLOAT = match(FLOAT);
				((RedondearContext)_localctx).node =  new Redondear(new Constante(Float.parseFloat((((RedondearContext)_localctx).FLOAT!=null?((RedondearContext)_localctx).FLOAT.getText():null))));
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
		enterRule(_localctx, 48, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); match(AZAR);
			setState(344); ((AzarContext)_localctx).numero = numero();
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
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode NEGATIVO() { return getToken(LogoTECParser.NEGATIVO, 0); }
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
		enterRule(_localctx, 50, RULE_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(NEGATIVO);
			setState(348); ((MenosContext)_localctx).numero = numero();
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
		public PrimeroContext primero() {
			return getRuleContext(PrimeroContext.class,0);
		}
		public UltimoContext ultimo() {
			return getRuleContext(UltimoContext.class,0);
		}
		public Elemento_nContext elemento_n() {
			return getRuleContext(Elemento_nContext.class,0);
		}
		public LargoContext largo() {
			return getRuleContext(LargoContext.class,0);
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
		enterRule(_localctx, 52, RULE_ordenes_listas);
		try {
			setState(366);
			switch (_input.LA(1)) {
			case ELEMENTO_AZAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(351); ((Ordenes_listasContext)_localctx).elegir = elegir();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).elegir.node;
				}
				break;
			case ELEMENTO_N:
				enterOuterAlt(_localctx, 2);
				{
				setState(354); ((Ordenes_listasContext)_localctx).elemento_n = elemento_n();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).elemento_n.node;
				}
				break;
			case LONGITUD:
				enterOuterAlt(_localctx, 3);
				{
				setState(357); ((Ordenes_listasContext)_localctx).largo = largo();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).largo.node;
				}
				break;
			case PRIMERO_LISTA:
				enterOuterAlt(_localctx, 4);
				{
				setState(360); ((Ordenes_listasContext)_localctx).primero = primero();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).primero.node;
				}
				break;
			case ULTIMO:
				enterOuterAlt(_localctx, 5);
				{
				setState(363); ((Ordenes_listasContext)_localctx).ultimo = ultimo();
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
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode ELEMENTO_AZAR() { return getToken(LogoTECParser.ELEMENTO_AZAR, 0); }
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
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
		enterRule(_localctx, 54, RULE_elegir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); match(ELEMENTO_AZAR);
			setState(369); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(371); ((ElegirContext)_localctx).numero = numero();
				body.add(((ElegirContext)_localctx).numero.node);
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	Random rand = new Random(); 
				   							((ElegirContext)_localctx).node =  body.get(rand.nextInt(body.size()));
										   
			setState(380); match(PAR_CUAD_CERRADO);
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
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
		public TerminalNode ELEMENTO_N() { return getToken(LogoTECParser.ELEMENTO_N, 0); }
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
		enterRule(_localctx, 56, RULE_elemento_n);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); ((Elemento_nContext)_localctx).ELEMENTO_N = match(ELEMENTO_N);
			setState(383); match(ENTERO);
			setState(384); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(386); ((Elemento_nContext)_localctx).numero = numero();
				body.add(((Elemento_nContext)_localctx).numero.node);
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((Elemento_nContext)_localctx).node =  body.get(Integer.parseInt((((Elemento_nContext)_localctx).ELEMENTO_N!=null?((Elemento_nContext)_localctx).ELEMENTO_N.getText():null)));
										   
			setState(395); match(PAR_CUAD_CERRADO);
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
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
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
		enterRule(_localctx, 58, RULE_largo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); match(LONGITUD);
			setState(398); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(400); ((LargoContext)_localctx).numero = numero();
				body.add(((LargoContext)_localctx).numero.node);
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((LargoContext)_localctx).node =  new Constante(body.size());
										   
			setState(409); match(PAR_CUAD_CERRADO);
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
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public TerminalNode PRIMERO_LISTA() { return getToken(LogoTECParser.PRIMERO_LISTA, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
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
		enterRule(_localctx, 60, RULE_primero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); match(PRIMERO_LISTA);
			setState(412); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(414); ((PrimeroContext)_localctx).numero = numero();
				body.add(((PrimeroContext)_localctx).numero.node);
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((PrimeroContext)_localctx).node =  body.get(0);
										   
			setState(423); match(PAR_CUAD_CERRADO);
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
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode ULTIMO() { return getToken(LogoTECParser.ULTIMO, 0); }
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
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
		enterRule(_localctx, 62, RULE_ultimo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); match(ULTIMO);
			setState(426); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(428); ((UltimoContext)_localctx).numero = numero();
				body.add(((UltimoContext)_localctx).numero.node);
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((UltimoContext)_localctx).node =  body.get(body.size()-1);
										   
			setState(437); match(PAR_CUAD_CERRADO);
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
		public Girar_derechaContext girar_derecha() {
			return getRuleContext(Girar_derechaContext.class,0);
		}
		public RetrocederContext retroceder() {
			return getRuleContext(RetrocederContext.class,0);
		}
		public Aparecer_tortugaContext aparecer_tortuga() {
			return getRuleContext(Aparecer_tortugaContext.class,0);
		}
		public Girar_izquierdaContext girar_izquierda() {
			return getRuleContext(Girar_izquierdaContext.class,0);
		}
		public CentrarContext centrar() {
			return getRuleContext(CentrarContext.class,0);
		}
		public AvanzarContext avanzar() {
			return getRuleContext(AvanzarContext.class,0);
		}
		public Ocultar_tortugaContext ocultar_tortuga() {
			return getRuleContext(Ocultar_tortugaContext.class,0);
		}
		public EsperarContext esperar() {
			return getRuleContext(EsperarContext.class,0);
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
		public Definir_coordContext definir_coord() {
			return getRuleContext(Definir_coordContext.class,0);
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
		enterRule(_localctx, 64, RULE_ordenes_tortuga);
		try {
			setState(478);
			switch (_input.LA(1)) {
			case AVANZA:
				enterOuterAlt(_localctx, 1);
				{
				setState(439); ((Ordenes_tortugaContext)_localctx).avanzar = avanzar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).avanzar.node;
				}
				break;
			case RETROCEDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(442); ((Ordenes_tortugaContext)_localctx).retroceder = retroceder();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).retroceder.node;
				}
				break;
			case GIRA_DERECHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(445); ((Ordenes_tortugaContext)_localctx).girar_derecha = girar_derecha();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).girar_derecha.node;
				}
				break;
			case GIRA_IZQUIERDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(448); ((Ordenes_tortugaContext)_localctx).girar_izquierda = girar_izquierda();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).girar_izquierda.node;
				}
				break;
			case OCULTA_TORTUGA:
				enterOuterAlt(_localctx, 5);
				{
				setState(451); ((Ordenes_tortugaContext)_localctx).ocultar_tortuga = ocultar_tortuga();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).ocultar_tortuga.node;
				}
				break;
			case APARECE_TORTUGA:
				enterOuterAlt(_localctx, 6);
				{
				setState(454); ((Ordenes_tortugaContext)_localctx).aparecer_tortuga = aparecer_tortuga();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).aparecer_tortuga.node;
				}
				break;
			case PON_POS:
				enterOuterAlt(_localctx, 7);
				{
				setState(457); ((Ordenes_tortugaContext)_localctx).definir_coord = definir_coord();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_coord.node;
				}
				break;
			case PONX:
				enterOuterAlt(_localctx, 8);
				{
				setState(460); ((Ordenes_tortugaContext)_localctx).definir_x = definir_x();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_x.node;
				}
				break;
			case PONY:
				enterOuterAlt(_localctx, 9);
				{
				setState(463); ((Ordenes_tortugaContext)_localctx).definir_y = definir_y();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_y.node;
				}
				break;
			case PON_RUMBO:
				enterOuterAlt(_localctx, 10);
				{
				setState(466); ((Ordenes_tortugaContext)_localctx).definir_dir = definir_dir();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_dir.node;
				}
				break;
			case RUMBO:
				enterOuterAlt(_localctx, 11);
				{
				setState(469); ((Ordenes_tortugaContext)_localctx).rumbo = rumbo();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).rumbo.node;
				}
				break;
			case CENTRO:
				enterOuterAlt(_localctx, 12);
				{
				setState(472); ((Ordenes_tortugaContext)_localctx).centrar = centrar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).centrar.node;
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 13);
				{
				setState(475); ((Ordenes_tortugaContext)_localctx).esperar = esperar();
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
		enterRule(_localctx, 66, RULE_avanzar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); match(AVANZA);
			setState(481); ((AvanzarContext)_localctx).numero = numero();
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
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode RETROCEDE() { return getToken(LogoTECParser.RETROCEDE, 0); }
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
		enterRule(_localctx, 68, RULE_retroceder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); match(RETROCEDE);
			setState(485); ((RetrocederContext)_localctx).numero = numero();
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
		enterRule(_localctx, 70, RULE_girar_derecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); match(GIRA_DERECHA);
			setState(489); ((Girar_derechaContext)_localctx).numero = numero();
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
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode GIRA_IZQUIERDA() { return getToken(LogoTECParser.GIRA_IZQUIERDA, 0); }
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
		enterRule(_localctx, 72, RULE_girar_izquierda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492); match(GIRA_IZQUIERDA);
			setState(493); ((Girar_izquierdaContext)_localctx).numero = numero();
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
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public TerminalNode PON_POS() { return getToken(LogoTECParser.PON_POS, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
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
		enterRule(_localctx, 74, RULE_definir_coord);
		try {
			setState(510);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496); match(PON_POS);
				setState(497); match(PAR_CUAD_ABIERTO);
				setState(498); ((Definir_coordContext)_localctx).n1 = numero();
				((Definir_coordContext)_localctx).node =  ((Definir_coordContext)_localctx).n1.node;
				setState(500); ((Definir_coordContext)_localctx).n2 = numero();
				((Definir_coordContext)_localctx).node =  new TortugaDefinirCoord(_localctx.node, ((Definir_coordContext)_localctx).n2.node);
				setState(502); match(PAR_CUAD_CERRADO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504); match(PON_POS);
				setState(505); ((Definir_coordContext)_localctx).n1 = numero();
				((Definir_coordContext)_localctx).node =  ((Definir_coordContext)_localctx).n1.node;
				setState(507); ((Definir_coordContext)_localctx).n2 = numero();
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
		enterRule(_localctx, 76, RULE_definir_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512); match(PONX);
			setState(513); ((Definir_xContext)_localctx).numero = numero();
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
		enterRule(_localctx, 78, RULE_definir_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516); match(PONY);
			setState(517); ((Definir_yContext)_localctx).numero = numero();
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
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode PON_RUMBO() { return getToken(LogoTECParser.PON_RUMBO, 0); }
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
		enterRule(_localctx, 80, RULE_definir_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520); match(PON_RUMBO);
			setState(521); ((Definir_dirContext)_localctx).numero = numero();
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
		enterRule(_localctx, 82, RULE_esperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524); match(ESPERA);
			setState(525); ((EsperarContext)_localctx).numero = numero();
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
		enterRule(_localctx, 84, RULE_ocultar_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528); match(OCULTA_TORTUGA);
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
		enterRule(_localctx, 86, RULE_aparecer_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); match(APARECE_TORTUGA);
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
		enterRule(_localctx, 88, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534); match(RUMBO);
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
		enterRule(_localctx, 90, RULE_centrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537); match(CENTRO);
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
		public Borra_pantallaContext borra_pantalla() {
			return getRuleContext(Borra_pantallaContext.class,0);
		}
		public No_dibujarContext no_dibujar() {
			return getRuleContext(No_dibujarContext.class,0);
		}
		public DibujarContext dibujar() {
			return getRuleContext(DibujarContext.class,0);
		}
		public BorrarContext borrar() {
			return getRuleContext(BorrarContext.class,0);
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
		enterRule(_localctx, 92, RULE_ordenes_lienzo);
		try {
			setState(552);
			switch (_input.LA(1)) {
			case BORRADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(540); ((Ordenes_lienzoContext)_localctx).borrar = borrar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).borrar.node;
				}
				break;
			case BAJA_LAPIZ:
				enterOuterAlt(_localctx, 2);
				{
				setState(543); ((Ordenes_lienzoContext)_localctx).dibujar = dibujar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).dibujar.node;
				}
				break;
			case SUBE_LAPIZ:
				enterOuterAlt(_localctx, 3);
				{
				setState(546); ((Ordenes_lienzoContext)_localctx).no_dibujar = no_dibujar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).no_dibujar.node;
				}
				break;
			case BORRA_PANTALLA:
				enterOuterAlt(_localctx, 4);
				{
				setState(549); ((Ordenes_lienzoContext)_localctx).borra_pantalla = borra_pantalla();
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
		enterRule(_localctx, 94, RULE_borrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554); match(BORRADOR);
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
		enterRule(_localctx, 96, RULE_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557); match(BAJA_LAPIZ);
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
		enterRule(_localctx, 98, RULE_no_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560); match(SUBE_LAPIZ);
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
		enterRule(_localctx, 100, RULE_borra_pantalla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); match(BORRA_PANTALLA);
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
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode FALSE() { return getToken(LogoTECParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(LogoTECParser.TRUE, 0); }
		public TerminalNode COMILLA(int i) {
			return getToken(LogoTECParser.COMILLA, i);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public List<TerminalNode> COMILLA() { return getTokens(LogoTECParser.COMILLA); }
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
		enterRule(_localctx, 102, RULE_dato);
		try {
			setState(577);
			switch (_input.LA(1)) {
			case COMILLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(566); match(COMILLA);
				setState(567); ((DatoContext)_localctx).ID = match(ID);
				setState(568); match(COMILLA);
				((DatoContext)_localctx).node =  new Constante((((DatoContext)_localctx).ID!=null?((DatoContext)_localctx).ID.getText():null));
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(570); ((DatoContext)_localctx).TRUE = match(TRUE);
				((DatoContext)_localctx).node =  new Constante(Boolean.parseBoolean((((DatoContext)_localctx).TRUE!=null?((DatoContext)_localctx).TRUE.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(572); ((DatoContext)_localctx).FALSE = match(FALSE);
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
				enterOuterAlt(_localctx, 4);
				{
				setState(574); ((DatoContext)_localctx).numero = numero();
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
		public Ordenes_listasContext ordenes_listas;
		public ReferenciaContext referencia;
		public Operacion_aritmeticaContext operacion_aritmetica;
		public Ordenes_listasContext ordenes_listas() {
			return getRuleContext(Ordenes_listasContext.class,0);
		}
		public Operacion_aritmeticaContext operacion_aritmetica() {
			return getRuleContext(Operacion_aritmeticaContext.class,0);
		}
		public ReferenciaContext referencia() {
			return getRuleContext(ReferenciaContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
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
		enterRule(_localctx, 104, RULE_numero);
		try {
			setState(590);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(579); ((NumeroContext)_localctx).ENTERO = match(ENTERO);
				((NumeroContext)_localctx).node =  new Constante(Integer.parseInt((((NumeroContext)_localctx).ENTERO!=null?((NumeroContext)_localctx).ENTERO.getText():null)));
				}
				break;
			case ELEMENTO_AZAR:
			case LONGITUD:
			case ULTIMO:
			case ELEMENTO_N:
			case PRIMERO_LISTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(581); ((NumeroContext)_localctx).ordenes_listas = ordenes_listas();
				((NumeroContext)_localctx).node =  ((NumeroContext)_localctx).ordenes_listas.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(584); ((NumeroContext)_localctx).referencia = referencia();
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
				enterOuterAlt(_localctx, 4);
				{
				setState(587); ((NumeroContext)_localctx).operacion_aritmetica = operacion_aritmetica();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u0253\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\7\2q\n\2\f\2\16\2t\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3~\n\3\f\3\16\3\u0081\13\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u008d\n\4\f\4\16\4\u0090\13\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a1\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00af\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00c8\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e1\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u011c"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0124\n\23\f\23\16\23\u0127\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u012f\n\24\f\24\16\24\u0132\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u013a\n\25\f\25\16\25\u013d\13"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0158"+
		"\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0171\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u0179\n\35\f\35\16\35\u017c\13\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0188\n\36\f\36\16"+
		"\36\u018b\13\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0196"+
		"\n\37\f\37\16\37\u0199\13\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u01a4"+
		"\n \f \16 \u01a7\13 \3 \3 \3 \3!\3!\3!\3!\3!\3!\7!\u01b2\n!\f!\16!\u01b5"+
		"\13!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01e1\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\5\'\u0201\n\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\5\60\u022b\n\60\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\5\65\u0244\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u0251\n\66\3\66\2\2\67\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\2"+
		"\u0256\2l\3\2\2\2\4w\3\2\2\2\6\u0085\3\2\2\2\b\u00a0\3\2\2\2\n\u00ae\3"+
		"\2\2\2\f\u00b0\3\2\2\2\16\u00b5\3\2\2\2\20\u00c7\3\2\2\2\22\u00c9\3\2"+
		"\2\2\24\u00cc\3\2\2\2\26\u00e0\3\2\2\2\30\u00e2\3\2\2\2\32\u00e8\3\2\2"+
		"\2\34\u00ee\3\2\2\2\36\u00f4\3\2\2\2 \u00fa\3\2\2\2\"\u011b\3\2\2\2$\u011d"+
		"\3\2\2\2&\u0128\3\2\2\2(\u0133\3\2\2\2*\u013e\3\2\2\2,\u0144\3\2\2\2."+
		"\u014a\3\2\2\2\60\u0157\3\2\2\2\62\u0159\3\2\2\2\64\u015d\3\2\2\2\66\u0170"+
		"\3\2\2\28\u0172\3\2\2\2:\u0180\3\2\2\2<\u018f\3\2\2\2>\u019d\3\2\2\2@"+
		"\u01ab\3\2\2\2B\u01e0\3\2\2\2D\u01e2\3\2\2\2F\u01e6\3\2\2\2H\u01ea\3\2"+
		"\2\2J\u01ee\3\2\2\2L\u0200\3\2\2\2N\u0202\3\2\2\2P\u0206\3\2\2\2R\u020a"+
		"\3\2\2\2T\u020e\3\2\2\2V\u0212\3\2\2\2X\u0215\3\2\2\2Z\u0218\3\2\2\2\\"+
		"\u021b\3\2\2\2^\u022a\3\2\2\2`\u022c\3\2\2\2b\u022f\3\2\2\2d\u0232\3\2"+
		"\2\2f\u0235\3\2\2\2h\u0243\3\2\2\2j\u0250\3\2\2\2lr\b\2\1\2mn\5\b\5\2"+
		"no\b\2\1\2oq\3\2\2\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2"+
		"tr\3\2\2\2uv\b\2\1\2v\3\3\2\2\2wx\7 \2\2xy\7C\2\2y\177\b\3\1\2z{\5B\""+
		"\2{|\b\3\1\2|~\3\2\2\2}z\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7D\2\2\u0083"+
		"\u0084\b\3\1\2\u0084\5\3\2\2\2\u0085\u0086\7\37\2\2\u0086\u0087\5j\66"+
		"\2\u0087\u0088\7C\2\2\u0088\u008e\b\4\1\2\u0089\u008a\5B\"\2\u008a\u008b"+
		"\b\4\1\2\u008b\u008d\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0092\7D\2\2\u0092\u0093\b\4\1\2\u0093\7\3\2\2\2\u0094\u0095"+
		"\5B\"\2\u0095\u0096\b\5\1\2\u0096\u00a1\3\2\2\2\u0097\u0098\5\n\6\2\u0098"+
		"\u0099\b\5\1\2\u0099\u00a1\3\2\2\2\u009a\u009b\5\4\3\2\u009b\u009c\b\5"+
		"\1\2\u009c\u00a1\3\2\2\2\u009d\u009e\5\6\4\2\u009e\u009f\b\5\1\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u0094\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u009a\3\2"+
		"\2\2\u00a0\u009d\3\2\2\2\u00a1\t\3\2\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4"+
		"\b\6\1\2\u00a4\u00af\3\2\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7\b\6\1\2"+
		"\u00a7\u00af\3\2\2\2\u00a8\u00a9\5\20\t\2\u00a9\u00aa\b\6\1\2\u00aa\u00af"+
		"\3\2\2\2\u00ab\u00ac\5\22\n\2\u00ac\u00ad\b\6\1\2\u00ad\u00af\3\2\2\2"+
		"\u00ae\u00a2\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00ab"+
		"\3\2\2\2\u00af\13\3\2\2\2\u00b0\u00b1\7\4\2\2\u00b1\u00b2\7H\2\2\u00b2"+
		"\u00b3\5h\65\2\u00b3\u00b4\b\7\1\2\u00b4\r\3\2\2\2\u00b5\u00b6\7\5\2\2"+
		"\u00b6\u00b7\7H\2\2\u00b7\u00b8\7:\2\2\u00b8\u00b9\5h\65\2\u00b9\u00ba"+
		"\b\b\1\2\u00ba\17\3\2\2\2\u00bb\u00bc\7\6\2\2\u00bc\u00bd\7C\2\2\u00bd"+
		"\u00be\7H\2\2\u00be\u00bf\7D\2\2\u00bf\u00c8\b\t\1\2\u00c0\u00c1\7\6\2"+
		"\2\u00c1\u00c2\7C\2\2\u00c2\u00c3\7H\2\2\u00c3\u00c4\5h\65\2\u00c4\u00c5"+
		"\7D\2\2\u00c5\u00c6\b\t\1\2\u00c6\u00c8\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c7"+
		"\u00c0\3\2\2\2\u00c8\21\3\2\2\2\u00c9\u00ca\7H\2\2\u00ca\u00cb\b\n\1\2"+
		"\u00cb\23\3\2\2\2\u00cc\u00cd\7A\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00cf"+
		"\b\13\1\2\u00cf\u00d0\7B\2\2\u00d0\25\3\2\2\2\u00d1\u00d2\5\30\r\2\u00d2"+
		"\u00d3\b\f\1\2\u00d3\u00e1\3\2\2\2\u00d4\u00d5\5\32\16\2\u00d5\u00d6\b"+
		"\f\1\2\u00d6\u00e1\3\2\2\2\u00d7\u00d8\5\34\17\2\u00d8\u00d9\b\f\1\2\u00d9"+
		"\u00e1\3\2\2\2\u00da\u00db\5\36\20\2\u00db\u00dc\b\f\1\2\u00dc\u00e1\3"+
		"\2\2\2\u00dd\u00de\5 \21\2\u00de\u00df\b\f\1\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00d1\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00da\3\2"+
		"\2\2\u00e0\u00dd\3\2\2\2\u00e1\27\3\2\2\2\u00e2\u00e3\7\25\2\2\u00e3\u00e4"+
		"\5h\65\2\u00e4\u00e5\b\r\1\2\u00e5\u00e6\5h\65\2\u00e6\u00e7\b\r\1\2\u00e7"+
		"\31\3\2\2\2\u00e8\u00e9\7\23\2\2\u00e9\u00ea\5\24\13\2\u00ea\u00eb\b\16"+
		"\1\2\u00eb\u00ec\5\24\13\2\u00ec\u00ed\b\16\1\2\u00ed\33\3\2\2\2\u00ee"+
		"\u00ef\7\24\2\2\u00ef\u00f0\5\24\13\2\u00f0\u00f1\b\17\1\2\u00f1\u00f2"+
		"\5\24\13\2\u00f2\u00f3\b\17\1\2\u00f3\35\3\2\2\2\u00f4\u00f5\7\21\2\2"+
		"\u00f5\u00f6\5j\66\2\u00f6\u00f7\b\20\1\2\u00f7\u00f8\5j\66\2\u00f8\u00f9"+
		"\b\20\1\2\u00f9\37\3\2\2\2\u00fa\u00fb\7\22\2\2\u00fb\u00fc\5j\66\2\u00fc"+
		"\u00fd\b\21\1\2\u00fd\u00fe\5j\66\2\u00fe\u00ff\b\21\1\2\u00ff!\3\2\2"+
		"\2\u0100\u0101\5$\23\2\u0101\u0102\b\22\1\2\u0102\u011c\3\2\2\2\u0103"+
		"\u0104\5&\24\2\u0104\u0105\b\22\1\2\u0105\u011c\3\2\2\2\u0106\u0107\5"+
		"(\25\2\u0107\u0108\b\22\1\2\u0108\u011c\3\2\2\2\u0109\u010a\5*\26\2\u010a"+
		"\u010b\b\22\1\2\u010b\u011c\3\2\2\2\u010c\u010d\5,\27\2\u010d\u010e\b"+
		"\22\1\2\u010e\u011c\3\2\2\2\u010f\u0110\5.\30\2\u0110\u0111\b\22\1\2\u0111"+
		"\u011c\3\2\2\2\u0112\u0113\5\60\31\2\u0113\u0114\b\22\1\2\u0114\u011c"+
		"\3\2\2\2\u0115\u0116\5\62\32\2\u0116\u0117\b\22\1\2\u0117\u011c\3\2\2"+
		"\2\u0118\u0119\5\64\33\2\u0119\u011a\b\22\1\2\u011a\u011c\3\2\2\2\u011b"+
		"\u0100\3\2\2\2\u011b\u0103\3\2\2\2\u011b\u0106\3\2\2\2\u011b\u0109\3\2"+
		"\2\2\u011b\u010c\3\2\2\2\u011b\u010f\3\2\2\2\u011b\u0112\3\2\2\2\u011b"+
		"\u0115\3\2\2\2\u011b\u0118\3\2\2\2\u011c#\3\2\2\2\u011d\u011e\7\b\2\2"+
		"\u011e\u011f\5j\66\2\u011f\u0125\b\23\1\2\u0120\u0121\5j\66\2\u0121\u0122"+
		"\b\23\1\2\u0122\u0124\3\2\2\2\u0123\u0120\3\2\2\2\u0124\u0127\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126%\3\2\2\2\u0127\u0125\3"+
		"\2\2\2\u0128\u0129\7\16\2\2\u0129\u012a\5j\66\2\u012a\u0130\b\24\1\2\u012b"+
		"\u012c\5j\66\2\u012c\u012d\b\24\1\2\u012d\u012f\3\2\2\2\u012e\u012b\3"+
		"\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\'\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\f\2\2\u0134\u0135\5j\66\2"+
		"\u0135\u013b\b\25\1\2\u0136\u0137\5j\66\2\u0137\u0138\b\25\1\2\u0138\u013a"+
		"\3\2\2\2\u0139\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c)\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7\13\2\2"+
		"\u013f\u0140\5j\66\2\u0140\u0141\b\26\1\2\u0141\u0142\5j\66\2\u0142\u0143"+
		"\b\26\1\2\u0143+\3\2\2\2\u0144\u0145\7\n\2\2\u0145\u0146\5j\66\2\u0146"+
		"\u0147\b\27\1\2\u0147\u0148\5j\66\2\u0148\u0149\b\27\1\2\u0149-\3\2\2"+
		"\2\u014a\u014b\7\t\2\2\u014b\u014c\5j\66\2\u014c\u014d\b\30\1\2\u014d"+
		"\u014e\5j\66\2\u014e\u014f\b\30\1\2\u014f/\3\2\2\2\u0150\u0151\7\17\2"+
		"\2\u0151\u0152\5j\66\2\u0152\u0153\b\31\1\2\u0153\u0158\3\2\2\2\u0154"+
		"\u0155\7\17\2\2\u0155\u0156\7J\2\2\u0156\u0158\b\31\1\2\u0157\u0150\3"+
		"\2\2\2\u0157\u0154\3\2\2\2\u0158\61\3\2\2\2\u0159\u015a\7\20\2\2\u015a"+
		"\u015b\5j\66\2\u015b\u015c\b\32\1\2\u015c\63\3\2\2\2\u015d\u015e\7\r\2"+
		"\2\u015e\u015f\5j\66\2\u015f\u0160\b\33\1\2\u0160\65\3\2\2\2\u0161\u0162"+
		"\58\35\2\u0162\u0163\b\34\1\2\u0163\u0171\3\2\2\2\u0164\u0165\5:\36\2"+
		"\u0165\u0166\b\34\1\2\u0166\u0171\3\2\2\2\u0167\u0168\5<\37\2\u0168\u0169"+
		"\b\34\1\2\u0169\u0171\3\2\2\2\u016a\u016b\5> \2\u016b\u016c\b\34\1\2\u016c"+
		"\u0171\3\2\2\2\u016d\u016e\5@!\2\u016e\u016f\b\34\1\2\u016f\u0171\3\2"+
		"\2\2\u0170\u0161\3\2\2\2\u0170\u0164\3\2\2\2\u0170\u0167\3\2\2\2\u0170"+
		"\u016a\3\2\2\2\u0170\u016d\3\2\2\2\u0171\67\3\2\2\2\u0172\u0173\7\26\2"+
		"\2\u0173\u0174\7C\2\2\u0174\u017a\b\35\1\2\u0175\u0176\5j\66\2\u0176\u0177"+
		"\b\35\1\2\u0177\u0179\3\2\2\2\u0178\u0175\3\2\2\2\u0179\u017c\3\2\2\2"+
		"\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017d\u017e\b\35\1\2\u017e\u017f\7D\2\2\u017f9\3\2\2\2\u0180"+
		"\u0181\7\31\2\2\u0181\u0182\7I\2\2\u0182\u0183\7C\2\2\u0183\u0189\b\36"+
		"\1\2\u0184\u0185\5j\66\2\u0185\u0186\b\36\1\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0184\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\b\36\1\2\u018d"+
		"\u018e\7D\2\2\u018e;\3\2\2\2\u018f\u0190\7\27\2\2\u0190\u0191\7C\2\2\u0191"+
		"\u0197\b\37\1\2\u0192\u0193\5j\66\2\u0193\u0194\b\37\1\2\u0194\u0196\3"+
		"\2\2\2\u0195\u0192\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\b\37"+
		"\1\2\u019b\u019c\7D\2\2\u019c=\3\2\2\2\u019d\u019e\7\32\2\2\u019e\u019f"+
		"\7C\2\2\u019f\u01a5\b \1\2\u01a0\u01a1\5j\66\2\u01a1\u01a2\b \1\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8"+
		"\u01a9\b \1\2\u01a9\u01aa\7D\2\2\u01aa?\3\2\2\2\u01ab\u01ac\7\30\2\2\u01ac"+
		"\u01ad\7C\2\2\u01ad\u01b3\b!\1\2\u01ae\u01af\5j\66\2\u01af\u01b0\b!\1"+
		"\2\u01b0\u01b2\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01b7\b!\1\2\u01b7\u01b8\7D\2\2\u01b8A\3\2\2\2\u01b9\u01ba\5D#\2\u01ba"+
		"\u01bb\b\"\1\2\u01bb\u01e1\3\2\2\2\u01bc\u01bd\5F$\2\u01bd\u01be\b\"\1"+
		"\2\u01be\u01e1\3\2\2\2\u01bf\u01c0\5H%\2\u01c0\u01c1\b\"\1\2\u01c1\u01e1"+
		"\3\2\2\2\u01c2\u01c3\5J&\2\u01c3\u01c4\b\"\1\2\u01c4\u01e1\3\2\2\2\u01c5"+
		"\u01c6\5V,\2\u01c6\u01c7\b\"\1\2\u01c7\u01e1\3\2\2\2\u01c8\u01c9\5X-\2"+
		"\u01c9\u01ca\b\"\1\2\u01ca\u01e1\3\2\2\2\u01cb\u01cc\5L\'\2\u01cc\u01cd"+
		"\b\"\1\2\u01cd\u01e1\3\2\2\2\u01ce\u01cf\5N(\2\u01cf\u01d0\b\"\1\2\u01d0"+
		"\u01e1\3\2\2\2\u01d1\u01d2\5P)\2\u01d2\u01d3\b\"\1\2\u01d3\u01e1\3\2\2"+
		"\2\u01d4\u01d5\5R*\2\u01d5\u01d6\b\"\1\2\u01d6\u01e1\3\2\2\2\u01d7\u01d8"+
		"\5Z.\2\u01d8\u01d9\b\"\1\2\u01d9\u01e1\3\2\2\2\u01da\u01db\5\\/\2\u01db"+
		"\u01dc\b\"\1\2\u01dc\u01e1\3\2\2\2\u01dd\u01de\5T+\2\u01de\u01df\b\"\1"+
		"\2\u01df\u01e1\3\2\2\2\u01e0\u01b9\3\2\2\2\u01e0\u01bc\3\2\2\2\u01e0\u01bf"+
		"\3\2\2\2\u01e0\u01c2\3\2\2\2\u01e0\u01c5\3\2\2\2\u01e0\u01c8\3\2\2\2\u01e0"+
		"\u01cb\3\2\2\2\u01e0\u01ce\3\2\2\2\u01e0\u01d1\3\2\2\2\u01e0\u01d4\3\2"+
		"\2\2\u01e0\u01d7\3\2\2\2\u01e0\u01da\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e1"+
		"C\3\2\2\2\u01e2\u01e3\7!\2\2\u01e3\u01e4\5j\66\2\u01e4\u01e5\b#\1\2\u01e5"+
		"E\3\2\2\2\u01e6\u01e7\7\"\2\2\u01e7\u01e8\5j\66\2\u01e8\u01e9\b$\1\2\u01e9"+
		"G\3\2\2\2\u01ea\u01eb\7$\2\2\u01eb\u01ec\5j\66\2\u01ec\u01ed\b%\1\2\u01ed"+
		"I\3\2\2\2\u01ee\u01ef\7%\2\2\u01ef\u01f0\5j\66\2\u01f0\u01f1\b&\1\2\u01f1"+
		"K\3\2\2\2\u01f2\u01f3\7)\2\2\u01f3\u01f4\7C\2\2\u01f4\u01f5\5j\66\2\u01f5"+
		"\u01f6\b\'\1\2\u01f6\u01f7\5j\66\2\u01f7\u01f8\b\'\1\2\u01f8\u01f9\7D"+
		"\2\2\u01f9\u0201\3\2\2\2\u01fa\u01fb\7)\2\2\u01fb\u01fc\5j\66\2\u01fc"+
		"\u01fd\b\'\1\2\u01fd\u01fe\5j\66\2\u01fe\u01ff\b\'\1\2\u01ff\u0201\3\2"+
		"\2\2\u0200\u01f2\3\2\2\2\u0200\u01fa\3\2\2\2\u0201M\3\2\2\2\u0202\u0203"+
		"\7*\2\2\u0203\u0204\5j\66\2\u0204\u0205\b(\1\2\u0205O\3\2\2\2\u0206\u0207"+
		"\7+\2\2\u0207\u0208\5j\66\2\u0208\u0209\b)\1\2\u0209Q\3\2\2\2\u020a\u020b"+
		"\7,\2\2\u020b\u020c\5j\66\2\u020c\u020d\b*\1\2\u020dS\3\2\2\2\u020e\u020f"+
		"\7#\2\2\u020f\u0210\5j\66\2\u0210\u0211\b+\1\2\u0211U\3\2\2\2\u0212\u0213"+
		"\7&\2\2\u0213\u0214\b,\1\2\u0214W\3\2\2\2\u0215\u0216\7\'\2\2\u0216\u0217"+
		"\b-\1\2\u0217Y\3\2\2\2\u0218\u0219\7-\2\2\u0219\u021a\b.\1\2\u021a[\3"+
		"\2\2\2\u021b\u021c\7(\2\2\u021c\u021d\b/\1\2\u021d]\3\2\2\2\u021e\u021f"+
		"\5`\61\2\u021f\u0220\b\60\1\2\u0220\u022b\3\2\2\2\u0221\u0222\5b\62\2"+
		"\u0222\u0223\b\60\1\2\u0223\u022b\3\2\2\2\u0224\u0225\5d\63\2\u0225\u0226"+
		"\b\60\1\2\u0226\u022b\3\2\2\2\u0227\u0228\5f\64\2\u0228\u0229\b\60\1\2"+
		"\u0229\u022b\3\2\2\2\u022a\u021e\3\2\2\2\u022a\u0221\3\2\2\2\u022a\u0224"+
		"\3\2\2\2\u022a\u0227\3\2\2\2\u022b_\3\2\2\2\u022c\u022d\7\61\2\2\u022d"+
		"\u022e\b\61\1\2\u022ea\3\2\2\2\u022f\u0230\7\60\2\2\u0230\u0231\b\62\1"+
		"\2\u0231c\3\2\2\2\u0232\u0233\7/\2\2\u0233\u0234\b\63\1\2\u0234e\3\2\2"+
		"\2\u0235\u0236\7\62\2\2\u0236\u0237\b\64\1\2\u0237g\3\2\2\2\u0238\u0239"+
		"\7G\2\2\u0239\u023a\7H\2\2\u023a\u023b\7G\2\2\u023b\u0244\b\65\1\2\u023c"+
		"\u023d\7\63\2\2\u023d\u0244\b\65\1\2\u023e\u023f\7\64\2\2\u023f\u0244"+
		"\b\65\1\2\u0240\u0241\5j\66\2\u0241\u0242\b\65\1\2\u0242\u0244\3\2\2\2"+
		"\u0243\u0238\3\2\2\2\u0243\u023c\3\2\2\2\u0243\u023e\3\2\2\2\u0243\u0240"+
		"\3\2\2\2\u0244i\3\2\2\2\u0245\u0246\7I\2\2\u0246\u0251\b\66\1\2\u0247"+
		"\u0248\5\66\34\2\u0248\u0249\b\66\1\2\u0249\u0251\3\2\2\2\u024a\u024b"+
		"\5\22\n\2\u024b\u024c\b\66\1\2\u024c\u0251\3\2\2\2\u024d\u024e\5\"\22"+
		"\2\u024e\u024f\b\66\1\2\u024f\u0251\3\2\2\2\u0250\u0245\3\2\2\2\u0250"+
		"\u0247\3\2\2\2\u0250\u024a\3\2\2\2\u0250\u024d\3\2\2\2\u0251k\3\2\2\2"+
		"\31r\177\u008e\u00a0\u00ae\u00c7\u00e0\u011b\u0125\u0130\u013b\u0157\u0170"+
		"\u017a\u0189\u0197\u01a5\u01b3\u01e0\u0200\u022a\u0243\u0250";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}