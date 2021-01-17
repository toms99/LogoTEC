package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class ConstRef implements ASTNode {
	
	private String name;

	public ConstRef(String name) {
		super();
		this.name = name;
	}

	@Override
	public Object execute(Map<String,Object> symbolTable, Lector lectorTortuga) {
		return symbolTable.get(name);
	}

}
