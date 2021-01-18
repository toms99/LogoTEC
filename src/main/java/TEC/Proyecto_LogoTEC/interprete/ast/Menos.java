package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Menos implements ASTNode {
	
	private ASTNode operador;
	
	/**
	 * Constructor.
	 * @param operador
	 */
	public Menos(ASTNode operador) {
		super();
		this.operador = operador;
	}

	/**
	 * Retorna el negativo del operador que ejecuta como un Integer.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		return (-1 * (int) operador.execute(symbolTable, lectorTortuga));
	} 

}
