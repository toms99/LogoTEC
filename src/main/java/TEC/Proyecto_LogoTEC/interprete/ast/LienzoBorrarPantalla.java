 package TEC.Proyecto_LogoTEC.interprete.ast;

public class LienzoBorrarPantalla implements ASTNode {	
	
	public LienzoBorrarPantalla() {
		super();
	}


	@Override
	public Object execute() {
		String texto = "subelapiz";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
