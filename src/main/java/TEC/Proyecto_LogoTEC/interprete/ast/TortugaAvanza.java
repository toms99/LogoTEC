 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaAvanza implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaAvanza(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute() {
		int distancia = (int) comando.execute();
		String texto = "avanza " + String.valueOf(distancia);
		lector.Texto(texto.split("\n"));
		return null;
	}

}
