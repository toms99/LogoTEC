package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Menos implements ASTNode {
	
	private ASTNode operador;
	
	public Menos(ASTNode operador) {
		super();
		this.operador = operador;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		return (-1 * (float) operador.execute(symbolTable, lectorTortuga));
	} 

}
