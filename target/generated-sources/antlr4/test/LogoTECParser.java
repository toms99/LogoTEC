// Generated from LogoTEC.g4 by ANTLR 4.4
package test;



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
		RULE_no_dibujar = 49, RULE_definir_color = 50, RULE_borra_pantalla = 51, 
		RULE_dato = 52, RULE_numero = 53;
	public static final String[] ruleNames = {
		"programa", "ejecuta", "repite", "sentencia_logoTEC", "ordenes_variables", 
		"asignacion", "reasignacion", "incrementa", "referencia", "condicion", 
		"ordenes_logicas", "iguales", "and", "or", "mayor", "menor", "operacion_aritmetica", 
		"suma", "diferencia", "producto", "potencia", "division", "residuo", "redondear", 
		"azar", "menos", "ordenes_listas", "elegir", "elemento_n", "largo", "primero", 
		"ultimo", "ordenes_tortuga", "avanzar", "retroceder", "girar_derecha", 
		"girar_izquierda", "definir_coord", "definir_x", "definir_y", "definir_dir", 
		"esperar", "ocultar_tortuga", "aparecer_tortuga", "rumbo", "centrar", 
		"ordenes_lienzo", "borrar", "dibujar", "no_dibujar", "definir_color", 
		"borra_pantalla", "dato", "numero"
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
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

				List<ASTNode> body = new ArrayList<ASTNode>();

			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAZ) | (1L << INIC) | (1L << INC) | (1L << DO_N) | (1L << DO) | (1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO) | (1L << COLOR) | (1L << SUBE_LAPIZ) | (1L << BAJA_LAPIZ) | (1L << BORRADOR) | (1L << BORRA_PANTALLA))) != 0) || _la==ID) {
				{
				{
				setState(109); ((ProgramaContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				body.add(((ProgramaContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(116);
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
	}

	public final EjecutaContext ejecuta() throws RecognitionException {
		EjecutaContext _localctx = new EjecutaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ejecuta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(DO);
			setState(120); match(PAR_CUAD_ABIERTO);

									List<ASTNode> body = new ArrayList<ASTNode>();
									
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO) | (1L << COLOR) | (1L << SUBE_LAPIZ) | (1L << BAJA_LAPIZ) | (1L << BORRADOR) | (1L << BORRA_PANTALLA))) != 0)) {
				{
				{
				setState(122); ((EjecutaContext)_localctx).ordenes_tortuga = ordenes_tortuga();
				body.add(((EjecutaContext)_localctx).ordenes_tortuga.node);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130); match(PAR_CUAD_CERRADO);
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
	}

	public final RepiteContext repite() throws RecognitionException {
		RepiteContext _localctx = new RepiteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_repite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(DO_N);
			setState(134); ((RepiteContext)_localctx).numero = numero();
			setState(135); match(PAR_CUAD_ABIERTO);

									List<ASTNode> body = new ArrayList<ASTNode>();
									
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO) | (1L << COLOR) | (1L << SUBE_LAPIZ) | (1L << BAJA_LAPIZ) | (1L << BORRADOR) | (1L << BORRA_PANTALLA))) != 0)) {
				{
				{
				setState(137); ((RepiteContext)_localctx).ordenes_tortuga = ordenes_tortuga();
				body.add(((RepiteContext)_localctx).ordenes_tortuga.node);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145); match(PAR_CUAD_CERRADO);
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
	}

	public final Sentencia_logoTECContext sentencia_logoTEC() throws RecognitionException {
		Sentencia_logoTECContext _localctx = new Sentencia_logoTECContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia_logoTEC);
		try {
			setState(160);
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
			case COLOR:
			case SUBE_LAPIZ:
			case BAJA_LAPIZ:
			case BORRADOR:
			case BORRA_PANTALLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(148); ((Sentencia_logoTECContext)_localctx).ordenes_tortuga = ordenes_tortuga();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ordenes_tortuga.node;
				}
				break;
			case HAZ:
			case INIC:
			case INC:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); ((Sentencia_logoTECContext)_localctx).ordenes_variables = ordenes_variables();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ordenes_variables.node;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(154); ((Sentencia_logoTECContext)_localctx).ejecuta = ejecuta();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ejecuta.node;
				}
				break;
			case DO_N:
				enterOuterAlt(_localctx, 4);
				{
				setState(157); ((Sentencia_logoTECContext)_localctx).repite = repite();
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
	}

	public final Ordenes_variablesContext ordenes_variables() throws RecognitionException {
		Ordenes_variablesContext _localctx = new Ordenes_variablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ordenes_variables);
		try {
			setState(174);
			switch (_input.LA(1)) {
			case HAZ:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); ((Ordenes_variablesContext)_localctx).asignacion = asignacion();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).asignacion.node;
				}
				break;
			case INIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(165); ((Ordenes_variablesContext)_localctx).reasignacion = reasignacion();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).reasignacion.node;
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 3);
				{
				setState(168); ((Ordenes_variablesContext)_localctx).incrementa = incrementa();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).incrementa.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(171); ((Ordenes_variablesContext)_localctx).referencia = referencia();
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
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(HAZ);
			setState(177); ((AsignacionContext)_localctx).ID = match(ID);
			setState(178); ((AsignacionContext)_localctx).dato = dato();
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
	}

	public final ReasignacionContext reasignacion() throws RecognitionException {
		ReasignacionContext _localctx = new ReasignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_reasignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(INIC);
			setState(182); ((ReasignacionContext)_localctx).ID = match(ID);
			setState(183); match(ASIGNAR);
			setState(184); ((ReasignacionContext)_localctx).dato = dato();
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
	}

	public final IncrementaContext incrementa() throws RecognitionException {
		IncrementaContext _localctx = new IncrementaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_incrementa);
		try {
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); match(INC);
				setState(188); match(PAR_CUAD_ABIERTO);
				setState(189); ((IncrementaContext)_localctx).ID = match(ID);
				setState(190); match(PAR_CUAD_CERRADO);
				((IncrementaContext)_localctx).node =   new IncrementaUno((((IncrementaContext)_localctx).ID!=null?((IncrementaContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); match(INC);
				setState(193); match(PAR_CUAD_ABIERTO);
				setState(194); ((IncrementaContext)_localctx).ID = match(ID);
				setState(195); ((IncrementaContext)_localctx).dato = dato();
				setState(196); match(PAR_CUAD_CERRADO);
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
	}

	public final ReferenciaContext referencia() throws RecognitionException {
		ReferenciaContext _localctx = new ReferenciaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_referencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); ((ReferenciaContext)_localctx).ID = match(ID);
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
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(PAR_ABIERTO);
			setState(205); ((CondicionContext)_localctx).ordenes_logicas = ordenes_logicas();
			((CondicionContext)_localctx).node =  ((CondicionContext)_localctx).ordenes_logicas.node;
			setState(207); match(PAR_CERRADO);
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
	}

	public final Ordenes_logicasContext ordenes_logicas() throws RecognitionException {
		Ordenes_logicasContext _localctx = new Ordenes_logicasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ordenes_logicas);
		try {
			setState(224);
			switch (_input.LA(1)) {
			case IGUALES:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); ((Ordenes_logicasContext)_localctx).iguales = iguales();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).iguales.node;
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); ((Ordenes_logicasContext)_localctx).and = and();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).and.node;
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(215); ((Ordenes_logicasContext)_localctx).or = or();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).or.node;
				}
				break;
			case MAYOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(218); ((Ordenes_logicasContext)_localctx).mayor = mayor();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).mayor.node;
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(221); ((Ordenes_logicasContext)_localctx).menor = menor();
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
	}

	public final IgualesContext iguales() throws RecognitionException {
		IgualesContext _localctx = new IgualesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_iguales);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(IGUALES);
			setState(227); ((IgualesContext)_localctx).d1 = ((IgualesContext)_localctx).dato = dato();
			((IgualesContext)_localctx).node =  ((IgualesContext)_localctx).dato.node;
			setState(229); ((IgualesContext)_localctx).d2 = ((IgualesContext)_localctx).dato = dato();
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
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); match(AND);
			setState(233); ((AndContext)_localctx).c1 = ((AndContext)_localctx).condicion = condicion();
			((AndContext)_localctx).node =  ((AndContext)_localctx).condicion.node;
			setState(235); ((AndContext)_localctx).c2 = ((AndContext)_localctx).condicion = condicion();
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
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(OR);
			setState(239); ((OrContext)_localctx).c1 = ((OrContext)_localctx).condicion = condicion();
			((OrContext)_localctx).node =  ((OrContext)_localctx).condicion.node;
			setState(241); ((OrContext)_localctx).c2 = ((OrContext)_localctx).condicion = condicion();
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
	}

	public final MayorContext mayor() throws RecognitionException {
		MayorContext _localctx = new MayorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(MAYOR);
			setState(245); ((MayorContext)_localctx).n1 = ((MayorContext)_localctx).numero = numero();
			((MayorContext)_localctx).node =  ((MayorContext)_localctx).numero.node;
			setState(247); ((MayorContext)_localctx).n2 = ((MayorContext)_localctx).numero = numero();
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
	}

	public final MenorContext menor() throws RecognitionException {
		MenorContext _localctx = new MenorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(MENOR);
			setState(251); ((MenorContext)_localctx).n1 = ((MenorContext)_localctx).numero = numero();
			((MenorContext)_localctx).node =  ((MenorContext)_localctx).numero.node;
			setState(253); ((MenorContext)_localctx).n2 = ((MenorContext)_localctx).numero = numero();
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
	}

	public final Operacion_aritmeticaContext operacion_aritmetica() throws RecognitionException {
		Operacion_aritmeticaContext _localctx = new Operacion_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operacion_aritmetica);
		try {
			setState(283);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(256); ((Operacion_aritmeticaContext)_localctx).suma = suma();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).suma.node;
				}
				break;
			case DIFERENCIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); ((Operacion_aritmeticaContext)_localctx).diferencia = diferencia();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).diferencia.node;
				}
				break;
			case PRODUCTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(262); ((Operacion_aritmeticaContext)_localctx).producto = producto();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).producto.node;
				}
				break;
			case POTENCIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(265); ((Operacion_aritmeticaContext)_localctx).potencia = potencia();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).potencia.node;
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 5);
				{
				setState(268); ((Operacion_aritmeticaContext)_localctx).division = division();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).division.node;
				}
				break;
			case RESIDUO:
				enterOuterAlt(_localctx, 6);
				{
				setState(271); ((Operacion_aritmeticaContext)_localctx).residuo = residuo();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).residuo.node;
				}
				break;
			case REDONDEO:
				enterOuterAlt(_localctx, 7);
				{
				setState(274); ((Operacion_aritmeticaContext)_localctx).redondear = redondear();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).redondear.node;
				}
				break;
			case AZAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(277); ((Operacion_aritmeticaContext)_localctx).azar = azar();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).azar.node;
				}
				break;
			case NEGATIVO:
				enterOuterAlt(_localctx, 9);
				{
				setState(280); ((Operacion_aritmeticaContext)_localctx).menos = menos();
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
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_suma);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(SUMA);
			setState(286); ((SumaContext)_localctx).n1 = numero();
			((SumaContext)_localctx).node =  ((SumaContext)_localctx).n1.node;
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288); ((SumaContext)_localctx).n2 = numero();
					((SumaContext)_localctx).node =  new Suma(_localctx.node, ((SumaContext)_localctx).n2.node);
					}
					} 
				}
				setState(295);
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
	}

	public final DiferenciaContext diferencia() throws RecognitionException {
		DiferenciaContext _localctx = new DiferenciaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_diferencia);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(DIFERENCIA);
			setState(297); ((DiferenciaContext)_localctx).n1 = numero();
			((DiferenciaContext)_localctx).node =  ((DiferenciaContext)_localctx).n1.node;
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(299); ((DiferenciaContext)_localctx).n2 = numero();
					((DiferenciaContext)_localctx).node =  new Diferencia(_localctx.node, ((DiferenciaContext)_localctx).n2.node);
					}
					} 
				}
				setState(306);
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
	}

	public final ProductoContext producto() throws RecognitionException {
		ProductoContext _localctx = new ProductoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_producto);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(PRODUCTO);
			setState(308); ((ProductoContext)_localctx).n1 = numero();
			((ProductoContext)_localctx).node =  ((ProductoContext)_localctx).n1.node;
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310); ((ProductoContext)_localctx).n2 = numero();
					((ProductoContext)_localctx).node =  new Producto(_localctx.node, ((ProductoContext)_localctx).n2.node);
					}
					} 
				}
				setState(317);
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
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); match(POTENCIA);
			setState(319); ((PotenciaContext)_localctx).n1 = numero();
			((PotenciaContext)_localctx).node =  ((PotenciaContext)_localctx).n1.node;
			{
			setState(321); ((PotenciaContext)_localctx).n2 = numero();
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
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(DIVISION);
			setState(325); ((DivisionContext)_localctx).n1 = numero();
			((DivisionContext)_localctx).node =  ((DivisionContext)_localctx).n1.node;
			{
			setState(327); ((DivisionContext)_localctx).n2 = numero();
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
	}

	public final ResiduoContext residuo() throws RecognitionException {
		ResiduoContext _localctx = new ResiduoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_residuo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(RESIDUO);
			setState(331); ((ResiduoContext)_localctx).n1 = numero();
			((ResiduoContext)_localctx).node =  ((ResiduoContext)_localctx).n1.node;
			{
			setState(333); ((ResiduoContext)_localctx).n2 = numero();
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
	}

	public final RedondearContext redondear() throws RecognitionException {
		RedondearContext _localctx = new RedondearContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_redondear);
		try {
			setState(343);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336); match(REDONDEO);
				setState(337); ((RedondearContext)_localctx).numero = numero();
				((RedondearContext)_localctx).node =  new Redondear(((RedondearContext)_localctx).numero.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340); match(REDONDEO);
				setState(341); ((RedondearContext)_localctx).FLOAT = match(FLOAT);
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
	}

	public final AzarContext azar() throws RecognitionException {
		AzarContext _localctx = new AzarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); match(AZAR);
			setState(346); ((AzarContext)_localctx).numero = numero();
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
	}

	public final MenosContext menos() throws RecognitionException {
		MenosContext _localctx = new MenosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); match(NEGATIVO);
			setState(350); ((MenosContext)_localctx).numero = numero();
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
	}

	public final Ordenes_listasContext ordenes_listas() throws RecognitionException {
		Ordenes_listasContext _localctx = new Ordenes_listasContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ordenes_listas);
		try {
			setState(368);
			switch (_input.LA(1)) {
			case ELEMENTO_AZAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(353); ((Ordenes_listasContext)_localctx).elegir = elegir();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).elegir.node;
				}
				break;
			case ELEMENTO_N:
				enterOuterAlt(_localctx, 2);
				{
				setState(356); ((Ordenes_listasContext)_localctx).elemento_n = elemento_n();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).elemento_n.node;
				}
				break;
			case LONGITUD:
				enterOuterAlt(_localctx, 3);
				{
				setState(359); ((Ordenes_listasContext)_localctx).largo = largo();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).largo.node;
				}
				break;
			case PRIMERO_LISTA:
				enterOuterAlt(_localctx, 4);
				{
				setState(362); ((Ordenes_listasContext)_localctx).primero = primero();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).primero.node;
				}
				break;
			case ULTIMO:
				enterOuterAlt(_localctx, 5);
				{
				setState(365); ((Ordenes_listasContext)_localctx).ultimo = ultimo();
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
	}

	public final ElegirContext elegir() throws RecognitionException {
		ElegirContext _localctx = new ElegirContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elegir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(ELEMENTO_AZAR);
			setState(371); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(373); ((ElegirContext)_localctx).numero = numero();
				body.add(((ElegirContext)_localctx).numero.node);
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	Random rand = new Random(); 
				   							((ElegirContext)_localctx).node =  body.get(rand.nextInt(body.size()));
										   
			setState(382); match(PAR_CUAD_CERRADO);
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
	}

	public final Elemento_nContext elemento_n() throws RecognitionException {
		Elemento_nContext _localctx = new Elemento_nContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elemento_n);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); ((Elemento_nContext)_localctx).ELEMENTO_N = match(ELEMENTO_N);
			setState(385); match(ENTERO);
			setState(386); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(388); ((Elemento_nContext)_localctx).numero = numero();
				body.add(((Elemento_nContext)_localctx).numero.node);
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((Elemento_nContext)_localctx).node =  body.get(Integer.parseInt((((Elemento_nContext)_localctx).ELEMENTO_N!=null?((Elemento_nContext)_localctx).ELEMENTO_N.getText():null)));
										   
			setState(397); match(PAR_CUAD_CERRADO);
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
	}

	public final LargoContext largo() throws RecognitionException {
		LargoContext _localctx = new LargoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_largo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); match(LONGITUD);
			setState(400); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(402); ((LargoContext)_localctx).numero = numero();
				body.add(((LargoContext)_localctx).numero.node);
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((LargoContext)_localctx).node =  new Constante(body.size());
										   
			setState(411); match(PAR_CUAD_CERRADO);
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
	}

	public final PrimeroContext primero() throws RecognitionException {
		PrimeroContext _localctx = new PrimeroContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); match(PRIMERO_LISTA);
			setState(414); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(416); ((PrimeroContext)_localctx).numero = numero();
				body.add(((PrimeroContext)_localctx).numero.node);
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((PrimeroContext)_localctx).node =  body.get(0);
										   
			setState(425); match(PAR_CUAD_CERRADO);
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
	}

	public final UltimoContext ultimo() throws RecognitionException {
		UltimoContext _localctx = new UltimoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ultimo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); match(ULTIMO);
			setState(428); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(430); ((UltimoContext)_localctx).numero = numero();
				body.add(((UltimoContext)_localctx).numero.node);
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((UltimoContext)_localctx).node =  body.get(body.size()-1);
										   
			setState(439); match(PAR_CUAD_CERRADO);
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
		public Ordenes_lienzoContext ordenes_lienzo;
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
		public Ordenes_lienzoContext ordenes_lienzo() {
			return getRuleContext(Ordenes_lienzoContext.class,0);
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
	}

	public final Ordenes_tortugaContext ordenes_tortuga() throws RecognitionException {
		Ordenes_tortugaContext _localctx = new Ordenes_tortugaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ordenes_tortuga);
		try {
			setState(483);
			switch (_input.LA(1)) {
			case AVANZA:
				enterOuterAlt(_localctx, 1);
				{
				setState(441); ((Ordenes_tortugaContext)_localctx).avanzar = avanzar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).avanzar.node;
				}
				break;
			case RETROCEDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(444); ((Ordenes_tortugaContext)_localctx).retroceder = retroceder();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).retroceder.node;
				}
				break;
			case GIRA_DERECHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(447); ((Ordenes_tortugaContext)_localctx).girar_derecha = girar_derecha();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).girar_derecha.node;
				}
				break;
			case GIRA_IZQUIERDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(450); ((Ordenes_tortugaContext)_localctx).girar_izquierda = girar_izquierda();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).girar_izquierda.node;
				}
				break;
			case OCULTA_TORTUGA:
				enterOuterAlt(_localctx, 5);
				{
				setState(453); ((Ordenes_tortugaContext)_localctx).ocultar_tortuga = ocultar_tortuga();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).ocultar_tortuga.node;
				}
				break;
			case APARECE_TORTUGA:
				enterOuterAlt(_localctx, 6);
				{
				setState(456); ((Ordenes_tortugaContext)_localctx).aparecer_tortuga = aparecer_tortuga();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).aparecer_tortuga.node;
				}
				break;
			case PON_POS:
				enterOuterAlt(_localctx, 7);
				{
				setState(459); ((Ordenes_tortugaContext)_localctx).definir_coord = definir_coord();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_coord.node;
				}
				break;
			case PONX:
				enterOuterAlt(_localctx, 8);
				{
				setState(462); ((Ordenes_tortugaContext)_localctx).definir_x = definir_x();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_x.node;
				}
				break;
			case PONY:
				enterOuterAlt(_localctx, 9);
				{
				setState(465); ((Ordenes_tortugaContext)_localctx).definir_y = definir_y();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_y.node;
				}
				break;
			case PON_RUMBO:
				enterOuterAlt(_localctx, 10);
				{
				setState(468); ((Ordenes_tortugaContext)_localctx).definir_dir = definir_dir();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_dir.node;
				}
				break;
			case RUMBO:
				enterOuterAlt(_localctx, 11);
				{
				setState(471); ((Ordenes_tortugaContext)_localctx).rumbo = rumbo();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).rumbo.node;
				}
				break;
			case CENTRO:
				enterOuterAlt(_localctx, 12);
				{
				setState(474); ((Ordenes_tortugaContext)_localctx).centrar = centrar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).centrar.node;
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 13);
				{
				setState(477); ((Ordenes_tortugaContext)_localctx).esperar = esperar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).esperar.node;
				}
				break;
			case COLOR:
			case SUBE_LAPIZ:
			case BAJA_LAPIZ:
			case BORRADOR:
			case BORRA_PANTALLA:
				enterOuterAlt(_localctx, 14);
				{
				setState(480); ((Ordenes_tortugaContext)_localctx).ordenes_lienzo = ordenes_lienzo();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).ordenes_lienzo.node;
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
	}

	public final AvanzarContext avanzar() throws RecognitionException {
		AvanzarContext _localctx = new AvanzarContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_avanzar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485); match(AVANZA);
			setState(486); ((AvanzarContext)_localctx).numero = numero();
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
	}

	public final RetrocederContext retroceder() throws RecognitionException {
		RetrocederContext _localctx = new RetrocederContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_retroceder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489); match(RETROCEDE);
			setState(490); ((RetrocederContext)_localctx).numero = numero();
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
	}

	public final Girar_derechaContext girar_derecha() throws RecognitionException {
		Girar_derechaContext _localctx = new Girar_derechaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_girar_derecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); match(GIRA_DERECHA);
			setState(494); ((Girar_derechaContext)_localctx).numero = numero();
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
	}

	public final Girar_izquierdaContext girar_izquierda() throws RecognitionException {
		Girar_izquierdaContext _localctx = new Girar_izquierdaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_girar_izquierda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); match(GIRA_IZQUIERDA);
			setState(498); ((Girar_izquierdaContext)_localctx).numero = numero();
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
	}

	public final Definir_coordContext definir_coord() throws RecognitionException {
		Definir_coordContext _localctx = new Definir_coordContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_definir_coord);
		try {
			setState(515);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501); match(PON_POS);
				setState(502); match(PAR_CUAD_ABIERTO);
				setState(503); ((Definir_coordContext)_localctx).n1 = numero();
				((Definir_coordContext)_localctx).node =  ((Definir_coordContext)_localctx).n1.node;
				setState(505); ((Definir_coordContext)_localctx).n2 = numero();
				((Definir_coordContext)_localctx).node =  new TortugaDefinirCoord(_localctx.node, ((Definir_coordContext)_localctx).n2.node);
				setState(507); match(PAR_CUAD_CERRADO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509); match(PON_POS);
				setState(510); ((Definir_coordContext)_localctx).n1 = numero();
				((Definir_coordContext)_localctx).node =  ((Definir_coordContext)_localctx).n1.node;
				setState(512); ((Definir_coordContext)_localctx).n2 = numero();
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
	}

	public final Definir_xContext definir_x() throws RecognitionException {
		Definir_xContext _localctx = new Definir_xContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_definir_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); match(PONX);
			setState(518); ((Definir_xContext)_localctx).numero = numero();
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
	}

	public final Definir_yContext definir_y() throws RecognitionException {
		Definir_yContext _localctx = new Definir_yContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_definir_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); match(PONY);
			setState(522); ((Definir_yContext)_localctx).numero = numero();
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
	}

	public final Definir_dirContext definir_dir() throws RecognitionException {
		Definir_dirContext _localctx = new Definir_dirContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_definir_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525); match(PON_RUMBO);
			setState(526); ((Definir_dirContext)_localctx).numero = numero();
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
	}

	public final EsperarContext esperar() throws RecognitionException {
		EsperarContext _localctx = new EsperarContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_esperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); match(ESPERA);
			setState(530); ((EsperarContext)_localctx).numero = numero();
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
	}

	public final Ocultar_tortugaContext ocultar_tortuga() throws RecognitionException {
		Ocultar_tortugaContext _localctx = new Ocultar_tortugaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ocultar_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); match(OCULTA_TORTUGA);
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
	}

	public final Aparecer_tortugaContext aparecer_tortuga() throws RecognitionException {
		Aparecer_tortugaContext _localctx = new Aparecer_tortugaContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_aparecer_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536); match(APARECE_TORTUGA);
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
	}

	public final RumboContext rumbo() throws RecognitionException {
		RumboContext _localctx = new RumboContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539); match(RUMBO);
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
	}

	public final CentrarContext centrar() throws RecognitionException {
		CentrarContext _localctx = new CentrarContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_centrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542); match(CENTRO);
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
		public Definir_colorContext definir_color;
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
		public Definir_colorContext definir_color() {
			return getRuleContext(Definir_colorContext.class,0);
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
	}

	public final Ordenes_lienzoContext ordenes_lienzo() throws RecognitionException {
		Ordenes_lienzoContext _localctx = new Ordenes_lienzoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ordenes_lienzo);
		try {
			setState(560);
			switch (_input.LA(1)) {
			case BORRADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(545); ((Ordenes_lienzoContext)_localctx).borrar = borrar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).borrar.node;
				}
				break;
			case BAJA_LAPIZ:
				enterOuterAlt(_localctx, 2);
				{
				setState(548); ((Ordenes_lienzoContext)_localctx).dibujar = dibujar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).dibujar.node;
				}
				break;
			case SUBE_LAPIZ:
				enterOuterAlt(_localctx, 3);
				{
				setState(551); ((Ordenes_lienzoContext)_localctx).no_dibujar = no_dibujar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).no_dibujar.node;
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(554); ((Ordenes_lienzoContext)_localctx).definir_color = definir_color();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).definir_color.node;
				}
				break;
			case BORRA_PANTALLA:
				enterOuterAlt(_localctx, 5);
				{
				setState(557); ((Ordenes_lienzoContext)_localctx).borra_pantalla = borra_pantalla();
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
	}

	public final BorrarContext borrar() throws RecognitionException {
		BorrarContext _localctx = new BorrarContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_borrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562); match(BORRADOR);
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
	}

	public final DibujarContext dibujar() throws RecognitionException {
		DibujarContext _localctx = new DibujarContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); match(BAJA_LAPIZ);
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
	}

	public final No_dibujarContext no_dibujar() throws RecognitionException {
		No_dibujarContext _localctx = new No_dibujarContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_no_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); match(SUBE_LAPIZ);
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

	public static class Definir_colorContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode COLOR() { return getToken(LogoTECParser.COLOR, 0); }
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public Definir_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterDefinir_color(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitDefinir_color(this);
		}
	}

	public final Definir_colorContext definir_color() throws RecognitionException {
		Definir_colorContext _localctx = new Definir_colorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_definir_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); match(COLOR);
			setState(572); ((Definir_colorContext)_localctx).ID = match(ID);
			((Definir_colorContext)_localctx).node =  new TortugaColor((((Definir_colorContext)_localctx).ID!=null?((Definir_colorContext)_localctx).ID.getText():null));
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
	}

	public final Borra_pantallaContext borra_pantalla() throws RecognitionException {
		Borra_pantallaContext _localctx = new Borra_pantallaContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_borra_pantalla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575); match(BORRA_PANTALLA);
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
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_dato);
		try {
			setState(589);
			switch (_input.LA(1)) {
			case COMILLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(578); match(COMILLA);
				setState(579); ((DatoContext)_localctx).ID = match(ID);
				setState(580); match(COMILLA);
				((DatoContext)_localctx).node =  new Constante((((DatoContext)_localctx).ID!=null?((DatoContext)_localctx).ID.getText():null));
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(582); ((DatoContext)_localctx).TRUE = match(TRUE);
				((DatoContext)_localctx).node =  new Constante(Boolean.parseBoolean((((DatoContext)_localctx).TRUE!=null?((DatoContext)_localctx).TRUE.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(584); ((DatoContext)_localctx).FALSE = match(FALSE);
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
				setState(586); ((DatoContext)_localctx).numero = numero();
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
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_numero);
		try {
			setState(602);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(591); ((NumeroContext)_localctx).ENTERO = match(ENTERO);
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
				setState(593); ((NumeroContext)_localctx).ordenes_listas = ordenes_listas();
				((NumeroContext)_localctx).node =  ((NumeroContext)_localctx).ordenes_listas.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(596); ((NumeroContext)_localctx).referencia = referencia();
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
				setState(599); ((NumeroContext)_localctx).operacion_aritmetica = operacion_aritmetica();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u025f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\7\2s\n\2\f\2\16\2v\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083\13\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u008f\n\4\f\4\16\4\u0092\13"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a3"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b1\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00ca\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e3"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u011e\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0126\n\23\f\23"+
		"\16\23\u0129\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0131\n\24\f\24"+
		"\16\24\u0134\13\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u013c\n\25\f\25"+
		"\16\25\u013f\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u015a\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0173\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u017b\n\35\f\35\16\35\u017e"+
		"\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u018a\n"+
		"\36\f\36\16\36\u018d\13\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u0198\n\37\f\37\16\37\u019b\13\37\3\37\3\37\3\37\3 \3 \3 \3 \3 "+
		"\3 \7 \u01a6\n \f \16 \u01a9\13 \3 \3 \3 \3!\3!\3!\3!\3!\3!\7!\u01b4\n"+
		"!\f!\16!\u01b7\13!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01e6\n\""+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0206\n\'\3(\3(\3(\3(\3)\3)\3)"+
		"\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u0233\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u0250\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u025d\n\67\3\67\2\28\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\2\u0263\2n\3"+
		"\2\2\2\4y\3\2\2\2\6\u0087\3\2\2\2\b\u00a2\3\2\2\2\n\u00b0\3\2\2\2\f\u00b2"+
		"\3\2\2\2\16\u00b7\3\2\2\2\20\u00c9\3\2\2\2\22\u00cb\3\2\2\2\24\u00ce\3"+
		"\2\2\2\26\u00e2\3\2\2\2\30\u00e4\3\2\2\2\32\u00ea\3\2\2\2\34\u00f0\3\2"+
		"\2\2\36\u00f6\3\2\2\2 \u00fc\3\2\2\2\"\u011d\3\2\2\2$\u011f\3\2\2\2&\u012a"+
		"\3\2\2\2(\u0135\3\2\2\2*\u0140\3\2\2\2,\u0146\3\2\2\2.\u014c\3\2\2\2\60"+
		"\u0159\3\2\2\2\62\u015b\3\2\2\2\64\u015f\3\2\2\2\66\u0172\3\2\2\28\u0174"+
		"\3\2\2\2:\u0182\3\2\2\2<\u0191\3\2\2\2>\u019f\3\2\2\2@\u01ad\3\2\2\2B"+
		"\u01e5\3\2\2\2D\u01e7\3\2\2\2F\u01eb\3\2\2\2H\u01ef\3\2\2\2J\u01f3\3\2"+
		"\2\2L\u0205\3\2\2\2N\u0207\3\2\2\2P\u020b\3\2\2\2R\u020f\3\2\2\2T\u0213"+
		"\3\2\2\2V\u0217\3\2\2\2X\u021a\3\2\2\2Z\u021d\3\2\2\2\\\u0220\3\2\2\2"+
		"^\u0232\3\2\2\2`\u0234\3\2\2\2b\u0237\3\2\2\2d\u023a\3\2\2\2f\u023d\3"+
		"\2\2\2h\u0241\3\2\2\2j\u024f\3\2\2\2l\u025c\3\2\2\2nt\b\2\1\2op\5\b\5"+
		"\2pq\b\2\1\2qs\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2"+
		"\2vt\3\2\2\2wx\b\2\1\2x\3\3\2\2\2yz\7 \2\2z{\7C\2\2{\u0081\b\3\1\2|}\5"+
		"B\"\2}~\b\3\1\2~\u0080\3\2\2\2\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0084\u0085\7D\2\2\u0085\u0086\b\3\1\2\u0086\5\3\2\2\2\u0087\u0088"+
		"\7\37\2\2\u0088\u0089\5l\67\2\u0089\u008a\7C\2\2\u008a\u0090\b\4\1\2\u008b"+
		"\u008c\5B\"\2\u008c\u008d\b\4\1\2\u008d\u008f\3\2\2\2\u008e\u008b\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7D\2\2\u0094\u0095\b\4"+
		"\1\2\u0095\7\3\2\2\2\u0096\u0097\5B\"\2\u0097\u0098\b\5\1\2\u0098\u00a3"+
		"\3\2\2\2\u0099\u009a\5\n\6\2\u009a\u009b\b\5\1\2\u009b\u00a3\3\2\2\2\u009c"+
		"\u009d\5\4\3\2\u009d\u009e\b\5\1\2\u009e\u00a3\3\2\2\2\u009f\u00a0\5\6"+
		"\4\2\u00a0\u00a1\b\5\1\2\u00a1\u00a3\3\2\2\2\u00a2\u0096\3\2\2\2\u00a2"+
		"\u0099\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3\t\3\2\2\2"+
		"\u00a4\u00a5\5\f\7\2\u00a5\u00a6\b\6\1\2\u00a6\u00b1\3\2\2\2\u00a7\u00a8"+
		"\5\16\b\2\u00a8\u00a9\b\6\1\2\u00a9\u00b1\3\2\2\2\u00aa\u00ab\5\20\t\2"+
		"\u00ab\u00ac\b\6\1\2\u00ac\u00b1\3\2\2\2\u00ad\u00ae\5\22\n\2\u00ae\u00af"+
		"\b\6\1\2\u00af\u00b1\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b0\u00a7\3\2\2\2\u00b0"+
		"\u00aa\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\13\3\2\2\2\u00b2\u00b3\7\4\2"+
		"\2\u00b3\u00b4\7H\2\2\u00b4\u00b5\5j\66\2\u00b5\u00b6\b\7\1\2\u00b6\r"+
		"\3\2\2\2\u00b7\u00b8\7\5\2\2\u00b8\u00b9\7H\2\2\u00b9\u00ba\7:\2\2\u00ba"+
		"\u00bb\5j\66\2\u00bb\u00bc\b\b\1\2\u00bc\17\3\2\2\2\u00bd\u00be\7\6\2"+
		"\2\u00be\u00bf\7C\2\2\u00bf\u00c0\7H\2\2\u00c0\u00c1\7D\2\2\u00c1\u00ca"+
		"\b\t\1\2\u00c2\u00c3\7\6\2\2\u00c3\u00c4\7C\2\2\u00c4\u00c5\7H\2\2\u00c5"+
		"\u00c6\5j\66\2\u00c6\u00c7\7D\2\2\u00c7\u00c8\b\t\1\2\u00c8\u00ca\3\2"+
		"\2\2\u00c9\u00bd\3\2\2\2\u00c9\u00c2\3\2\2\2\u00ca\21\3\2\2\2\u00cb\u00cc"+
		"\7H\2\2\u00cc\u00cd\b\n\1\2\u00cd\23\3\2\2\2\u00ce\u00cf\7A\2\2\u00cf"+
		"\u00d0\5\26\f\2\u00d0\u00d1\b\13\1\2\u00d1\u00d2\7B\2\2\u00d2\25\3\2\2"+
		"\2\u00d3\u00d4\5\30\r\2\u00d4\u00d5\b\f\1\2\u00d5\u00e3\3\2\2\2\u00d6"+
		"\u00d7\5\32\16\2\u00d7\u00d8\b\f\1\2\u00d8\u00e3\3\2\2\2\u00d9\u00da\5"+
		"\34\17\2\u00da\u00db\b\f\1\2\u00db\u00e3\3\2\2\2\u00dc\u00dd\5\36\20\2"+
		"\u00dd\u00de\b\f\1\2\u00de\u00e3\3\2\2\2\u00df\u00e0\5 \21\2\u00e0\u00e1"+
		"\b\f\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00d3\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2"+
		"\u00d9\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\27\3\2\2"+
		"\2\u00e4\u00e5\7\25\2\2\u00e5\u00e6\5j\66\2\u00e6\u00e7\b\r\1\2\u00e7"+
		"\u00e8\5j\66\2\u00e8\u00e9\b\r\1\2\u00e9\31\3\2\2\2\u00ea\u00eb\7\23\2"+
		"\2\u00eb\u00ec\5\24\13\2\u00ec\u00ed\b\16\1\2\u00ed\u00ee\5\24\13\2\u00ee"+
		"\u00ef\b\16\1\2\u00ef\33\3\2\2\2\u00f0\u00f1\7\24\2\2\u00f1\u00f2\5\24"+
		"\13\2\u00f2\u00f3\b\17\1\2\u00f3\u00f4\5\24\13\2\u00f4\u00f5\b\17\1\2"+
		"\u00f5\35\3\2\2\2\u00f6\u00f7\7\21\2\2\u00f7\u00f8\5l\67\2\u00f8\u00f9"+
		"\b\20\1\2\u00f9\u00fa\5l\67\2\u00fa\u00fb\b\20\1\2\u00fb\37\3\2\2\2\u00fc"+
		"\u00fd\7\22\2\2\u00fd\u00fe\5l\67\2\u00fe\u00ff\b\21\1\2\u00ff\u0100\5"+
		"l\67\2\u0100\u0101\b\21\1\2\u0101!\3\2\2\2\u0102\u0103\5$\23\2\u0103\u0104"+
		"\b\22\1\2\u0104\u011e\3\2\2\2\u0105\u0106\5&\24\2\u0106\u0107\b\22\1\2"+
		"\u0107\u011e\3\2\2\2\u0108\u0109\5(\25\2\u0109\u010a\b\22\1\2\u010a\u011e"+
		"\3\2\2\2\u010b\u010c\5*\26\2\u010c\u010d\b\22\1\2\u010d\u011e\3\2\2\2"+
		"\u010e\u010f\5,\27\2\u010f\u0110\b\22\1\2\u0110\u011e\3\2\2\2\u0111\u0112"+
		"\5.\30\2\u0112\u0113\b\22\1\2\u0113\u011e\3\2\2\2\u0114\u0115\5\60\31"+
		"\2\u0115\u0116\b\22\1\2\u0116\u011e\3\2\2\2\u0117\u0118\5\62\32\2\u0118"+
		"\u0119\b\22\1\2\u0119\u011e\3\2\2\2\u011a\u011b\5\64\33\2\u011b\u011c"+
		"\b\22\1\2\u011c\u011e\3\2\2\2\u011d\u0102\3\2\2\2\u011d\u0105\3\2\2\2"+
		"\u011d\u0108\3\2\2\2\u011d\u010b\3\2\2\2\u011d\u010e\3\2\2\2\u011d\u0111"+
		"\3\2\2\2\u011d\u0114\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u011a\3\2\2\2\u011e"+
		"#\3\2\2\2\u011f\u0120\7\b\2\2\u0120\u0121\5l\67\2\u0121\u0127\b\23\1\2"+
		"\u0122\u0123\5l\67\2\u0123\u0124\b\23\1\2\u0124\u0126\3\2\2\2\u0125\u0122"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"%\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\16\2\2\u012b\u012c\5l\67\2"+
		"\u012c\u0132\b\24\1\2\u012d\u012e\5l\67\2\u012e\u012f\b\24\1\2\u012f\u0131"+
		"\3\2\2\2\u0130\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\'\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7\f\2\2"+
		"\u0136\u0137\5l\67\2\u0137\u013d\b\25\1\2\u0138\u0139\5l\67\2\u0139\u013a"+
		"\b\25\1\2\u013a\u013c\3\2\2\2\u013b\u0138\3\2\2\2\u013c\u013f\3\2\2\2"+
		"\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e)\3\2\2\2\u013f\u013d\3"+
		"\2\2\2\u0140\u0141\7\13\2\2\u0141\u0142\5l\67\2\u0142\u0143\b\26\1\2\u0143"+
		"\u0144\5l\67\2\u0144\u0145\b\26\1\2\u0145+\3\2\2\2\u0146\u0147\7\n\2\2"+
		"\u0147\u0148\5l\67\2\u0148\u0149\b\27\1\2\u0149\u014a\5l\67\2\u014a\u014b"+
		"\b\27\1\2\u014b-\3\2\2\2\u014c\u014d\7\t\2\2\u014d\u014e\5l\67\2\u014e"+
		"\u014f\b\30\1\2\u014f\u0150\5l\67\2\u0150\u0151\b\30\1\2\u0151/\3\2\2"+
		"\2\u0152\u0153\7\17\2\2\u0153\u0154\5l\67\2\u0154\u0155\b\31\1\2\u0155"+
		"\u015a\3\2\2\2\u0156\u0157\7\17\2\2\u0157\u0158\7J\2\2\u0158\u015a\b\31"+
		"\1\2\u0159\u0152\3\2\2\2\u0159\u0156\3\2\2\2\u015a\61\3\2\2\2\u015b\u015c"+
		"\7\20\2\2\u015c\u015d\5l\67\2\u015d\u015e\b\32\1\2\u015e\63\3\2\2\2\u015f"+
		"\u0160\7\r\2\2\u0160\u0161\5l\67\2\u0161\u0162\b\33\1\2\u0162\65\3\2\2"+
		"\2\u0163\u0164\58\35\2\u0164\u0165\b\34\1\2\u0165\u0173\3\2\2\2\u0166"+
		"\u0167\5:\36\2\u0167\u0168\b\34\1\2\u0168\u0173\3\2\2\2\u0169\u016a\5"+
		"<\37\2\u016a\u016b\b\34\1\2\u016b\u0173\3\2\2\2\u016c\u016d\5> \2\u016d"+
		"\u016e\b\34\1\2\u016e\u0173\3\2\2\2\u016f\u0170\5@!\2\u0170\u0171\b\34"+
		"\1\2\u0171\u0173\3\2\2\2\u0172\u0163\3\2\2\2\u0172\u0166\3\2\2\2\u0172"+
		"\u0169\3\2\2\2\u0172\u016c\3\2\2\2\u0172\u016f\3\2\2\2\u0173\67\3\2\2"+
		"\2\u0174\u0175\7\26\2\2\u0175\u0176\7C\2\2\u0176\u017c\b\35\1\2\u0177"+
		"\u0178\5l\67\2\u0178\u0179\b\35\1\2\u0179\u017b\3\2\2\2\u017a\u0177\3"+
		"\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\b\35\1\2\u0180\u0181\7"+
		"D\2\2\u01819\3\2\2\2\u0182\u0183\7\31\2\2\u0183\u0184\7I\2\2\u0184\u0185"+
		"\7C\2\2\u0185\u018b\b\36\1\2\u0186\u0187\5l\67\2\u0187\u0188\b\36\1\2"+
		"\u0188\u018a\3\2\2\2\u0189\u0186\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u018f\b\36\1\2\u018f\u0190\7D\2\2\u0190;\3\2\2\2\u0191\u0192\7\27\2\2"+
		"\u0192\u0193\7C\2\2\u0193\u0199\b\37\1\2\u0194\u0195\5l\67\2\u0195\u0196"+
		"\b\37\1\2\u0196\u0198\3\2\2\2\u0197\u0194\3\2\2\2\u0198\u019b\3\2\2\2"+
		"\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019c\u019d\b\37\1\2\u019d\u019e\7D\2\2\u019e=\3\2\2\2\u019f"+
		"\u01a0\7\32\2\2\u01a0\u01a1\7C\2\2\u01a1\u01a7\b \1\2\u01a2\u01a3\5l\67"+
		"\2\u01a3\u01a4\b \1\2\u01a4\u01a6\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a6\u01a9"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\u01ab\b \1\2\u01ab\u01ac\7D\2\2\u01ac?\3\2\2\2\u01ad"+
		"\u01ae\7\30\2\2\u01ae\u01af\7C\2\2\u01af\u01b5\b!\1\2\u01b0\u01b1\5l\67"+
		"\2\u01b1\u01b2\b!\1\2\u01b2\u01b4\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b4\u01b7"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01b9\b!\1\2\u01b9\u01ba\7D\2\2\u01baA\3\2\2\2\u01bb"+
		"\u01bc\5D#\2\u01bc\u01bd\b\"\1\2\u01bd\u01e6\3\2\2\2\u01be\u01bf\5F$\2"+
		"\u01bf\u01c0\b\"\1\2\u01c0\u01e6\3\2\2\2\u01c1\u01c2\5H%\2\u01c2\u01c3"+
		"\b\"\1\2\u01c3\u01e6\3\2\2\2\u01c4\u01c5\5J&\2\u01c5\u01c6\b\"\1\2\u01c6"+
		"\u01e6\3\2\2\2\u01c7\u01c8\5V,\2\u01c8\u01c9\b\"\1\2\u01c9\u01e6\3\2\2"+
		"\2\u01ca\u01cb\5X-\2\u01cb\u01cc\b\"\1\2\u01cc\u01e6\3\2\2\2\u01cd\u01ce"+
		"\5L\'\2\u01ce\u01cf\b\"\1\2\u01cf\u01e6\3\2\2\2\u01d0\u01d1\5N(\2\u01d1"+
		"\u01d2\b\"\1\2\u01d2\u01e6\3\2\2\2\u01d3\u01d4\5P)\2\u01d4\u01d5\b\"\1"+
		"\2\u01d5\u01e6\3\2\2\2\u01d6\u01d7\5R*\2\u01d7\u01d8\b\"\1\2\u01d8\u01e6"+
		"\3\2\2\2\u01d9\u01da\5Z.\2\u01da\u01db\b\"\1\2\u01db\u01e6\3\2\2\2\u01dc"+
		"\u01dd\5\\/\2\u01dd\u01de\b\"\1\2\u01de\u01e6\3\2\2\2\u01df\u01e0\5T+"+
		"\2\u01e0\u01e1\b\"\1\2\u01e1\u01e6\3\2\2\2\u01e2\u01e3\5^\60\2\u01e3\u01e4"+
		"\b\"\1\2\u01e4\u01e6\3\2\2\2\u01e5\u01bb\3\2\2\2\u01e5\u01be\3\2\2\2\u01e5"+
		"\u01c1\3\2\2\2\u01e5\u01c4\3\2\2\2\u01e5\u01c7\3\2\2\2\u01e5\u01ca\3\2"+
		"\2\2\u01e5\u01cd\3\2\2\2\u01e5\u01d0\3\2\2\2\u01e5\u01d3\3\2\2\2\u01e5"+
		"\u01d6\3\2\2\2\u01e5\u01d9\3\2\2\2\u01e5\u01dc\3\2\2\2\u01e5\u01df\3\2"+
		"\2\2\u01e5\u01e2\3\2\2\2\u01e6C\3\2\2\2\u01e7\u01e8\7!\2\2\u01e8\u01e9"+
		"\5l\67\2\u01e9\u01ea\b#\1\2\u01eaE\3\2\2\2\u01eb\u01ec\7\"\2\2\u01ec\u01ed"+
		"\5l\67\2\u01ed\u01ee\b$\1\2\u01eeG\3\2\2\2\u01ef\u01f0\7$\2\2\u01f0\u01f1"+
		"\5l\67\2\u01f1\u01f2\b%\1\2\u01f2I\3\2\2\2\u01f3\u01f4\7%\2\2\u01f4\u01f5"+
		"\5l\67\2\u01f5\u01f6\b&\1\2\u01f6K\3\2\2\2\u01f7\u01f8\7)\2\2\u01f8\u01f9"+
		"\7C\2\2\u01f9\u01fa\5l\67\2\u01fa\u01fb\b\'\1\2\u01fb\u01fc\5l\67\2\u01fc"+
		"\u01fd\b\'\1\2\u01fd\u01fe\7D\2\2\u01fe\u0206\3\2\2\2\u01ff\u0200\7)\2"+
		"\2\u0200\u0201\5l\67\2\u0201\u0202\b\'\1\2\u0202\u0203\5l\67\2\u0203\u0204"+
		"\b\'\1\2\u0204\u0206\3\2\2\2\u0205\u01f7\3\2\2\2\u0205\u01ff\3\2\2\2\u0206"+
		"M\3\2\2\2\u0207\u0208\7*\2\2\u0208\u0209\5l\67\2\u0209\u020a\b(\1\2\u020a"+
		"O\3\2\2\2\u020b\u020c\7+\2\2\u020c\u020d\5l\67\2\u020d\u020e\b)\1\2\u020e"+
		"Q\3\2\2\2\u020f\u0210\7,\2\2\u0210\u0211\5l\67\2\u0211\u0212\b*\1\2\u0212"+
		"S\3\2\2\2\u0213\u0214\7#\2\2\u0214\u0215\5l\67\2\u0215\u0216\b+\1\2\u0216"+
		"U\3\2\2\2\u0217\u0218\7&\2\2\u0218\u0219\b,\1\2\u0219W\3\2\2\2\u021a\u021b"+
		"\7\'\2\2\u021b\u021c\b-\1\2\u021cY\3\2\2\2\u021d\u021e\7-\2\2\u021e\u021f"+
		"\b.\1\2\u021f[\3\2\2\2\u0220\u0221\7(\2\2\u0221\u0222\b/\1\2\u0222]\3"+
		"\2\2\2\u0223\u0224\5`\61\2\u0224\u0225\b\60\1\2\u0225\u0233\3\2\2\2\u0226"+
		"\u0227\5b\62\2\u0227\u0228\b\60\1\2\u0228\u0233\3\2\2\2\u0229\u022a\5"+
		"d\63\2\u022a\u022b\b\60\1\2\u022b\u0233\3\2\2\2\u022c\u022d\5f\64\2\u022d"+
		"\u022e\b\60\1\2\u022e\u0233\3\2\2\2\u022f\u0230\5h\65\2\u0230\u0231\b"+
		"\60\1\2\u0231\u0233\3\2\2\2\u0232\u0223\3\2\2\2\u0232\u0226\3\2\2\2\u0232"+
		"\u0229\3\2\2\2\u0232\u022c\3\2\2\2\u0232\u022f\3\2\2\2\u0233_\3\2\2\2"+
		"\u0234\u0235\7\61\2\2\u0235\u0236\b\61\1\2\u0236a\3\2\2\2\u0237\u0238"+
		"\7\60\2\2\u0238\u0239\b\62\1\2\u0239c\3\2\2\2\u023a\u023b\7/\2\2\u023b"+
		"\u023c\b\63\1\2\u023ce\3\2\2\2\u023d\u023e\7.\2\2\u023e\u023f\7H\2\2\u023f"+
		"\u0240\b\64\1\2\u0240g\3\2\2\2\u0241\u0242\7\62\2\2\u0242\u0243\b\65\1"+
		"\2\u0243i\3\2\2\2\u0244\u0245\7G\2\2\u0245\u0246\7H\2\2\u0246\u0247\7"+
		"G\2\2\u0247\u0250\b\66\1\2\u0248\u0249\7\63\2\2\u0249\u0250\b\66\1\2\u024a"+
		"\u024b\7\64\2\2\u024b\u0250\b\66\1\2\u024c\u024d\5l\67\2\u024d\u024e\b"+
		"\66\1\2\u024e\u0250\3\2\2\2\u024f\u0244\3\2\2\2\u024f\u0248\3\2\2\2\u024f"+
		"\u024a\3\2\2\2\u024f\u024c\3\2\2\2\u0250k\3\2\2\2\u0251\u0252\7I\2\2\u0252"+
		"\u025d\b\67\1\2\u0253\u0254\5\66\34\2\u0254\u0255\b\67\1\2\u0255\u025d"+
		"\3\2\2\2\u0256\u0257\5\22\n\2\u0257\u0258\b\67\1\2\u0258\u025d\3\2\2\2"+
		"\u0259\u025a\5\"\22\2\u025a\u025b\b\67\1\2\u025b\u025d\3\2\2\2\u025c\u0251"+
		"\3\2\2\2\u025c\u0253\3\2\2\2\u025c\u0256\3\2\2\2\u025c\u0259\3\2\2\2\u025d"+
		"m\3\2\2\2\31t\u0081\u0090\u00a2\u00b0\u00c9\u00e2\u011d\u0127\u0132\u013d"+
		"\u0159\u0172\u017c\u018b\u0199\u01a7\u01b5\u01e5\u0205\u0232\u024f\u025c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}