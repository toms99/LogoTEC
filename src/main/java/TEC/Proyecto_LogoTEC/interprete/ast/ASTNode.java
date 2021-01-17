package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public interface ASTNode {
	public Lector lector = new Lector();
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga);
}
