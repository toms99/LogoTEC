 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class LienzoDibujar implements ASTNode {	
	
	public LienzoDibujar() {
		super();
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "bajalapiz";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
