package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.List;
import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Para implements ASTNode {

	private String name;
	private List<ASTNode> body;
	//private List<ASTNode> params;
	//private ASTNode dato;
		
	/**
	 * Constructor
	 * @param name
	 * @param dato
	 */
	public Para(String name, List<ASTNode> body) {
		super();
		this.name = name;
		this.body = body;
	}

	/*
	 * Asigna un valor a una variable aún no asignada
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		symbolTable.put(name, body);
		//symbolTable.get(name);     // Obtener el valor de la variable
		return null;
	}

}
