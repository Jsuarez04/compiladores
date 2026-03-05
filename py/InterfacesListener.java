// Generated from Interfaces.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterfacesParser}.
 */
public interface InterfacesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterfacesParser#archivo}.
	 * @param ctx the parse tree
	 */
	void enterArchivo(InterfacesParser.ArchivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterfacesParser#archivo}.
	 * @param ctx the parse tree
	 */
	void exitArchivo(InterfacesParser.ArchivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterfacesParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(InterfacesParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterfacesParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(InterfacesParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterfacesParser#familia}.
	 * @param ctx the parse tree
	 */
	void enterFamilia(InterfacesParser.FamiliaContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterfacesParser#familia}.
	 * @param ctx the parse tree
	 */
	void exitFamilia(InterfacesParser.FamiliaContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterfacesParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(InterfacesParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterfacesParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(InterfacesParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterfacesParser#opcion}.
	 * @param ctx the parse tree
	 */
	void enterOpcion(InterfacesParser.OpcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterfacesParser#opcion}.
	 * @param ctx the parse tree
	 */
	void exitOpcion(InterfacesParser.OpcionContext ctx);
}