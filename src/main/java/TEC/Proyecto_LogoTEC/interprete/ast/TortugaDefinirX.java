 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaDefinirX implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaDefinirX(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute() {
		int pos = (int) comando.execute();
		String texto = "ponx " + String.valueOf(pos);
		lector.Texto(texto.split("\n"));
		return null;
	}

}
