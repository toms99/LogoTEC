// Generated from /home/chago/Documents/GitHub/LogoTEC/simple.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleParser}.
 */
public interface simpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(simpleParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(simpleParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#ejecuta}.
	 * @param ctx the parse tree
	 */
	void enterEjecuta(simpleParser.EjecutaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#ejecuta}.
	 * @param ctx the parse tree
	 */
	void exitEjecuta(simpleParser.EjecutaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#repite}.
	 * @param ctx the parse tree
	 */
	void enterRepite(simpleParser.RepiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#repite}.
	 * @param ctx the parse tree
	 */
	void exitRepite(simpleParser.RepiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(simpleParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(simpleParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#sisino}.
	 * @param ctx the parse tree
	 */
	void enterSisino(simpleParser.SisinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#sisino}.
	 * @param ctx the parse tree
	 */
	void exitSisino(simpleParser.SisinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(simpleParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(simpleParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(simpleParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(simpleParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#sentencia_logoTEC}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_logoTEC(simpleParser.Sentencia_logoTECContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#sentencia_logoTEC}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_logoTEC(simpleParser.Sentencia_logoTECContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#sentencia_general}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_general(simpleParser.Sentencia_generalContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#sentencia_general}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_general(simpleParser.Sentencia_generalContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#ordenes_variables}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_variables(simpleParser.Ordenes_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#ordenes_variables}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_variables(simpleParser.Ordenes_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(simpleParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(simpleParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#reasignacion}.
	 * @param ctx the parse tree
	 */
	void enterReasignacion(simpleParser.ReasignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#reasignacion}.
	 * @param ctx the parse tree
	 */
	void exitReasignacion(simpleParser.ReasignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#incrementa}.
	 * @param ctx the parse tree
	 */
	void enterIncrementa(simpleParser.IncrementaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#incrementa}.
	 * @param ctx the parse tree
	 */
	void exitIncrementa(simpleParser.IncrementaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(simpleParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(simpleParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#ordenes_logicas}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_logicas(simpleParser.Ordenes_logicasContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#ordenes_logicas}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_logicas(simpleParser.Ordenes_logicasContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#iguales}.
	 * @param ctx the parse tree
	 */
	void enterIguales(simpleParser.IgualesContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#iguales}.
	 * @param ctx the parse tree
	 */
	void exitIguales(simpleParser.IgualesContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(simpleParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(simpleParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(simpleParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(simpleParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#mayor}.
	 * @param ctx the parse tree
	 */
	void enterMayor(simpleParser.MayorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#mayor}.
	 * @param ctx the parse tree
	 */
	void exitMayor(simpleParser.MayorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#menor}.
	 * @param ctx the parse tree
	 */
	void enterMenor(simpleParser.MenorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#menor}.
	 * @param ctx the parse tree
	 */
	void exitMenor(simpleParser.MenorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacion_aritmetica(simpleParser.Operacion_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacion_aritmetica(simpleParser.Operacion_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(simpleParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(simpleParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#diferencia}.
	 * @param ctx the parse tree
	 */
	void enterDiferencia(simpleParser.DiferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#diferencia}.
	 * @param ctx the parse tree
	 */
	void exitDiferencia(simpleParser.DiferenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#producto}.
	 * @param ctx the parse tree
	 */
	void enterProducto(simpleParser.ProductoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#producto}.
	 * @param ctx the parse tree
	 */
	void exitProducto(simpleParser.ProductoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(simpleParser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(simpleParser.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(simpleParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(simpleParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#residuo}.
	 * @param ctx the parse tree
	 */
	void enterResiduo(simpleParser.ResiduoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#residuo}.
	 * @param ctx the parse tree
	 */
	void exitResiduo(simpleParser.ResiduoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#redondear}.
	 * @param ctx the parse tree
	 */
	void enterRedondear(simpleParser.RedondearContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#redondear}.
	 * @param ctx the parse tree
	 */
	void exitRedondear(simpleParser.RedondearContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#azar}.
	 * @param ctx the parse tree
	 */
	void enterAzar(simpleParser.AzarContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#azar}.
	 * @param ctx the parse tree
	 */
	void exitAzar(simpleParser.AzarContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#menos}.
	 * @param ctx the parse tree
	 */
	void enterMenos(simpleParser.MenosContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#menos}.
	 * @param ctx the parse tree
	 */
	void exitMenos(simpleParser.MenosContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#ordenes_listas}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_listas(simpleParser.Ordenes_listasContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#ordenes_listas}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_listas(simpleParser.Ordenes_listasContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#elegir}.
	 * @param ctx the parse tree
	 */
	void enterElegir(simpleParser.ElegirContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#elegir}.
	 * @param ctx the parse tree
	 */
	void exitElegir(simpleParser.ElegirContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#elemento_n}.
	 * @param ctx the parse tree
	 */
	void enterElemento_n(simpleParser.Elemento_nContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#elemento_n}.
	 * @param ctx the parse tree
	 */
	void exitElemento_n(simpleParser.Elemento_nContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#largo}.
	 * @param ctx the parse tree
	 */
	void enterLargo(simpleParser.LargoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#largo}.
	 * @param ctx the parse tree
	 */
	void exitLargo(simpleParser.LargoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#primero}.
	 * @param ctx the parse tree
	 */
	void enterPrimero(simpleParser.PrimeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#primero}.
	 * @param ctx the parse tree
	 */
	void exitPrimero(simpleParser.PrimeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#ultimo}.
	 * @param ctx the parse tree
	 */
	void enterUltimo(simpleParser.UltimoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#ultimo}.
	 * @param ctx the parse tree
	 */
	void exitUltimo(simpleParser.UltimoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#ordenes_tortuga}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_tortuga(simpleParser.Ordenes_tortugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#ordenes_tortuga}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_tortuga(simpleParser.Ordenes_tortugaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#avanzar}.
	 * @param ctx the parse tree
	 */
	void enterAvanzar(simpleParser.AvanzarContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#avanzar}.
	 * @param ctx the parse tree
	 */
	void exitAvanzar(simpleParser.AvanzarContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#retroceder}.
	 * @param ctx the parse tree
	 */
	void enterRetroceder(simpleParser.RetrocederContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#retroceder}.
	 * @param ctx the parse tree
	 */
	void exitRetroceder(simpleParser.RetrocederContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#girar_derecha}.
	 * @param ctx the parse tree
	 */
	void enterGirar_derecha(simpleParser.Girar_derechaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#girar_derecha}.
	 * @param ctx the parse tree
	 */
	void exitGirar_derecha(simpleParser.Girar_derechaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#girar_izquierda}.
	 * @param ctx the parse tree
	 */
	void enterGirar_izquierda(simpleParser.Girar_izquierdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#girar_izquierda}.
	 * @param ctx the parse tree
	 */
	void exitGirar_izquierda(simpleParser.Girar_izquierdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#ocultar_tortuga}.
	 * @param ctx the parse tree
	 */
	void enterOcultar_tortuga(simpleParser.Ocultar_tortugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#ocultar_tortuga}.
	 * @param ctx the parse tree
	 */
	void exitOcultar_tortuga(simpleParser.Ocultar_tortugaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#aparecer_tortuga}.
	 * @param ctx the parse tree
	 */
	void enterAparecer_tortuga(simpleParser.Aparecer_tortugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#aparecer_tortuga}.
	 * @param ctx the parse tree
	 */
	void exitAparecer_tortuga(simpleParser.Aparecer_tortugaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#definir_coord}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_coord(simpleParser.Definir_coordContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#definir_coord}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_coord(simpleParser.Definir_coordContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#definir_x}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_x(simpleParser.Definir_xContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#definir_x}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_x(simpleParser.Definir_xContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#definir_y}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_y(simpleParser.Definir_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#definir_y}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_y(simpleParser.Definir_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#definir_dir}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_dir(simpleParser.Definir_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#definir_dir}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_dir(simpleParser.Definir_dirContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#rumbo}.
	 * @param ctx the parse tree
	 */
	void enterRumbo(simpleParser.RumboContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#rumbo}.
	 * @param ctx the parse tree
	 */
	void exitRumbo(simpleParser.RumboContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#centrar}.
	 * @param ctx the parse tree
	 */
	void enterCentrar(simpleParser.CentrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#centrar}.
	 * @param ctx the parse tree
	 */
	void exitCentrar(simpleParser.CentrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#esperar}.
	 * @param ctx the parse tree
	 */
	void enterEsperar(simpleParser.EsperarContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#esperar}.
	 * @param ctx the parse tree
	 */
	void exitEsperar(simpleParser.EsperarContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#ordenes_lienzo}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes_lienzo(simpleParser.Ordenes_lienzoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#ordenes_lienzo}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes_lienzo(simpleParser.Ordenes_lienzoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#borrar}.
	 * @param ctx the parse tree
	 */
	void enterBorrar(simpleParser.BorrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#borrar}.
	 * @param ctx the parse tree
	 */
	void exitBorrar(simpleParser.BorrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#dibujar}.
	 * @param ctx the parse tree
	 */
	void enterDibujar(simpleParser.DibujarContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#dibujar}.
	 * @param ctx the parse tree
	 */
	void exitDibujar(simpleParser.DibujarContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#no_dibujar}.
	 * @param ctx the parse tree
	 */
	void enterNo_dibujar(simpleParser.No_dibujarContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#no_dibujar}.
	 * @param ctx the parse tree
	 */
	void exitNo_dibujar(simpleParser.No_dibujarContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#definir_color}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_color(simpleParser.Definir_colorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#definir_color}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_color(simpleParser.Definir_colorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#borra_pantalla}.
	 * @param ctx the parse tree
	 */
	void enterBorra_pantalla(simpleParser.Borra_pantallaContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#borra_pantalla}.
	 * @param ctx the parse tree
	 */
	void exitBorra_pantalla(simpleParser.Borra_pantallaContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(simpleParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(simpleParser.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(simpleParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(simpleParser.NumeroContext ctx);
}