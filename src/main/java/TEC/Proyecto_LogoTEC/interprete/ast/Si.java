package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.List;
import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Si implements ASTNode {
	private ASTNode condition;
	private List<ASTNode> body; 

	public Si(ASTNode condition, List<ASTNode> body) {
		super();
		this.condition = condition;
		this.body = body;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		if ((boolean)condition.execute(symbolTable, lectorTortuga)) {
			for(ASTNode n : body) {
				n.execute(symbolTable, lectorTortuga);
			}
		}
		return null;
	}

}
