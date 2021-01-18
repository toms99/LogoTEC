package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.List;
import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class WhileDo implements ASTNode {
	private ASTNode condition;
	private List<ASTNode> body; 

	/**
	 * Constructor
	 * @param condition
	 * @param body
	 */
	public WhileDo(ASTNode condition, List<ASTNode> body) {
		super();
		this.condition = condition;
		this.body = body;
	}

	@Override
	/**
	 * Se encarga de ejecutar todas las instrucciones recolectadas
	 * en el body, definido como una lista.
	 */
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		while ((boolean)condition.execute(symbolTable, lectorTortuga)) {
			for(ASTNode n : body) {
				n.execute(symbolTable, lectorTortuga);
			}
		};
		return null;
	}

}
