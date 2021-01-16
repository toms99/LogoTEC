 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaRetrocede implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaRetrocede(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute() {
		int distancia = (int) comando.execute();
		String texto = "retrocede " + String.valueOf(distancia);
		lector.Texto(texto.split("\n"));
		return null;
	}

}