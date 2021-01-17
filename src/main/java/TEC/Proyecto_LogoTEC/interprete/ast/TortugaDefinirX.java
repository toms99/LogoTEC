 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaDefinirX implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaDefinirX(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		int pos = (int) comando.execute(null, null);
		String texto = "ponx " + String.valueOf(pos);
		lector.Texto(texto.split("\n"));
		return null;
	}

}
