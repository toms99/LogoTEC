// Generated from TEC\Proyecto_LogoTEC\LogoTEC.g4 by ANTLR 4.5.1
package TEC.Proyecto_LogoTEC;
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
	 * Visit a parse tree produced by {@link LogoTECParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LogoTECParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ejecuta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEjecuta(LogoTECParser.EjecutaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#repite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepite(LogoTECParser.RepiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(LogoTECParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#sisino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSisino(LogoTECParser.SisinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(LogoTECParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(LogoTECParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#sentencia_logoTEC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_logoTEC(LogoTECParser.Sentencia_logoTECContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#sentencia_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_general(LogoTECParser.Sentencia_generalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ordenes_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_variables(LogoTECParser.Ordenes_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LogoTECParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#reasignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReasignacion(LogoTECParser.ReasignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#incrementa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementa(LogoTECParser.IncrementaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(LogoTECParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ordenes_logicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_logicas(LogoTECParser.Ordenes_logicasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#iguales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIguales(LogoTECParser.IgualesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LogoTECParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LogoTECParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#mayor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayor(LogoTECParser.MayorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#menor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(LogoTECParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_aritmetica(LogoTECParser.Operacion_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(LogoTECParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#diferencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferencia(LogoTECParser.DiferenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#producto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducto(LogoTECParser.ProductoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#potencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(LogoTECParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(LogoTECParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#residuo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResiduo(LogoTECParser.ResiduoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#redondear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedondear(LogoTECParser.RedondearContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#azar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzar(LogoTECParser.AzarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#menos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenos(LogoTECParser.MenosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ordenes_listas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_listas(LogoTECParser.Ordenes_listasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#elegir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElegir(LogoTECParser.ElegirContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#elemento_n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento_n(LogoTECParser.Elemento_nContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#largo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLargo(LogoTECParser.LargoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#primero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimero(LogoTECParser.PrimeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ultimo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUltimo(LogoTECParser.UltimoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ordenes_tortuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_tortuga(LogoTECParser.Ordenes_tortugaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#avanzar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvanzar(LogoTECParser.AvanzarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#retroceder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetroceder(LogoTECParser.RetrocederContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#girar_derecha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGirar_derecha(LogoTECParser.Girar_derechaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#girar_izquierda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGirar_izquierda(LogoTECParser.Girar_izquierdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ocultar_tortuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOcultar_tortuga(LogoTECParser.Ocultar_tortugaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#aparecer_tortuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAparecer_tortuga(LogoTECParser.Aparecer_tortugaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#definir_coord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_coord(LogoTECParser.Definir_coordContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#definir_x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_x(LogoTECParser.Definir_xContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#definir_y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_y(LogoTECParser.Definir_yContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#definir_dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_dir(LogoTECParser.Definir_dirContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#rumbo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRumbo(LogoTECParser.RumboContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#centrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCentrar(LogoTECParser.CentrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#esperar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsperar(LogoTECParser.EsperarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ordenes_lienzo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_lienzo(LogoTECParser.Ordenes_lienzoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#borrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorrar(LogoTECParser.BorrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#dibujar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDibujar(LogoTECParser.DibujarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#no_dibujar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_dibujar(LogoTECParser.No_dibujarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#definir_color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_color(LogoTECParser.Definir_colorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#borra_pantalla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorra_pantalla(LogoTECParser.Borra_pantallaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDato(LogoTECParser.DatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(LogoTECParser.NumeroContext ctx);
}