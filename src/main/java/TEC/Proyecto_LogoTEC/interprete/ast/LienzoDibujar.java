 package TEC.Proyecto_LogoTEC.interprete.ast;

public class LienzoDibujar implements ASTNode {	
	
	public LienzoDibujar() {
		super();
	}


	@Override
	public Object execute() {
		String texto = "bajalapiz";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
