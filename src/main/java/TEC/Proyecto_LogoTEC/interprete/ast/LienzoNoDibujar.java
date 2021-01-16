 package TEC.Proyecto_LogoTEC.interprete.ast;

public class LienzoNoDibujar implements ASTNode {	
	
	public LienzoNoDibujar() {
		super();
	}


	@Override
	public Object execute() {
		String texto = "subelapiz";
		lector.Texto(texto.split("\n"));
		return null;
	}

}
