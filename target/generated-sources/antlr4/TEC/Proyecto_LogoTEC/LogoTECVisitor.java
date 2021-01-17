// Generated from LogoTEC.g4 by ANTLR 4.4
package TEC.Proyecto_LogoTEC;



	import java.util.Map;
	import java.util.HashMap;
	import java.util.Random; 
	import TEC.Proyecto_LogoTEC.interprete.ast.ASTNode;
	import TEC.Proyecto_LogoTEC.tortuga.Lector;
	import TEC.Proyecto_LogoTEC.interprete.ast.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogoTECParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogoTECVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(@NotNull LogoTECParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(@NotNull LogoTECParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#primero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimero(@NotNull LogoTECParser.PrimeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#redondear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedondear(@NotNull LogoTECParser.RedondearContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(@NotNull LogoTECParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#azar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzar(@NotNull LogoTECParser.AzarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#no_dibujar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_dibujar(@NotNull LogoTECParser.No_dibujarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#elegir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElegir(@NotNull LogoTECParser.ElegirContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ordenes_lienzo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_lienzo(@NotNull LogoTECParser.Ordenes_lienzoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull LogoTECParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_aritmetica(@NotNull LogoTECParser.Operacion_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#producto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducto(@NotNull LogoTECParser.ProductoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#esperar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsperar(@NotNull LogoTECParser.EsperarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(@NotNull LogoTECParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#menos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenos(@NotNull LogoTECParser.MenosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDato(@NotNull LogoTECParser.DatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#definir_coord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_coord(@NotNull LogoTECParser.Definir_coordContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#largo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLargo(@NotNull LogoTECParser.LargoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ordenes_tortuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_tortuga(@NotNull LogoTECParser.Ordenes_tortugaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#definir_dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_dir(@NotNull LogoTECParser.Definir_dirContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#centrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCentrar(@NotNull LogoTECParser.CentrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#diferencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferencia(@NotNull LogoTECParser.DiferenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#retroceder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetroceder(@NotNull LogoTECParser.RetrocederContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ultimo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUltimo(@NotNull LogoTECParser.UltimoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#sentencia_logoTEC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_logoTEC(@NotNull LogoTECParser.Sentencia_logoTECContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#reasignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReasignacion(@NotNull LogoTECParser.ReasignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ordenes_listas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_listas(@NotNull LogoTECParser.Ordenes_listasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#avanzar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvanzar(@NotNull LogoTECParser.AvanzarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#rumbo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRumbo(@NotNull LogoTECParser.RumboContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#borra_pantalla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorra_pantalla(@NotNull LogoTECParser.Borra_pantallaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#girar_derecha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGirar_derecha(@NotNull LogoTECParser.Girar_derechaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#residuo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResiduo(@NotNull LogoTECParser.ResiduoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#potencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(@NotNull LogoTECParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#borrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorrar(@NotNull LogoTECParser.BorrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#dibujar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDibujar(@NotNull LogoTECParser.DibujarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#elemento_n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento_n(@NotNull LogoTECParser.Elemento_nContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#definir_x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_x(@NotNull LogoTECParser.Definir_xContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ordenes_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_variables(@NotNull LogoTECParser.Ordenes_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#definir_y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_y(@NotNull LogoTECParser.Definir_yContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#aparecer_tortuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAparecer_tortuga(@NotNull LogoTECParser.Aparecer_tortugaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#incrementa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementa(@NotNull LogoTECParser.IncrementaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#referencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencia(@NotNull LogoTECParser.ReferenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ocultar_tortuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOcultar_tortuga(@NotNull LogoTECParser.Ocultar_tortugaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#girar_izquierda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGirar_izquierda(@NotNull LogoTECParser.Girar_izquierdaContext ctx);
}