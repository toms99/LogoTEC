 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaColor implements ASTNode {
	private String comando;
	
	
	public TortugaColor(String comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		String texto = "poncolorlapiz " + comando;
		lector.Texto(texto.split("\n"));
		return null;
	}

}
