package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class IncrementaUno implements ASTNode {
	
	private String name;
	private int res;

	public IncrementaUno(String name) {
		super();
		this.name = name;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		res = (int)symbolTable.get(name) + 1;
		System.out.println(res);
		symbolTable.put(name, res);
		return res;
	}

}
