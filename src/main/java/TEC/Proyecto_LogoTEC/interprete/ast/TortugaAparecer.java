 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaAparecer implements ASTNode {	
	
	public TortugaAparecer() {
		super();
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "aparecetortuga";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
