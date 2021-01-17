 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaCentro implements ASTNode {	
	
	public TortugaCentro() {
		super();
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "centro";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
