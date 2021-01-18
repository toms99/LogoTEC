package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class ConstRef implements ASTNode {
	
	private String name;

	/**
	 * Contructor
	 * @param name
	 */
	public ConstRef(String name) {
		super();
		this.name = name;
	}

	/**
	 * Obtiene el valor asignado a un nodo en la tabla de simbolos
	 */
	@Override
	public Object execute(Map<String,Object> symbolTable, Lector lectorTortuga) {
		return symbolTable.get(name);
	}

}
