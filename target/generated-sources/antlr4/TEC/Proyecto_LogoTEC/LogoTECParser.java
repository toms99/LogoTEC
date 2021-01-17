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
		"<INVALID>", "'Programa'", "'Haz'", "'INIC'", "'INC'", "SUMA", "RESIDUO", 
		"DIVISION", "POTENCIA", "PRODUCTO", "NEGATIVO", "DIFERENCIA", "REDONDEO", 
		"AZAR", "MAYOR", "MENOR", "'Y'", "'O'", "IGUALES", "ELEMENTO_AZAR", "LONGITUD", 
		"ULTIMO", "ELEMENTO_N", "PRIMERO_LISTA", "WHILE", "DO_WHILE", "'SISINO'", 
		"'SI'", "'REPITE'", "'Ejecuta'", "AVANZA", "RETROCEDE", "ESPERA", "GIRA_DERECHA", 
		"GIRA_IZQUIERDA", "OCULTA_TORTUGA", "APARECE_TORTUGA", "CENTRO", "PON_POS", 
		"'PonX'", "'PonY'", "PON_RUMBO", "RUMBO", "COLOR", "SUBE_LAPIZ", "BAJA_LAPIZ", 
		"BORRADOR", "'borrapantalla'", "'TRUE'", "'FALSE'", "'+'", "'-'", "'*'", 
		"'/'", "'>'", "'<'", "'='", "'!'", "'>='", "'<='", "'!='", "'{'", "'}'", 
		"'('", "')'", "'['", "']'", "';'", "':'", "'\"'", "ID", "ENTERO", "ESPACIO_BLANCO"
	};
	public static final int
		RULE_programa = 0, RULE_sentencia_logoTEC = 1, RULE_ordenes_listas = 2, 
		RULE_elegir = 3, RULE_elemento_n = 4, RULE_largo = 5, RULE_primero = 6, 
		RULE_ultimo = 7, RULE_ordenes_tortuga = 8, RULE_avanzar = 9, RULE_retroceder = 10, 
		RULE_girar_derecha = 11, RULE_girar_izquierda = 12, RULE_definir_coord = 13, 
		RULE_definir_x = 14, RULE_definir_y = 15, RULE_definir_dir = 16, RULE_esperar = 17, 
		RULE_ocultar_tortuga = 18, RULE_aparecer_tortuga = 19, RULE_rumbo = 20, 
		RULE_centrar = 21, RULE_ordenes_lienzo = 22, RULE_borrar = 23, RULE_dibujar = 24, 
		RULE_no_dibujar = 25, RULE_borra_pantalla = 26, RULE_dato = 27, RULE_numero = 28;
	public static final String[] ruleNames = {
		"programa", "sentencia_logoTEC", "ordenes_listas", "elegir", "elemento_n", 
		"largo", "primero", "ultimo", "ordenes_tortuga", "avanzar", "retroceder", 
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

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVANZA) | (1L << RETROCEDE) | (1L << ESPERA) | (1L << GIRA_DERECHA) | (1L << GIRA_IZQUIERDA) | (1L << OCULTA_TORTUGA) | (1L << APARECE_TORTUGA) | (1L << CENTRO) | (1L << PON_POS) | (1L << PONX) | (1L << PONY) | (1L << PON_RUMBO) | (1L << RUMBO))) != 0)) {
				{
				{
				setState(59); ((ProgramaContext)_localctx).sentencia_logoTEC = sentencia_logoTEC();
				body.add(((ProgramaContext)_localctx).sentencia_logoTEC.node);
				}
				}
				setState(66);
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
			setState(69); ((Sentencia_logoTECContext)_localctx).ordenes_tortuga = ordenes_tortuga();
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
		enterRule(_localctx, 4, RULE_ordenes_listas);
		try {
			setState(87);
			switch (_input.LA(1)) {
			case ELEMENTO_AZAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); ((Ordenes_listasContext)_localctx).elegir = elegir();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).elegir.node;
				}
				break;
			case ELEMENTO_N:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); ((Ordenes_listasContext)_localctx).elemento_n = elemento_n();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).elemento_n.node;
				}
				break;
			case LONGITUD:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); ((Ordenes_listasContext)_localctx).largo = largo();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).largo.node;
				}
				break;
			case PRIMERO_LISTA:
				enterOuterAlt(_localctx, 4);
				{
				setState(81); ((Ordenes_listasContext)_localctx).primero = primero();
				((Ordenes_listasContext)_localctx).node =  ((Ordenes_listasContext)_localctx).primero.node;
				}
				break;
			case ULTIMO:
				enterOuterAlt(_localctx, 5);
				{
				setState(84); ((Ordenes_listasContext)_localctx).ultimo = ultimo();
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
		enterRule(_localctx, 6, RULE_elegir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(ELEMENTO_AZAR);
			setState(90); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (ELEMENTO_AZAR - 19)) | (1L << (LONGITUD - 19)) | (1L << (ULTIMO - 19)) | (1L << (ELEMENTO_N - 19)) | (1L << (PRIMERO_LISTA - 19)) | (1L << (ENTERO - 19)))) != 0)) {
				{
				{
				setState(92); ((ElegirContext)_localctx).numero = numero();
				body.add(((ElegirContext)_localctx).numero.node);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	Random rand = new Random(); 
				   							((ElegirContext)_localctx).node =  body.get(rand.nextInt(body.size()));
										   
			setState(101); match(PAR_CUAD_CERRADO);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 8, RULE_elemento_n);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); ((Elemento_nContext)_localctx).ELEMENTO_N = match(ELEMENTO_N);
			setState(104); match(ENTERO);
			setState(105); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (ELEMENTO_AZAR - 19)) | (1L << (LONGITUD - 19)) | (1L << (ULTIMO - 19)) | (1L << (ELEMENTO_N - 19)) | (1L << (PRIMERO_LISTA - 19)) | (1L << (ENTERO - 19)))) != 0)) {
				{
				{
				setState(107); ((Elemento_nContext)_localctx).numero = numero();
				body.add(((Elemento_nContext)_localctx).numero.node);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((Elemento_nContext)_localctx).node =  body.get(Integer.parseInt((((Elemento_nContext)_localctx).ELEMENTO_N!=null?((Elemento_nContext)_localctx).ELEMENTO_N.getText():null)));
										   
			setState(116); match(PAR_CUAD_CERRADO);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 10, RULE_largo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(LONGITUD);
			setState(119); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (ELEMENTO_AZAR - 19)) | (1L << (LONGITUD - 19)) | (1L << (ULTIMO - 19)) | (1L << (ELEMENTO_N - 19)) | (1L << (PRIMERO_LISTA - 19)) | (1L << (ENTERO - 19)))) != 0)) {
				{
				{
				setState(121); ((LargoContext)_localctx).numero = numero();
				body.add(((LargoContext)_localctx).numero.node);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((LargoContext)_localctx).node =  new Constante(body.size());
										   
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
		enterRule(_localctx, 12, RULE_primero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(PRIMERO_LISTA);
			setState(133); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (ELEMENTO_AZAR - 19)) | (1L << (LONGITUD - 19)) | (1L << (ULTIMO - 19)) | (1L << (ELEMENTO_N - 19)) | (1L << (PRIMERO_LISTA - 19)) | (1L << (ENTERO - 19)))) != 0)) {
				{
				{
				setState(135); ((PrimeroContext)_localctx).numero = numero();
				body.add(((PrimeroContext)_localctx).numero.node);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((PrimeroContext)_localctx).node =  body.get(0);
										   
			setState(144); match(PAR_CUAD_CERRADO);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 14, RULE_ultimo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(ULTIMO);
			setState(147); match(PAR_CUAD_ABIERTO);

										   List<ASTNode> body = new ArrayList<ASTNode>();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (ELEMENTO_AZAR - 19)) | (1L << (LONGITUD - 19)) | (1L << (ULTIMO - 19)) | (1L << (ELEMENTO_N - 19)) | (1L << (PRIMERO_LISTA - 19)) | (1L << (ENTERO - 19)))) != 0)) {
				{
				{
				setState(149); ((UltimoContext)_localctx).numero = numero();
				body.add(((UltimoContext)_localctx).numero.node);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										   	((UltimoContext)_localctx).node =  body.get(body.size()-1);
										   
			setState(158); match(PAR_CUAD_CERRADO);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 16, RULE_ordenes_tortuga);
		try {
			setState(199);
			switch (_input.LA(1)) {
			case AVANZA:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); ((Ordenes_tortugaContext)_localctx).avanzar = avanzar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).avanzar.node;
				}
				break;
			case RETROCEDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(163); ((Ordenes_tortugaContext)_localctx).retroceder = retroceder();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).retroceder.node;
				}
				break;
			case GIRA_DERECHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(166); ((Ordenes_tortugaContext)_localctx).girar_derecha = girar_derecha();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).girar_derecha.node;
				}
				break;
			case GIRA_IZQUIERDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(169); ((Ordenes_tortugaContext)_localctx).girar_izquierda = girar_izquierda();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).girar_izquierda.node;
				}
				break;
			case OCULTA_TORTUGA:
				enterOuterAlt(_localctx, 5);
				{
				setState(172); ((Ordenes_tortugaContext)_localctx).ocultar_tortuga = ocultar_tortuga();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).ocultar_tortuga.node;
				}
				break;
			case APARECE_TORTUGA:
				enterOuterAlt(_localctx, 6);
				{
				setState(175); ((Ordenes_tortugaContext)_localctx).aparecer_tortuga = aparecer_tortuga();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).aparecer_tortuga.node;
				}
				break;
			case PON_POS:
				enterOuterAlt(_localctx, 7);
				{
				setState(178); ((Ordenes_tortugaContext)_localctx).definir_coord = definir_coord();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_coord.node;
				}
				break;
			case PONX:
				enterOuterAlt(_localctx, 8);
				{
				setState(181); ((Ordenes_tortugaContext)_localctx).definir_x = definir_x();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_x.node;
				}
				break;
			case PONY:
				enterOuterAlt(_localctx, 9);
				{
				setState(184); ((Ordenes_tortugaContext)_localctx).definir_y = definir_y();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_y.node;
				}
				break;
			case PON_RUMBO:
				enterOuterAlt(_localctx, 10);
				{
				setState(187); ((Ordenes_tortugaContext)_localctx).definir_dir = definir_dir();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).definir_dir.node;
				}
				break;
			case RUMBO:
				enterOuterAlt(_localctx, 11);
				{
				setState(190); ((Ordenes_tortugaContext)_localctx).rumbo = rumbo();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).rumbo.node;
				}
				break;
			case CENTRO:
				enterOuterAlt(_localctx, 12);
				{
				setState(193); ((Ordenes_tortugaContext)_localctx).centrar = centrar();
				((Ordenes_tortugaContext)_localctx).node =  ((Ordenes_tortugaContext)_localctx).centrar.node;
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 13);
				{
				setState(196); ((Ordenes_tortugaContext)_localctx).esperar = esperar();
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
		enterRule(_localctx, 18, RULE_avanzar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(AVANZA);
			setState(202); ((AvanzarContext)_localctx).numero = numero();
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
		enterRule(_localctx, 20, RULE_retroceder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(RETROCEDE);
			setState(206); ((RetrocederContext)_localctx).numero = numero();
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
		enterRule(_localctx, 22, RULE_girar_derecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(GIRA_DERECHA);
			setState(210); ((Girar_derechaContext)_localctx).numero = numero();
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
		enterRule(_localctx, 24, RULE_girar_izquierda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(GIRA_IZQUIERDA);
			setState(214); ((Girar_izquierdaContext)_localctx).numero = numero();
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
		enterRule(_localctx, 26, RULE_definir_coord);
		try {
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); match(PON_POS);
				setState(218); match(PAR_CUAD_ABIERTO);
				setState(219); ((Definir_coordContext)_localctx).n1 = numero();
				((Definir_coordContext)_localctx).node =  ((Definir_coordContext)_localctx).n1.node;
				setState(221); ((Definir_coordContext)_localctx).n2 = numero();
				((Definir_coordContext)_localctx).node =  new TortugaDefinirCoord(_localctx.node, ((Definir_coordContext)_localctx).n2.node);
				setState(223); match(PAR_CUAD_CERRADO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225); match(PON_POS);
				setState(226); ((Definir_coordContext)_localctx).n1 = numero();
				((Definir_coordContext)_localctx).node =  ((Definir_coordContext)_localctx).n1.node;
				setState(228); ((Definir_coordContext)_localctx).n2 = numero();
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
		enterRule(_localctx, 28, RULE_definir_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(PONX);
			setState(234); ((Definir_xContext)_localctx).numero = numero();
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
		enterRule(_localctx, 30, RULE_definir_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(PONY);
			setState(238); ((Definir_yContext)_localctx).numero = numero();
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
		enterRule(_localctx, 32, RULE_definir_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); match(PON_RUMBO);
			setState(242); ((Definir_dirContext)_localctx).numero = numero();
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
		enterRule(_localctx, 34, RULE_esperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(ESPERA);
			setState(246); ((EsperarContext)_localctx).numero = numero();
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
		enterRule(_localctx, 36, RULE_ocultar_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(OCULTA_TORTUGA);
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
		enterRule(_localctx, 38, RULE_aparecer_tortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(APARECE_TORTUGA);
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
		enterRule(_localctx, 40, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); match(RUMBO);
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
		enterRule(_localctx, 42, RULE_centrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(CENTRO);
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
		enterRule(_localctx, 44, RULE_ordenes_lienzo);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case BORRADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(261); ((Ordenes_lienzoContext)_localctx).borrar = borrar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).borrar.node;
				}
				break;
			case BAJA_LAPIZ:
				enterOuterAlt(_localctx, 2);
				{
				setState(264); ((Ordenes_lienzoContext)_localctx).dibujar = dibujar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).dibujar.node;
				}
				break;
			case SUBE_LAPIZ:
				enterOuterAlt(_localctx, 3);
				{
				setState(267); ((Ordenes_lienzoContext)_localctx).no_dibujar = no_dibujar();
				((Ordenes_lienzoContext)_localctx).node =  ((Ordenes_lienzoContext)_localctx).no_dibujar.node;
				}
				break;
			case BORRA_PANTALLA:
				enterOuterAlt(_localctx, 4);
				{
				setState(270); ((Ordenes_lienzoContext)_localctx).borra_pantalla = borra_pantalla();
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
		enterRule(_localctx, 46, RULE_borrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(BORRADOR);
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
		enterRule(_localctx, 48, RULE_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(BAJA_LAPIZ);
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
		enterRule(_localctx, 50, RULE_no_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(SUBE_LAPIZ);
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
		enterRule(_localctx, 52, RULE_borra_pantalla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(BORRA_PANTALLA);
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
		enterRule(_localctx, 54, RULE_dato);
		try {
			setState(298);
			switch (_input.LA(1)) {
			case COMILLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(287); match(COMILLA);
				setState(288); ((DatoContext)_localctx).ID = match(ID);
				setState(289); match(COMILLA);
				((DatoContext)_localctx).node =  new Constante((((DatoContext)_localctx).ID!=null?((DatoContext)_localctx).ID.getText():null));
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(291); ((DatoContext)_localctx).TRUE = match(TRUE);
				((DatoContext)_localctx).node =  new Constante(Boolean.parseBoolean((((DatoContext)_localctx).TRUE!=null?((DatoContext)_localctx).TRUE.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(293); ((DatoContext)_localctx).FALSE = match(FALSE);
				((DatoContext)_localctx).node =  new Constante(Boolean.parseBoolean((((DatoContext)_localctx).FALSE!=null?((DatoContext)_localctx).FALSE.getText():null)));
				}
				break;
			case ELEMENTO_AZAR:
			case LONGITUD:
			case ULTIMO:
			case ELEMENTO_N:
			case PRIMERO_LISTA:
			case ENTERO:
				enterOuterAlt(_localctx, 4);
				{
				setState(295); ((DatoContext)_localctx).numero = numero();
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
		public Ordenes_listasContext ordenes_listas() {
			return getRuleContext(Ordenes_listasContext.class,0);
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
		enterRule(_localctx, 56, RULE_numero);
		try {
			setState(305);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(300); ((NumeroContext)_localctx).ENTERO = match(ENTERO);
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
				setState(302); ((NumeroContext)_localctx).ordenes_listas = ordenes_listas();
				((NumeroContext)_localctx).node =  ((NumeroContext)_localctx).ordenes_listas.node;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3J\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5b\n"+
		"\5\f\5\16\5e\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6q\n\6\f\6"+
		"\16\6t\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082"+
		"\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090"+
		"\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009b\n\t\f\t\16\t\u009e"+
		"\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ca\n\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ea\n\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0114\n\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u012d\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0134\n\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:\2\2\u0136\2<\3\2\2\2\4G\3\2\2\2\6"+
		"Y\3\2\2\2\b[\3\2\2\2\ni\3\2\2\2\fx\3\2\2\2\16\u0086\3\2\2\2\20\u0094\3"+
		"\2\2\2\22\u00c9\3\2\2\2\24\u00cb\3\2\2\2\26\u00cf\3\2\2\2\30\u00d3\3\2"+
		"\2\2\32\u00d7\3\2\2\2\34\u00e9\3\2\2\2\36\u00eb\3\2\2\2 \u00ef\3\2\2\2"+
		"\"\u00f3\3\2\2\2$\u00f7\3\2\2\2&\u00fb\3\2\2\2(\u00fe\3\2\2\2*\u0101\3"+
		"\2\2\2,\u0104\3\2\2\2.\u0113\3\2\2\2\60\u0115\3\2\2\2\62\u0118\3\2\2\2"+
		"\64\u011b\3\2\2\2\66\u011e\3\2\2\28\u012c\3\2\2\2:\u0133\3\2\2\2<B\b\2"+
		"\1\2=>\5\4\3\2>?\b\2\1\2?A\3\2\2\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2"+
		"\2\2CE\3\2\2\2DB\3\2\2\2EF\b\2\1\2F\3\3\2\2\2GH\5\22\n\2HI\b\3\1\2I\5"+
		"\3\2\2\2JK\5\b\5\2KL\b\4\1\2LZ\3\2\2\2MN\5\n\6\2NO\b\4\1\2OZ\3\2\2\2P"+
		"Q\5\f\7\2QR\b\4\1\2RZ\3\2\2\2ST\5\16\b\2TU\b\4\1\2UZ\3\2\2\2VW\5\20\t"+
		"\2WX\b\4\1\2XZ\3\2\2\2YJ\3\2\2\2YM\3\2\2\2YP\3\2\2\2YS\3\2\2\2YV\3\2\2"+
		"\2Z\7\3\2\2\2[\\\7\25\2\2\\]\7C\2\2]c\b\5\1\2^_\5:\36\2_`\b\5\1\2`b\3"+
		"\2\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\b"+
		"\5\1\2gh\7D\2\2h\t\3\2\2\2ij\7\30\2\2jk\7I\2\2kl\7C\2\2lr\b\6\1\2mn\5"+
		":\36\2no\b\6\1\2oq\3\2\2\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3"+
		"\2\2\2tr\3\2\2\2uv\b\6\1\2vw\7D\2\2w\13\3\2\2\2xy\7\26\2\2yz\7C\2\2z\u0080"+
		"\b\7\1\2{|\5:\36\2|}\b\7\1\2}\177\3\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083\u0084\b\7\1\2\u0084\u0085\7D\2\2\u0085\r\3\2\2\2\u0086\u0087"+
		"\7\31\2\2\u0087\u0088\7C\2\2\u0088\u008e\b\b\1\2\u0089\u008a\5:\36\2\u008a"+
		"\u008b\b\b\1\2\u008b\u008d\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\b\b\1\2\u0092\u0093\7D\2\2\u0093\17\3\2\2\2"+
		"\u0094\u0095\7\27\2\2\u0095\u0096\7C\2\2\u0096\u009c\b\t\1\2\u0097\u0098"+
		"\5:\36\2\u0098\u0099\b\t\1\2\u0099\u009b\3\2\2\2\u009a\u0097\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\b\t\1\2\u00a0\u00a1\7D\2\2\u00a1"+
		"\21\3\2\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\b\n\1\2\u00a4\u00ca\3\2"+
		"\2\2\u00a5\u00a6\5\26\f\2\u00a6\u00a7\b\n\1\2\u00a7\u00ca\3\2\2\2\u00a8"+
		"\u00a9\5\30\r\2\u00a9\u00aa\b\n\1\2\u00aa\u00ca\3\2\2\2\u00ab\u00ac\5"+
		"\32\16\2\u00ac\u00ad\b\n\1\2\u00ad\u00ca\3\2\2\2\u00ae\u00af\5&\24\2\u00af"+
		"\u00b0\b\n\1\2\u00b0\u00ca\3\2\2\2\u00b1\u00b2\5(\25\2\u00b2\u00b3\b\n"+
		"\1\2\u00b3\u00ca\3\2\2\2\u00b4\u00b5\5\34\17\2\u00b5\u00b6\b\n\1\2\u00b6"+
		"\u00ca\3\2\2\2\u00b7\u00b8\5\36\20\2\u00b8\u00b9\b\n\1\2\u00b9\u00ca\3"+
		"\2\2\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\b\n\1\2\u00bc\u00ca\3\2\2\2\u00bd"+
		"\u00be\5\"\22\2\u00be\u00bf\b\n\1\2\u00bf\u00ca\3\2\2\2\u00c0\u00c1\5"+
		"*\26\2\u00c1\u00c2\b\n\1\2\u00c2\u00ca\3\2\2\2\u00c3\u00c4\5,\27\2\u00c4"+
		"\u00c5\b\n\1\2\u00c5\u00ca\3\2\2\2\u00c6\u00c7\5$\23\2\u00c7\u00c8\b\n"+
		"\1\2\u00c8\u00ca\3\2\2\2\u00c9\u00a2\3\2\2\2\u00c9\u00a5\3\2\2\2\u00c9"+
		"\u00a8\3\2\2\2\u00c9\u00ab\3\2\2\2\u00c9\u00ae\3\2\2\2\u00c9\u00b1\3\2"+
		"\2\2\u00c9\u00b4\3\2\2\2\u00c9\u00b7\3\2\2\2\u00c9\u00ba\3\2\2\2\u00c9"+
		"\u00bd\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c6\3\2"+
		"\2\2\u00ca\23\3\2\2\2\u00cb\u00cc\7 \2\2\u00cc\u00cd\5:\36\2\u00cd\u00ce"+
		"\b\13\1\2\u00ce\25\3\2\2\2\u00cf\u00d0\7!\2\2\u00d0\u00d1\5:\36\2\u00d1"+
		"\u00d2\b\f\1\2\u00d2\27\3\2\2\2\u00d3\u00d4\7#\2\2\u00d4\u00d5\5:\36\2"+
		"\u00d5\u00d6\b\r\1\2\u00d6\31\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8\u00d9\5"+
		":\36\2\u00d9\u00da\b\16\1\2\u00da\33\3\2\2\2\u00db\u00dc\7(\2\2\u00dc"+
		"\u00dd\7C\2\2\u00dd\u00de\5:\36\2\u00de\u00df\b\17\1\2\u00df\u00e0\5:"+
		"\36\2\u00e0\u00e1\b\17\1\2\u00e1\u00e2\7D\2\2\u00e2\u00ea\3\2\2\2\u00e3"+
		"\u00e4\7(\2\2\u00e4\u00e5\5:\36\2\u00e5\u00e6\b\17\1\2\u00e6\u00e7\5:"+
		"\36\2\u00e7\u00e8\b\17\1\2\u00e8\u00ea\3\2\2\2\u00e9\u00db\3\2\2\2\u00e9"+
		"\u00e3\3\2\2\2\u00ea\35\3\2\2\2\u00eb\u00ec\7)\2\2\u00ec\u00ed\5:\36\2"+
		"\u00ed\u00ee\b\20\1\2\u00ee\37\3\2\2\2\u00ef\u00f0\7*\2\2\u00f0\u00f1"+
		"\5:\36\2\u00f1\u00f2\b\21\1\2\u00f2!\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4"+
		"\u00f5\5:\36\2\u00f5\u00f6\b\22\1\2\u00f6#\3\2\2\2\u00f7\u00f8\7\"\2\2"+
		"\u00f8\u00f9\5:\36\2\u00f9\u00fa\b\23\1\2\u00fa%\3\2\2\2\u00fb\u00fc\7"+
		"%\2\2\u00fc\u00fd\b\24\1\2\u00fd\'\3\2\2\2\u00fe\u00ff\7&\2\2\u00ff\u0100"+
		"\b\25\1\2\u0100)\3\2\2\2\u0101\u0102\7,\2\2\u0102\u0103\b\26\1\2\u0103"+
		"+\3\2\2\2\u0104\u0105\7\'\2\2\u0105\u0106\b\27\1\2\u0106-\3\2\2\2\u0107"+
		"\u0108\5\60\31\2\u0108\u0109\b\30\1\2\u0109\u0114\3\2\2\2\u010a\u010b"+
		"\5\62\32\2\u010b\u010c\b\30\1\2\u010c\u0114\3\2\2\2\u010d\u010e\5\64\33"+
		"\2\u010e\u010f\b\30\1\2\u010f\u0114\3\2\2\2\u0110\u0111\5\66\34\2\u0111"+
		"\u0112\b\30\1\2\u0112\u0114\3\2\2\2\u0113\u0107\3\2\2\2\u0113\u010a\3"+
		"\2\2\2\u0113\u010d\3\2\2\2\u0113\u0110\3\2\2\2\u0114/\3\2\2\2\u0115\u0116"+
		"\7\60\2\2\u0116\u0117\b\31\1\2\u0117\61\3\2\2\2\u0118\u0119\7/\2\2\u0119"+
		"\u011a\b\32\1\2\u011a\63\3\2\2\2\u011b\u011c\7.\2\2\u011c\u011d\b\33\1"+
		"\2\u011d\65\3\2\2\2\u011e\u011f\7\61\2\2\u011f\u0120\b\34\1\2\u0120\67"+
		"\3\2\2\2\u0121\u0122\7G\2\2\u0122\u0123\7H\2\2\u0123\u0124\7G\2\2\u0124"+
		"\u012d\b\35\1\2\u0125\u0126\7\62\2\2\u0126\u012d\b\35\1\2\u0127\u0128"+
		"\7\63\2\2\u0128\u012d\b\35\1\2\u0129\u012a\5:\36\2\u012a\u012b\b\35\1"+
		"\2\u012b\u012d\3\2\2\2\u012c\u0121\3\2\2\2\u012c\u0125\3\2\2\2\u012c\u0127"+
		"\3\2\2\2\u012c\u0129\3\2\2\2\u012d9\3\2\2\2\u012e\u012f\7I\2\2\u012f\u0134"+
		"\b\36\1\2\u0130\u0131\5\6\4\2\u0131\u0132\b\36\1\2\u0132\u0134\3\2\2\2"+
		"\u0133\u012e\3\2\2\2\u0133\u0130\3\2\2\2\u0134;\3\2\2\2\16BYcr\u0080\u008e"+
		"\u009c\u00c9\u00e9\u0113\u012c\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}