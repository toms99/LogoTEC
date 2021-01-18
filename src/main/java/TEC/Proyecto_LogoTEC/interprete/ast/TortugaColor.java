 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaColor implements ASTNode {
	private String comando;
	
	/**
	 * Constructor.
	 * @param comando
	 */
	public TortugaColor(String comando) {
		super();
		this.comando = comando;
	}

	/**
	 * Llama a la instancia del lector (ventana de la tortuga)
	 * y le envia el comanda correspondiente para que ejecute 
	 * la accion de cambiar el color del lapiz.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "poncolorlapiz " + comando;
		lector.Texto(texto.split("\n"));
		return null;
	}

}
