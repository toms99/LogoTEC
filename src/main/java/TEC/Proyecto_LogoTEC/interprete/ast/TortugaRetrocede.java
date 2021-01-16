 package TEC.Proyecto_LogoTEC.interprete.ast;

public class TortugaRetrocede implements ASTNode {
	private ASTNode comando;
	
	
	public TortugaRetrocede(ASTNode comando) {
		super();
		this.comando = comando;
	}


	@Override
	public Object execute() {
		return (int) comando.execute();
	}

}
