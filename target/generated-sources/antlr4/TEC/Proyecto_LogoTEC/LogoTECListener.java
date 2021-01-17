// Generated from LogoTEC.g4 by ANTLR 4.4
package TEC.Proyecto_LogoTEC;


	import java.util.Map;
	import java.util.HashMap;
	import java.util.Random; 
	import TEC.Proyecto_LogoTEC.interprete.ast.ASTNode;
	import TEC.Proyecto_LogoTEC.tortuga.Lector;
	import TEC.Proyecto_LogoTEC.interprete.ast.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoTECParser}.
 */
public interface LogoTECListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#primero}.
	 * @param ctx the parse tree
	 */
	void enterPrimero(@NotNull LogoTECParser.PrimeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#primero}.
	 * @param ctx the parse tree
	 */
	void exitPrimero(@NotNull LogoTECParser.PrimeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(@NotNull LogoTECParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(@NotNull LogoTECParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#no_dibujar}.
	 * @param ctx the parse tree
	 */
	void enterNo_dibujar(@NotNull LogoTECParser.No_dibujarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#no_dibujar}.
	 * @param ctx the parse tree
	 */
	void exitNo_dibujar(@NotNull LogoTECParser.No_dibujarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#elegir}.
	 * @param ctx the parse tree
	 */
	void enterElegir(@NotNull LogoTECParser.ElegirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#elegir}.
	 * @param ctx the parse tree
	 */
	void exitElegir(@NotNull LogoTECParser.ElegirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ordenes_lienzo}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_lienzo(@NotNull LogoTECParser.Ordenes_lienzoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ordenes_lienzo}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_lienzo(@NotNull LogoTECParser.Ordenes_lienzoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull LogoTECParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull LogoTECParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#esperar}.
	 * @param ctx the parse tree
	 */
	void enterEsperar(@NotNull LogoTECParser.EsperarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#esperar}.
	 * @param ctx the parse tree
	 */
	void exitEsperar(@NotNull LogoTECParser.EsperarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(@NotNull LogoTECParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(@NotNull LogoTECParser.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#definir_coord}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_coord(@NotNull LogoTECParser.Definir_coordContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#definir_coord}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_coord(@NotNull LogoTECParser.Definir_coordContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#largo}.
	 * @param ctx the parse tree
	 */
	void enterLargo(@NotNull LogoTECParser.LargoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#largo}.
	 * @param ctx the parse tree
	 */
	void exitLargo(@NotNull LogoTECParser.LargoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ordenes_tortuga}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_tortuga(@NotNull LogoTECParser.Ordenes_tortugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ordenes_tortuga}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_tortuga(@NotNull LogoTECParser.Ordenes_tortugaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#definir_dir}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_dir(@NotNull LogoTECParser.Definir_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#definir_dir}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_dir(@NotNull LogoTECParser.Definir_dirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#centrar}.
	 * @param ctx the parse tree
	 */
	void enterCentrar(@NotNull LogoTECParser.CentrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#centrar}.
	 * @param ctx the parse tree
	 */
	void exitCentrar(@NotNull LogoTECParser.CentrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#retroceder}.
	 * @param ctx the parse tree
	 */
	void enterRetroceder(@NotNull LogoTECParser.RetrocederContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#retroceder}.
	 * @param ctx the parse tree
	 */
	void exitRetroceder(@NotNull LogoTECParser.RetrocederContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ultimo}.
	 * @param ctx the parse tree
	 */
	void enterUltimo(@NotNull LogoTECParser.UltimoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ultimo}.
	 * @param ctx the parse tree
	 */
	void exitUltimo(@NotNull LogoTECParser.UltimoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#sentencia_logoTEC}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_logoTEC(@NotNull LogoTECParser.Sentencia_logoTECContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#sentencia_logoTEC}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_logoTEC(@NotNull LogoTECParser.Sentencia_logoTECContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ordenes_listas}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_listas(@NotNull LogoTECParser.Ordenes_listasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ordenes_listas}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_listas(@NotNull LogoTECParser.Ordenes_listasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#avanzar}.
	 * @param ctx the parse tree
	 */
	void enterAvanzar(@NotNull LogoTECParser.AvanzarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#avanzar}.
	 * @param ctx the parse tree
	 */
	void exitAvanzar(@NotNull LogoTECParser.AvanzarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#rumbo}.
	 * @param ctx the parse tree
	 */
	void enterRumbo(@NotNull LogoTECParser.RumboContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#rumbo}.
	 * @param ctx the parse tree
	 */
	void exitRumbo(@NotNull LogoTECParser.RumboContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#borra_pantalla}.
	 * @param ctx the parse tree
	 */
	void enterBorra_pantalla(@NotNull LogoTECParser.Borra_pantallaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#borra_pantalla}.
	 * @param ctx the parse tree
	 */
	void exitBorra_pantalla(@NotNull LogoTECParser.Borra_pantallaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#girar_derecha}.
	 * @param ctx the parse tree
	 */
	void enterGirar_derecha(@NotNull LogoTECParser.Girar_derechaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#girar_derecha}.
	 * @param ctx the parse tree
	 */
	void exitGirar_derecha(@NotNull LogoTECParser.Girar_derechaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#borrar}.
	 * @param ctx the parse tree
	 */
	void enterBorrar(@NotNull LogoTECParser.BorrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#borrar}.
	 * @param ctx the parse tree
	 */
	void exitBorrar(@NotNull LogoTECParser.BorrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#dibujar}.
	 * @param ctx the parse tree
	 */
	void enterDibujar(@NotNull LogoTECParser.DibujarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#dibujar}.
	 * @param ctx the parse tree
	 */
	void exitDibujar(@NotNull LogoTECParser.DibujarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#elemento_n}.
	 * @param ctx the parse tree
	 */
	void enterElemento_n(@NotNull LogoTECParser.Elemento_nContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#elemento_n}.
	 * @param ctx the parse tree
	 */
	void exitElemento_n(@NotNull LogoTECParser.Elemento_nContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#definir_x}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_x(@NotNull LogoTECParser.Definir_xContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#definir_x}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_x(@NotNull LogoTECParser.Definir_xContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#definir_y}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_y(@NotNull LogoTECParser.Definir_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#definir_y}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_y(@NotNull LogoTECParser.Definir_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#aparecer_tortuga}.
	 * @param ctx the parse tree
	 */
	void enterAparecer_tortuga(@NotNull LogoTECParser.Aparecer_tortugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#aparecer_tortuga}.
	 * @param ctx the parse tree
	 */
	void exitAparecer_tortuga(@NotNull LogoTECParser.Aparecer_tortugaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ocultar_tortuga}.
	 * @param ctx the parse tree
	 */
	void enterOcultar_tortuga(@NotNull LogoTECParser.Ocultar_tortugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ocultar_tortuga}.
	 * @param ctx the parse tree
	 */
	void exitOcultar_tortuga(@NotNull LogoTECParser.Ocultar_tortugaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#girar_izquierda}.
	 * @param ctx the parse tree
	 */
	void enterGirar_izquierda(@NotNull LogoTECParser.Girar_izquierdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#girar_izquierda}.
	 * @param ctx the parse tree
	 */
	void exitGirar_izquierda(@NotNull LogoTECParser.Girar_izquierdaContext ctx);
}