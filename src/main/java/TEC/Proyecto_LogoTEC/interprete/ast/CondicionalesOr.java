package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class CondicionalesOr implements ASTNode {
	private ASTNode primerDato;
	private ASTNode segundoDato;
	
	
	/**
	 * Constructor
	 * @param primerDato
	 * @param segundoDato
	 */
	public CondicionalesOr(ASTNode primerDato, ASTNode segundoDato) {
		super();
		this.primerDato = primerDato;
		this.segundoDato = segundoDato;
	}


	/**
	 * Retorna TRUE si al menos una de las condiciones es verdadera
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		Boolean valor1 = (Boolean) primerDato.execute(symbolTable, lectorTortuga); 
		Boolean valor2 = (Boolean) segundoDato.execute(symbolTable, lectorTortuga); 
		return (valor1 || valor2);
	}

}
