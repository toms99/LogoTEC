 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaOcultar implements ASTNode {	
	
	public TortugaOcultar() {
		super();
	}


	@Override
	public Object execute() {
		String texto = "ocultatortuga";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
