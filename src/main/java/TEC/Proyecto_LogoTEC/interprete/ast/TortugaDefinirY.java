 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaDefinirY implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaDefinirY(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute() {
		int pos = (int) comando.execute();
		String texto = "pony " + String.valueOf(pos);
		lector.Texto(texto.split("\n"));
		return null;
	}

}
