 package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class TortugaGiraDerecha implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaGiraDerecha(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		//int distancia = (int) comando.execute(symbolTable, lectorTortuga);
		String texto = "giraderecha " + String.valueOf(comando.execute(symbolTable, lectorTortuga));
		lector.Texto(texto.split("\n"));
		return null;
	}

}
