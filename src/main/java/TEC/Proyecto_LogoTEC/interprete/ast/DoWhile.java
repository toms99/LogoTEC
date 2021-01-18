package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.List;
import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class DoWhile implements ASTNode {
	private ASTNode condition;
	private List<ASTNode> body; 

	/**
	 * Constructor
	 * @param condition
	 * @param body
	 */
	public DoWhile(ASTNode condition, List<ASTNode> body) {
		super();
		this.condition = condition;
		this.body = body;
	}

	/**
	 * Repite la lista de instrucciones tantas veces como se dé la condición de entrada. 
	 * Las instrucciones se realizan al menos una vez antes de comprobar la condición
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		do {
			for(ASTNode n : body) {
				n.execute(symbolTable, lectorTortuga);
			}
		} while ((boolean)condition.execute(symbolTable, lectorTortuga));
		return null;
	}

}
