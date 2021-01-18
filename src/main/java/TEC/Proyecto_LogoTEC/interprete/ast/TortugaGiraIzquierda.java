 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaGiraIzquierda implements ASTNode {
	private ASTNode comando;
	
	/**
	 * Constructor.
	 * @param comando
	 */
	public TortugaGiraIzquierda(ASTNode comando) {
		super();
		this.comando = comando;
	}


	/**
	 * Llama a la instancia del lector (ventana de la tortuga)
	 * y le envia el comanda correspondiente para que ejecute 
	 * la accion de girar a la izquierda.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		//int distancia = (int) comando.execute(symbolTable, lectorTortuga);
		String texto = "giraizquierda " + String.valueOf(comando.execute(symbolTable, lectorTortuga));
		lector.Texto(texto.split("\n"));
		return null;
	}

}
