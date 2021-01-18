 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaRumbo implements ASTNode {	
	
	/**
	 * Constructor.
	 */
	public TortugaRumbo() {
		super();
	}


	/**
	 * Llama a la instancia del lector (ventana de la tortuga)
	 * y le envia el comanda correspondiente para que ejecute 
	 * la accion de poner rumbo.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "rumbo";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
