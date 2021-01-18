package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class CondicionalesIguales implements ASTNode {
	private ASTNode primerDato;
	private ASTNode segundoDato;

	
	public CondicionalesIguales(ASTNode primerDato, ASTNode segundoDato) {
		super();
		this.primerDato = primerDato;
		this.segundoDato = segundoDato;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		return (primerDato.execute(symbolTable, lectorTortuga) == segundoDato.execute(symbolTable, lectorTortuga));
	}

}
