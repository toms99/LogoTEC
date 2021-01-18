package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

// Relacionada a dato.
public class Constante implements ASTNode {
	private Object valor;

	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		// TODO Auto-generated method stub
		return valor;
	}

	/**
	 * Contructor
	 * @param valor
	 */
	public Constante(Object valor) {
		super();
		this.valor = valor;
	}

}
