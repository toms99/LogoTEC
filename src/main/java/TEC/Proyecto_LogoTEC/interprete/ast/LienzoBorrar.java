 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class LienzoBorrar implements ASTNode {	
	
	/**
	 * Constructor
	 */
	public LienzoBorrar() {
		super();
	}

	/**
	 * Comnando que al ser ejecutado permite que la tortuga borre por el lugar que pasa
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "goma";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
