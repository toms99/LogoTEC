 package TEC.Proyecto_LogoTEC.interprete.ast;

public class LienzoBorrar implements ASTNode {	
	
	public LienzoBorrar() {
		super();
	}


	@Override
	public Object execute() {
		String texto = "goma";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
