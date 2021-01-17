package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class IncrementaDos implements ASTNode {
	
	private ASTNode dato;
	private String name;
	private int res;
	private int valor;
	

	public IncrementaDos(String name, int valor) {
		super();
		this.name = name;
		this.valor = valor;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		dato = (ASTNode) symbolTable.get(name);
		res = (int)dato.execute(symbolTable, null);
		while (valor != 0) {
			res += 1;
		}
		System.out.println(res);
		symbolTable.put(name, res);
		return (int)dato.execute(symbolTable, null);
	}

}
