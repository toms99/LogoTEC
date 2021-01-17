package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Println implements ASTNode {
	
	private ASTNode data;

	public Println(ASTNode data) {
		super();
		this.data = data;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		//System.out.println(data.execute(symbolTable, null));
		data.execute(symbolTable, lectorTortuga);
		return null;
	}

}
