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
		RULE_programa = 0, RULE_sentencia_logoTEC = 1, RULE_ordenes_tortuga = 2, 
		RULE_avanzar = 3, RULE_retroceder = 4, RULE_girar_derecha = 5, RULE_girar_izquierda = 6, 
		RULE_definir_coord = 7, RULE_definir_x = 8, RULE_definir_y = 9, RULE_definir_dir = 10, 
		RULE_esperar = 11, RULE_ocultar_tortuga = 12, RULE_aparecer_tortuga = 13, 
		RULE_rumbo = 14, RULE_centrar = 15, RULE_ordenes_lienzo = 16, RULE_borrar = 17, 
		RULE_dibujar = 18, RULE_no_dibujar = 19, RULE_borra_pantalla = 20, RULE_dato = 21, 
		RULE_numero = 22;
	public static final String[] ruleNames = {
		"programa", "sentencia_logoTEC", "ordenes_tortuga", "avanzar", "retroceder", 
		"girar_derecha", "girar_izquierda", "definir_coord", "definir_x", "definir_y", 
		"definir_dir", "esperar", "ocultar_tortuga", "aparecer_tortuga", "rumbo", 
		"centrar", "ordenes_lienzo", "borrar", "dibujar", "no_dibujar", "borra_pantalla", 
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

			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0)) {
				{
				{
				setState(47); ((ProgramaContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				body.add(((ProgramaContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(54);
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

	public static class Sentencia_logoTECContext extends ParserRuleContext {
		public ASTNode node;
		public Ordenes_tortugaContext ordenes_tortuga;
		public Ordenes_tortugaContext ordenes_tortuga() {
			return getRuleContext(Ordenes_tortugaContext.class,0);
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
		enterRule(_localctx, 2, RULE_sentencia_logoTEC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); ((Sentencia_logoTECContext)_localctx).ordenes_tortuga = ordenes_tortuga();
			((Sentencia_logoTECContext)_localctx).node =  ((Sentencia_logoTECContext)_localctx).ordenes_tortuga.node;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 4, RULE_ordenes_tortuga);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case AVANZA:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); ((Ordenes_tortugaContext)_localctx).avanzar = avanzar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).avanzar.node;
				}
				break;
			case RETROCEDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); ((Ordenes_tortugaContext)_localctx).retroceder = retroceder();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).retroceder.node;
				}
				break;
			case GIRA_DERECHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); ((Ordenes_tortugaContext)_localctx).girar_derecha = girar_derecha();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).girar_derecha.node;
				}
				break;
			case GIRA_IZQUIERDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(69); ((Ordenes_tortugaContext)_localctx).girar_izquierda = girar_izquierda();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).girar_izquierda.node;
				}
				break;
			case OCULTA_TORTUGA:
				enterOuterAlt(_localctx, 5);
				{
				setState(72); ((Ordenes_tortugaContext)_localctx).ocultar_tortuga = ocultar_tortuga();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).ocultar_tortuga.node;
				}
				break;
			case APARECE_TORTUGA:
				enterOuterAlt(_localctx, 6);
				{
				setState(75); ((Ordenes_tortugaContext)_localctx).aparecer_tortuga = aparecer_tortuga();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).aparecer_tortuga.node;
				}
				break;
			case PON_POS:
				enterOuterAlt(_localctx, 7);
				{
				setState(78); ((Ordenes_tortugaContext)_localctx).definir_coord = definir_coord();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_coord.node;
				}
				break;
			case PONX:
				enterOuterAlt(_localctx, 8);
				{
				setState(81); ((Ordenes_tortugaContext)_localctx).definir_x = definir_x();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_x.node;
				}
				break;
			case PONY:
				enterOuterAlt(_localctx, 9);
				{
				setState(84); ((Ordenes_tortugaContext)_localctx).definir_y = definir_y();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_y.node;
				}
				break;
			case PON_RUMBO:
				enterOuterAlt(_localctx, 10);
				{
				setState(87); ((Ordenes_tortugaContext)_localctx).definir_dir = definir_dir();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_dir.node;
				}
				break;
			case RUMBO:
				enterOuterAlt(_localctx, 11);
				{
				setState(90); ((Ordenes_tortugaContext)_localctx).rumbo = rumbo();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).rumbo.node;
				}
				break;
			case CENTRO:
				enterOuterAlt(_localctx, 12);
				{
				setState(93); ((Ordenes_tortugaContext)_localctx).centrar = centrar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).centrar.node;
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 13);
				{
				setState(96); ((Ordenes_tortugaContext)_localctx).esperar = esperar();
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
		enterRule(_localctx, 6, RULE_avanzar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(AVANZA);
			setState(102); ((AvanzarContext)_localctx).numero = numero();
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
		enterRule(_localctx, 8, RULE_retroceder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(RETROCEDE);
			setState(106); ((RetrocederContext)_localctx).numero = numero();
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
		enterRule(_localctx, 10, RULE_girar_derecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(GIRA_DERECHA);
			setState(110); ((Girar_derechaContext)_localctx).numero = numero();
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
		enterRule(_localctx, 12, RULE_girar_izquierda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(GIRA_IZQUIERDA);
			setState(114); ((Girar_izquierdaContext)_localctx).numero = numero();
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
		enterRule(_localctx, 14, RULE_definir_coord);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); match(PON_POS);
				setState(118); match(PAR_CUAD_ABIERTO);
				setState(119); ((Definir_coordContext)_localctx).n1 = numero();
				((Definir_coordContext)_localctx).node =  ((Definir_coordContext)_localctx).n1.node;
				setState(121); ((Definir_coordContext)_localctx).n2 = numero();
				((Definir_coordContext)_localctx).node =  new TortugaDefinirCoord(_localctx.node, ((Definir_coordContext)_localctx).n2.node);
				setState(123); match(PAR_CUAD_CERRADO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); match(PON_POS);
				setState(126); ((Definir_coordContext)_localctx).n1 = numero();
				((Definir_coordContext)_localctx).node =  ((Definir_coordContext)_localctx).n1.node;
				setState(128); ((Definir_coordContext)_localctx).n2 = numero();
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
		enterRule(_localctx, 16, RULE_definir_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(PONX);
			setState(134); ((Definir_xContext)_localctx).numero = numero();
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
		enterRule(_localctx, 18, RULE_definir_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(PONY);
			setState(138); ((Definir_yContext)_localctx).numero = numero();
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
		enterRule(_localctx, 20, RULE_definir_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(PON_RUMBO);
			setState(142); ((Definir_dirContext)_localctx).numero = numero();
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
		enterRule(_localctx, 22, RULE_esperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(ESPERA);
			setState(146); ((EsperarContext)_localctx).numero = numero();
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
		enterRule(_localctx, 24, RULE_ocultar_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(OCULTA_TORTUGA);
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
		enterRule(_localctx, 26, RULE_aparecer_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(APARECE_TORTUGA);
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
		enterRule(_localctx, 28, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(RUMBO);
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
		enterRule(_localctx, 30, RULE_centrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(CENTRO);
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
		enterRule(_localctx, 32, RULE_ordenes_lienzo);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case BORRADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(161); ((Ordenes_lienzoContext)_localctx).borrar = borrar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).borrar.node;
				}
				break;
			case BAJA_LAPIZ:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); ((Ordenes_lienzoContext)_localctx).dibujar = dibujar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).dibujar.node;
				}
				break;
			case SUBE_LAPIZ:
				enterOuterAlt(_localctx, 3);
				{
				setState(167); ((Ordenes_lienzoContext)_localctx).no_dibujar = no_dibujar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).no_dibujar.node;
				}
				break;
			case BORRA_PANTALLA:
				enterOuterAlt(_localctx, 4);
				{
				setState(170); ((Ordenes_lienzoContext)_localctx).borra_pantalla = borra_pantalla();
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
		enterRule(_localctx, 34, RULE_borrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(BORRADOR);
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
		enterRule(_localctx, 36, RULE_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(BAJA_LAPIZ);
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
		enterRule(_localctx, 38, RULE_no_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(SUBE_LAPIZ);
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
		enterRule(_localctx, 40, RULE_borra_pantalla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(BORRA_PANTALLA);
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
		enterRule(_localctx, 42, RULE_dato);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case COMILLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); match(COMILLA);
				setState(188); ((DatoContext)_localctx).ID = match(ID);
				setState(189); match(COMILLA);
				((DatoContext)_localctx).node =  new Constante((((DatoContext)_localctx).ID!=null?((DatoContext)_localctx).ID.getText():null));
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(191); ((DatoContext)_localctx).TRUE = match(TRUE);
				((DatoContext)_localctx).node =  new Constante(Boolean.parseBoolean((((DatoContext)_localctx).TRUE!=null?((DatoContext)_localctx).TRUE.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(193); ((DatoContext)_localctx).FALSE = match(FALSE);
				((DatoContext)_localctx).node =  new Constante(Boolean.parseBoolean((((DatoContext)_localctx).FALSE!=null?((DatoContext)_localctx).FALSE.getText():null)));
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 4);
				{
				setState(195); ((DatoContext)_localctx).numero = numero();
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
		enterRule(_localctx, 44, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); ((NumeroContext)_localctx).ENTERO = match(ENTERO);
			((NumeroContext)_localctx).node =  new Constante(Integer.parseInt((((NumeroContext)_localctx).ENTERO!=null?((NumeroContext)_localctx).ENTERO.getText():null)));
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3J\u00ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4f\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0086\n"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b0\n\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00c9\n\27\3\30\3\30\3\30"+
		"\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\u00ca"+
		"\2\60\3\2\2\2\4;\3\2\2\2\6e\3\2\2\2\bg\3\2\2\2\nk\3\2\2\2\fo\3\2\2\2\16"+
		"s\3\2\2\2\20\u0085\3\2\2\2\22\u0087\3\2\2\2\24\u008b\3\2\2\2\26\u008f"+
		"\3\2\2\2\30\u0093\3\2\2\2\32\u0097\3\2\2\2\34\u009a\3\2\2\2\36\u009d\3"+
		"\2\2\2 \u00a0\3\2\2\2\"\u00af\3\2\2\2$\u00b1\3\2\2\2&\u00b4\3\2\2\2(\u00b7"+
		"\3\2\2\2*\u00ba\3\2\2\2,\u00c8\3\2\2\2.\u00ca\3\2\2\2\60\66\b\2\1\2\61"+
		"\62\5\4\3\2\62\63\b\2\1\2\63\65\3\2\2\2\64\61\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\b\2\1\2:\3\3\2\2\2;<"+
		"\5\6\4\2<=\b\3\1\2=\5\3\2\2\2>?\5\b\5\2?@\b\4\1\2@f\3\2\2\2AB\5\n\6\2"+
		"BC\b\4\1\2Cf\3\2\2\2DE\5\f\7\2EF\b\4\1\2Ff\3\2\2\2GH\5\16\b\2HI\b\4\1"+
		"\2If\3\2\2\2JK\5\32\16\2KL\b\4\1\2Lf\3\2\2\2MN\5\34\17\2NO\b\4\1\2Of\3"+
		"\2\2\2PQ\5\20\t\2QR\b\4\1\2Rf\3\2\2\2ST\5\22\n\2TU\b\4\1\2Uf\3\2\2\2V"+
		"W\5\24\13\2WX\b\4\1\2Xf\3\2\2\2YZ\5\26\f\2Z[\b\4\1\2[f\3\2\2\2\\]\5\36"+
		"\20\2]^\b\4\1\2^f\3\2\2\2_`\5 \21\2`a\b\4\1\2af\3\2\2\2bc\5\30\r\2cd\b"+
		"\4\1\2df\3\2\2\2e>\3\2\2\2eA\3\2\2\2eD\3\2\2\2eG\3\2\2\2eJ\3\2\2\2eM\3"+
		"\2\2\2eP\3\2\2\2eS\3\2\2\2eV\3\2\2\2eY\3\2\2\2e\\\3\2\2\2e_\3\2\2\2eb"+
		"\3\2\2\2f\7\3\2\2\2gh\7 \2\2hi\5.\30\2ij\b\5\1\2j\t\3\2\2\2kl\7!\2\2l"+
		"m\5.\30\2mn\b\6\1\2n\13\3\2\2\2op\7#\2\2pq\5.\30\2qr\b\7\1\2r\r\3\2\2"+
		"\2st\7$\2\2tu\5.\30\2uv\b\b\1\2v\17\3\2\2\2wx\7(\2\2xy\7C\2\2yz\5.\30"+
		"\2z{\b\t\1\2{|\5.\30\2|}\b\t\1\2}~\7D\2\2~\u0086\3\2\2\2\177\u0080\7("+
		"\2\2\u0080\u0081\5.\30\2\u0081\u0082\b\t\1\2\u0082\u0083\5.\30\2\u0083"+
		"\u0084\b\t\1\2\u0084\u0086\3\2\2\2\u0085w\3\2\2\2\u0085\177\3\2\2\2\u0086"+
		"\21\3\2\2\2\u0087\u0088\7)\2\2\u0088\u0089\5.\30\2\u0089\u008a\b\n\1\2"+
		"\u008a\23\3\2\2\2\u008b\u008c\7*\2\2\u008c\u008d\5.\30\2\u008d\u008e\b"+
		"\13\1\2\u008e\25\3\2\2\2\u008f\u0090\7+\2\2\u0090\u0091\5.\30\2\u0091"+
		"\u0092\b\f\1\2\u0092\27\3\2\2\2\u0093\u0094\7\"\2\2\u0094\u0095\5.\30"+
		"\2\u0095\u0096\b\r\1\2\u0096\31\3\2\2\2\u0097\u0098\7%\2\2\u0098\u0099"+
		"\b\16\1\2\u0099\33\3\2\2\2\u009a\u009b\7&\2\2\u009b\u009c\b\17\1\2\u009c"+
		"\35\3\2\2\2\u009d\u009e\7,\2\2\u009e\u009f\b\20\1\2\u009f\37\3\2\2\2\u00a0"+
		"\u00a1\7\'\2\2\u00a1\u00a2\b\21\1\2\u00a2!\3\2\2\2\u00a3\u00a4\5$\23\2"+
		"\u00a4\u00a5\b\22\1\2\u00a5\u00b0\3\2\2\2\u00a6\u00a7\5&\24\2\u00a7\u00a8"+
		"\b\22\1\2\u00a8\u00b0\3\2\2\2\u00a9\u00aa\5(\25\2\u00aa\u00ab\b\22\1\2"+
		"\u00ab\u00b0\3\2\2\2\u00ac\u00ad\5*\26\2\u00ad\u00ae\b\22\1\2\u00ae\u00b0"+
		"\3\2\2\2\u00af\u00a3\3\2\2\2\u00af\u00a6\3\2\2\2\u00af\u00a9\3\2\2\2\u00af"+
		"\u00ac\3\2\2\2\u00b0#\3\2\2\2\u00b1\u00b2\7\60\2\2\u00b2\u00b3\b\23\1"+
		"\2\u00b3%\3\2\2\2\u00b4\u00b5\7/\2\2\u00b5\u00b6\b\24\1\2\u00b6\'\3\2"+
		"\2\2\u00b7\u00b8\7.\2\2\u00b8\u00b9\b\25\1\2\u00b9)\3\2\2\2\u00ba\u00bb"+
		"\7\61\2\2\u00bb\u00bc\b\26\1\2\u00bc+\3\2\2\2\u00bd\u00be\7G\2\2\u00be"+
		"\u00bf\7H\2\2\u00bf\u00c0\7G\2\2\u00c0\u00c9\b\27\1\2\u00c1\u00c2\7\62"+
		"\2\2\u00c2\u00c9\b\27\1\2\u00c3\u00c4\7\63\2\2\u00c4\u00c9\b\27\1\2\u00c5"+
		"\u00c6\5.\30\2\u00c6\u00c7\b\27\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00bd\3"+
		"\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9"+
		"-\3\2\2\2\u00ca\u00cb\7I\2\2\u00cb\u00cc\b\30\1\2\u00cc/\3\2\2\2\7\66"+
		"e\u0085\u00af\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}