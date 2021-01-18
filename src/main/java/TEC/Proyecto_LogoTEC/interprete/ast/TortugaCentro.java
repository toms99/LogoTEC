 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaCentro implements ASTNode {	
	
	/**
	 * Constructor.
	 */
	public TortugaCentro() {
		super();
	}

	
	/**
	 * Llama a la instancia del lector (ventana de la tortuga)
	 * y le envia el comanda correspondiente para que ejecute 
	 * la accion de colocar la tortuga en el centro.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "centro";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
