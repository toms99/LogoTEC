// Generated from LogoTEC.g4 by ANTLR 4.4
package TEC.Proyecto_LogoTEC;

	import java.util.Map;
	import java.util.HashMap;

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
	public static final String[] tokenNames = {
		"<INVALID>", "'Programa'", "'Haz'", "'INIC'", "'INC'", "'Suma'", "'Resto'", 
		"'Division'", "'Potencia'", "'Producto'", "'Menos'", "'Diferencia'", "'Redondea'", 
		"'Azar'", "MAYOR", "MENOR", "'Y'", "'O'", "IGUALES", "'Elegir'", "'Cuenta'", 
		"ULTIMO", "'Elemento'", "PRIMERO_LISTA", "WHILE", "DO_WHILE", "'SISINO'", 
		"'SI'", "'REPITE'", "'Ejecuta'", "AVANZA", "RETROCEDE", "ESPERA", "GIRA_DERECHA", 
		"GIRA_IZQUIERDA", "OCULTA_TORTUGA", "APARECE_TORTUGA", "CENTRO", "PON_POS", 
		"'PonX'", "'PonY'", "'PonRumbo'", "'Muestra RUMBO'", "COLOR", "SUBE_LAPIZ", 
		"BAJA_LAPIZ", "BORRADOR", "'borrapantalla'", "'TRUE'", "'FALSE'", "'+'", 
		"'-'", "'*'", "'/'", "'>'", "'<'", "'='", "'!'", "'>='", "'<='", "'!='", 
		"'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "':'", "'\"'", "ID", 
		"ENTERO", "ESPACIO_BLANCO"
	};
	public static final int
		RULE_programa = 0, RULE_ejecuta = 1, RULE_repite = 2, RULE_si = 3, RULE_sisino = 4, 
		RULE_do_while = 5, RULE_mientras = 6, RULE_sentencia_logoTEC = 7, RULE_sentencia_general = 8, 
		RULE_ordenes_variables = 9, RULE_asignacion = 10, RULE_reasignacion = 11, 
		RULE_incrementa = 12, RULE_condicion = 13, RULE_ordenes_logicas = 14, 
		RULE_iguales = 15, RULE_and = 16, RULE_or = 17, RULE_mayor = 18, RULE_menor = 19, 
		RULE_operacion_aritmetica = 20, RULE_suma = 21, RULE_diferencia = 22, 
		RULE_producto = 23, RULE_potencia = 24, RULE_division = 25, RULE_residuo = 26, 
		RULE_redondear = 27, RULE_azar = 28, RULE_menos = 29, RULE_ordenes_listas = 30, 
		RULE_elegir = 31, RULE_elemento_n = 32, RULE_largo = 33, RULE_primero = 34, 
		RULE_ultimo = 35, RULE_ordenes_tortuga = 36, RULE_avanzar = 37, RULE_retroceder = 38, 
		RULE_girar_derecha = 39, RULE_girar_izquierda = 40, RULE_ocultar_tortuga = 41, 
		RULE_aparecer_tortuga = 42, RULE_definir_coord = 43, RULE_definir_x = 44, 
		RULE_definir_y = 45, RULE_definir_dir = 46, RULE_rumbo = 47, RULE_centrar = 48, 
		RULE_esperar = 49, RULE_ordenes_lienzo = 50, RULE_borrar = 51, RULE_dibujar = 52, 
		RULE_no_dibujar = 53, RULE_definir_color = 54, RULE_borra_pantalla = 55, 
		RULE_dato = 56, RULE_numero = 57;
	public static final String[] ruleNames = {
		"programa", "ejecuta", "repite", "si", "sisino", "do_while", "mientras", 
		"sentencia_logoTEC", "sentencia_general", "ordenes_variables", "asignacion", 
		"reasignacion", "incrementa", "condicion", "ordenes_logicas", "iguales", 
		"and", "or", "mayor", "menor", "operacion_aritmetica", "suma", "diferencia", 
		"producto", "potencia", "division", "residuo", "redondear", "azar", "menos", 
		"ordenes_listas", "elegir", "elemento_n", "largo", "primero", "ultimo", 
		"ordenes_tortuga", "avanzar", "retroceder", "girar_derecha", "girar_izquierda", 
		"ocultar_tortuga", "aparecer_tortuga", "definir_coord", "definir_x", "definir_y", 
		"definir_dir", "rumbo", "centrar", "esperar", "ordenes_lienzo", "borrar", 
		"dibujar", "no_dibujar", "definir_color", "borra_pantalla", "dato", "numero"
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

	public LogoTECParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
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
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (HAZ - 2)) | (1L << (INIC - 2)) | (1L << (INC - 2)) | (1L << (SUMA - 2)) | (1L << (RESIDUO - 2)) | (1L << (DIVISION - 2)) | (1L << (POTENCIA - 2)) | (1L << (PRODUCTO - 2)) | (1L << (DIFERENCIA - 2)) | (1L << (REDONDEO - 2)) | (1L << (AZAR - 2)) | (1L << (MAYOR - 2)) | (1L << (MENOR - 2)) | (1L << (AND - 2)) | (1L << (OR - 2)) | (1L << (IGUALES - 2)) | (1L << (ELEMENTO_AZAR - 2)) | (1L << (LONGITUD - 2)) | (1L << (ULTIMO - 2)) | (1L << (ELEMENTO_N - 2)) | (1L << (PRIMERO_LISTA - 2)) | (1L << (DO_WHILE - 2)) | (1L << (IF_ELSE - 2)) | (1L << (IF - 2)) | (1L << (DO_N - 2)) | (1L << (DO - 2)) | (1L << (AVANZA - 2)) | (1L << (RETROCEDE - 2)) | (1L << (ESPERA - 2)) | (1L << (GIRA_DERECHA - 2)) | (1L << (GIRA_IZQUIERDA - 2)) | (1L << (OCULTA_TORTUGA - 2)) | (1L << (APARECE_TORTUGA - 2)) | (1L << (CENTRO - 2)) | (1L << (PON_POS - 2)) | (1L << (PONX - 2)) | (1L << (PONY - 2)) | (1L << (PON_RUMBO - 2)) | (1L << (RUMBO - 2)) | (1L << (COLOR - 2)) | (1L << (SUBE_LAPIZ - 2)) | (1L << (BAJA_LAPIZ - 2)) | (1L << (BORRADOR - 2)) | (1L << (BORRA_PANTALLA - 2)) | (1L << (MENOS - 2)) | (1L << (PAR_CUAD_ABIERTO - 2)))) != 0)) {
				{
				{
				setState(116); sentencia_logoTEC();
				}
				}
				setState(121);
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

	public static class EjecutaContext extends ParserRuleContext {
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
			setState(122); match(DO);
			setState(123); match(PAR_CUAD_ABIERTO);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0)) {
				{
				{
				setState(124); ordenes_tortuga();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130); match(PAR_CUAD_CERRADO);
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
		public TerminalNode DO_N() { return getToken(LogoTECParser.DO_N, 0); }
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
			setState(132); match(DO_N);
			setState(133); match(PAR_CUAD_ABIERTO);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0)) {
				{
				{
				setState(134); ordenes_tortuga();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140); match(PAR_CUAD_CERRADO);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LogoTECParser.IF, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public List<Ordenes_tortugaContext> ordenes_tortuga() {
			return getRuleContexts(Ordenes_tortugaContext.class);
		}
		public Ordenes_tortugaContext ordenes_tortuga(int i) {
			return getRuleContext(Ordenes_tortugaContext.class,i);
		}
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(IF);
			setState(143); condicion();
			setState(144); match(PAR_CUAD_ABIERTO);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0)) {
				{
				{
				setState(145); ordenes_tortuga();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151); match(PAR_CUAD_CERRADO);
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

	public static class SisinoContext extends ParserRuleContext {
		public TerminalNode PAR_CUAD_CERRADO(int i) {
			return getToken(LogoTECParser.PAR_CUAD_CERRADO, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<TerminalNode> PAR_CUAD_ABIERTO() { return getTokens(LogoTECParser.PAR_CUAD_ABIERTO); }
		public List<Ordenes_tortugaContext> ordenes_tortuga() {
			return getRuleContexts(Ordenes_tortugaContext.class);
		}
		public Ordenes_tortugaContext ordenes_tortuga(int i) {
			return getRuleContext(Ordenes_tortugaContext.class,i);
		}
		public TerminalNode IF_ELSE() { return getToken(LogoTECParser.IF_ELSE, 0); }
		public TerminalNode PAR_CUAD_ABIERTO(int i) {
			return getToken(LogoTECParser.PAR_CUAD_ABIERTO, i);
		}
		public List<TerminalNode> PAR_CUAD_CERRADO() { return getTokens(LogoTECParser.PAR_CUAD_CERRADO); }
		public SisinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sisino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterSisino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitSisino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitSisino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SisinoContext sisino() throws RecognitionException {
		SisinoContext _localctx = new SisinoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sisino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(IF_ELSE);
			setState(154); condicion();
			setState(155); match(PAR_CUAD_ABIERTO);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0)) {
				{
				{
				setState(156); ordenes_tortuga();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162); match(PAR_CUAD_CERRADO);
			setState(163); match(PAR_CUAD_ABIERTO);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0)) {
				{
				{
				setState(164); ordenes_tortuga();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170); match(PAR_CUAD_CERRADO);
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

	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode PAR_CUAD_CERRADO(int i) {
			return getToken(LogoTECParser.PAR_CUAD_CERRADO, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<TerminalNode> PAR_CUAD_ABIERTO() { return getTokens(LogoTECParser.PAR_CUAD_ABIERTO); }
		public Sentencia_logoTECContext sentencia_logoTEC(int i) {
			return getRuleContext(Sentencia_logoTECContext.class,i);
		}
		public List<Sentencia_logoTECContext> sentencia_logoTEC() {
			return getRuleContexts(Sentencia_logoTECContext.class);
		}
		public TerminalNode DO_WHILE() { return getToken(LogoTECParser.DO_WHILE, 0); }
		public TerminalNode PAR_CUAD_ABIERTO(int i) {
			return getToken(LogoTECParser.PAR_CUAD_ABIERTO, i);
		}
		public List<TerminalNode> PAR_CUAD_CERRADO() { return getTokens(LogoTECParser.PAR_CUAD_CERRADO); }
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(DO_WHILE);
			setState(173); match(PAR_CUAD_ABIERTO);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (HAZ - 2)) | (1L << (INIC - 2)) | (1L << (INC - 2)) | (1L << (SUMA - 2)) | (1L << (RESIDUO - 2)) | (1L << (DIVISION - 2)) | (1L << (POTENCIA - 2)) | (1L << (PRODUCTO - 2)) | (1L << (DIFERENCIA - 2)) | (1L << (REDONDEO - 2)) | (1L << (AZAR - 2)) | (1L << (MAYOR - 2)) | (1L << (MENOR - 2)) | (1L << (AND - 2)) | (1L << (OR - 2)) | (1L << (IGUALES - 2)) | (1L << (ELEMENTO_AZAR - 2)) | (1L << (LONGITUD - 2)) | (1L << (ULTIMO - 2)) | (1L << (ELEMENTO_N - 2)) | (1L << (PRIMERO_LISTA - 2)) | (1L << (DO_WHILE - 2)) | (1L << (IF_ELSE - 2)) | (1L << (IF - 2)) | (1L << (DO_N - 2)) | (1L << (DO - 2)) | (1L << (AVANZA - 2)) | (1L << (RETROCEDE - 2)) | (1L << (ESPERA - 2)) | (1L << (GIRA_DERECHA - 2)) | (1L << (GIRA_IZQUIERDA - 2)) | (1L << (OCULTA_TORTUGA - 2)) | (1L << (APARECE_TORTUGA - 2)) | (1L << (CENTRO - 2)) | (1L << (PON_POS - 2)) | (1L << (PONX - 2)) | (1L << (PONY - 2)) | (1L << (PON_RUMBO - 2)) | (1L << (RUMBO - 2)) | (1L << (COLOR - 2)) | (1L << (SUBE_LAPIZ - 2)) | (1L << (BAJA_LAPIZ - 2)) | (1L << (BORRADOR - 2)) | (1L << (BORRA_PANTALLA - 2)) | (1L << (MENOS - 2)) | (1L << (PAR_CUAD_ABIERTO - 2)))) != 0)) {
				{
				{
				setState(174); sentencia_logoTEC();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180); match(PAR_CUAD_CERRADO);
			setState(181); match(PAR_CUAD_ABIERTO);
			setState(182); condicion();
			setState(183); match(PAR_CUAD_CERRADO);
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode PAR_CUAD_CERRADO(int i) {
			return getToken(LogoTECParser.PAR_CUAD_CERRADO, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<TerminalNode> PAR_CUAD_ABIERTO() { return getTokens(LogoTECParser.PAR_CUAD_ABIERTO); }
		public Sentencia_logoTECContext sentencia_logoTEC(int i) {
			return getRuleContext(Sentencia_logoTECContext.class,i);
		}
		public List<Sentencia_logoTECContext> sentencia_logoTEC() {
			return getRuleContexts(Sentencia_logoTECContext.class);
		}
		public TerminalNode PAR_CUAD_ABIERTO(int i) {
			return getToken(LogoTECParser.PAR_CUAD_ABIERTO, i);
		}
		public List<TerminalNode> PAR_CUAD_CERRADO() { return getTokens(LogoTECParser.PAR_CUAD_CERRADO); }
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(PAR_CUAD_ABIERTO);
			setState(186); condicion();
			setState(187); match(PAR_CUAD_CERRADO);
			setState(188); match(PAR_CUAD_ABIERTO);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (HAZ - 2)) | (1L << (INIC - 2)) | (1L << (INC - 2)) | (1L << (SUMA - 2)) | (1L << (RESIDUO - 2)) | (1L << (DIVISION - 2)) | (1L << (POTENCIA - 2)) | (1L << (PRODUCTO - 2)) | (1L << (DIFERENCIA - 2)) | (1L << (REDONDEO - 2)) | (1L << (AZAR - 2)) | (1L << (MAYOR - 2)) | (1L << (MENOR - 2)) | (1L << (AND - 2)) | (1L << (OR - 2)) | (1L << (IGUALES - 2)) | (1L << (ELEMENTO_AZAR - 2)) | (1L << (LONGITUD - 2)) | (1L << (ULTIMO - 2)) | (1L << (ELEMENTO_N - 2)) | (1L << (PRIMERO_LISTA - 2)) | (1L << (DO_WHILE - 2)) | (1L << (IF_ELSE - 2)) | (1L << (IF - 2)) | (1L << (DO_N - 2)) | (1L << (DO - 2)) | (1L << (AVANZA - 2)) | (1L << (RETROCEDE - 2)) | (1L << (ESPERA - 2)) | (1L << (GIRA_DERECHA - 2)) | (1L << (GIRA_IZQUIERDA - 2)) | (1L << (OCULTA_TORTUGA - 2)) | (1L << (APARECE_TORTUGA - 2)) | (1L << (CENTRO - 2)) | (1L << (PON_POS - 2)) | (1L << (PONX - 2)) | (1L << (PONY - 2)) | (1L << (PON_RUMBO - 2)) | (1L << (RUMBO - 2)) | (1L << (COLOR - 2)) | (1L << (SUBE_LAPIZ - 2)) | (1L << (BAJA_LAPIZ - 2)) | (1L << (BORRADOR - 2)) | (1L << (BORRA_PANTALLA - 2)) | (1L << (MENOS - 2)) | (1L << (PAR_CUAD_ABIERTO - 2)))) != 0)) {
				{
				{
				setState(189); sentencia_logoTEC();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195); match(PAR_CUAD_CERRADO);
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
		public Sentencia_generalContext sentencia_general() {
			return getRuleContext(Sentencia_generalContext.class,0);
		}
		public SisinoContext sisino() {
			return getRuleContext(SisinoContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public RepiteContext repite() {
			return getRuleContext(RepiteContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
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
		enterRule(_localctx, 14, RULE_sentencia_logoTEC);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case DO:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); ejecuta();
				}
				break;
			case DO_N:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); repite();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(199); si();
				}
				break;
			case IF_ELSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(200); sisino();
				}
				break;
			case HAZ:
			case INIC:
			case INC:
			case SUMA:
			case RESIDUO:
			case DIVISION:
			case POTENCIA:
			case PRODUCTO:
			case DIFERENCIA:
			case REDONDEO:
			case AZAR:
			case MAYOR:
			case MENOR:
			case AND:
			case OR:
			case IGUALES:
			case ELEMENTO_AZAR:
			case LONGITUD:
			case ULTIMO:
			case ELEMENTO_N:
			case PRIMERO_LISTA:
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
			case MENOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(201); sentencia_general();
				}
				break;
			case DO_WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(202); do_while();
				}
				break;
			case PAR_CUAD_ABIERTO:
				enterOuterAlt(_localctx, 7);
				{
				setState(203); mientras();
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

	public static class Sentencia_generalContext extends ParserRuleContext {
		public Ordenes_lienzoContext ordenes_lienzo() {
			return getRuleContext(Ordenes_lienzoContext.class,0);
		}
		public Ordenes_variablesContext ordenes_variables() {
			return getRuleContext(Ordenes_variablesContext.class,0);
		}
		public Ordenes_logicasContext ordenes_logicas() {
			return getRuleContext(Ordenes_logicasContext.class,0);
		}
		public Ordenes_listasContext ordenes_listas() {
			return getRuleContext(Ordenes_listasContext.class,0);
		}
		public Ordenes_tortugaContext ordenes_tortuga() {
			return getRuleContext(Ordenes_tortugaContext.class,0);
		}
		public Operacion_aritmeticaContext operacion_aritmetica() {
			return getRuleContext(Operacion_aritmeticaContext.class,0);
		}
		public Sentencia_generalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_general; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterSentencia_general(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitSentencia_general(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitSentencia_general(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_generalContext sentencia_general() throws RecognitionException {
		Sentencia_generalContext _localctx = new Sentencia_generalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentencia_general);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case HAZ:
			case INIC:
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(206); ordenes_variables();
				}
				break;
			case MAYOR:
			case MENOR:
			case AND:
			case OR:
			case IGUALES:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); ordenes_logicas();
				}
				break;
			case COLOR:
			case SUBE_LAPIZ:
			case BAJA_LAPIZ:
			case BORRADOR:
			case BORRA_PANTALLA:
				enterOuterAlt(_localctx, 3);
				{
				setState(208); ordenes_lienzo();
				}
				break;
			case SUMA:
			case RESIDUO:
			case DIVISION:
			case POTENCIA:
			case PRODUCTO:
			case DIFERENCIA:
			case REDONDEO:
			case AZAR:
			case MENOS:
				enterOuterAlt(_localctx, 4);
				{
				setState(209); operacion_aritmetica();
				}
				break;
			case ELEMENTO_AZAR:
			case LONGITUD:
			case ULTIMO:
			case ELEMENTO_N:
			case PRIMERO_LISTA:
				enterOuterAlt(_localctx, 5);
				{
				setState(210); ordenes_listas();
				}
				break;
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
				enterOuterAlt(_localctx, 6);
				{
				setState(211); ordenes_tortuga();
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
		public IncrementaContext incrementa() {
			return getRuleContext(IncrementaContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ReasignacionContext reasignacion() {
			return getRuleContext(ReasignacionContext.class,0);
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
		enterRule(_localctx, 18, RULE_ordenes_variables);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case HAZ:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); asignacion();
				}
				break;
			case INIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); reasignacion();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 3);
				{
				setState(216); incrementa();
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
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(HAZ);
			setState(220); match(ID);
			setState(221); dato();
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
		enterRule(_localctx, 22, RULE_reasignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); match(INIC);
			setState(224); match(ID);
			setState(225); match(ASIGNAR);
			setState(226); dato();
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
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode INC() { return getToken(LogoTECParser.INC, 0); }
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode PAR_CUAD_CERRADO() { return getToken(LogoTECParser.PAR_CUAD_CERRADO, 0); }
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
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
		enterRule(_localctx, 24, RULE_incrementa);
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); match(INC);
				setState(229); match(PAR_CUAD_ABIERTO);
				setState(230); match(ID);
				setState(231); match(PAR_CUAD_CERRADO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232); match(INC);
				setState(233); match(PAR_CUAD_ABIERTO);
				setState(234); match(ID);
				setState(235); match(ENTERO);
				setState(236); match(PAR_CUAD_CERRADO);
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

	public static class CondicionContext extends ParserRuleContext {
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
		enterRule(_localctx, 26, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(PAR_ABIERTO);
			setState(240); ordenes_logicas();
			setState(241); match(PAR_CERRADO);
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
		enterRule(_localctx, 28, RULE_ordenes_logicas);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case IGUALES:
				enterOuterAlt(_localctx, 1);
				{
				setState(243); iguales();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(244); and();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(245); or();
				}
				break;
			case MAYOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(246); mayor();
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(247); menor();
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
		enterRule(_localctx, 30, RULE_iguales);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(IGUALES);
			setState(251); dato();
			setState(252); dato();
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
		enterRule(_localctx, 32, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(AND);
			setState(255); condicion();
			setState(256); condicion();
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
		enterRule(_localctx, 34, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(OR);
			setState(259); condicion();
			setState(260); condicion();
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
		enterRule(_localctx, 36, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(MAYOR);
			setState(263); numero();
			setState(264); numero();
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
		enterRule(_localctx, 38, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(MENOR);
			setState(267); numero();
			setState(268); numero();
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
		enterRule(_localctx, 40, RULE_operacion_aritmetica);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(270); suma();
				}
				break;
			case DIFERENCIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); diferencia();
				}
				break;
			case PRODUCTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(272); producto();
				}
				break;
			case POTENCIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(273); potencia();
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 5);
				{
				setState(274); division();
				}
				break;
			case RESIDUO:
				enterOuterAlt(_localctx, 6);
				{
				setState(275); residuo();
				}
				break;
			case REDONDEO:
				enterOuterAlt(_localctx, 7);
				{
				setState(276); redondear();
				}
				break;
			case AZAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(277); azar();
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 9);
				{
				setState(278); menos();
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
		enterRule(_localctx, 42, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(SUMA);
			setState(282); numero();
			setState(283); numero();
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
		enterRule(_localctx, 44, RULE_diferencia);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(DIFERENCIA);
			setState(286); numero();
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(287); numero();
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 46, RULE_producto);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293); match(PRODUCTO);
			setState(294); numero();
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295); numero();
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 48, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(POTENCIA);
			setState(302); numero();
			setState(303); numero();
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
		enterRule(_localctx, 50, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(DIVISION);
			setState(306); numero();
			setState(307); numero();
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
		public TerminalNode ENTERO(int i) {
			return getToken(LogoTECParser.ENTERO, i);
		}
		public TerminalNode RESIDUO() { return getToken(LogoTECParser.RESIDUO, 0); }
		public List<TerminalNode> ENTERO() { return getTokens(LogoTECParser.ENTERO); }
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
		enterRule(_localctx, 52, RULE_residuo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(RESIDUO);
			setState(310); match(ENTERO);
			setState(311); match(ENTERO);
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
		enterRule(_localctx, 54, RULE_redondear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(REDONDEO);
			setState(314); numero();
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
		public TerminalNode AZAR() { return getToken(LogoTECParser.AZAR, 0); }
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
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
		enterRule(_localctx, 56, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); match(AZAR);
			setState(317); match(ENTERO);
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
		public TerminalNode MENOS() { return getToken(LogoTECParser.MENOS, 0); }
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
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
		enterRule(_localctx, 58, RULE_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(MENOS);
			setState(320); match(ENTERO);
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
		enterRule(_localctx, 60, RULE_ordenes_listas);
		try {
			setState(327);
			switch (_input.LA(1)) {
			case ELEMENTO_AZAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(322); elegir();
				}
				break;
			case ELEMENTO_N:
				enterOuterAlt(_localctx, 2);
				{
				setState(323); elemento_n();
				}
				break;
			case LONGITUD:
				enterOuterAlt(_localctx, 3);
				{
				setState(324); largo();
				}
				break;
			case PRIMERO_LISTA:
				enterOuterAlt(_localctx, 4);
				{
				setState(325); primero();
				}
				break;
			case ULTIMO:
				enterOuterAlt(_localctx, 5);
				{
				setState(326); ultimo();
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
		public List<DatoContext> dato() {
			return getRuleContexts(DatoContext.class);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode ELEMENTO_AZAR() { return getToken(LogoTECParser.ELEMENTO_AZAR, 0); }
		public DatoContext dato(int i) {
			return getRuleContext(DatoContext.class,i);
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
		enterRule(_localctx, 62, RULE_elegir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(ELEMENTO_AZAR);
			setState(330); match(PAR_CUAD_ABIERTO);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << TRUE) | (1L << FALSE) | (1L << MENOS))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (COMILLA - 69)) | (1L << (ID - 69)) | (1L << (ENTERO - 69)))) != 0)) {
				{
				{
				setState(331); dato();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337); match(PAR_CUAD_CERRADO);
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
		public List<DatoContext> dato() {
			return getRuleContexts(DatoContext.class);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public DatoContext dato(int i) {
			return getRuleContext(DatoContext.class,i);
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
		enterRule(_localctx, 64, RULE_elemento_n);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(ELEMENTO_N);
			setState(340); match(ENTERO);
			setState(341); match(PAR_CUAD_ABIERTO);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << TRUE) | (1L << FALSE) | (1L << MENOS))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (COMILLA - 69)) | (1L << (ID - 69)) | (1L << (ENTERO - 69)))) != 0)) {
				{
				{
				setState(342); dato();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348); match(PAR_CUAD_CERRADO);
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
		public TerminalNode LONGITUD() { return getToken(LogoTECParser.LONGITUD, 0); }
		public List<DatoContext> dato() {
			return getRuleContexts(DatoContext.class);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public DatoContext dato(int i) {
			return getRuleContext(DatoContext.class,i);
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
		enterRule(_localctx, 66, RULE_largo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); match(LONGITUD);
			setState(351); match(PAR_CUAD_ABIERTO);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << TRUE) | (1L << FALSE) | (1L << MENOS))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (COMILLA - 69)) | (1L << (ID - 69)) | (1L << (ENTERO - 69)))) != 0)) {
				{
				{
				setState(352); dato();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358); match(PAR_CUAD_CERRADO);
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
		public List<DatoContext> dato() {
			return getRuleContexts(DatoContext.class);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public DatoContext dato(int i) {
			return getRuleContext(DatoContext.class,i);
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
		enterRule(_localctx, 68, RULE_primero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(PRIMERO_LISTA);
			setState(361); match(PAR_CUAD_ABIERTO);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << TRUE) | (1L << FALSE) | (1L << MENOS))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (COMILLA - 69)) | (1L << (ID - 69)) | (1L << (ENTERO - 69)))) != 0)) {
				{
				{
				setState(362); dato();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368); match(PAR_CUAD_CERRADO);
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
		public List<DatoContext> dato() {
			return getRuleContexts(DatoContext.class);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode ULTIMO() { return getToken(LogoTECParser.ULTIMO, 0); }
		public DatoContext dato(int i) {
			return getRuleContext(DatoContext.class,i);
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
		enterRule(_localctx, 70, RULE_ultimo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(ULTIMO);
			setState(371); match(PAR_CUAD_ABIERTO);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << TRUE) | (1L << FALSE) | (1L << MENOS))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (COMILLA - 69)) | (1L << (ID - 69)) | (1L << (ENTERO - 69)))) != 0)) {
				{
				{
				setState(372); dato();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378); match(PAR_CUAD_CERRADO);
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
		enterRule(_localctx, 72, RULE_ordenes_tortuga);
		try {
			setState(393);
			switch (_input.LA(1)) {
			case AVANZA:
				enterOuterAlt(_localctx, 1);
				{
				setState(380); avanzar();
				}
				break;
			case RETROCEDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(381); retroceder();
				}
				break;
			case GIRA_DERECHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(382); girar_derecha();
				}
				break;
			case GIRA_IZQUIERDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(383); girar_izquierda();
				}
				break;
			case OCULTA_TORTUGA:
				enterOuterAlt(_localctx, 5);
				{
				setState(384); ocultar_tortuga();
				}
				break;
			case APARECE_TORTUGA:
				enterOuterAlt(_localctx, 6);
				{
				setState(385); aparecer_tortuga();
				}
				break;
			case PON_POS:
				enterOuterAlt(_localctx, 7);
				{
				setState(386); definir_coord();
				}
				break;
			case PONX:
				enterOuterAlt(_localctx, 8);
				{
				setState(387); definir_x();
				}
				break;
			case PONY:
				enterOuterAlt(_localctx, 9);
				{
				setState(388); definir_y();
				}
				break;
			case PON_RUMBO:
				enterOuterAlt(_localctx, 10);
				{
				setState(389); definir_dir();
				}
				break;
			case RUMBO:
				enterOuterAlt(_localctx, 11);
				{
				setState(390); rumbo();
				}
				break;
			case CENTRO:
				enterOuterAlt(_localctx, 12);
				{
				setState(391); centrar();
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 13);
				{
				setState(392); esperar();
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
		public Token cmd;
		public Operacion_aritmeticaContext cmd2;
		public TerminalNode AVANZA() { return getToken(LogoTECParser.AVANZA, 0); }
		public Operacion_aritmeticaContext operacion_aritmetica() {
			return getRuleContext(Operacion_aritmeticaContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
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
		enterRule(_localctx, 74, RULE_avanzar);
		try {
			setState(402);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395); match(AVANZA);
				setState(396); ((AvanzarContext)_localctx).cmd = match(ENTERO);
				((AvanzarContext)_localctx).node =  cmd.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398); match(AVANZA);
				setState(399); ((AvanzarContext)_localctx).cmd2 = operacion_aritmetica();
				((AvanzarContext)_localctx).node =  cmd2.node;
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

	public static class RetrocederContext extends ParserRuleContext {
		public TerminalNode RETROCEDE() { return getToken(LogoTECParser.RETROCEDE, 0); }
		public Operacion_aritmeticaContext operacion_aritmetica() {
			return getRuleContext(Operacion_aritmeticaContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
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
		enterRule(_localctx, 76, RULE_retroceder);
		try {
			setState(408);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404); match(RETROCEDE);
				setState(405); match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406); match(RETROCEDE);
				setState(407); operacion_aritmetica();
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

	public static class Girar_derechaContext extends ParserRuleContext {
		public TerminalNode GIRA_DERECHA() { return getToken(LogoTECParser.GIRA_DERECHA, 0); }
		public Operacion_aritmeticaContext operacion_aritmetica() {
			return getRuleContext(Operacion_aritmeticaContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
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
		enterRule(_localctx, 78, RULE_girar_derecha);
		try {
			setState(414);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410); match(GIRA_DERECHA);
				setState(411); match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412); match(GIRA_DERECHA);
				setState(413); operacion_aritmetica();
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

	public static class Girar_izquierdaContext extends ParserRuleContext {
		public Operacion_aritmeticaContext operacion_aritmetica() {
			return getRuleContext(Operacion_aritmeticaContext.class,0);
		}
		public TerminalNode GIRA_IZQUIERDA() { return getToken(LogoTECParser.GIRA_IZQUIERDA, 0); }
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
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
		enterRule(_localctx, 80, RULE_girar_izquierda);
		try {
			setState(420);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416); match(GIRA_IZQUIERDA);
				setState(417); match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418); match(GIRA_IZQUIERDA);
				setState(419); operacion_aritmetica();
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

	public static class Ocultar_tortugaContext extends ParserRuleContext {
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
		enterRule(_localctx, 82, RULE_ocultar_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(OCULTA_TORTUGA);
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
		enterRule(_localctx, 84, RULE_aparecer_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); match(APARECE_TORTUGA);
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
		public TerminalNode ENTERO(int i) {
			return getToken(LogoTECParser.ENTERO, i);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public TerminalNode PON_POS() { return getToken(LogoTECParser.PON_POS, 0); }
		public List<TerminalNode> ENTERO() { return getTokens(LogoTECParser.ENTERO); }
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
		enterRule(_localctx, 86, RULE_definir_coord);
		try {
			setState(434);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426); match(PON_POS);
				setState(427); match(PAR_CUAD_ABIERTO);
				setState(428); match(ENTERO);
				setState(429); match(ENTERO);
				setState(430); match(PAR_CUAD_CERRADO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431); match(PON_POS);
				setState(432); match(ENTERO);
				setState(433); match(ENTERO);
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
		public TerminalNode PONX() { return getToken(LogoTECParser.PONX, 0); }
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
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
		enterRule(_localctx, 88, RULE_definir_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436); match(PONX);
			setState(437); match(ENTERO);
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
		public TerminalNode PONY() { return getToken(LogoTECParser.PONY, 0); }
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
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
		enterRule(_localctx, 90, RULE_definir_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); match(PONY);
			setState(440); match(ENTERO);
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
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
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
		enterRule(_localctx, 92, RULE_definir_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442); match(PON_RUMBO);
			setState(443); match(ENTERO);
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
		enterRule(_localctx, 94, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); match(RUMBO);
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
		enterRule(_localctx, 96, RULE_centrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); match(CENTRO);
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
		public TerminalNode ESPERA() { return getToken(LogoTECParser.ESPERA, 0); }
		public TerminalNode ENTERO() { return getToken(LogoTECParser.ENTERO, 0); }
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
		enterRule(_localctx, 98, RULE_esperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); match(ESPERA);
			setState(450); match(ENTERO);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOrdenes_lienzo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordenes_lienzoContext ordenes_lienzo() throws RecognitionException {
		Ordenes_lienzoContext _localctx = new Ordenes_lienzoContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ordenes_lienzo);
		try {
			setState(457);
			switch (_input.LA(1)) {
			case BORRADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(452); borrar();
				}
				break;
			case BAJA_LAPIZ:
				enterOuterAlt(_localctx, 2);
				{
				setState(453); dibujar();
				}
				break;
			case SUBE_LAPIZ:
				enterOuterAlt(_localctx, 3);
				{
				setState(454); no_dibujar();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(455); definir_color();
				}
				break;
			case BORRA_PANTALLA:
				enterOuterAlt(_localctx, 5);
				{
				setState(456); borra_pantalla();
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
		enterRule(_localctx, 102, RULE_borrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); match(BORRADOR);
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
		enterRule(_localctx, 104, RULE_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); match(BAJA_LAPIZ);
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
		enterRule(_localctx, 106, RULE_no_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463); match(SUBE_LAPIZ);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitDefinir_color(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definir_colorContext definir_color() throws RecognitionException {
		Definir_colorContext _localctx = new Definir_colorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_definir_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); match(COLOR);
			setState(466); match(ID);
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
		enterRule(_localctx, 110, RULE_borra_pantalla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468); match(BORRA_PANTALLA);
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
		enterRule(_localctx, 112, RULE_dato);
		try {
			setState(477);
			switch (_input.LA(1)) {
			case COMILLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(470); match(COMILLA);
				setState(471); match(ID);
				setState(472); match(COMILLA);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(473); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(474); match(FALSE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(475); match(ID);
				}
				break;
			case SUMA:
			case RESIDUO:
			case DIVISION:
			case POTENCIA:
			case PRODUCTO:
			case DIFERENCIA:
			case REDONDEO:
			case AZAR:
			case MENOS:
			case ENTERO:
				enterOuterAlt(_localctx, 5);
				{
				setState(476); numero();
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
		public Operacion_aritmeticaContext operacion_aritmetica() {
			return getRuleContext(Operacion_aritmeticaContext.class,0);
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
		enterRule(_localctx, 114, RULE_numero);
		try {
			setState(481);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(479); match(ENTERO);
				}
				break;
			case SUMA:
			case RESIDUO:
			case DIVISION:
			case POTENCIA:
			case PRODUCTO:
			case DIFERENCIA:
			case REDONDEO:
			case AZAR:
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(480); operacion_aritmetica();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3J\u01e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\7\2x\n\2"+
		"\f\2\16\2{\13\2\3\3\3\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083\13\3\3\3\3\3"+
		"\3\4\3\4\3\4\7\4\u008a\n\4\f\4\16\4\u008d\13\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\7\5\u0095\n\5\f\5\16\5\u0098\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00a0\n"+
		"\6\f\6\16\6\u00a3\13\6\3\6\3\6\3\6\7\6\u00a8\n\6\f\6\16\6\u00ab\13\6\3"+
		"\6\3\6\3\7\3\7\3\7\7\7\u00b2\n\7\f\7\16\7\u00b5\13\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\7\b\u00c1\n\b\f\b\16\b\u00c4\13\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cf\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d7"+
		"\n\n\3\13\3\13\3\13\5\13\u00dc\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f0\n\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00fb\n\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011a"+
		"\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0123\n\30\f\30\16\30\u0126"+
		"\13\30\3\31\3\31\3\31\7\31\u012b\n\31\f\31\16\31\u012e\13\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u014a\n \3!\3!\3!\7!\u014f"+
		"\n!\f!\16!\u0152\13!\3!\3!\3\"\3\"\3\"\3\"\7\"\u015a\n\"\f\"\16\"\u015d"+
		"\13\"\3\"\3\"\3#\3#\3#\7#\u0164\n#\f#\16#\u0167\13#\3#\3#\3$\3$\3$\7$"+
		"\u016e\n$\f$\16$\u0171\13$\3$\3$\3%\3%\3%\7%\u0178\n%\f%\16%\u017b\13"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u018c\n&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u0195\n\'\3(\3(\3(\3(\5(\u019b\n(\3)\3)\3)\3)\5)"+
		"\u01a1\n)\3*\3*\3*\3*\5*\u01a7\n*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u01b5\n-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\5\64\u01cc\n\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\38\39\39\3:\3:\3:\3:\3:\3:\3:\5:\u01e0\n:\3;\3;\5;\u01e4"+
		"\n;\3;\2\2<\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\2\u01f2\2y\3\2\2\2\4|\3\2\2\2\6\u0086"+
		"\3\2\2\2\b\u0090\3\2\2\2\n\u009b\3\2\2\2\f\u00ae\3\2\2\2\16\u00bb\3\2"+
		"\2\2\20\u00ce\3\2\2\2\22\u00d6\3\2\2\2\24\u00db\3\2\2\2\26\u00dd\3\2\2"+
		"\2\30\u00e1\3\2\2\2\32\u00ef\3\2\2\2\34\u00f1\3\2\2\2\36\u00fa\3\2\2\2"+
		" \u00fc\3\2\2\2\"\u0100\3\2\2\2$\u0104\3\2\2\2&\u0108\3\2\2\2(\u010c\3"+
		"\2\2\2*\u0119\3\2\2\2,\u011b\3\2\2\2.\u011f\3\2\2\2\60\u0127\3\2\2\2\62"+
		"\u012f\3\2\2\2\64\u0133\3\2\2\2\66\u0137\3\2\2\28\u013b\3\2\2\2:\u013e"+
		"\3\2\2\2<\u0141\3\2\2\2>\u0149\3\2\2\2@\u014b\3\2\2\2B\u0155\3\2\2\2D"+
		"\u0160\3\2\2\2F\u016a\3\2\2\2H\u0174\3\2\2\2J\u018b\3\2\2\2L\u0194\3\2"+
		"\2\2N\u019a\3\2\2\2P\u01a0\3\2\2\2R\u01a6\3\2\2\2T\u01a8\3\2\2\2V\u01aa"+
		"\3\2\2\2X\u01b4\3\2\2\2Z\u01b6\3\2\2\2\\\u01b9\3\2\2\2^\u01bc\3\2\2\2"+
		"`\u01bf\3\2\2\2b\u01c1\3\2\2\2d\u01c3\3\2\2\2f\u01cb\3\2\2\2h\u01cd\3"+
		"\2\2\2j\u01cf\3\2\2\2l\u01d1\3\2\2\2n\u01d3\3\2\2\2p\u01d6\3\2\2\2r\u01df"+
		"\3\2\2\2t\u01e3\3\2\2\2vx\5\20\t\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2"+
		"\2\2z\3\3\2\2\2{y\3\2\2\2|}\7\37\2\2}\u0081\7C\2\2~\u0080\5J&\2\177~\3"+
		"\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7D\2\2\u0085\5\3\2\2\2"+
		"\u0086\u0087\7\36\2\2\u0087\u008b\7C\2\2\u0088\u008a\5J&\2\u0089\u0088"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7D\2\2\u008f\7\3\2\2\2"+
		"\u0090\u0091\7\35\2\2\u0091\u0092\5\34\17\2\u0092\u0096\7C\2\2\u0093\u0095"+
		"\5J&\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7D"+
		"\2\2\u009a\t\3\2\2\2\u009b\u009c\7\34\2\2\u009c\u009d\5\34\17\2\u009d"+
		"\u00a1\7C\2\2\u009e\u00a0\5J&\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2"+
		"\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a4\u00a5\7D\2\2\u00a5\u00a9\7C\2\2\u00a6\u00a8\5J&\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7D\2\2\u00ad"+
		"\13\3\2\2\2\u00ae\u00af\7\33\2\2\u00af\u00b3\7C\2\2\u00b0\u00b2\5\20\t"+
		"\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7D\2\2\u00b7"+
		"\u00b8\7C\2\2\u00b8\u00b9\5\34\17\2\u00b9\u00ba\7D\2\2\u00ba\r\3\2\2\2"+
		"\u00bb\u00bc\7C\2\2\u00bc\u00bd\5\34\17\2\u00bd\u00be\7D\2\2\u00be\u00c2"+
		"\7C\2\2\u00bf\u00c1\5\20\t\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c6\7D\2\2\u00c6\17\3\2\2\2\u00c7\u00cf\5\4\3\2\u00c8\u00cf"+
		"\5\6\4\2\u00c9\u00cf\5\b\5\2\u00ca\u00cf\5\n\6\2\u00cb\u00cf\5\22\n\2"+
		"\u00cc\u00cf\5\f\7\2\u00cd\u00cf\5\16\b\2\u00ce\u00c7\3\2\2\2\u00ce\u00c8"+
		"\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\21\3\2\2\2\u00d0\u00d7\5\24\13"+
		"\2\u00d1\u00d7\5\36\20\2\u00d2\u00d7\5f\64\2\u00d3\u00d7\5*\26\2\u00d4"+
		"\u00d7\5> \2\u00d5\u00d7\5J&\2\u00d6\u00d0\3\2\2\2\u00d6\u00d1\3\2\2\2"+
		"\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\23\3\2\2\2\u00d8\u00dc\5\26\f\2\u00d9\u00dc\5\30\r\2\u00da"+
		"\u00dc\5\32\16\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3"+
		"\2\2\2\u00dc\25\3\2\2\2\u00dd\u00de\7\4\2\2\u00de\u00df\7H\2\2\u00df\u00e0"+
		"\5r:\2\u00e0\27\3\2\2\2\u00e1\u00e2\7\5\2\2\u00e2\u00e3\7H\2\2\u00e3\u00e4"+
		"\7:\2\2\u00e4\u00e5\5r:\2\u00e5\31\3\2\2\2\u00e6\u00e7\7\6\2\2\u00e7\u00e8"+
		"\7C\2\2\u00e8\u00e9\7H\2\2\u00e9\u00f0\7D\2\2\u00ea\u00eb\7\6\2\2\u00eb"+
		"\u00ec\7C\2\2\u00ec\u00ed\7H\2\2\u00ed\u00ee\7I\2\2\u00ee\u00f0\7D\2\2"+
		"\u00ef\u00e6\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0\33\3\2\2\2\u00f1\u00f2"+
		"\7A\2\2\u00f2\u00f3\5\36\20\2\u00f3\u00f4\7B\2\2\u00f4\35\3\2\2\2\u00f5"+
		"\u00fb\5 \21\2\u00f6\u00fb\5\"\22\2\u00f7\u00fb\5$\23\2\u00f8\u00fb\5"+
		"&\24\2\u00f9\u00fb\5(\25\2\u00fa\u00f5\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa"+
		"\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\37\3\2\2"+
		"\2\u00fc\u00fd\7\24\2\2\u00fd\u00fe\5r:\2\u00fe\u00ff\5r:\2\u00ff!\3\2"+
		"\2\2\u0100\u0101\7\22\2\2\u0101\u0102\5\34\17\2\u0102\u0103\5\34\17\2"+
		"\u0103#\3\2\2\2\u0104\u0105\7\23\2\2\u0105\u0106\5\34\17\2\u0106\u0107"+
		"\5\34\17\2\u0107%\3\2\2\2\u0108\u0109\7\20\2\2\u0109\u010a\5t;\2\u010a"+
		"\u010b\5t;\2\u010b\'\3\2\2\2\u010c\u010d\7\21\2\2\u010d\u010e\5t;\2\u010e"+
		"\u010f\5t;\2\u010f)\3\2\2\2\u0110\u011a\5,\27\2\u0111\u011a\5.\30\2\u0112"+
		"\u011a\5\60\31\2\u0113\u011a\5\62\32\2\u0114\u011a\5\64\33\2\u0115\u011a"+
		"\5\66\34\2\u0116\u011a\58\35\2\u0117\u011a\5:\36\2\u0118\u011a\5<\37\2"+
		"\u0119\u0110\3\2\2\2\u0119\u0111\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0113"+
		"\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a+\3\2\2\2\u011b\u011c\7\7\2\2"+
		"\u011c\u011d\5t;\2\u011d\u011e\5t;\2\u011e-\3\2\2\2\u011f\u0120\7\r\2"+
		"\2\u0120\u0124\5t;\2\u0121\u0123\5t;\2\u0122\u0121\3\2\2\2\u0123\u0126"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125/\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127\u0128\7\13\2\2\u0128\u012c\5t;\2\u0129\u012b\5t;"+
		"\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\61\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\n\2\2\u0130"+
		"\u0131\5t;\2\u0131\u0132\5t;\2\u0132\63\3\2\2\2\u0133\u0134\7\t\2\2\u0134"+
		"\u0135\5t;\2\u0135\u0136\5t;\2\u0136\65\3\2\2\2\u0137\u0138\7\b\2\2\u0138"+
		"\u0139\7I\2\2\u0139\u013a\7I\2\2\u013a\67\3\2\2\2\u013b\u013c\7\16\2\2"+
		"\u013c\u013d\5t;\2\u013d9\3\2\2\2\u013e\u013f\7\17\2\2\u013f\u0140\7I"+
		"\2\2\u0140;\3\2\2\2\u0141\u0142\7\65\2\2\u0142\u0143\7I\2\2\u0143=\3\2"+
		"\2\2\u0144\u014a\5@!\2\u0145\u014a\5B\"\2\u0146\u014a\5D#\2\u0147\u014a"+
		"\5F$\2\u0148\u014a\5H%\2\u0149\u0144\3\2\2\2\u0149\u0145\3\2\2\2\u0149"+
		"\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a?\3\2\2\2"+
		"\u014b\u014c\7\25\2\2\u014c\u0150\7C\2\2\u014d\u014f\5r:\2\u014e\u014d"+
		"\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7D\2\2\u0154A\3\2\2\2\u0155"+
		"\u0156\7\30\2\2\u0156\u0157\7I\2\2\u0157\u015b\7C\2\2\u0158\u015a\5r:"+
		"\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7D\2\2\u015f"+
		"C\3\2\2\2\u0160\u0161\7\26\2\2\u0161\u0165\7C\2\2\u0162\u0164\5r:\2\u0163"+
		"\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7D\2\2\u0169"+
		"E\3\2\2\2\u016a\u016b\7\31\2\2\u016b\u016f\7C\2\2\u016c\u016e\5r:\2\u016d"+
		"\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7D\2\2\u0173"+
		"G\3\2\2\2\u0174\u0175\7\27\2\2\u0175\u0179\7C\2\2\u0176\u0178\5r:\2\u0177"+
		"\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7D\2\2\u017d"+
		"I\3\2\2\2\u017e\u018c\5L\'\2\u017f\u018c\5N(\2\u0180\u018c\5P)\2\u0181"+
		"\u018c\5R*\2\u0182\u018c\5T+\2\u0183\u018c\5V,\2\u0184\u018c\5X-\2\u0185"+
		"\u018c\5Z.\2\u0186\u018c\5\\/\2\u0187\u018c\5^\60\2\u0188\u018c\5`\61"+
		"\2\u0189\u018c\5b\62\2\u018a\u018c\5d\63\2\u018b\u017e\3\2\2\2\u018b\u017f"+
		"\3\2\2\2\u018b\u0180\3\2\2\2\u018b\u0181\3\2\2\2\u018b\u0182\3\2\2\2\u018b"+
		"\u0183\3\2\2\2\u018b\u0184\3\2\2\2\u018b\u0185\3\2\2\2\u018b\u0186\3\2"+
		"\2\2\u018b\u0187\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018a\3\2\2\2\u018cK\3\2\2\2\u018d\u018e\7 \2\2\u018e\u018f\7I\2\2\u018f"+
		"\u0195\b\'\1\2\u0190\u0191\7 \2\2\u0191\u0192\5*\26\2\u0192\u0193\b\'"+
		"\1\2\u0193\u0195\3\2\2\2\u0194\u018d\3\2\2\2\u0194\u0190\3\2\2\2\u0195"+
		"M\3\2\2\2\u0196\u0197\7!\2\2\u0197\u019b\7I\2\2\u0198\u0199\7!\2\2\u0199"+
		"\u019b\5*\26\2\u019a\u0196\3\2\2\2\u019a\u0198\3\2\2\2\u019bO\3\2\2\2"+
		"\u019c\u019d\7#\2\2\u019d\u01a1\7I\2\2\u019e\u019f\7#\2\2\u019f\u01a1"+
		"\5*\26\2\u01a0\u019c\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1Q\3\2\2\2\u01a2"+
		"\u01a3\7$\2\2\u01a3\u01a7\7I\2\2\u01a4\u01a5\7$\2\2\u01a5\u01a7\5*\26"+
		"\2\u01a6\u01a2\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7S\3\2\2\2\u01a8\u01a9"+
		"\7%\2\2\u01a9U\3\2\2\2\u01aa\u01ab\7&\2\2\u01abW\3\2\2\2\u01ac\u01ad\7"+
		"(\2\2\u01ad\u01ae\7C\2\2\u01ae\u01af\7I\2\2\u01af\u01b0\7I\2\2\u01b0\u01b5"+
		"\7D\2\2\u01b1\u01b2\7(\2\2\u01b2\u01b3\7I\2\2\u01b3\u01b5\7I\2\2\u01b4"+
		"\u01ac\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b5Y\3\2\2\2\u01b6\u01b7\7)\2\2\u01b7"+
		"\u01b8\7I\2\2\u01b8[\3\2\2\2\u01b9\u01ba\7*\2\2\u01ba\u01bb\7I\2\2\u01bb"+
		"]\3\2\2\2\u01bc\u01bd\7+\2\2\u01bd\u01be\7I\2\2\u01be_\3\2\2\2\u01bf\u01c0"+
		"\7,\2\2\u01c0a\3\2\2\2\u01c1\u01c2\7\'\2\2\u01c2c\3\2\2\2\u01c3\u01c4"+
		"\7\"\2\2\u01c4\u01c5\7I\2\2\u01c5e\3\2\2\2\u01c6\u01cc\5h\65\2\u01c7\u01cc"+
		"\5j\66\2\u01c8\u01cc\5l\67\2\u01c9\u01cc\5n8\2\u01ca\u01cc\5p9\2\u01cb"+
		"\u01c6\3\2\2\2\u01cb\u01c7\3\2\2\2\u01cb\u01c8\3\2\2\2\u01cb\u01c9\3\2"+
		"\2\2\u01cb\u01ca\3\2\2\2\u01ccg\3\2\2\2\u01cd\u01ce\7\60\2\2\u01cei\3"+
		"\2\2\2\u01cf\u01d0\7/\2\2\u01d0k\3\2\2\2\u01d1\u01d2\7.\2\2\u01d2m\3\2"+
		"\2\2\u01d3\u01d4\7-\2\2\u01d4\u01d5\7H\2\2\u01d5o\3\2\2\2\u01d6\u01d7"+
		"\7\61\2\2\u01d7q\3\2\2\2\u01d8\u01d9\7G\2\2\u01d9\u01da\7H\2\2\u01da\u01e0"+
		"\7G\2\2\u01db\u01e0\7\62\2\2\u01dc\u01e0\7\63\2\2\u01dd\u01e0\7H\2\2\u01de"+
		"\u01e0\5t;\2\u01df\u01d8\3\2\2\2\u01df\u01db\3\2\2\2\u01df\u01dc\3\2\2"+
		"\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0s\3\2\2\2\u01e1\u01e4"+
		"\7I\2\2\u01e2\u01e4\5*\26\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4"+
		"u\3\2\2\2!y\u0081\u008b\u0096\u00a1\u00a9\u00b3\u00c2\u00ce\u00d6\u00db"+
		"\u00ef\u00fa\u0119\u0124\u012c\u0149\u0150\u015b\u0165\u016f\u0179\u018b"+
		"\u0194\u019a\u01a0\u01a6\u01b4\u01cb\u01df\u01e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}