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
	 * Enter a parse tree produced by {@link LogoTECParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(@NotNull LogoTECParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(@NotNull LogoTECParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#azar}.
	 * @param ctx the parse tree
	 */
	void enterAzar(@NotNull LogoTECParser.AzarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#azar}.
	 * @param ctx the parse tree
	 */
	void exitAzar(@NotNull LogoTECParser.AzarContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacion_aritmetica(@NotNull LogoTECParser.Operacion_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacion_aritmetica(@NotNull LogoTECParser.Operacion_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(@NotNull LogoTECParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(@NotNull LogoTECParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#repite}.
	 * @param ctx the parse tree
	 */
	void enterRepite(@NotNull LogoTECParser.RepiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#repite}.
	 * @param ctx the parse tree
	 */
	void exitRepite(@NotNull LogoTECParser.RepiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#menos}.
	 * @param ctx the parse tree
	 */
	void enterMenos(@NotNull LogoTECParser.MenosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#menos}.
	 * @param ctx the parse tree
	 */
	void exitMenos(@NotNull LogoTECParser.MenosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#menor}.
	 * @param ctx the parse tree
	 */
	void enterMenor(@NotNull LogoTECParser.MenorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#menor}.
	 * @param ctx the parse tree
	 */
	void exitMenor(@NotNull LogoTECParser.MenorContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#reasignacion}.
	 * @param ctx the parse tree
	 */
	void enterReasignacion(@NotNull LogoTECParser.ReasignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#reasignacion}.
	 * @param ctx the parse tree
	 */
	void exitReasignacion(@NotNull LogoTECParser.ReasignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#mayor}.
	 * @param ctx the parse tree
	 */
	void enterMayor(@NotNull LogoTECParser.MayorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#mayor}.
	 * @param ctx the parse tree
	 */
	void exitMayor(@NotNull LogoTECParser.MayorContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(@NotNull LogoTECParser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(@NotNull LogoTECParser.PotenciaContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#ordenes_variables}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_variables(@NotNull LogoTECParser.Ordenes_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ordenes_variables}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_variables(@NotNull LogoTECParser.Ordenes_variablesContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(@NotNull LogoTECParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(@NotNull LogoTECParser.SumaContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#redondear}.
	 * @param ctx the parse tree
	 */
	void enterRedondear(@NotNull LogoTECParser.RedondearContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#redondear}.
	 * @param ctx the parse tree
	 */
	void exitRedondear(@NotNull LogoTECParser.RedondearContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#ejecuta}.
	 * @param ctx the parse tree
	 */
	void enterEjecuta(@NotNull LogoTECParser.EjecutaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ejecuta}.
	 * @param ctx the parse tree
	 */
	void exitEjecuta(@NotNull LogoTECParser.EjecutaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#producto}.
	 * @param ctx the parse tree
	 */
	void enterProducto(@NotNull LogoTECParser.ProductoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#producto}.
	 * @param ctx the parse tree
	 */
	void exitProducto(@NotNull LogoTECParser.ProductoContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#ordenes_logicas}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_logicas(@NotNull LogoTECParser.Ordenes_logicasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ordenes_logicas}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_logicas(@NotNull LogoTECParser.Ordenes_logicasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull LogoTECParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull LogoTECParser.AndContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#diferencia}.
	 * @param ctx the parse tree
	 */
	void enterDiferencia(@NotNull LogoTECParser.DiferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#diferencia}.
	 * @param ctx the parse tree
	 */
	void exitDiferencia(@NotNull LogoTECParser.DiferenciaContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull LogoTECParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull LogoTECParser.OrContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(@NotNull LogoTECParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(@NotNull LogoTECParser.CondicionContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#residuo}.
	 * @param ctx the parse tree
	 */
	void enterResiduo(@NotNull LogoTECParser.ResiduoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#residuo}.
	 * @param ctx the parse tree
	 */
	void exitResiduo(@NotNull LogoTECParser.ResiduoContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#incrementa}.
	 * @param ctx the parse tree
	 */
	void enterIncrementa(@NotNull LogoTECParser.IncrementaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#incrementa}.
	 * @param ctx the parse tree
	 */
	void exitIncrementa(@NotNull LogoTECParser.IncrementaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#referencia}.
	 * @param ctx the parse tree
	 */
	void enterReferencia(@NotNull LogoTECParser.ReferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#referencia}.
	 * @param ctx the parse tree
	 */
	void exitReferencia(@NotNull LogoTECParser.ReferenciaContext ctx);
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
	 * Enter a parse tree produced by {@link LogoTECParser#iguales}.
	 * @param ctx the parse tree
	 */
	void enterIguales(@NotNull LogoTECParser.IgualesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#iguales}.
	 * @param ctx the parse tree
	 */
	void exitIguales(@NotNull LogoTECParser.IgualesContext ctx);
}