 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaDefinirEsperar implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaDefinirEsperar(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute() {
		int pos = (int) comando.execute();
		String texto = "espera " + String.valueOf(pos);
		lector.Texto(texto.split("\n"));
		return null;
	}

}
