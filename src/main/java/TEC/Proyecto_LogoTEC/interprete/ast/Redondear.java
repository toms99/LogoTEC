package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Redondear implements ASTNode {
	
	private ASTNode operador;
	
	public Redondear(ASTNode operador) {
		super();
		this.operador = operador;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		return Math.round((float) operador.execute(symbolTable, lectorTortuga));
	} 

}