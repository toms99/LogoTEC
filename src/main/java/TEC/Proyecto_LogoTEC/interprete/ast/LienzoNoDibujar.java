 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class LienzoNoDibujar implements ASTNode {	
	
	/**
	 * Contructor
	 */
	public LienzoNoDibujar() {
		super();
	}

	/**
	 * El lápiz deja de dibujar cuando se mueve.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "subelapiz";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
