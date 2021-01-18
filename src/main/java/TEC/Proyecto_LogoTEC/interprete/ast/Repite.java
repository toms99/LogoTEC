package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class Repite implements ASTNode {
	private List<ASTNode> body;
	private ASTNode comando;

	/**
	 * Constructor.
	 * @param body
	 * @param veces
	 */
	public Repite(List<ASTNode> body, ASTNode veces) {
		super();
		this.body = body; // cuerpo: contiene las sentencias a ejecutar.
		this.comando = veces;
	}

	/**
	 * Se encarga de repetir las instrucciones que se encuentran dentro del cuerpo
	 * las veces que corresponda.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		int veces = (int)  comando.execute(symbolTable, lectorTortuga);
		while (veces >= 1) {

			for (ASTNode sentencia : body) {
				sentencia.execute(symbolTable, lectorTortuga);
			}
			veces--;
		}
		return null;
	}

}
