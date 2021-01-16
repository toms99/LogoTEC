 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaDefinirCoord implements ASTNode {
	private ASTNode comandoX;
	private ASTNode comandoY;
	
	
	public TortugaDefinirCoord(ASTNode comandoX, ASTNode comandoY) {
		super();
		this.comandoX = comandoX;
		this.comandoY = comandoY;
	}


	@Override
	public Object execute() {
		int posX = (int) comandoX.execute();
		int posY = (int) comandoY.execute();
		String texto = "ponpos " + String.valueOf(posX) + " " + String.valueOf(posY);
		lector.Texto(texto.split("\n"));
		return null;
	}

}
