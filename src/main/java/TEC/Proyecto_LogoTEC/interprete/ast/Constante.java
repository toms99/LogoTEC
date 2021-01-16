package TEC.Proyecto_LogoTEC.interprete.ast;

// Relacionada a dato.
public class Constante implements ASTNode {
	private Object valor;

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return valor;
	}

	public Constante(Object valor) {
		super();
		this.valor = valor;
	}

}
