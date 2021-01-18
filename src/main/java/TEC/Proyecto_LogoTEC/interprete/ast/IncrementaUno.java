package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class IncrementaUno implements ASTNode {
	
	private String name;
	private int res;

	/**
	 * Constructor
	 * @param name
	 */
	public IncrementaUno(String name) {
		super();
		this.name = name;
	}

	/**
	 * Incrementa +1 la variable de entrada que contenga un Integer
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		res = (int)symbolTable.get(name) + 1;
		System.out.println(res);
		symbolTable.put(name, res);
		return res;
	}

}
