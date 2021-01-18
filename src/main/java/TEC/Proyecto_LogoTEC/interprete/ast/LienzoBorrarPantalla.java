 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class LienzoBorrarPantalla implements ASTNode {	
	
	public LienzoBorrarPantalla() {
		super();
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "borrapantalla";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
