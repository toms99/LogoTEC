package TEC.Proyecto_LogoTEC.interprete.ast;

import java.util.List;
import java.util.Map;

import TEC.Proyecto_LogoTEC.tortuga.Lector;

public class SiSiNo implements ASTNode {
	private ASTNode condition;
	private List<ASTNode> IfBody;
	private List<ASTNode> ElseBody;

	/**
	 * Constructor.
	 * @param condition
	 * @param IfBody
	 * @param ElseBody
	 */
	public SiSiNo(ASTNode condition, List<ASTNode> IfBody, List<ASTNode> ElseBody) {
		super();
		this.condition = condition;
		this.IfBody = IfBody; // Cuerpo del if: sentencias dentro del if.
		this.ElseBody = ElseBody; // Cuerpo del else: sentencias dentro del else.
	}

	/**
	 * Se encarga de ejecutar las sentencias dentro de los cuerpos segun corresponda
	 * a las condiciones booleanas.
	 */
	@Override
	public Object execute(Map<String, Object> symbolTable, Lector lectorTortuga) {
		if ((boolean)condition.execute(symbolTable, lectorTortuga)) {
			for(ASTNode n : IfBody) {
				n.execute(symbolTable, lectorTortuga);
			}
		} else {
			for(ASTNode n : ElseBody) {
				n.execute(symbolTable, lectorTortuga);
			}
		}
		
		return null;
	}

}
