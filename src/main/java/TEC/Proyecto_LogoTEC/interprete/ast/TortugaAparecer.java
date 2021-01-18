 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaAparecer implements ASTNode {	
	
	/**
	 * Constructor.
	 */
	public TortugaAparecer() {
		super();
	}

	/**
	 * Llama a la instancia del lector (ventana de la tortuga)
	 * y le envia el comanda correspondiente para que ejecute 
	 * la accion de que la tortuga aparezca en la pantalla.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "aparecetortuga";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
