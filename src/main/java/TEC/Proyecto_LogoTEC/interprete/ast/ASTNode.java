package TEC.Proyecto_LogoTEC.interprete.ast;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public interface ASTNode {
	public Lector lector = new Lector();
	public Object execute();
}
