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
		PROGRAMA=1, PARA=2, FIN=3, HAZ=4, INIC=5, INC=6, PRINTLN=7, SUMA=8, RESIDUO=9, 
		DIVISION=10, POTENCIA=11, PRODUCTO=12, NEGATIVO=13, DIFERENCIA=14, REDONDEO=15, 
		AZAR=16, MAYOR=17, MENOR=18, AND=19, OR=20, IGUALES=21, ELEMENTO_AZAR=22, 
		LONGITUD=23, ULTIMO=24, ELEMENTO_N=25, PRIMERO_LISTA=26, WHILE=27, DO_WHILE=28, 
		IF_ELSE=29, IF=30, DO_N=31, DO=32, AVANZA=33, RETROCEDE=34, ESPERA=35, 
		GIRA_DERECHA=36, GIRA_IZQUIERDA=37, OCULTA_TORTUGA=38, APARECE_TORTUGA=39, 
		CENTRO=40, PON_POS=41, PONX=42, PONY=43, PON_RUMBO=44, RUMBO=45, COLOR=46, 
		SUBE_LAPIZ=47, BAJA_LAPIZ=48, BORRADOR=49, BORRA_PANTALLA=50, TRUE=51, 
		FALSE=52, MAS=53, MULTI=54, DIV=55, MY=56, MN=57, ASIGNAR=58, NOT=59, 
		MYI=60, MNI=61, NEQ=62, BRACKET_ABIERTO=63, BRACKET_CERRADO=64, PAR_ABIERTO=65, 
		PAR_CERRADO=66, PAR_CUAD_ABIERTO=67, PAR_CUAD_CERRADO=68, SEMICOLON=69, 
		DOS_PUNTOS=70, COMILLA=71, ID=72, ENTERO=73, FLOAT=74, ESPACIO_BLANCO=75;
	public static final String[] tokenNames = {
		"<INVALID>", "'Programa'", "PARA", "FIN", "'Haz'", "'INIC'", "'INC'", 
		"'print'", "SUMA", "RESIDUO", "DIVISION", "POTENCIA", "PRODUCTO", "NEGATIVO", 
		"DIFERENCIA", "REDONDEO", "AZAR", "MAYOR", "MENOR", "'Y'", "'O'", "IGUALES", 
		"ELEMENTO_AZAR", "LONGITUD", "ULTIMO", "ELEMENTO_N", "PRIMERO_LISTA", 
		"WHILE", "DO_WHILE", "'SISINO'", "'SI'", "DO_N", "DO", "AVANZA", "RETROCEDE", 
		"ESPERA", "GIRA_DERECHA", "GIRA_IZQUIERDA", "OCULTA_TORTUGA", "APARECE_TORTUGA", 
		"CENTRO", "PON_POS", "'PonX'", "'PonY'", "PON_RUMBO", "RUMBO", "COLOR", 
		"SUBE_LAPIZ", "BAJA_LAPIZ", "BORRADOR", "'borrapantalla'", "'TRUE'", "'FALSE'", 
		"'+'", "'*'", "'/'", "'>'", "'<'", "'='", "'!'", "'>='", "'<='", "'!='", 
		"'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "':'", "'\"'", "ID", 
		"ENTERO", "FLOAT", "ESPACIO_BLANCO"
	};
	public static final int
		RULE_programa = 0, RULE_ejecuta = 1, RULE_repite = 2, RULE_si = 3, RULE_sisino = 4, 
		RULE_do_while = 5, RULE_mientras = 6, RULE_sentencia_logoTEC = 7, RULE_ordenes_variables = 8, 
		RULE_asignacion = 9, RULE_reasignacion = 10, RULE_incrementa = 11, RULE_referencia = 12, 
		RULE_condicion = 13, RULE_ordenes_logicas = 14, RULE_iguales = 15, RULE_and = 16, 
		RULE_or = 17, RULE_mayor = 18, RULE_menor = 19, RULE_operacion_aritmetica = 20, 
		RULE_suma = 21, RULE_diferencia = 22, RULE_producto = 23, RULE_potencia = 24, 
		RULE_division = 25, RULE_residuo = 26, RULE_redondear = 27, RULE_azar = 28, 
		RULE_menos = 29, RULE_ordenes_listas = 30, RULE_elegir = 31, RULE_elemento_n = 32, 
		RULE_largo = 33, RULE_primero = 34, RULE_ultimo = 35, RULE_ordenes_tortuga = 36, 
		RULE_avanzar = 37, RULE_retroceder = 38, RULE_girar_derecha = 39, RULE_girar_izquierda = 40, 
		RULE_definir_coord = 41, RULE_definir_x = 42, RULE_definir_y = 43, RULE_definir_dir = 44, 
		RULE_esperar = 45, RULE_ocultar_tortuga = 46, RULE_aparecer_tortuga = 47, 
		RULE_rumbo = 48, RULE_centrar = 49, RULE_ordenes_lienzo = 50, RULE_borrar = 51, 
		RULE_dibujar = 52, RULE_no_dibujar = 53, RULE_definir_color = 54, RULE_borra_pantalla = 55, 
		RULE_dato = 56, RULE_numero = 57;
	public static final String[] ruleNames = {
		"programa", "ejecuta", "repite", "si", "sisino", "do_while", "mientras", 
		"sentencia_logoTEC", "ordenes_variables", "asignacion", "reasignacion", 
		"incrementa", "referencia", "condicion", "ordenes_logicas", "iguales", 
		"and", "or", "mayor", "menor", "operacion_aritmetica", "suma", "diferencia", 
		"producto", "potencia", "division", "residuo", "redondear", "azar", "menos", 
		"ordenes_listas", "elegir", "elemento_n", "largo", "primero", "ultimo", 
		"ordenes_tortuga", "avanzar", "retroceder", "girar_derecha", "girar_izquierda", 
		"definir_coord", "definir_x", "definir_y", "definir_dir", "esperar", "ocultar_tortuga", 
		"aparecer_tortuga", "rumbo", "centrar", "ordenes_lienzo", "borrar", "dibujar", 
		"no_dibujar", "definir_color", "borra_pantalla", "dato", "numero"
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

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAZ) | (1L << INIC) | (1L << INC) | (1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << MAYOR) | (1L << MENOR) | (1L << AND) | (1L << OR) | (1L << IGUALES) | (1L << WHILE) | (1L << DO_WHILE) | (1L << IF_ELSE) | (1L << IF) | (1L << DO_N) | (1L << DO) | (1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO) | (1L << COLOR) | (1L << SUBE_LAPIZ) | (1L << BAJA_LAPIZ) | (1L << BORRADOR) | (1L << BORRA_PANTALLA))) != 0) || _la==ID) {
				{
				{
				setState(117); ((ProgramaContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				body.add(((ProgramaContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(124);
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
		public Sentencia_logoTECContext sentencia_logoTEC;
		public TerminalNode DO() { return getToken(LogoTECParser.DO, 0); }
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public Sentencia_logoTECContext sentencia_logoTEC(int i) {
			return getRuleContext(Sentencia_logoTECContext.class,i);
		}
		public List<Sentencia_logoTECContext> sentencia_logoTEC() {
			return getRuleContexts(Sentencia_logoTECContext.class);
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
			setState(127); match(DO);
			setState(128); match(PAR_CUAD_ABIERTO);

									List<ASTNode> body = new ArrayList<ASTNode>();
									
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAZ) | (1L << INIC) | (1L << INC) | (1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << MAYOR) | (1L << MENOR) | (1L << AND) | (1L << OR) | (1L << IGUALES) | (1L << WHILE) | (1L << DO_WHILE) | (1L << IF_ELSE) | (1L << IF) | (1L << DO_N) | (1L << DO) | (1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO) | (1L << COLOR) | (1L << SUBE_LAPIZ) | (1L << BAJA_LAPIZ) | (1L << BORRADOR) | (1L << BORRA_PANTALLA))) != 0) || _la==ID) {
				{
				{
				setState(130); ((EjecutaContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				body.add(((EjecutaContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138); match(PAR_CUAD_CERRADO);
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
		public Sentencia_logoTECContext sentencia_logoTEC;
		public TerminalNode DO_N() { return getToken(LogoTECParser.DO_N, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public Sentencia_logoTECContext sentencia_logoTEC(int i) {
			return getRuleContext(Sentencia_logoTECContext.class,i);
		}
		public List<Sentencia_logoTECContext> sentencia_logoTEC() {
			return getRuleContexts(Sentencia_logoTECContext.class);
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
			setState(141); match(DO_N);
			setState(142); ((RepiteContext)_localctx).numero = numero();
			setState(143); match(PAR_CUAD_ABIERTO);

									List<ASTNode> body = new ArrayList<ASTNode>();
									
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAZ) | (1L << INIC) | (1L << INC) | (1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << MAYOR) | (1L << MENOR) | (1L << AND) | (1L << OR) | (1L << IGUALES) | (1L << WHILE) | (1L << DO_WHILE) | (1L << IF_ELSE) | (1L << IF) | (1L << DO_N) | (1L << DO) | (1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO) | (1L << COLOR) | (1L << SUBE_LAPIZ) | (1L << BAJA_LAPIZ) | (1L << BORRADOR) | (1L << BORRA_PANTALLA))) != 0) || _la==ID) {
				{
				{
				setState(145); ((RepiteContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				body.add(((RepiteContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153); match(PAR_CUAD_CERRADO);
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

	public static class SiContext extends ParserRuleContext {
		public ASTNode node;
		public CondicionContext condicion;
		public Sentencia_logoTECContext sentencia_logoTEC;
		public TerminalNode IF() { return getToken(LogoTECParser.IF, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CUAD_ABIERTO() { return getToken(LogoTECParser.PAR_CUAD_ABIERTO, 0); }
		public Sentencia_logoTECContext sentencia_logoTEC(int i) {
			return getRuleContext(Sentencia_logoTECContext.class,i);
		}
		public List<Sentencia_logoTECContext> sentencia_logoTEC() {
			return getRuleContexts(Sentencia_logoTECContext.class);
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
			setState(156); match(IF);
			setState(157); ((SiContext)_localctx).condicion = condicion();
			setState(158); match(PAR_CUAD_ABIERTO);

									List<ASTNode> body = new ArrayList<ASTNode>();
									
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAZ) | (1L << INIC) | (1L << INC) | (1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << MAYOR) | (1L << MENOR) | (1L << AND) | (1L << OR) | (1L << IGUALES) | (1L << WHILE) | (1L << DO_WHILE) | (1L << IF_ELSE) | (1L << IF) | (1L << DO_N) | (1L << DO) | (1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO) | (1L << COLOR) | (1L << SUBE_LAPIZ) | (1L << BAJA_LAPIZ) | (1L << BORRADOR) | (1L << BORRA_PANTALLA))) != 0) || _la==ID) {
				{
				{
				setState(160); ((SiContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				body.add(((SiContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168); match(PAR_CUAD_CERRADO);
			((SiContext)_localctx).node =  new Si(((SiContext)_localctx).condicion.node, body);
			}
		}
		catch (RecognitionException re) {
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
		public ASTNode node;
		public CondicionContext condicion;
		public Sentencia_logoTECContext sentencia_logoTEC;
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
			setState(171); match(IF_ELSE);
			setState(172); ((SisinoContext)_localctx).condicion = condicion();
			setState(173); match(PAR_CUAD_ABIERTO);

									List<ASTNode> ifBody = new ArrayList<ASTNode>();
									List<ASTNode> elseBody = new ArrayList<ASTNode>();
									
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAZ) | (1L << INIC) | (1L << INC) | (1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << MAYOR) | (1L << MENOR) | (1L << AND) | (1L << OR) | (1L << IGUALES) | (1L << WHILE) | (1L << DO_WHILE) | (1L << IF_ELSE) | (1L << IF) | (1L << DO_N) | (1L << DO) | (1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO) | (1L << COLOR) | (1L << SUBE_LAPIZ) | (1L << BAJA_LAPIZ) | (1L << BORRADOR) | (1L << BORRA_PANTALLA))) != 0) || _la==ID) {
				{
				{
				setState(175); ((SisinoContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				ifBody.add(((SisinoContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183); match(PAR_CUAD_CERRADO);
			setState(184); match(PAR_CUAD_ABIERTO);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAZ) | (1L << INIC) | (1L << INC) | (1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << MAYOR) | (1L << MENOR) | (1L << AND) | (1L << OR) | (1L << IGUALES) | (1L << WHILE) | (1L << DO_WHILE) | (1L << IF_ELSE) | (1L << IF) | (1L << DO_N) | (1L << DO) | (1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO) | (1L << COLOR) | (1L << SUBE_LAPIZ) | (1L << BAJA_LAPIZ) | (1L << BORRADOR) | (1L << BORRA_PANTALLA))) != 0) || _la==ID) {
				{
				{
				setState(185); ((SisinoContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				elseBody.add(((SisinoContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193); match(PAR_CUAD_CERRADO);
			((SisinoContext)_localctx).node =  new SiSiNo(((SisinoContext)_localctx).condicion.node, ifBody, elseBody);
			}
		}
		catch (RecognitionException re) {
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
		public ASTNode node;
		public Sentencia_logoTECContext sentencia_logoTEC;
		public CondicionContext condicion;
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
			setState(196); match(DO_WHILE);
			setState(197); match(PAR_CUAD_ABIERTO);

						List<ASTNode> body = new ArrayList<ASTNode>();
						
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAZ) | (1L << INIC) | (1L << INC) | (1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << MAYOR) | (1L << MENOR) | (1L << AND) | (1L << OR) | (1L << IGUALES) | (1L << WHILE) | (1L << DO_WHILE) | (1L << IF_ELSE) | (1L << IF) | (1L << DO_N) | (1L << DO) | (1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO) | (1L << COLOR) | (1L << SUBE_LAPIZ) | (1L << BAJA_LAPIZ) | (1L << BORRADOR) | (1L << BORRA_PANTALLA))) != 0) || _la==ID) {
				{
				{
				setState(199); ((Do_whileContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				body.add(((Do_whileContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207); match(PAR_CUAD_CERRADO);
			setState(208); match(PAR_CUAD_ABIERTO);
			setState(209); ((Do_whileContext)_localctx).condicion = condicion();
			setState(210); match(PAR_CUAD_CERRADO);
			((Do_whileContext)_localctx).node =  new DoWhile(((Do_whileContext)_localctx).condicion.node, body);
			}
		}
		catch (RecognitionException re) {
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
		public ASTNode node;
		public CondicionContext condicion;
		public Sentencia_logoTECContext sentencia_logoTEC;
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
		public TerminalNode WHILE() { return getToken(LogoTECParser.WHILE, 0); }
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
			setState(213); match(WHILE);
			setState(214); match(PAR_CUAD_ABIERTO);
			setState(215); ((MientrasContext)_localctx).condicion = condicion();
			setState(216); match(PAR_CUAD_CERRADO);
			setState(217); match(PAR_CUAD_ABIERTO);

						List<ASTNode> body = new ArrayList<ASTNode>();
						
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAZ) | (1L << INIC) | (1L << INC) | (1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << MAYOR) | (1L << MENOR) | (1L << AND) | (1L << OR) | (1L << IGUALES) | (1L << WHILE) | (1L << DO_WHILE) | (1L << IF_ELSE) | (1L << IF) | (1L << DO_N) | (1L << DO) | (1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO) | (1L << COLOR) | (1L << SUBE_LAPIZ) | (1L << BAJA_LAPIZ) | (1L << BORRADOR) | (1L << BORRA_PANTALLA))) != 0) || _la==ID) {
				{
				{
				setState(219); ((MientrasContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				body.add(((MientrasContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); match(PAR_CUAD_CERRADO);
			((MientrasContext)_localctx).node =  new WhileDo(((MientrasContext)_localctx).condicion.node, body);
			}
		}
		catch (RecognitionException re) {
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
		public SiContext si;
		public SisinoContext sisino;
		public Do_whileContext do_while;
		public MientrasContext mientras;
		public Operacion_aritmeticaContext operacion_aritmetica;
		public Ordenes_logicasContext ordenes_logicas;
		public Ordenes_variablesContext ordenes_variables() {
			return getRuleContext(Ordenes_variablesContext.class,0);
		}
		public Ordenes_logicasContext ordenes_logicas() {
			return getRuleContext(Ordenes_logicasContext.class,0);
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
		public Ordenes_tortugaContext ordenes_tortuga() {
			return getRuleContext(Ordenes_tortugaContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public EjecutaContext ejecuta() {
			return getRuleContext(EjecutaContext.class,0);
		}
		public Operacion_aritmeticaContext operacion_aritmetica() {
			return getRuleContext(Operacion_aritmeticaContext.class,0);
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
			setState(260);
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
				setState(230); ((Sentencia_logoTECContext)_localctx).ordenes_tortuga = ordenes_tortuga();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ordenes_tortuga.node;
				}
				break;
			case HAZ:
			case INIC:
			case INC:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); ((Sentencia_logoTECContext)_localctx).ordenes_variables = ordenes_variables();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ordenes_variables.node;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(236); ((Sentencia_logoTECContext)_localctx).ejecuta = ejecuta();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ejecuta.node;
				}
				break;
			case DO_N:
				enterOuterAlt(_localctx, 4);
				{
				setState(239); ((Sentencia_logoTECContext)_localctx).repite = repite();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).repite.node;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(242); ((Sentencia_logoTECContext)_localctx).si = si();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).si.node;
				}
				break;
			case IF_ELSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(245); ((Sentencia_logoTECContext)_localctx).sisino = sisino();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).sisino.node;
				}
				break;
			case DO_WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(248); ((Sentencia_logoTECContext)_localctx).do_while = do_while();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).do_while.node;
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(251); ((Sentencia_logoTECContext)_localctx).mientras = mientras();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).mientras.node;
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
				enterOuterAlt(_localctx, 9);
				{
				setState(254); ((Sentencia_logoTECContext)_localctx).operacion_aritmetica = operacion_aritmetica();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).operacion_aritmetica.node;
				}
				break;
			case MAYOR:
			case MENOR:
			case AND:
			case OR:
			case IGUALES:
				enterOuterAlt(_localctx, 10);
				{
				setState(257); ((Sentencia_logoTECContext)_localctx).ordenes_logicas = ordenes_logicas();
				((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ordenes_logicas.node;
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
		enterRule(_localctx, 16, RULE_ordenes_variables);
		try {
			setState(274);
			switch (_input.LA(1)) {
			case HAZ:
				enterOuterAlt(_localctx, 1);
				{
				setState(262); ((Ordenes_variablesContext)_localctx).asignacion = asignacion();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).asignacion.node;
				}
				break;
			case INIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(265); ((Ordenes_variablesContext)_localctx).reasignacion = reasignacion();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).reasignacion.node;
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 3);
				{
				setState(268); ((Ordenes_variablesContext)_localctx).incrementa = incrementa();
				((Ordenes_variablesContext)_localctx).node =  ((Ordenes_variablesContext)_localctx).incrementa.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(271); ((Ordenes_variablesContext)_localctx).referencia = referencia();
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
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(HAZ);
			setState(277); ((AsignacionContext)_localctx).ID = match(ID);
			setState(278); ((AsignacionContext)_localctx).dato = dato();
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
		enterRule(_localctx, 20, RULE_reasignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(INIC);
			setState(282); ((ReasignacionContext)_localctx).ID = match(ID);
			setState(283); match(ASIGNAR);
			setState(284); ((ReasignacionContext)_localctx).dato = dato();
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
		enterRule(_localctx, 22, RULE_incrementa);
		try {
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287); match(INC);
				setState(288); match(PAR_CUAD_ABIERTO);
				setState(289); ((IncrementaContext)_localctx).ID = match(ID);
				setState(290); match(PAR_CUAD_CERRADO);
				((IncrementaContext)_localctx).node =   new IncrementaUno((((IncrementaContext)_localctx).ID!=null?((IncrementaContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); match(INC);
				setState(293); match(PAR_CUAD_ABIERTO);
				setState(294); ((IncrementaContext)_localctx).ID = match(ID);
				setState(295); ((IncrementaContext)_localctx).dato = dato();
				setState(296); match(PAR_CUAD_CERRADO);
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
		enterRule(_localctx, 24, RULE_referencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); ((ReferenciaContext)_localctx).ID = match(ID);
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
		enterRule(_localctx, 26, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); match(PAR_ABIERTO);
			setState(305); ((CondicionContext)_localctx).ordenes_logicas = ordenes_logicas();
			((CondicionContext)_localctx).node =  ((CondicionContext)_localctx).ordenes_logicas.node;
			setState(307); match(PAR_CERRADO);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_ordenes_logicas);
		try {
			setState(324);
			switch (_input.LA(1)) {
			case IGUALES:
				enterOuterAlt(_localctx, 1);
				{
				setState(309); ((Ordenes_logicasContext)_localctx).iguales = iguales();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).iguales.node;
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(312); ((Ordenes_logicasContext)_localctx).and = and();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).and.node;
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(315); ((Ordenes_logicasContext)_localctx).or = or();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).or.node;
				}
				break;
			case MAYOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(318); ((Ordenes_logicasContext)_localctx).mayor = mayor();
				((Ordenes_logicasContext)_localctx).node =  ((Ordenes_logicasContext)_localctx).mayor.node;
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(321); ((Ordenes_logicasContext)_localctx).menor = menor();
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
		enterRule(_localctx, 30, RULE_iguales);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(IGUALES);
			setState(327); ((IgualesContext)_localctx).d1 = ((IgualesContext)_localctx).dato = dato();
			((IgualesContext)_localctx).node =  ((IgualesContext)_localctx).dato.node;
			setState(329); ((IgualesContext)_localctx).d2 = ((IgualesContext)_localctx).dato = dato();
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
		enterRule(_localctx, 32, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(AND);
			setState(333); ((AndContext)_localctx).c1 = ((AndContext)_localctx).condicion = condicion();
			((AndContext)_localctx).node =  ((AndContext)_localctx).condicion.node;
			setState(335); ((AndContext)_localctx).c2 = ((AndContext)_localctx).condicion = condicion();
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
		enterRule(_localctx, 34, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(OR);
			setState(339); ((OrContext)_localctx).c1 = ((OrContext)_localctx).condicion = condicion();
			((OrContext)_localctx).node =  ((OrContext)_localctx).condicion.node;
			setState(341); ((OrContext)_localctx).c2 = ((OrContext)_localctx).condicion = condicion();
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
		enterRule(_localctx, 36, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(MAYOR);
			setState(345); ((MayorContext)_localctx).n1 = ((MayorContext)_localctx).numero = numero();
			((MayorContext)_localctx).node =  ((MayorContext)_localctx).numero.node;
			setState(347); ((MayorContext)_localctx).n2 = ((MayorContext)_localctx).numero = numero();
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
		enterRule(_localctx, 38, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); match(MENOR);
			setState(351); ((MenorContext)_localctx).n1 = ((MenorContext)_localctx).numero = numero();
			((MenorContext)_localctx).node =  ((MenorContext)_localctx).numero.node;
			setState(353); ((MenorContext)_localctx).n2 = ((MenorContext)_localctx).numero = numero();
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
		enterRule(_localctx, 40, RULE_operacion_aritmetica);
		try {
			setState(383);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(356); ((Operacion_aritmeticaContext)_localctx).suma = suma();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).suma.node;
				}
				break;
			case DIFERENCIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(359); ((Operacion_aritmeticaContext)_localctx).diferencia = diferencia();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).diferencia.node;
				}
				break;
			case PRODUCTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(362); ((Operacion_aritmeticaContext)_localctx).producto = producto();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).producto.node;
				}
				break;
			case POTENCIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(365); ((Operacion_aritmeticaContext)_localctx).potencia = potencia();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).potencia.node;
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 5);
				{
				setState(368); ((Operacion_aritmeticaContext)_localctx).division = division();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).division.node;
				}
				break;
			case RESIDUO:
				enterOuterAlt(_localctx, 6);
				{
				setState(371); ((Operacion_aritmeticaContext)_localctx).residuo = residuo();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).residuo.node;
				}
				break;
			case REDONDEO:
				enterOuterAlt(_localctx, 7);
				{
				setState(374); ((Operacion_aritmeticaContext)_localctx).redondear = redondear();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).redondear.node;
				}
				break;
			case AZAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(377); ((Operacion_aritmeticaContext)_localctx).azar = azar();
				((Operacion_aritmeticaContext)_localctx).node =  ((Operacion_aritmeticaContext)_localctx).azar.node;
				}
				break;
			case NEGATIVO:
				enterOuterAlt(_localctx, 9);
				{
				setState(380); ((Operacion_aritmeticaContext)_localctx).menos = menos();
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
		enterRule(_localctx, 42, RULE_suma);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(SUMA);
			setState(386); ((SumaContext)_localctx).n1 = numero();
			((SumaContext)_localctx).node =  ((SumaContext)_localctx).n1.node;
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388); ((SumaContext)_localctx).n2 = numero();
					((SumaContext)_localctx).node =  new Suma(_localctx.node, ((SumaContext)_localctx).n2.node);
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 44, RULE_diferencia);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396); match(DIFERENCIA);
			setState(397); ((DiferenciaContext)_localctx).n1 = numero();
			((DiferenciaContext)_localctx).node =  ((DiferenciaContext)_localctx).n1.node;
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399); ((DiferenciaContext)_localctx).n2 = numero();
					((DiferenciaContext)_localctx).node =  new Diferencia(_localctx.node, ((DiferenciaContext)_localctx).n2.node);
					}
					} 
				}
				setState(406);
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
		enterRule(_localctx, 46, RULE_producto);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(407); match(PRODUCTO);
			setState(408); ((ProductoContext)_localctx).n1 = numero();
			((ProductoContext)_localctx).node =  ((ProductoContext)_localctx).n1.node;
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410); ((ProductoContext)_localctx).n2 = numero();
					((ProductoContext)_localctx).node =  new Producto(_localctx.node, ((ProductoContext)_localctx).n2.node);
					}
					} 
				}
				setState(417);
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
		enterRule(_localctx, 48, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); match(POTENCIA);
			setState(419); ((PotenciaContext)_localctx).n1 = numero();
			((PotenciaContext)_localctx).node =  ((PotenciaContext)_localctx).n1.node;
			{
			setState(421); ((PotenciaContext)_localctx).n2 = numero();
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
		enterRule(_localctx, 50, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); match(DIVISION);
			setState(425); ((DivisionContext)_localctx).n1 = numero();
			((DivisionContext)_localctx).node =  ((DivisionContext)_localctx).n1.node;
			{
			setState(427); ((DivisionContext)_localctx).n2 = numero();
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
		enterRule(_localctx, 52, RULE_residuo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(RESIDUO);
			setState(431); ((ResiduoContext)_localctx).n1 = numero();
			((ResiduoContext)_localctx).node =  ((ResiduoContext)_localctx).n1.node;
			{
			setState(433); ((ResiduoContext)_localctx).n2 = numero();
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
		enterRule(_localctx, 54, RULE_redondear);
		try {
			setState(443);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436); match(REDONDEO);
				setState(437); ((RedondearContext)_localctx).numero = numero();
				((RedondearContext)_localctx).node =  new Redondear(((RedondearContext)_localctx).numero.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440); match(REDONDEO);
				setState(441); ((RedondearContext)_localctx).FLOAT = match(FLOAT);
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
		enterRule(_localctx, 56, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); match(AZAR);
			setState(446); ((AzarContext)_localctx).numero = numero();
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
		enterRule(_localctx, 58, RULE_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); match(NEGATIVO);
			setState(450); ((MenosContext)_localctx).numero = numero();
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
		enterRule(_localctx, 60, RULE_ordenes_listas);
		try {
			setState(468);
			switch (_input.LA(1)) {
			case ELEMENTO_AZAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(453); ((Ordenes_listasContext)_localctx).elegir = elegir();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).elegir.node;
				}
				break;
			case ELEMENTO_N:
				enterOuterAlt(_localctx, 2);
				{
				setState(456); ((Ordenes_listasContext)_localctx).elemento_n = elemento_n();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).elemento_n.node;
				}
				break;
			case LONGITUD:
				enterOuterAlt(_localctx, 3);
				{
				setState(459); ((Ordenes_listasContext)_localctx).largo = largo();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).largo.node;
				}
				break;
			case PRIMERO_LISTA:
				enterOuterAlt(_localctx, 4);
				{
				setState(462); ((Ordenes_listasContext)_localctx).primero = primero();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).primero.node;
				}
				break;
			case ULTIMO:
				enterOuterAlt(_localctx, 5);
				{
				setState(465); ((Ordenes_listasContext)_localctx).ultimo = ultimo();
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
		enterRule(_localctx, 62, RULE_elegir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); match(ELEMENTO_AZAR);
			setState(471); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(473); ((ElegirContext)_localctx).numero = numero();
				body.add(((ElegirContext)_localctx).numero.node);
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	Random rand = new Random(); 
				   							((ElegirContext)_localctx).node =  body.get(rand.nextInt(body.size()));
										   
			setState(482); match(PAR_CUAD_CERRADO);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_elemento_n);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); ((Elemento_nContext)_localctx).ELEMENTO_N = match(ELEMENTO_N);
			setState(485); match(ENTERO);
			setState(486); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(488); ((Elemento_nContext)_localctx).numero = numero();
				body.add(((Elemento_nContext)_localctx).numero.node);
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((Elemento_nContext)_localctx).node =  body.get(Integer.parseInt((((Elemento_nContext)_localctx).ELEMENTO_N!=null?((Elemento_nContext)_localctx).ELEMENTO_N.getText():null)));
										   
			setState(497); match(PAR_CUAD_CERRADO);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_largo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499); match(LONGITUD);
			setState(500); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(502); ((LargoContext)_localctx).numero = numero();
				body.add(((LargoContext)_localctx).numero.node);
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((LargoContext)_localctx).node =  new Constante(body.size());
										   
			setState(511); match(PAR_CUAD_CERRADO);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 68, RULE_primero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); match(PRIMERO_LISTA);
			setState(514); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(516); ((PrimeroContext)_localctx).numero = numero();
				body.add(((PrimeroContext)_localctx).numero.node);
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((PrimeroContext)_localctx).node =  body.get(0);
										   
			setState(525); match(PAR_CUAD_CERRADO);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_ultimo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527); match(ULTIMO);
			setState(528); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESIDUO) | (1L << DIVISION) | (1L << POTENCIA) | (1L << PRODUCTO) | (1L << NEGATIVO) | (1L << DIFERENCIA) | (1L << REDONDEO) | (1L << AZAR) | (1L << ELEMENTO_AZAR) | (1L << LONGITUD) | (1L << ULTIMO) | (1L << ELEMENTO_N) | (1L << PRIMERO_LISTA))) != 0) || _la==ID || _la==ENTERO) {
				{
				{
				setState(530); ((UltimoContext)_localctx).numero = numero();
				body.add(((UltimoContext)_localctx).numero.node);
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((UltimoContext)_localctx).node =  body.get(body.size()-1);
										   
			setState(539); match(PAR_CUAD_CERRADO);
			}
		}
		catch (RecognitionException re) {
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
			setState(583);
			switch (_input.LA(1)) {
			case AVANZA:
				enterOuterAlt(_localctx, 1);
				{
				setState(541); ((Ordenes_tortugaContext)_localctx).avanzar = avanzar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).avanzar.node;
				}
				break;
			case RETROCEDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(544); ((Ordenes_tortugaContext)_localctx).retroceder = retroceder();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).retroceder.node;
				}
				break;
			case GIRA_DERECHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(547); ((Ordenes_tortugaContext)_localctx).girar_derecha = girar_derecha();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).girar_derecha.node;
				}
				break;
			case GIRA_IZQUIERDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(550); ((Ordenes_tortugaContext)_localctx).girar_izquierda = girar_izquierda();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).girar_izquierda.node;
				}
				break;
			case OCULTA_TORTUGA:
				enterOuterAlt(_localctx, 5);
				{
				setState(553); ((Ordenes_tortugaContext)_localctx).ocultar_tortuga = ocultar_tortuga();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).ocultar_tortuga.node;
				}
				break;
			case APARECE_TORTUGA:
				enterOuterAlt(_localctx, 6);
				{
				setState(556); ((Ordenes_tortugaContext)_localctx).aparecer_tortuga = aparecer_tortuga();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).aparecer_tortuga.node;
				}
				break;
			case PON_POS:
				enterOuterAlt(_localctx, 7);
				{
				setState(559); ((Ordenes_tortugaContext)_localctx).definir_coord = definir_coord();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_coord.node;
				}
				break;
			case PONX:
				enterOuterAlt(_localctx, 8);
				{
				setState(562); ((Ordenes_tortugaContext)_localctx).definir_x = definir_x();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_x.node;
				}
				break;
			case PONY:
				enterOuterAlt(_localctx, 9);
				{
				setState(565); ((Ordenes_tortugaContext)_localctx).definir_y = definir_y();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_y.node;
				}
				break;
			case PON_RUMBO:
				enterOuterAlt(_localctx, 10);
				{
				setState(568); ((Ordenes_tortugaContext)_localctx).definir_dir = definir_dir();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_dir.node;
				}
				break;
			case RUMBO:
				enterOuterAlt(_localctx, 11);
				{
				setState(571); ((Ordenes_tortugaContext)_localctx).rumbo = rumbo();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).rumbo.node;
				}
				break;
			case CENTRO:
				enterOuterAlt(_localctx, 12);
				{
				setState(574); ((Ordenes_tortugaContext)_localctx).centrar = centrar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).centrar.node;
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 13);
				{
				setState(577); ((Ordenes_tortugaContext)_localctx).esperar = esperar();
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
				setState(580); ((Ordenes_tortugaContext)_localctx).ordenes_lienzo = ordenes_lienzo();
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
			enterOuterAlt(_localctx, 1);
			{
			setState(585); match(AVANZA);
			setState(586); ((AvanzarContext)_localctx).numero = numero();
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
		enterRule(_localctx, 76, RULE_retroceder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589); match(RETROCEDE);
			setState(590); ((RetrocederContext)_localctx).numero = numero();
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
		enterRule(_localctx, 78, RULE_girar_derecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); match(GIRA_DERECHA);
			setState(594); ((Girar_derechaContext)_localctx).numero = numero();
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
		enterRule(_localctx, 80, RULE_girar_izquierda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597); match(GIRA_IZQUIERDA);
			setState(598); ((Girar_izquierdaContext)_localctx).numero = numero();
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
		enterRule(_localctx, 82, RULE_definir_coord);
		try {
			setState(615);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601); match(PON_POS);
				setState(602); match(PAR_CUAD_ABIERTO);
				setState(603); ((Definir_coordContext)_localctx).n1 = numero();
				((Definir_coordContext)_localctx).node =  ((Definir_coordContext)_localctx).n1.node;
				setState(605); ((Definir_coordContext)_localctx).n2 = numero();
				((Definir_coordContext)_localctx).node =  new TortugaDefinirCoord(_localctx.node, ((Definir_coordContext)_localctx).n2.node);
				setState(607); match(PAR_CUAD_CERRADO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609); match(PON_POS);
				setState(610); ((Definir_coordContext)_localctx).n1 = numero();
				((Definir_coordContext)_localctx).node =  ((Definir_coordContext)_localctx).n1.node;
				setState(612); ((Definir_coordContext)_localctx).n2 = numero();
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
		enterRule(_localctx, 84, RULE_definir_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617); match(PONX);
			setState(618); ((Definir_xContext)_localctx).numero = numero();
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
		enterRule(_localctx, 86, RULE_definir_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621); match(PONY);
			setState(622); ((Definir_yContext)_localctx).numero = numero();
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
		enterRule(_localctx, 88, RULE_definir_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625); match(PON_RUMBO);
			setState(626); ((Definir_dirContext)_localctx).numero = numero();
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
		enterRule(_localctx, 90, RULE_esperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629); match(ESPERA);
			setState(630); ((EsperarContext)_localctx).numero = numero();
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
		enterRule(_localctx, 92, RULE_ocultar_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); match(OCULTA_TORTUGA);
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
		enterRule(_localctx, 94, RULE_aparecer_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636); match(APARECE_TORTUGA);
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
		enterRule(_localctx, 96, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639); match(RUMBO);
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
		enterRule(_localctx, 98, RULE_centrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642); match(CENTRO);
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
			setState(660);
			switch (_input.LA(1)) {
			case BORRADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(645); ((Ordenes_lienzoContext)_localctx).borrar = borrar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).borrar.node;
				}
				break;
			case BAJA_LAPIZ:
				enterOuterAlt(_localctx, 2);
				{
				setState(648); ((Ordenes_lienzoContext)_localctx).dibujar = dibujar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).dibujar.node;
				}
				break;
			case SUBE_LAPIZ:
				enterOuterAlt(_localctx, 3);
				{
				setState(651); ((Ordenes_lienzoContext)_localctx).no_dibujar = no_dibujar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).no_dibujar.node;
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(654); ((Ordenes_lienzoContext)_localctx).definir_color = definir_color();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).definir_color.node;
				}
				break;
			case BORRA_PANTALLA:
				enterOuterAlt(_localctx, 5);
				{
				setState(657); ((Ordenes_lienzoContext)_localctx).borra_pantalla = borra_pantalla();
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
		enterRule(_localctx, 102, RULE_borrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662); match(BORRADOR);
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
		enterRule(_localctx, 104, RULE_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665); match(BAJA_LAPIZ);
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
		enterRule(_localctx, 106, RULE_no_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668); match(SUBE_LAPIZ);
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
			setState(671); match(COLOR);
			setState(672); ((Definir_colorContext)_localctx).ID = match(ID);
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
			setState(675); match(BORRA_PANTALLA);
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
		enterRule(_localctx, 112, RULE_dato);
		try {
			setState(689);
			switch (_input.LA(1)) {
			case COMILLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(678); match(COMILLA);
				setState(679); ((DatoContext)_localctx).ID = match(ID);
				setState(680); match(COMILLA);
				((DatoContext)_localctx).node =  new Constante((((DatoContext)_localctx).ID!=null?((DatoContext)_localctx).ID.getText():null));
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(682); ((DatoContext)_localctx).TRUE = match(TRUE);
				((DatoContext)_localctx).node =  new Constante(Boolean.parseBoolean((((DatoContext)_localctx).TRUE!=null?((DatoContext)_localctx).TRUE.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(684); ((DatoContext)_localctx).FALSE = match(FALSE);
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
				setState(686); ((DatoContext)_localctx).numero = numero();
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
		enterRule(_localctx, 114, RULE_numero);
		try {
			setState(702);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(691); ((NumeroContext)_localctx).ENTERO = match(ENTERO);
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
				setState(693); ((NumeroContext)_localctx).ordenes_listas = ordenes_listas();
				((NumeroContext)_localctx).node =  ((NumeroContext)_localctx).ordenes_listas.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(696); ((NumeroContext)_localctx).referencia = referencia();
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
				setState(699); ((NumeroContext)_localctx).operacion_aritmetica = operacion_aritmetica();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3M\u02c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\7\2{\n\2\f\2\16\2~\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0088"+
		"\n\3\f\3\16\3\u008b\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0097"+
		"\n\4\f\4\16\4\u009a\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00a6"+
		"\n\5\f\5\16\5\u00a9\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b5"+
		"\n\6\f\6\16\6\u00b8\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u00bf\n\6\f\6\16\6\u00c2"+
		"\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00cd\n\7\f\7\16\7\u00d0"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00e1\n\b\f\b\16\b\u00e4\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0107\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0115\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u012e\n\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0147\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0182\n\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u018a\n\27\f\27\16\27\u018d"+
		"\13\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0195\n\30\f\30\16\30\u0198"+
		"\13\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01a0\n\31\f\31\16\31\u01a3"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01be"+
		"\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \5 \u01d7\n \3!\3!\3!\3!\3!\3!\7!\u01df\n!\f!\16"+
		"!\u01e2\13!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01ee\n\"\f\"\16"+
		"\"\u01f1\13\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\7#\u01fc\n#\f#\16#\u01ff\13"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\7$\u020a\n$\f$\16$\u020d\13$\3$\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\7%\u0218\n%\f%\16%\u021b\13%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u024a\n&\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\5+\u026a\n+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0297"+
		"\n\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\39\39\3"+
		"9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u02b4\n:\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\5;\u02c1\n;\3;\2\2<\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\2\u02ce\2v\3\2"+
		"\2\2\4\u0081\3\2\2\2\6\u008f\3\2\2\2\b\u009e\3\2\2\2\n\u00ad\3\2\2\2\f"+
		"\u00c6\3\2\2\2\16\u00d7\3\2\2\2\20\u0106\3\2\2\2\22\u0114\3\2\2\2\24\u0116"+
		"\3\2\2\2\26\u011b\3\2\2\2\30\u012d\3\2\2\2\32\u012f\3\2\2\2\34\u0132\3"+
		"\2\2\2\36\u0146\3\2\2\2 \u0148\3\2\2\2\"\u014e\3\2\2\2$\u0154\3\2\2\2"+
		"&\u015a\3\2\2\2(\u0160\3\2\2\2*\u0181\3\2\2\2,\u0183\3\2\2\2.\u018e\3"+
		"\2\2\2\60\u0199\3\2\2\2\62\u01a4\3\2\2\2\64\u01aa\3\2\2\2\66\u01b0\3\2"+
		"\2\28\u01bd\3\2\2\2:\u01bf\3\2\2\2<\u01c3\3\2\2\2>\u01d6\3\2\2\2@\u01d8"+
		"\3\2\2\2B\u01e6\3\2\2\2D\u01f5\3\2\2\2F\u0203\3\2\2\2H\u0211\3\2\2\2J"+
		"\u0249\3\2\2\2L\u024b\3\2\2\2N\u024f\3\2\2\2P\u0253\3\2\2\2R\u0257\3\2"+
		"\2\2T\u0269\3\2\2\2V\u026b\3\2\2\2X\u026f\3\2\2\2Z\u0273\3\2\2\2\\\u0277"+
		"\3\2\2\2^\u027b\3\2\2\2`\u027e\3\2\2\2b\u0281\3\2\2\2d\u0284\3\2\2\2f"+
		"\u0296\3\2\2\2h\u0298\3\2\2\2j\u029b\3\2\2\2l\u029e\3\2\2\2n\u02a1\3\2"+
		"\2\2p\u02a5\3\2\2\2r\u02b3\3\2\2\2t\u02c0\3\2\2\2v|\b\2\1\2wx\5\20\t\2"+
		"xy\b\2\1\2y{\3\2\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2"+
		"\2\2~|\3\2\2\2\177\u0080\b\2\1\2\u0080\3\3\2\2\2\u0081\u0082\7\"\2\2\u0082"+
		"\u0083\7E\2\2\u0083\u0089\b\3\1\2\u0084\u0085\5\20\t\2\u0085\u0086\b\3"+
		"\1\2\u0086\u0088\3\2\2\2\u0087\u0084\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008d\7F\2\2\u008d\u008e\b\3\1\2\u008e\5\3\2\2\2\u008f\u0090"+
		"\7!\2\2\u0090\u0091\5t;\2\u0091\u0092\7E\2\2\u0092\u0098\b\4\1\2\u0093"+
		"\u0094\5\20\t\2\u0094\u0095\b\4\1\2\u0095\u0097\3\2\2\2\u0096\u0093\3"+
		"\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7F\2\2\u009c\u009d\b\4"+
		"\1\2\u009d\7\3\2\2\2\u009e\u009f\7 \2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1"+
		"\7E\2\2\u00a1\u00a7\b\5\1\2\u00a2\u00a3\5\20\t\2\u00a3\u00a4\b\5\1\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7F\2\2\u00ab\u00ac\b\5\1\2\u00ac\t\3\2\2\2\u00ad\u00ae\7\37\2\2"+
		"\u00ae\u00af\5\34\17\2\u00af\u00b0\7E\2\2\u00b0\u00b6\b\6\1\2\u00b1\u00b2"+
		"\5\20\t\2\u00b2\u00b3\b\6\1\2\u00b3\u00b5\3\2\2\2\u00b4\u00b1\3\2\2\2"+
		"\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7F\2\2\u00ba\u00c0\7E\2\2\u00bb"+
		"\u00bc\5\20\t\2\u00bc\u00bd\b\6\1\2\u00bd\u00bf\3\2\2\2\u00be\u00bb\3"+
		"\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7F\2\2\u00c4\u00c5\b\6"+
		"\1\2\u00c5\13\3\2\2\2\u00c6\u00c7\7\36\2\2\u00c7\u00c8\7E\2\2\u00c8\u00ce"+
		"\b\7\1\2\u00c9\u00ca\5\20\t\2\u00ca\u00cb\b\7\1\2\u00cb\u00cd\3\2\2\2"+
		"\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7F\2\2\u00d2"+
		"\u00d3\7E\2\2\u00d3\u00d4\5\34\17\2\u00d4\u00d5\7F\2\2\u00d5\u00d6\b\7"+
		"\1\2\u00d6\r\3\2\2\2\u00d7\u00d8\7\35\2\2\u00d8\u00d9\7E\2\2\u00d9\u00da"+
		"\5\34\17\2\u00da\u00db\7F\2\2\u00db\u00dc\7E\2\2\u00dc\u00e2\b\b\1\2\u00dd"+
		"\u00de\5\20\t\2\u00de\u00df\b\b\1\2\u00df\u00e1\3\2\2\2\u00e0\u00dd\3"+
		"\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7F\2\2\u00e6\u00e7\b\b"+
		"\1\2\u00e7\17\3\2\2\2\u00e8\u00e9\5J&\2\u00e9\u00ea\b\t\1\2\u00ea\u0107"+
		"\3\2\2\2\u00eb\u00ec\5\22\n\2\u00ec\u00ed\b\t\1\2\u00ed\u0107\3\2\2\2"+
		"\u00ee\u00ef\5\4\3\2\u00ef\u00f0\b\t\1\2\u00f0\u0107\3\2\2\2\u00f1\u00f2"+
		"\5\6\4\2\u00f2\u00f3\b\t\1\2\u00f3\u0107\3\2\2\2\u00f4\u00f5\5\b\5\2\u00f5"+
		"\u00f6\b\t\1\2\u00f6\u0107\3\2\2\2\u00f7\u00f8\5\n\6\2\u00f8\u00f9\b\t"+
		"\1\2\u00f9\u0107\3\2\2\2\u00fa\u00fb\5\f\7\2\u00fb\u00fc\b\t\1\2\u00fc"+
		"\u0107\3\2\2\2\u00fd\u00fe\5\16\b\2\u00fe\u00ff\b\t\1\2\u00ff\u0107\3"+
		"\2\2\2\u0100\u0101\5*\26\2\u0101\u0102\b\t\1\2\u0102\u0107\3\2\2\2\u0103"+
		"\u0104\5\36\20\2\u0104\u0105\b\t\1\2\u0105\u0107\3\2\2\2\u0106\u00e8\3"+
		"\2\2\2\u0106\u00eb\3\2\2\2\u0106\u00ee\3\2\2\2\u0106\u00f1\3\2\2\2\u0106"+
		"\u00f4\3\2\2\2\u0106\u00f7\3\2\2\2\u0106\u00fa\3\2\2\2\u0106\u00fd\3\2"+
		"\2\2\u0106\u0100\3\2\2\2\u0106\u0103\3\2\2\2\u0107\21\3\2\2\2\u0108\u0109"+
		"\5\24\13\2\u0109\u010a\b\n\1\2\u010a\u0115\3\2\2\2\u010b\u010c\5\26\f"+
		"\2\u010c\u010d\b\n\1\2\u010d\u0115\3\2\2\2\u010e\u010f\5\30\r\2\u010f"+
		"\u0110\b\n\1\2\u0110\u0115\3\2\2\2\u0111\u0112\5\32\16\2\u0112\u0113\b"+
		"\n\1\2\u0113\u0115\3\2\2\2\u0114\u0108\3\2\2\2\u0114\u010b\3\2\2\2\u0114"+
		"\u010e\3\2\2\2\u0114\u0111\3\2\2\2\u0115\23\3\2\2\2\u0116\u0117\7\6\2"+
		"\2\u0117\u0118\7J\2\2\u0118\u0119\5r:\2\u0119\u011a\b\13\1\2\u011a\25"+
		"\3\2\2\2\u011b\u011c\7\7\2\2\u011c\u011d\7J\2\2\u011d\u011e\7<\2\2\u011e"+
		"\u011f\5r:\2\u011f\u0120\b\f\1\2\u0120\27\3\2\2\2\u0121\u0122\7\b\2\2"+
		"\u0122\u0123\7E\2\2\u0123\u0124\7J\2\2\u0124\u0125\7F\2\2\u0125\u012e"+
		"\b\r\1\2\u0126\u0127\7\b\2\2\u0127\u0128\7E\2\2\u0128\u0129\7J\2\2\u0129"+
		"\u012a\5r:\2\u012a\u012b\7F\2\2\u012b\u012c\b\r\1\2\u012c\u012e\3\2\2"+
		"\2\u012d\u0121\3\2\2\2\u012d\u0126\3\2\2\2\u012e\31\3\2\2\2\u012f\u0130"+
		"\7J\2\2\u0130\u0131\b\16\1\2\u0131\33\3\2\2\2\u0132\u0133\7C\2\2\u0133"+
		"\u0134\5\36\20\2\u0134\u0135\b\17\1\2\u0135\u0136\7D\2\2\u0136\35\3\2"+
		"\2\2\u0137\u0138\5 \21\2\u0138\u0139\b\20\1\2\u0139\u0147\3\2\2\2\u013a"+
		"\u013b\5\"\22\2\u013b\u013c\b\20\1\2\u013c\u0147\3\2\2\2\u013d\u013e\5"+
		"$\23\2\u013e\u013f\b\20\1\2\u013f\u0147\3\2\2\2\u0140\u0141\5&\24\2\u0141"+
		"\u0142\b\20\1\2\u0142\u0147\3\2\2\2\u0143\u0144\5(\25\2\u0144\u0145\b"+
		"\20\1\2\u0145\u0147\3\2\2\2\u0146\u0137\3\2\2\2\u0146\u013a\3\2\2\2\u0146"+
		"\u013d\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0143\3\2\2\2\u0147\37\3\2\2"+
		"\2\u0148\u0149\7\27\2\2\u0149\u014a\5r:\2\u014a\u014b\b\21\1\2\u014b\u014c"+
		"\5r:\2\u014c\u014d\b\21\1\2\u014d!\3\2\2\2\u014e\u014f\7\25\2\2\u014f"+
		"\u0150\5\34\17\2\u0150\u0151\b\22\1\2\u0151\u0152\5\34\17\2\u0152\u0153"+
		"\b\22\1\2\u0153#\3\2\2\2\u0154\u0155\7\26\2\2\u0155\u0156\5\34\17\2\u0156"+
		"\u0157\b\23\1\2\u0157\u0158\5\34\17\2\u0158\u0159\b\23\1\2\u0159%\3\2"+
		"\2\2\u015a\u015b\7\23\2\2\u015b\u015c\5t;\2\u015c\u015d\b\24\1\2\u015d"+
		"\u015e\5t;\2\u015e\u015f\b\24\1\2\u015f\'\3\2\2\2\u0160\u0161\7\24\2\2"+
		"\u0161\u0162\5t;\2\u0162\u0163\b\25\1\2\u0163\u0164\5t;\2\u0164\u0165"+
		"\b\25\1\2\u0165)\3\2\2\2\u0166\u0167\5,\27\2\u0167\u0168\b\26\1\2\u0168"+
		"\u0182\3\2\2\2\u0169\u016a\5.\30\2\u016a\u016b\b\26\1\2\u016b\u0182\3"+
		"\2\2\2\u016c\u016d\5\60\31\2\u016d\u016e\b\26\1\2\u016e\u0182\3\2\2\2"+
		"\u016f\u0170\5\62\32\2\u0170\u0171\b\26\1\2\u0171\u0182\3\2\2\2\u0172"+
		"\u0173\5\64\33\2\u0173\u0174\b\26\1\2\u0174\u0182\3\2\2\2\u0175\u0176"+
		"\5\66\34\2\u0176\u0177\b\26\1\2\u0177\u0182\3\2\2\2\u0178\u0179\58\35"+
		"\2\u0179\u017a\b\26\1\2\u017a\u0182\3\2\2\2\u017b\u017c\5:\36\2\u017c"+
		"\u017d\b\26\1\2\u017d\u0182\3\2\2\2\u017e\u017f\5<\37\2\u017f\u0180\b"+
		"\26\1\2\u0180\u0182\3\2\2\2\u0181\u0166\3\2\2\2\u0181\u0169\3\2\2\2\u0181"+
		"\u016c\3\2\2\2\u0181\u016f\3\2\2\2\u0181\u0172\3\2\2\2\u0181\u0175\3\2"+
		"\2\2\u0181\u0178\3\2\2\2\u0181\u017b\3\2\2\2\u0181\u017e\3\2\2\2\u0182"+
		"+\3\2\2\2\u0183\u0184\7\n\2\2\u0184\u0185\5t;\2\u0185\u018b\b\27\1\2\u0186"+
		"\u0187\5t;\2\u0187\u0188\b\27\1\2\u0188\u018a\3\2\2\2\u0189\u0186\3\2"+
		"\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"-\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\20\2\2\u018f\u0190\5t;\2\u0190"+
		"\u0196\b\30\1\2\u0191\u0192\5t;\2\u0192\u0193\b\30\1\2\u0193\u0195\3\2"+
		"\2\2\u0194\u0191\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197/\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7\16\2\2"+
		"\u019a\u019b\5t;\2\u019b\u01a1\b\31\1\2\u019c\u019d\5t;\2\u019d\u019e"+
		"\b\31\1\2\u019e\u01a0\3\2\2\2\u019f\u019c\3\2\2\2\u01a0\u01a3\3\2\2\2"+
		"\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\61\3\2\2\2\u01a3\u01a1"+
		"\3\2\2\2\u01a4\u01a5\7\r\2\2\u01a5\u01a6\5t;\2\u01a6\u01a7\b\32\1\2\u01a7"+
		"\u01a8\5t;\2\u01a8\u01a9\b\32\1\2\u01a9\63\3\2\2\2\u01aa\u01ab\7\f\2\2"+
		"\u01ab\u01ac\5t;\2\u01ac\u01ad\b\33\1\2\u01ad\u01ae\5t;\2\u01ae\u01af"+
		"\b\33\1\2\u01af\65\3\2\2\2\u01b0\u01b1\7\13\2\2\u01b1\u01b2\5t;\2\u01b2"+
		"\u01b3\b\34\1\2\u01b3\u01b4\5t;\2\u01b4\u01b5\b\34\1\2\u01b5\67\3\2\2"+
		"\2\u01b6\u01b7\7\21\2\2\u01b7\u01b8\5t;\2\u01b8\u01b9\b\35\1\2\u01b9\u01be"+
		"\3\2\2\2\u01ba\u01bb\7\21\2\2\u01bb\u01bc\7L\2\2\u01bc\u01be\b\35\1\2"+
		"\u01bd\u01b6\3\2\2\2\u01bd\u01ba\3\2\2\2\u01be9\3\2\2\2\u01bf\u01c0\7"+
		"\22\2\2\u01c0\u01c1\5t;\2\u01c1\u01c2\b\36\1\2\u01c2;\3\2\2\2\u01c3\u01c4"+
		"\7\17\2\2\u01c4\u01c5\5t;\2\u01c5\u01c6\b\37\1\2\u01c6=\3\2\2\2\u01c7"+
		"\u01c8\5@!\2\u01c8\u01c9\b \1\2\u01c9\u01d7\3\2\2\2\u01ca\u01cb\5B\"\2"+
		"\u01cb\u01cc\b \1\2\u01cc\u01d7\3\2\2\2\u01cd\u01ce\5D#\2\u01ce\u01cf"+
		"\b \1\2\u01cf\u01d7\3\2\2\2\u01d0\u01d1\5F$\2\u01d1\u01d2\b \1\2\u01d2"+
		"\u01d7\3\2\2\2\u01d3\u01d4\5H%\2\u01d4\u01d5\b \1\2\u01d5\u01d7\3\2\2"+
		"\2\u01d6\u01c7\3\2\2\2\u01d6\u01ca\3\2\2\2\u01d6\u01cd\3\2\2\2\u01d6\u01d0"+
		"\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d7?\3\2\2\2\u01d8\u01d9\7\30\2\2\u01d9"+
		"\u01da\7E\2\2\u01da\u01e0\b!\1\2\u01db\u01dc\5t;\2\u01dc\u01dd\b!\1\2"+
		"\u01dd\u01df\3\2\2\2\u01de\u01db\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3"+
		"\u01e4\b!\1\2\u01e4\u01e5\7F\2\2\u01e5A\3\2\2\2\u01e6\u01e7\7\33\2\2\u01e7"+
		"\u01e8\7K\2\2\u01e8\u01e9\7E\2\2\u01e9\u01ef\b\"\1\2\u01ea\u01eb\5t;\2"+
		"\u01eb\u01ec\b\"\1\2\u01ec\u01ee\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ee\u01f1"+
		"\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f3\b\"\1\2\u01f3\u01f4\7F\2\2\u01f4C\3\2\2\2\u01f5"+
		"\u01f6\7\31\2\2\u01f6\u01f7\7E\2\2\u01f7\u01fd\b#\1\2\u01f8\u01f9\5t;"+
		"\2\u01f9\u01fa\b#\1\2\u01fa\u01fc\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fc\u01ff"+
		"\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u0200\u0201\b#\1\2\u0201\u0202\7F\2\2\u0202E\3\2\2\2\u0203"+
		"\u0204\7\34\2\2\u0204\u0205\7E\2\2\u0205\u020b\b$\1\2\u0206\u0207\5t;"+
		"\2\u0207\u0208\b$\1\2\u0208\u020a\3\2\2\2\u0209\u0206\3\2\2\2\u020a\u020d"+
		"\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020e\u020f\b$\1\2\u020f\u0210\7F\2\2\u0210G\3\2\2\2\u0211"+
		"\u0212\7\32\2\2\u0212\u0213\7E\2\2\u0213\u0219\b%\1\2\u0214\u0215\5t;"+
		"\2\u0215\u0216\b%\1\2\u0216\u0218\3\2\2\2\u0217\u0214\3\2\2\2\u0218\u021b"+
		"\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021c\u021d\b%\1\2\u021d\u021e\7F\2\2\u021eI\3\2\2\2\u021f"+
		"\u0220\5L\'\2\u0220\u0221\b&\1\2\u0221\u024a\3\2\2\2\u0222\u0223\5N(\2"+
		"\u0223\u0224\b&\1\2\u0224\u024a\3\2\2\2\u0225\u0226\5P)\2\u0226\u0227"+
		"\b&\1\2\u0227\u024a\3\2\2\2\u0228\u0229\5R*\2\u0229\u022a\b&\1\2\u022a"+
		"\u024a\3\2\2\2\u022b\u022c\5^\60\2\u022c\u022d\b&\1\2\u022d\u024a\3\2"+
		"\2\2\u022e\u022f\5`\61\2\u022f\u0230\b&\1\2\u0230\u024a\3\2\2\2\u0231"+
		"\u0232\5T+\2\u0232\u0233\b&\1\2\u0233\u024a\3\2\2\2\u0234\u0235\5V,\2"+
		"\u0235\u0236\b&\1\2\u0236\u024a\3\2\2\2\u0237\u0238\5X-\2\u0238\u0239"+
		"\b&\1\2\u0239\u024a\3\2\2\2\u023a\u023b\5Z.\2\u023b\u023c\b&\1\2\u023c"+
		"\u024a\3\2\2\2\u023d\u023e\5b\62\2\u023e\u023f\b&\1\2\u023f\u024a\3\2"+
		"\2\2\u0240\u0241\5d\63\2\u0241\u0242\b&\1\2\u0242\u024a\3\2\2\2\u0243"+
		"\u0244\5\\/\2\u0244\u0245\b&\1\2\u0245\u024a\3\2\2\2\u0246\u0247\5f\64"+
		"\2\u0247\u0248\b&\1\2\u0248\u024a\3\2\2\2\u0249\u021f\3\2\2\2\u0249\u0222"+
		"\3\2\2\2\u0249\u0225\3\2\2\2\u0249\u0228\3\2\2\2\u0249\u022b\3\2\2\2\u0249"+
		"\u022e\3\2\2\2\u0249\u0231\3\2\2\2\u0249\u0234\3\2\2\2\u0249\u0237\3\2"+
		"\2\2\u0249\u023a\3\2\2\2\u0249\u023d\3\2\2\2\u0249\u0240\3\2\2\2\u0249"+
		"\u0243\3\2\2\2\u0249\u0246\3\2\2\2\u024aK\3\2\2\2\u024b\u024c\7#\2\2\u024c"+
		"\u024d\5t;\2\u024d\u024e\b\'\1\2\u024eM\3\2\2\2\u024f\u0250\7$\2\2\u0250"+
		"\u0251\5t;\2\u0251\u0252\b(\1\2\u0252O\3\2\2\2\u0253\u0254\7&\2\2\u0254"+
		"\u0255\5t;\2\u0255\u0256\b)\1\2\u0256Q\3\2\2\2\u0257\u0258\7\'\2\2\u0258"+
		"\u0259\5t;\2\u0259\u025a\b*\1\2\u025aS\3\2\2\2\u025b\u025c\7+\2\2\u025c"+
		"\u025d\7E\2\2\u025d\u025e\5t;\2\u025e\u025f\b+\1\2\u025f\u0260\5t;\2\u0260"+
		"\u0261\b+\1\2\u0261\u0262\7F\2\2\u0262\u026a\3\2\2\2\u0263\u0264\7+\2"+
		"\2\u0264\u0265\5t;\2\u0265\u0266\b+\1\2\u0266\u0267\5t;\2\u0267\u0268"+
		"\b+\1\2\u0268\u026a\3\2\2\2\u0269\u025b\3\2\2\2\u0269\u0263\3\2\2\2\u026a"+
		"U\3\2\2\2\u026b\u026c\7,\2\2\u026c\u026d\5t;\2\u026d\u026e\b,\1\2\u026e"+
		"W\3\2\2\2\u026f\u0270\7-\2\2\u0270\u0271\5t;\2\u0271\u0272\b-\1\2\u0272"+
		"Y\3\2\2\2\u0273\u0274\7.\2\2\u0274\u0275\5t;\2\u0275\u0276\b.\1\2\u0276"+
		"[\3\2\2\2\u0277\u0278\7%\2\2\u0278\u0279\5t;\2\u0279\u027a\b/\1\2\u027a"+
		"]\3\2\2\2\u027b\u027c\7(\2\2\u027c\u027d\b\60\1\2\u027d_\3\2\2\2\u027e"+
		"\u027f\7)\2\2\u027f\u0280\b\61\1\2\u0280a\3\2\2\2\u0281\u0282\7/\2\2\u0282"+
		"\u0283\b\62\1\2\u0283c\3\2\2\2\u0284\u0285\7*\2\2\u0285\u0286\b\63\1\2"+
		"\u0286e\3\2\2\2\u0287\u0288\5h\65\2\u0288\u0289\b\64\1\2\u0289\u0297\3"+
		"\2\2\2\u028a\u028b\5j\66\2\u028b\u028c\b\64\1\2\u028c\u0297\3\2\2\2\u028d"+
		"\u028e\5l\67\2\u028e\u028f\b\64\1\2\u028f\u0297\3\2\2\2\u0290\u0291\5"+
		"n8\2\u0291\u0292\b\64\1\2\u0292\u0297\3\2\2\2\u0293\u0294\5p9\2\u0294"+
		"\u0295\b\64\1\2\u0295\u0297\3\2\2\2\u0296\u0287\3\2\2\2\u0296\u028a\3"+
		"\2\2\2\u0296\u028d\3\2\2\2\u0296\u0290\3\2\2\2\u0296\u0293\3\2\2\2\u0297"+
		"g\3\2\2\2\u0298\u0299\7\63\2\2\u0299\u029a\b\65\1\2\u029ai\3\2\2\2\u029b"+
		"\u029c\7\62\2\2\u029c\u029d\b\66\1\2\u029dk\3\2\2\2\u029e\u029f\7\61\2"+
		"\2\u029f\u02a0\b\67\1\2\u02a0m\3\2\2\2\u02a1\u02a2\7\60\2\2\u02a2\u02a3"+
		"\7J\2\2\u02a3\u02a4\b8\1\2\u02a4o\3\2\2\2\u02a5\u02a6\7\64\2\2\u02a6\u02a7"+
		"\b9\1\2\u02a7q\3\2\2\2\u02a8\u02a9\7I\2\2\u02a9\u02aa\7J\2\2\u02aa\u02ab"+
		"\7I\2\2\u02ab\u02b4\b:\1\2\u02ac\u02ad\7\65\2\2\u02ad\u02b4\b:\1\2\u02ae"+
		"\u02af\7\66\2\2\u02af\u02b4\b:\1\2\u02b0\u02b1\5t;\2\u02b1\u02b2\b:\1"+
		"\2\u02b2\u02b4\3\2\2\2\u02b3\u02a8\3\2\2\2\u02b3\u02ac\3\2\2\2\u02b3\u02ae"+
		"\3\2\2\2\u02b3\u02b0\3\2\2\2\u02b4s\3\2\2\2\u02b5\u02b6\7K\2\2\u02b6\u02c1"+
		"\b;\1\2\u02b7\u02b8\5> \2\u02b8\u02b9\b;\1\2\u02b9\u02c1\3\2\2\2\u02ba"+
		"\u02bb\5\32\16\2\u02bb\u02bc\b;\1\2\u02bc\u02c1\3\2\2\2\u02bd\u02be\5"+
		"*\26\2\u02be\u02bf\b;\1\2\u02bf\u02c1\3\2\2\2\u02c0\u02b5\3\2\2\2\u02c0"+
		"\u02b7\3\2\2\2\u02c0\u02ba\3\2\2\2\u02c0\u02bd\3\2\2\2\u02c1u\3\2\2\2"+
		"\36|\u0089\u0098\u00a7\u00b6\u00c0\u00ce\u00e2\u0106\u0114\u012d\u0146"+
		"\u0181\u018b\u0196\u01a1\u01bd\u01d6\u01e0\u01ef\u01fd\u020b\u0219\u0249"+
		"\u0269\u0296\u02b3\u02c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}