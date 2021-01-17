package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Repite implements ASTNode {
	private List<ASTNode> body;
	private ASTNode comando;

	public Repite(List<ASTNode> body, ASTNode veces) {
		super();
		this.body = body;
		this.comando = veces;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		int veces = (int)  comando.execute(symbolTable, lectorTortuga);
		while (veces >= 1) {

			for (ASTNode sentencia : body) {
				sentencia.execute(symbolTable, lectorTortuga);
			}
			veces--;
		}
		return null;
	}

}
