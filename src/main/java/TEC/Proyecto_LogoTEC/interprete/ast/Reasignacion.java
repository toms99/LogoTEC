package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Reasignacion implements ASTNode {

	private String name;
	private ASTNode dato;
		
	public Reasignacion(String name, ASTNode dato) {
		super();
		this.name = name;
		this.dato = dato;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		symbolTable.put(name, dato.execute(symbolTable, lectorTortuga));
		//symbolTable.get(name);     // Obtener el valor de la variable
		return null;
	}

}
