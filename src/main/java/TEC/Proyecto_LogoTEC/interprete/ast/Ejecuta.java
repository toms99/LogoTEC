package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Ejecuta implements ASTNode {
	private List<ASTNode> body;

	public Ejecuta(List<ASTNode> body) {
		super();
		this.body = body;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		for (ASTNode sentencia : body) {
			sentencia.execute(symbolTable, lectorTortuga);
		}
		return null;
	}

}
