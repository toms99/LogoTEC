 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaRumbo implements ASTNode {	
	
	public TortugaRumbo() {
		super();
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "rumbo";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
