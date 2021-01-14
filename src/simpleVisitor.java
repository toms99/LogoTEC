// Generated from /home/chago/Documents/GitHub/LogoTEC/simple.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(simpleParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#ejecuta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEjecuta(simpleParser.EjecutaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#repite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepite(simpleParser.RepiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(simpleParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#sisino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSisino(simpleParser.SisinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(simpleParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(simpleParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#sentencia_logoTEC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_logoTEC(simpleParser.Sentencia_logoTECContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#sentencia_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_general(simpleParser.Sentencia_generalContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#ordenes_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_variables(simpleParser.Ordenes_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(simpleParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#reasignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReasignacion(simpleParser.ReasignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#incrementa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementa(simpleParser.IncrementaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(simpleParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#ordenes_logicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_logicas(simpleParser.Ordenes_logicasContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#iguales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIguales(simpleParser.IgualesContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(simpleParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(simpleParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#mayor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayor(simpleParser.MayorContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#menor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(simpleParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_aritmetica(simpleParser.Operacion_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(simpleParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#diferencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferencia(simpleParser.DiferenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#producto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducto(simpleParser.ProductoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#potencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(simpleParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(simpleParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#residuo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResiduo(simpleParser.ResiduoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#redondear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedondear(simpleParser.RedondearContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#azar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzar(simpleParser.AzarContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#menos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenos(simpleParser.MenosContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#ordenes_listas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_listas(simpleParser.Ordenes_listasContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#elegir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElegir(simpleParser.ElegirContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#elemento_n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento_n(simpleParser.Elemento_nContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#largo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLargo(simpleParser.LargoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#primero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimero(simpleParser.PrimeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#ultimo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUltimo(simpleParser.UltimoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#ordenes_tortuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_tortuga(simpleParser.Ordenes_tortugaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#avanzar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvanzar(simpleParser.AvanzarContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#retroceder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetroceder(simpleParser.RetrocederContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#girar_derecha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGirar_derecha(simpleParser.Girar_derechaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#girar_izquierda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGirar_izquierda(simpleParser.Girar_izquierdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#ocultar_tortuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOcultar_tortuga(simpleParser.Ocultar_tortugaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#aparecer_tortuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAparecer_tortuga(simpleParser.Aparecer_tortugaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#definir_coord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_coord(simpleParser.Definir_coordContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#definir_x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_x(simpleParser.Definir_xContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#definir_y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_y(simpleParser.Definir_yContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#definir_dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_dir(simpleParser.Definir_dirContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#rumbo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRumbo(simpleParser.RumboContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#centrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCentrar(simpleParser.CentrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#esperar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsperar(simpleParser.EsperarContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#ordenes_lienzo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes_lienzo(simpleParser.Ordenes_lienzoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#borrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorrar(simpleParser.BorrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#dibujar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDibujar(simpleParser.DibujarContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#no_dibujar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_dibujar(simpleParser.No_dibujarContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#definir_color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_color(simpleParser.Definir_colorContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#borra_pantalla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorra_pantalla(simpleParser.Borra_pantallaContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDato(simpleParser.DatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(simpleParser.NumeroContext ctx);
}