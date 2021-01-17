package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Diferencia implements ASTNode {
	
	private ASTNode operador1;
	private ASTNode operador2;
	private int res;
	
	public Diferencia(ASTNode operador1, ASTNode operador2) {
		super();
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		res = (int)operador1.execute(symbolTable, null) - (int)operador2.execute(symbolTable, null);
		System.out.println(res);
		return (int)operador1.execute(symbolTable, null) - (int)operador2.execute(symbolTable, null);
	}

}
