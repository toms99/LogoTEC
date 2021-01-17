 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaDefinirEsperar implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaDefinirEsperar(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		int pos = (int) comando.execute(null, null);
		String texto = "espera " + String.valueOf(pos);
		lector.Texto(texto.split("\n"));
		return null;
	}

}
