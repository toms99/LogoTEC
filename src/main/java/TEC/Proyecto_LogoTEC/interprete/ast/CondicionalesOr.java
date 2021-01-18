package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class CondicionalesOr implements ASTNode {
	private ASTNode primerDato;
	private ASTNode segundoDato;
	
	

	public CondicionalesOr(ASTNode primerDato, ASTNode segundoDato) {
		super();
		this.primerDato = primerDato;
		this.segundoDato = segundoDato;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		Boolean valor1 = (Boolean) primerDato.execute(symbolTable, lectorTortuga); 
		Boolean valor2 = (Boolean) segundoDato.execute(symbolTable, lectorTortuga); 
		return (valor1 || valor2);
	}

}
