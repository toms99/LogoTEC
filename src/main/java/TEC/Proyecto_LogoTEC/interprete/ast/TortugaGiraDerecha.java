 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaGiraDerecha implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaGiraDerecha(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute() {
		int distancia = (int) comando.execute();
		String texto = "giraderecha " + String.valueOf(distancia);
		lector.Texto(texto.split("\n"));
		return null;
	}

}
