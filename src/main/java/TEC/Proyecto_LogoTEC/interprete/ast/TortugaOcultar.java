 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaOcultar implements ASTNode {	
	
	public TortugaOcultar() {
		super();
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "ocultatortuga";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
