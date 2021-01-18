 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaDefinirCoord implements ASTNode {
	private ASTNode comandoX;
	private ASTNode comandoY;
	
	/**
	 * Constructor.
	 * @param comandoX
	 * @param comandoY
	 */
	public TortugaDefinirCoord(ASTNode comandoX, ASTNode comandoY) {
		super();
		this.comandoX = comandoX;
		this.comandoY = comandoY;
	}

	/**
	 * Llama a la instancia del lector (ventana de la tortuga)
	 * y le envia el comanda correspondiente para que ejecute 
	 * la accion de definir la posicion x y y de la tortuga.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		//int posX = (int) comandoX.execute(symbolTable, lectorTortuga);
		//int posY = (int) comandoY.execute(symbolTable, lectorTortuga);
		String texto = "ponpos [ " + String.valueOf(comandoX.execute(symbolTable, lectorTortuga)) 
						+ " " + String.valueOf(comandoY.execute(symbolTable, lectorTortuga) + " ]");
		lector.Texto(texto.split("\n"));
		return null;
	}

}
