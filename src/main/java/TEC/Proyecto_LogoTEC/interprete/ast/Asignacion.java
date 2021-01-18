package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Asignacion implements ASTNode {

	private String name;
	private ASTNode dato;
		
	/**
	 * Constructor
	 * @param name
	 * @param dato
	 */
	public Asignacion(String name, ASTNode dato) {
		super();
		this.name = name;
		this.dato = dato;
	}

	/*
	 * Asigna un valor a una variable aún no asignada
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		
		try {
			if (symbolTable.get(name) != null) {	
				throw new AsigException (111);
			}else {
				symbolTable.put(name, dato.execute(symbolTable, lectorTortuga));
			}
		}catch (AsigException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

}
