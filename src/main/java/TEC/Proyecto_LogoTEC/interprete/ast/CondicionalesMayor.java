package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class CondicionalesMayor implements ASTNode {
	private ASTNode primerDato;
	private ASTNode segundoDato;
	
	
	/**
	 * Constructor
	 * @param primerDato
	 * @param segundoDato
	 */
	public CondicionalesMayor(ASTNode primerDato, ASTNode segundoDato) {
		super();
		this.primerDato = primerDato;
		this.segundoDato = segundoDato;
	}


	/**
	 * Retorna TRUE si el primer valor de entrada ´primerDato´ es mayor que el segundo valor de entrada 'segundoDato'
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		int valor1 = (int) primerDato.execute(symbolTable, lectorTortuga); 
		int valor2 = (int) segundoDato.execute(symbolTable, lectorTortuga); 
		return (valor1 > valor2);
	}

}
