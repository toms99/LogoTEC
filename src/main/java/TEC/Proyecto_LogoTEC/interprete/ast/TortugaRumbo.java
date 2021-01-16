 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaRumbo implements ASTNode {	
	
	public TortugaRumbo() {
		super();
	}


	@Override
	public Object execute() {
		String texto = "rumbo";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
