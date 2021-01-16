 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaCentro implements ASTNode {	
	
	public TortugaCentro() {
		super();
	}


	@Override
	public Object execute() {
		String texto = "centro";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
