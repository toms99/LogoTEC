 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaRetrocede implements ASTNode {
	private ASTNode comando;
	
	/**
	 * Constructor.
	 * @param comando
	 */
	public TortugaRetrocede(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	/**
	 * Llama a la instancia del lector (ventana de la tortuga)
	 * y le envia el comanda correspondiente para que ejecute 
	 * la accion de retroceder.
	 */
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		//	int distancia = (int) comando.execute(symbolTable, lectorTortuga);
		String texto = "retrocede " + String.valueOf(comando.execute(symbolTable, lectorTortuga));
		lector.Texto(texto.split("\n"));
		return null;
	}

}
