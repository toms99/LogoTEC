package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Println implements ASTNode {
	private ASTNode data;
	
	
	
	public Println(ASTNode operador1, ASTNode operador2) {
		super();
		this.data = data;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		System.out.println(data.execute(null, null));
		return null;
	}

}
