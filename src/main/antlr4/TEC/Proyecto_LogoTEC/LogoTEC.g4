grammar LogoTEC;

@parser:: header {

	import java.util.Map;
	import java.util.HashMap;
	import java.util.Random; 
	import TEC.Proyecto_LogoTEC.interprete.ast.ASTNode;
	import TEC.Proyecto_LogoTEC.tortuga.Lector;
	import TEC.Proyecto_LogoTEC.interprete.ast.*;
}

@parser::members{

	Map<String, Object> tablaSimbolos = new HashMap<String, Object>(); 
	Lector lectorTortuga;
}


/* Sentencia de un programa */
programa returns [ASTNode node]: {
	List<ASTNode> body = new ArrayList<ASTNode>();
} (sentencia_logoTEC {body.add($sentencia_logoTEC.node);})* 
{
	for (ASTNode n : body) {
			n.execute(tablaSimbolos, lectorTortuga);
		}
};

/* Sentencias para funciones y ciclos 
ejecuta: DO PAR_CUAD_ABIERTO ordenes_tortuga* PAR_CUAD_CERRADO;
repite: DO_N PAR_CUAD_ABIERTO ordenes_tortuga* PAR_CUAD_CERRADO;

si: IF condicion PAR_CUAD_ABIERTO ordenes_tortuga* PAR_CUAD_CERRADO;
sisino: IF_ELSE condicion
            PAR_CUAD_ABIERTO ordenes_tortuga* PAR_CUAD_CERRADO
            PAR_CUAD_ABIERTO ordenes_tortuga* PAR_CUAD_CERRADO;

do_while: DO_WHILE PAR_CUAD_ABIERTO
            sentencia_logoTEC* PAR_CUAD_CERRADO
          PAR_CUAD_ABIERTO condicion PAR_CUAD_CERRADO;
mientras: PAR_CUAD_ABIERTO condicion PAR_CUAD_CERRADO
            PAR_CUAD_ABIERTO sentencia_logoTEC* PAR_CUAD_CERRADO; 

sentencia_logoTEC: ejecuta | repite | si | sisino | sentencia_general | do_while | mientras;
sentencia_general: ordenes_variables | ordenes_logicas | ordenes_lienzo
                      | operacion_aritmetica | ordenes_listas | ordenes_tortuga; */
                      
sentencia_logoTEC returns [ASTNode node]: ordenes_tortuga {$node = $ordenes_tortuga.node;};             

/* Sentencias de variables 
ordenes_variables: asignacion | reasignacion | incrementa;
asignacion: HAZ ID dato;
reasignacion: INIC ID ASIGNAR dato;
incrementa: INC PAR_CUAD_ABIERTO ID PAR_CUAD_CERRADO
            | INC PAR_CUAD_ABIERTO ID ENTERO PAR_CUAD_CERRADO; */

/* Sentencias logicas 
condicion: PAR_ABIERTO ordenes_logicas PAR_CERRADO;
ordenes_logicas: iguales | and | or | mayor | menor;

iguales: IGUALES dato dato;
and: AND condicion condicion;
or: OR condicion condicion;
mayor: MAYOR numero numero;
menor: MENOR numero numero; */

/* Sentencias aritmeticas 
operacion_aritmetica: suma | diferencia | producto | potencia | division | residuo
                      | redondear | azar | menos;
suma: SUMA numero numero;
diferencia: DIFERENCIA numero numero*;
producto: PRODUCTO numero numero*;
potencia: POTENCIA numero numero;
division: DIVISION numero numero;
residuo: RESIDUO ENTERO ENTERO;

redondear: REDONDEO numero;
azar: AZAR ENTERO;
menos: MENOS ENTERO; */

/* Sentencias de listas 
ordenes_listas: elegir | elemento_n | largo | primero | ultimo;
elegir returns [ASTNode node]: ELEMENTO_AZAR PAR_CUAD_ABIERTO {
							   List<ASTNode> body = new ArrayList<ASTNode>();} 
							   (dato {body.add($dato.text);})* {
							   	$node = new ListaElegir(body);
							   } PAR_CUAD_CERRADO;
							   
							   
elemento_n returns [ASTNode node]: ELEMENTO_N ENTERO PAR_CUAD_ABIERTO {
							   List<ASTNode> body = new ArrayList<ASTNode>();} 
							   (dato {body.add($dato);})* {
							   	Random rand = new Random(); 
							   	$node = body.get(Integer.parseInt($ELEMENTO_N.text));
							   } PAR_CUAD_CERRADO;
							   
largo returns [ASTNode node]: LONGITUD PAR_CUAD_ABIERTO {
							   List<ASTNode> body = new ArrayList<ASTNode>();} 
							   (dato {body.add($dato);})* {
							   	Random rand = new Random(); 
							   	$node = body.size();
							   } PAR_CUAD_CERRADO;
							   
primero returns [ASTNode node]: PRIMERO_LISTA PAR_CUAD_ABIERTO dato* PAR_CUAD_CERRADO;
ultimo returns [ASTNode node]: ULTIMO PAR_CUAD_ABIERTO dato* PAR_CUAD_CERRADO; */



/* Sentencias de la tortuga */
ordenes_tortuga returns [ASTNode node]: avanzar {$node = $avanzar.node;} 
									  | retroceder {$node = $retroceder.node;} 
									  | girar_derecha {$node = $girar_derecha.node;} 
									  | girar_izquierda {$node = $girar_izquierda.node;}
                 					  | ocultar_tortuga {$node = $ocultar_tortuga.node;} 
                 					  | aparecer_tortuga {$node = $aparecer_tortuga.node;}
                 					  | definir_coord {$node = $definir_coord.node;} 
                 					  | definir_x {$node = $definir_x.node;} 
                 					  | definir_y {$node = $definir_y.node;}
                 					  | definir_dir {$node = $definir_dir.node;} 
                 					  | rumbo {$node = $rumbo.node;} 
                 					  | centrar {$node = $centrar.node;} 
                 					  | esperar {$node = $esperar.node;};

avanzar returns [ASTNode node]: AVANZA numero {$node = new TortugaAvanza($numero.node);};
retroceder returns [ASTNode node]: RETROCEDE numero {$node = new TortugaRetrocede($numero.node);};
girar_derecha returns [ASTNode node]: GIRA_DERECHA numero {$node = new TortugaGiraDerecha($numero.node);};
girar_izquierda returns [ASTNode node]: GIRA_IZQUIERDA numero {$node = new TortugaGiraIzquierda($numero.node);};

definir_coord returns [ASTNode node]: PON_POS PAR_CUAD_ABIERTO n1 = numero {$node = $n1.node;} 
															   n2 = numero {$node = new TortugaDefinirCoord($node, $n2.node);} 
															   PAR_CUAD_CERRADO
               						|  PON_POS n1 = numero {$node = $n1.node;} 
						 					   n2 = numero {$node = new TortugaDefinirCoord($node, $n2.node);};
     
definir_x returns [ASTNode node]: PONX numero {$node = new TortugaDefinirX($numero.node);};
definir_y returns [ASTNode node]: PONY numero {$node = new TortugaDefinirY($numero.node);};
definir_dir returns [ASTNode node]: PON_RUMBO numero {$node = new TortugaDefinirDir($numero.node);};

esperar returns [ASTNode node]: ESPERA numero {$node = new TortugaDefinirEsperar($numero.node);};

ocultar_tortuga returns [ASTNode node]: OCULTA_TORTUGA {$node = new TortugaOcultar();};
aparecer_tortuga returns [ASTNode node]: APARECE_TORTUGA {$node = new TortugaAparecer();};

rumbo returns [ASTNode node]: RUMBO {$node = new TortugaRumbo();};
centrar returns [ASTNode node]: CENTRO {$node = new TortugaCentro();};


/* Sentencias generales del lienzo */
ordenes_lienzo returns [ASTNode node]: borrar {$node = $borrar.node;} 
									 | dibujar {$node = $dibujar.node;}
									 | no_dibujar {$node = $no_dibujar.node;} 
									 /* | definir_color {$node = $definir_color.node;}*/ 
									 | borra_pantalla {$node = $borra_pantalla.node;};

borrar returns [ASTNode node]: BORRADOR {$node = new LienzoBorrar();};
dibujar returns [ASTNode node]: BAJA_LAPIZ {$node = new LienzoDibujar();};
no_dibujar returns [ASTNode node]: SUBE_LAPIZ {$node = new LienzoNoDibujar();};
/*definir_color returns [ASTNode node]: COLOR ID;*/

borra_pantalla returns [ASTNode node]: BORRA_PANTALLA {$node = new LienzoBorrarPantalla();};

/* Sentencias utilitarias */
dato returns [ASTNode node]:  COMILLA ID COMILLA {$node = new Constante($ID.text);}
							  | TRUE {$node = new Constante(Boolean.parseBoolean($TRUE.text));}
							  | FALSE {$node = new Constante(Boolean.parseBoolean($FALSE.text));} 
							  /* | ID*/ 
							  | numero {$node = $numero.node;};
numero returns [ASTNode node]: ENTERO {$node = new Constante(Integer.parseInt($ENTERO.text));};
						      /*| operacion_aritmetica {$node = $numero.node;}; */


/* *** Claves o terminales especificos de LogoTEC *** */

// Claves generales

PROGRAMA: 'Programa';

// Claves para variables
HAZ: 'Haz';
INIC: 'INIC';
INC: 'INC';

// Claves para operaciones aritmeticas
SUMA: 'Suma';
RESIDUO: 'Resto';
DIVISION: 'Division';
POTENCIA: 'Potencia';
PRODUCTO: 'Producto';
NEGATIVO: 'Menos';
DIFERENCIA: 'Diferencia';

REDONDEO: 'Redondea';
AZAR: 'Azar';

//Claves para operaciones logicas
MAYOR: 'MayorQue?' | 'mayorque?';
MENOR: 'MenorQue?' | 'menorque?';
AND: 'Y';
OR: 'O';
IGUALES: 'iguales?' | 'Iguales?';

// Claves para listas
ELEMENTO_AZAR: 'Elegir';
LONGITUD: 'Cuenta';
ULTIMO: 'Ultimo' | 'ul';
ELEMENTO_N: 'Elemento';
PRIMERO_LISTA: 'Pri' | 'Primero';

// Claves para ciclos y funciones.
WHILE: 'MIENTRAS' | 'HASTA';
DO_WHILE: 'HAZ.MIENTRAS' | 'HAZ.HASTA';

IF_ELSE: 'SISINO';
IF: 'SI';
DO_N: 'REPITE';
DO: 'Ejecuta';

// Claves para la tortuga
AVANZA: 'AVANZA' | 'AV';
RETROCEDE: 'RETROCEDE' | 'RE';
ESPERA: 'ESPERA' | 'Espera';

GIRA_DERECHA: 'GiraDerecha' | 'GD';
GIRA_IZQUIERDA: 'GiraIzquierda' | 'GI';

OCULTA_TORTUGA: 'OcultaTortuga' | 'OT';
APARECE_TORTUGA: 'ApareceTortuga' | 'AT';
CENTRO: 'Centro' | 'centro';

PON_POS: 'PonPOS' | 'PonXY';
PONX: 'PonX';
PONY: 'PonY';

PON_RUMBO: 'PonRumbo';
RUMBO: 'Muestra RUMBO';


// Claves para el lienzo.
COLOR: 'poncolorlapiz' | 'PonColorLapiz' | 'poncl' | 'PonCL';
SUBE_LAPIZ: 'SubeLapiz' | 'subelapiz' | 'sb';
BAJA_LAPIZ: 'BajaLapiz' | 'bajalapiz' | 'bl';
BORRADOR: 'goma' | 'GOMA' | 'GO';
BORRA_PANTALLA: 'borrapantalla';

/* *** Valores logicos *** */
TRUE: 'TRUE';
FALSE: 'FALSE';

// LOS QUE ME DEBO FUMAR ----------
MAS: '+';
MENOS: '-';
MULTI: '*';
DIV: '/';
MY: '>';
MN: '<';
ASIGNAR: '=';

// -------------------------------


NOT: '!';


MYI: '>=';
MNI: '<=';
NEQ: '!=';



BRACKET_ABIERTO: '{';
BRACKET_CERRADO: '}';
PAR_ABIERTO: '(';
PAR_CERRADO: ')';
PAR_CUAD_ABIERTO: '[';
PAR_CUAD_CERRADO: ']';

SEMICOLON: ';';
DOS_PUNTOS: ':';
COMILLA: '"';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

ENTERO: [0-9]+;

ESPACIO_BLANCO: [ \n\t\r]+ -> skip;

////  ------------------------------------------------------------------------  ////
