package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class IncrementaTres implements ASTNode {
	
	private String var1;
	private String var2;
	private int res;
	
	/**
	 * Constructor
	 * @param var1
	 * @param var2
	 */
	public IncrementaTres(String var1, String var2) {
		super();
		this.var1 = var1;
		this.var2 = var2;
	}

	/**
	 * Retorna el incremento del primer valor de entrada la cantidad de veces del segundo valor Integer de entrada, en caso de que el segundo valor sea una variable 
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		
		res = (int)symbolTable.get(var1);
		while ((int)symbolTable.get(var2) != 0) {
			res += 1;
		}
		System.out.println(res);
		symbolTable.put(var1, res);
		return res;
	}

}
