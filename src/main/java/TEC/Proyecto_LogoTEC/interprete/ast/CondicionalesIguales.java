package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class CondicionalesIguales implements ASTNode {
	private ASTNode primerDato;
	private ASTNode segundoDato;

	/**
	 * Contructor
	 * @param primerDato
	 * @param segundoDato
	 */
	public CondicionalesIguales(ASTNode primerDato, ASTNode segundoDato) {
		super();
		this.primerDato = primerDato;
		this.segundoDato = segundoDato;
	}


	/**
	 * Devuelve TRUE si ambos valores de entrada son iguales
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		return (primerDato.execute(symbolTable, lectorTortuga) == segundoDato.execute(symbolTable, lectorTortuga));
	}

}
