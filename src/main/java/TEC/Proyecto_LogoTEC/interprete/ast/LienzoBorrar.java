 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class LienzoBorrar implements ASTNode {	
	
	public LienzoBorrar() {
		super();
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "goma";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
