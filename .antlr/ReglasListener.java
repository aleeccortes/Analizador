// Generated from c:/Users/corte/OneDrive/Escritorio/Analizador/Reglas.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReglasParser}.
 */
public interface ReglasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReglasParser#dsl}.
	 * @param ctx the parse tree
	 */
	void enterDsl(ReglasParser.DslContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#dsl}.
	 * @param ctx the parse tree
	 */
	void exitDsl(ReglasParser.DslContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#regla}.
	 * @param ctx the parse tree
	 */
	void enterRegla(ReglasParser.ReglaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#regla}.
	 * @param ctx the parse tree
	 */
	void exitRegla(ReglasParser.ReglaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(ReglasParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(ReglasParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#accesoNoAutorizado}.
	 * @param ctx the parse tree
	 */
	void enterAccesoNoAutorizado(ReglasParser.AccesoNoAutorizadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#accesoNoAutorizado}.
	 * @param ctx the parse tree
	 */
	void exitAccesoNoAutorizado(ReglasParser.AccesoNoAutorizadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#multiplesIntentosFallidos}.
	 * @param ctx the parse tree
	 */
	void enterMultiplesIntentosFallidos(ReglasParser.MultiplesIntentosFallidosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#multiplesIntentosFallidos}.
	 * @param ctx the parse tree
	 */
	void exitMultiplesIntentosFallidos(ReglasParser.MultiplesIntentosFallidosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#actividadSospechosa}.
	 * @param ctx the parse tree
	 */
	void enterActividadSospechosa(ReglasParser.ActividadSospechosaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#actividadSospechosa}.
	 * @param ctx the parse tree
	 */
	void exitActividadSospechosa(ReglasParser.ActividadSospechosaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(ReglasParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(ReglasParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(ReglasParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(ReglasParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReglasParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(ReglasParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReglasParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(ReglasParser.IdentificadorContext ctx);
}