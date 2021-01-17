package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class IncrementaTres implements ASTNode {
	
	private String var1;
	private String var2;
	private int res;
	
	public IncrementaTres(String var1, String var2) {
		super();
		this.var1 = var1;
		this.var2 = var2;
	}


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
