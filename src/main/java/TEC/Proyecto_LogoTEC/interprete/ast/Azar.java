package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;
import java.util.Random;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Azar implements ASTNode {
	
	private ASTNode operador;
	
	/**
	 * Constructor
	 * @param operador
	 */
	public Azar(ASTNode operador) {
		super();
		this.operador = operador;
	}

	/**
	 * Generar un número aleatorio comprendido entre 0 y un Integer de entrada
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		Random rand = new Random(); 
		return rand.nextInt((int) operador.execute(symbolTable, lectorTortuga));
	} 

}
