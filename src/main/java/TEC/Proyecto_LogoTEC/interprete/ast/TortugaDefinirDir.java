 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaDefinirDir implements ASTNode {
	private ASTNode comando;
	
	/**
	 * Constructor.
	 * @param comando
	 */
	public TortugaDefinirDir(ASTNode comando) {
		super();
		this.comando = comando;
	}

	/**
	 * Llama a la instancia del lector (ventana de la tortuga)
	 * y le envia el comanda correspondiente para que ejecute 
	 * la accion de poner un rumbo.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		//int pos = (int) comando.execute(symbolTable, lectorTortuga);
		String texto = "ponrumbo " + String.valueOf(comando.execute(symbolTable, lectorTortuga));
		lector.Texto(texto.split("\n"));
		return null;
	}

}
