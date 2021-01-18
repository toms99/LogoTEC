package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Residuo implements ASTNode {
	
	private ASTNode operador1;
	private ASTNode operador2;
	private int res;
	
	/**
	 * Constructor.
	 * @param operador1
	 * @param operador2
	 */
	public Residuo(ASTNode operador1, ASTNode operador2) {
		super();
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

	/**
	 * Retorna el residuo de una division entera entre los operadores que 
	 * procesa como Integer.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		res = (int)operador1.execute(symbolTable, lectorTortuga) % (int)operador2.execute(symbolTable, lectorTortuga);
		System.out.println(res);
		return (int)operador1.execute(symbolTable, lectorTortuga) % (int)operador2.execute(symbolTable, lectorTortuga);
	}

}
