// Generated from TEC\Proyecto_LogoTEC\LogoTEC.g4 by ANTLR 4.5.1
package TEC.Proyecto_LogoTEC;



	import java.util.Map;
	import java.util.HashMap;
	import java.util.Random; 
	import TEC.Proyecto_LogoTEC.interprete.ast.ASTNode;
	import TEC.Proyecto_LogoTEC.tortuga.Lector;
	import TEC.Proyecto_LogoTEC.interprete.ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoTECParser}.
 */
public interface LogoTECListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LogoTECParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LogoTECParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ejecuta}.
	 * @param ctx the parse tree
	 */
	void enterEjecuta(LogoTECParser.EjecutaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ejecuta}.
	 * @param ctx the parse tree
	 */
	void exitEjecuta(LogoTECParser.EjecutaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#repite}.
	 * @param ctx the parse tree
	 */
	void enterRepite(LogoTECParser.RepiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#repite}.
	 * @param ctx the parse tree
	 */
	void exitRepite(LogoTECParser.RepiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#sentencia_logoTEC}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_logoTEC(LogoTECParser.Sentencia_logoTECContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#sentencia_logoTEC}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_logoTEC(LogoTECParser.Sentencia_logoTECContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ordenes_variables}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_variables(LogoTECParser.Ordenes_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ordenes_variables}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_variables(LogoTECParser.Ordenes_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(LogoTECParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(LogoTECParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#reasignacion}.
	 * @param ctx the parse tree
	 */
	void enterReasignacion(LogoTECParser.ReasignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#reasignacion}.
	 * @param ctx the parse tree
	 */
	void exitReasignacion(LogoTECParser.ReasignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#incrementa}.
	 * @param ctx the parse tree
	 */
	void enterIncrementa(LogoTECParser.IncrementaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#incrementa}.
	 * @param ctx the parse tree
	 */
	void exitIncrementa(LogoTECParser.IncrementaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#referencia}.
	 * @param ctx the parse tree
	 */
	void enterReferencia(LogoTECParser.ReferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#referencia}.
	 * @param ctx the parse tree
	 */
	void exitReferencia(LogoTECParser.ReferenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacion_aritmetica(LogoTECParser.Operacion_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacion_aritmetica(LogoTECParser.Operacion_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(LogoTECParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(LogoTECParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#diferencia}.
	 * @param ctx the parse tree
	 */
	void enterDiferencia(LogoTECParser.DiferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#diferencia}.
	 * @param ctx the parse tree
	 */
	void exitDiferencia(LogoTECParser.DiferenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#producto}.
	 * @param ctx the parse tree
	 */
	void enterProducto(LogoTECParser.ProductoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#producto}.
	 * @param ctx the parse tree
	 */
	void exitProducto(LogoTECParser.ProductoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(LogoTECParser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(LogoTECParser.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(LogoTECParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(LogoTECParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#residuo}.
	 * @param ctx the parse tree
	 */
	void enterResiduo(LogoTECParser.ResiduoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#residuo}.
	 * @param ctx the parse tree
	 */
	void exitResiduo(LogoTECParser.ResiduoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#redondear}.
	 * @param ctx the parse tree
	 */
	void enterRedondear(LogoTECParser.RedondearContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#redondear}.
	 * @param ctx the parse tree
	 */
	void exitRedondear(LogoTECParser.RedondearContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#azar}.
	 * @param ctx the parse tree
	 */
	void enterAzar(LogoTECParser.AzarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#azar}.
	 * @param ctx the parse tree
	 */
	void exitAzar(LogoTECParser.AzarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#menos}.
	 * @param ctx the parse tree
	 */
	void enterMenos(LogoTECParser.MenosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#menos}.
	 * @param ctx the parse tree
	 */
	void exitMenos(LogoTECParser.MenosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ordenes_listas}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_listas(LogoTECParser.Ordenes_listasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ordenes_listas}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_listas(LogoTECParser.Ordenes_listasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#elegir}.
	 * @param ctx the parse tree
	 */
	void enterElegir(LogoTECParser.ElegirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#elegir}.
	 * @param ctx the parse tree
	 */
	void exitElegir(LogoTECParser.ElegirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#elemento_n}.
	 * @param ctx the parse tree
	 */
	void enterElemento_n(LogoTECParser.Elemento_nContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#elemento_n}.
	 * @param ctx the parse tree
	 */
	void exitElemento_n(LogoTECParser.Elemento_nContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#largo}.
	 * @param ctx the parse tree
	 */
	void enterLargo(LogoTECParser.LargoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#largo}.
	 * @param ctx the parse tree
	 */
	void exitLargo(LogoTECParser.LargoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#primero}.
	 * @param ctx the parse tree
	 */
	void enterPrimero(LogoTECParser.PrimeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#primero}.
	 * @param ctx the parse tree
	 */
	void exitPrimero(LogoTECParser.PrimeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ultimo}.
	 * @param ctx the parse tree
	 */
	void enterUltimo(LogoTECParser.UltimoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ultimo}.
	 * @param ctx the parse tree
	 */
	void exitUltimo(LogoTECParser.UltimoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ordenes_tortuga}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_tortuga(LogoTECParser.Ordenes_tortugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ordenes_tortuga}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_tortuga(LogoTECParser.Ordenes_tortugaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#avanzar}.
	 * @param ctx the parse tree
	 */
	void enterAvanzar(LogoTECParser.AvanzarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#avanzar}.
	 * @param ctx the parse tree
	 */
	void exitAvanzar(LogoTECParser.AvanzarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#retroceder}.
	 * @param ctx the parse tree
	 */
	void enterRetroceder(LogoTECParser.RetrocederContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#retroceder}.
	 * @param ctx the parse tree
	 */
	void exitRetroceder(LogoTECParser.RetrocederContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#girar_derecha}.
	 * @param ctx the parse tree
	 */
	void enterGirar_derecha(LogoTECParser.Girar_derechaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#girar_derecha}.
	 * @param ctx the parse tree
	 */
	void exitGirar_derecha(LogoTECParser.Girar_derechaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#girar_izquierda}.
	 * @param ctx the parse tree
	 */
	void enterGirar_izquierda(LogoTECParser.Girar_izquierdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#girar_izquierda}.
	 * @param ctx the parse tree
	 */
	void exitGirar_izquierda(LogoTECParser.Girar_izquierdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#definir_coord}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_coord(LogoTECParser.Definir_coordContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#definir_coord}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_coord(LogoTECParser.Definir_coordContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#definir_x}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_x(LogoTECParser.Definir_xContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#definir_x}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_x(LogoTECParser.Definir_xContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#definir_y}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_y(LogoTECParser.Definir_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#definir_y}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_y(LogoTECParser.Definir_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#definir_dir}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_dir(LogoTECParser.Definir_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#definir_dir}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_dir(LogoTECParser.Definir_dirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#esperar}.
	 * @param ctx the parse tree
	 */
	void enterEsperar(LogoTECParser.EsperarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#esperar}.
	 * @param ctx the parse tree
	 */
	void exitEsperar(LogoTECParser.EsperarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ocultar_tortuga}.
	 * @param ctx the parse tree
	 */
	void enterOcultar_tortuga(LogoTECParser.Ocultar_tortugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ocultar_tortuga}.
	 * @param ctx the parse tree
	 */
	void exitOcultar_tortuga(LogoTECParser.Ocultar_tortugaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#aparecer_tortuga}.
	 * @param ctx the parse tree
	 */
	void enterAparecer_tortuga(LogoTECParser.Aparecer_tortugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#aparecer_tortuga}.
	 * @param ctx the parse tree
	 */
	void exitAparecer_tortuga(LogoTECParser.Aparecer_tortugaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#rumbo}.
	 * @param ctx the parse tree
	 */
	void enterRumbo(LogoTECParser.RumboContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#rumbo}.
	 * @param ctx the parse tree
	 */
	void exitRumbo(LogoTECParser.RumboContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#centrar}.
	 * @param ctx the parse tree
	 */
	void enterCentrar(LogoTECParser.CentrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#centrar}.
	 * @param ctx the parse tree
	 */
	void exitCentrar(LogoTECParser.CentrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ordenes_lienzo}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_lienzo(LogoTECParser.Ordenes_lienzoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ordenes_lienzo}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_lienzo(LogoTECParser.Ordenes_lienzoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#borrar}.
	 * @param ctx the parse tree
	 */
	void enterBorrar(LogoTECParser.BorrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#borrar}.
	 * @param ctx the parse tree
	 */
	void exitBorrar(LogoTECParser.BorrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#dibujar}.
	 * @param ctx the parse tree
	 */
	void enterDibujar(LogoTECParser.DibujarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#dibujar}.
	 * @param ctx the parse tree
	 */
	void exitDibujar(LogoTECParser.DibujarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#no_dibujar}.
	 * @param ctx the parse tree
	 */
	void enterNo_dibujar(LogoTECParser.No_dibujarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#no_dibujar}.
	 * @param ctx the parse tree
	 */
	void exitNo_dibujar(LogoTECParser.No_dibujarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#borra_pantalla}.
	 * @param ctx the parse tree
	 */
	void enterBorra_pantalla(LogoTECParser.Borra_pantallaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#borra_pantalla}.
	 * @param ctx the parse tree
	 */
	void exitBorra_pantalla(LogoTECParser.Borra_pantallaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(LogoTECParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(LogoTECParser.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(LogoTECParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(LogoTECParser.NumeroContext ctx);
}