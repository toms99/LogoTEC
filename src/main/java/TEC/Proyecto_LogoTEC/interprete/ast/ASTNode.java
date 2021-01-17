package TEC.Proyecto_LogoTEC.interprete.ast;

import TEC.Proyecto_LogoTEC.tortuga.Lector;
import java.util.Map;

public interface ASTNode {
	public Lector lector = new Lector();
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga);
}
