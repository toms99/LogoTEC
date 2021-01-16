 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaDefinirDir implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaDefinirDir(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute() {
		int pos = (int) comando.execute();
		String texto = "ponrumbo " + String.valueOf(pos);
		lector.Texto(texto.split("\n"));
		return null;
	}

}
