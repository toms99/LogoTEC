 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;


import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaOcultar implements ASTNode {	
	
	/**
	 * Constructor.
	 */
	public TortugaOcultar() {
		super();
	}


	/**
	 * Llama a la instancia del lector (ventana de la tortuga)
	 * y le envia el comanda correspondiente para que ejecute 
	 * la accion de ocultar la tortuga.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "ocultatortuga";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
