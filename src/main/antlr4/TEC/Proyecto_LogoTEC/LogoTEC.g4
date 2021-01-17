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

/* Sentencias para funciones y ciclos */

ejecuta returns [ASTNode node]: DO PAR_CUAD_ABIERTO {
						List<ASTNode> body = new ArrayList<ASTNode>();
						} (ordenes_tortuga {body.add($ordenes_tortuga.node);})*  PAR_CUAD_CERRADO 
						{$node = new Ejecuta(body);};

repite returns [ASTNode node]: DO_N numero PAR_CUAD_ABIERTO {
						List<ASTNode> body = new ArrayList<ASTNode>();
						} (ordenes_tortuga {body.add($ordenes_tortuga.node);})* PAR_CUAD_CERRADO
						{$node = new Repite(body, $numero.node);};

/*si: IF condicion PAR_CUAD_ABIERTO ordenes_tortuga* PAR_CUAD_CERRADO;
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
                      
sentencia_logoTEC returns [ASTNode node]: ordenes_tortuga {$node = $ordenes_tortuga.node;}
										| ordenes_variables {$node = $ordenes_variables.node;}
										| ejecuta {$node = $ejecuta.node;}
										| repite {$node = $repite.node;};             

// Sentencias de variables 
ordenes_variables returns [ASTNode node]: asignacion {$node = $asignacion.node;}
										| reasignacion {$node = $reasignacion.node;}
										| incrementa {$node = $incrementa.node;}
										| referencia {$node = $referencia.node;}; 
										
asignacion returns [ASTNode node]: 
			HAZ ID dato {$node =  new Asignacion($ID.text, $dato.node);};
reasignacion returns [ASTNode node]: 
			INIC ID ASIGNAR dato {$node =  new Reasignacion($ID.text, $dato.node);};
incrementa returns [ASTNode node]: 
			INC PAR_CUAD_ABIERTO ID PAR_CUAD_CERRADO {$node =  new IncrementaUno($ID.text);}
		  //| INC PAR_CUAD_ABIERTO ID numero PAR_CUAD_CERRADO {$node =  new IncrementaDos($ID.text, numero);}
          | INC PAR_CUAD_ABIERTO ID dato PAR_CUAD_CERRADO {$node =  new IncrementaTres($ID.text, $dato.text);};

referencia returns [ASTNode node]: 
			ID {$node = new ConstRef($ID.text);};

/* Sentencias logicas   
condicion: PAR_ABIERTO ordenes_logicas PAR_CERRADO;
ordenes_logicas: iguales | and | or | mayor | menor;

iguales: IGUALES dato dato;
and: AND condicion condicion;
or: OR condicion condicion;
mayor: MAYOR numero numero;
menor: MENOR numero numero; */

/*  Sentencias aritmeticas  */  
operacion_aritmetica returns [ASTNode node]: suma {$node = $suma.node;} 
										   | diferencia {$node = $diferencia.node;}
										   | producto {$node = $producto.node;} 
										   | potencia {$node = $potencia.node;}
										   | division {$node = $division.node;} 
										   | residuo {$node = $residuo.node;}
										   | redondear {$node = $redondear.node;}
										   | azar {$node = $azar.node;} 
										   | menos {$node = $menos.node;};
										   
suma returns [ASTNode node]: SUMA n1 = numero {$node = $n1.node;} 
								(n2 = numero {$node = new Suma($node, $n2.node);})*;
diferencia returns [ASTNode node]: DIFERENCIA n1 = numero {$node = $n1.node;} 
								(n2 = numero {$node = new Diferencia($node, $n2.node);})*;
producto returns [ASTNode node]: PRODUCTO n1 = numero {$node = $n1.node;} 
								(n2 = numero {$node = new Producto($node, $n2.node);})*;
potencia returns [ASTNode node]: POTENCIA n1 = numero {$node = $n1.node;} 
								(n2 = numero {$node = new Potencia($node, $n2.node);});
division returns [ASTNode node]: DIVISION n1 = numero {$node = $n1.node;} 
								(n2 = numero {$node = new Division($node, $n2.node);});
residuo returns [ASTNode node]: RESIDUO  n1 = numero {$node = $n1.node;} 
								(n2 = numero {$node = new Residuo($node, $n2.node);});
 
redondear returns [ASTNode node]: REDONDEO numero {$node = new Redondear($numero.node);};
azar returns [ASTNode node]: AZAR numero {$node = new Azar($numero.node);};
menos returns [ASTNode node]: NEGATIVO numero {$node = new Menos($numero.node);}; 


/* Sentencias de listas */

ordenes_listas returns [ASTNode node]: elegir {$node = $elegir.node;}  
									 | elemento_n {$node = $elemento_n.node;} 
									 | largo {$node = $largo.node;} 
									 | primero {$node = $primero.node;} 
									 | ultimo {$node = $ultimo.node;};
									 
elegir returns [ASTNode node]: ELEMENTO_AZAR PAR_CUAD_ABIERTO {
							   List<ASTNode> body = new ArrayList<ASTNode>();} 
							   (numero {body.add($numero.node);})* {
							   	Random rand = new Random(); 
	   							$node = body.get(rand.nextInt(body.size()));
							   } PAR_CUAD_CERRADO;
							   
							   
elemento_n returns [ASTNode node]: ELEMENTO_N ENTERO PAR_CUAD_ABIERTO {
							   List<ASTNode> body = new ArrayList<ASTNode>();} 
							   (numero {body.add($numero.node);})* {
							   	$node = body.get(Integer.parseInt($ELEMENTO_N.text));
							   } PAR_CUAD_CERRADO;
							   
largo returns [ASTNode node]: LONGITUD PAR_CUAD_ABIERTO {
							   List<ASTNode> body = new ArrayList<ASTNode>();} 
							   (numero {body.add($numero.node);})* {
							   	$node = new Constante(body.size());
							   } PAR_CUAD_CERRADO;
							   
primero returns [ASTNode node]: PRIMERO_LISTA PAR_CUAD_ABIERTO {
							   List<ASTNode> body = new ArrayList<ASTNode>();} 
							   (numero {body.add($numero.node);})* {
							   	$node = body.get(0);
							   } PAR_CUAD_CERRADO;
							   
ultimo returns [ASTNode node]: ULTIMO PAR_CUAD_ABIERTO {
							   List<ASTNode> body = new ArrayList<ASTNode>();} 
							   (numero {body.add($numero.node);})* {
							   	$node = body.get(body.size()-1);
							   } PAR_CUAD_CERRADO; 



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
							 /* | ID  */
							  | numero {$node = $numero.node;};
numero returns [ASTNode node]: ENTERO {$node = new Constante(Integer.parseInt($ENTERO.text));}
							 | FLOAT {$node = new Constante(Float.parseFloat($FLOAT.text));}
							 | ordenes_listas {$node = $ordenes_listas.node;}
							 | referencia {$node = $referencia.node;}
						     | operacion_aritmetica {$node = $operacion_aritmetica.node;}; 


/* *** Claves o terminales especificos de LogoTEC *** */

// Claves generales

PROGRAMA: 'Programa';

// Claves para variables
HAZ: 'Haz';
INIC: 'INIC';
INC: 'INC';
PRINTLN: 'print';

// Claves para operaciones aritmeticas
SUMA: 'Suma' | 'suma';
RESIDUO: 'Resto' | 'resto';
DIVISION: 'Division' | 'division';
POTENCIA: 'Potencia' | 'potencia';
PRODUCTO: 'Producto' | 'producto';
NEGATIVO: 'Menos' | 'menos';
DIFERENCIA: 'Diferencia' | 'diferencia';

REDONDEO: 'Redondea' | 'redondea';
AZAR: 'Azar' | 'azar';

//Claves para operaciones logicas
MAYOR: 'MayorQue?' | 'mayorque?';
MENOR: 'MenorQue?' | 'menorque?';
AND: 'Y';
OR: 'O';
IGUALES: 'iguales?' | 'Iguales?';

// Claves para listas
ELEMENTO_AZAR: 'Elegir' | 'elegir';
LONGITUD: 'Cuenta' | 'cuenta';
ULTIMO: 'Ultimo' | 'ul' | 'ultimo';
ELEMENTO_N: 'Elemento' | 'elemento';
PRIMERO_LISTA: 'Pri' | 'Primero';

// Claves para ciclos y funciones.
WHILE: 'MIENTRAS' | 'HASTA';
DO_WHILE: 'HAZ.MIENTRAS' | 'HAZ.HASTA';

IF_ELSE: 'SISINO';
IF: 'SI';
DO_N: 'REPITE' | 'Repite' | 'repite';
DO: 'Ejecuta' | 'EJECUTA' | 'ejecuta';

// Claves para la tortuga
AVANZA: 'AVANZA' | 'AV' | 'avanza';
RETROCEDE: 'RETROCEDE' | 'RE' | 'retrocede';
ESPERA: 'ESPERA' | 'Espera' | 'espera';

GIRA_DERECHA: 'GiraDerecha' | 'GD' | 'giraderecha';
GIRA_IZQUIERDA: 'GiraIzquierda' | 'GI' | 'giraizquierda';

OCULTA_TORTUGA: 'OcultaTortuga' | 'OT' | 'ocultatortuga';
APARECE_TORTUGA: 'ApareceTortuga' | 'AT' | 'aparecetortuga';
CENTRO: 'Centro' | 'centro' | 'centro';

PON_POS: 'PonPOS' | 'PonXY';
PONX: 'PonX';
PONY: 'PonY';

PON_RUMBO: 'PonRumbo' | 'ponrumbo';
RUMBO: 'Muestra RUMBO' | 'rumbo' | 'RUMBO';


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
FLOAT: ENTERO('.'ENTERO)?;


ESPACIO_BLANCO: [ \n\t\r]+ -> skip;

////  ------------------------------------------------------------------------  ////
