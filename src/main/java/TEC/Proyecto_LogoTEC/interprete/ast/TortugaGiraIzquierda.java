 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaGiraIzquierda implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaGiraIzquierda(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		int distancia = (int) comando.execute(null, null);
		String texto = "giraizquierda " + String.valueOf(distancia);
		lector.Texto(texto.split("\n"));
		return null;
	}

}
