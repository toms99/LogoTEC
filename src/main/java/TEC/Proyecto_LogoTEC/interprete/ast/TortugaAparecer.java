 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaAparecer implements ASTNode {	
	
	public TortugaAparecer() {
		super();
	}


	@Override
	public Object execute() {
		String texto = "aparecetortuga";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
