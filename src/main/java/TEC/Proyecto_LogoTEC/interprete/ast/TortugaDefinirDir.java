 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaDefinirDir implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaDefinirDir(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		int pos = (int) comando.execute(null, null);
		String texto = "ponrumbo " + String.valueOf(pos);
		lector.Texto(texto.split("\n"));
		return null;
	}

}
