package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.List;
import java.util.Map;
import java.util.Random;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class ListaElegir implements ASTNode {
	private List<ASTNode> body;
	
	public ListaElegir(List<ASTNode> body) {
		super();
		this.body = body;
	}
	
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
	   	Random rand = new Random(); 
	   	ASTNode result = body.get(rand.nextInt(body.size()));
		return null;
	}

}
