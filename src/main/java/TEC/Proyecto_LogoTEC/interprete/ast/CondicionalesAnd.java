package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class CondicionalesAnd implements ASTNode {
	private ASTNode primerDato;
	private ASTNode segundoDato;

	/**
	 * Constructor
	 * @param primerDato
	 * @param segundoDato
	 */
	public CondicionalesAnd(ASTNode primerDato, ASTNode segundoDato) {
		super();
		this.primerDato = primerDato;
		this.segundoDato = segundoDato;
	}


	/**
	 * Retorna TRUE si ambas condiciones de entrada son verdaderas 
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		Boolean valor1 = (Boolean) primerDato.execute(symbolTable, lectorTortuga); 
		Boolean valor2 = (Boolean) segundoDato.execute(symbolTable, lectorTortuga); 
		return (valor1 & valor2);
	}

}
