package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Println implements ASTNode {
	
	private ASTNode data;

	/**
	 * Constructor.
	 * @param data
	 */
	public Println(ASTNode data) {
		super();
		this.data = data;
	}



	/**
	 * Finalmente, esta clase permite que se retorne el valor de la variable dentro
	 * de la "memoria virtual" del lenguaje. La funcion de print esta desabilitada.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		//System.out.println(data.execute(symbolTable, null));
		data.execute(symbolTable, lectorTortuga);
		return data.execute(symbolTable, lectorTortuga);
	}

}
