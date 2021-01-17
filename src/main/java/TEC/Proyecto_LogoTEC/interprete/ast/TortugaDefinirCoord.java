 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaDefinirCoord implements ASTNode {
	private ASTNode comandoX;
	private ASTNode comandoY;
	
	
	public TortugaDefinirCoord(ASTNode comandoX, ASTNode comandoY) {
		super();
		this.comandoX = comandoX;
		this.comandoY = comandoY;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		int posX = (int) comandoX.execute(null, null);
		int posY = (int) comandoY.execute(null, null);
		String texto = "ponpos " + String.valueOf(posX) + " " + String.valueOf(posY);
		lector.Texto(texto.split("\n"));
		return null;
	}

}
