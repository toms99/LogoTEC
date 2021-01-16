grammar LogoTEC;

@parser:: header {
	import java.util.Map;
	import java.util.HashMap;
}

@parser::members{
	Map<String, Object> tablaSimbolos = new HashMap<String, Object>(); 
}


/* Sentencia de un programa */
programa: {
	List<ASTNode> body = new ArrayList<ASTNode>();
} (sentencia_logoTEC {body.add($sentencia_logoTEC);})* 
{
	for (ASTNode n: body) {
		n.execute();
	}
};

/* Sentencias para funciones y ciclos */
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
                      | operacion_aritmetica | ordenes_listas | ordenes_tortuga;

/* Sentencias de variables */
ordenes_variables: asignacion | reasignacion | incrementa;
asignacion: HAZ ID dato;
reasignacion: INIC ID ASIGNAR dato;
incrementa: INC PAR_CUAD_ABIERTO ID PAR_CUAD_CERRADO
            | INC PAR_CUAD_ABIERTO ID ENTERO PAR_CUAD_CERRADO;

/* Sentencias logicas */
condicion: PAR_ABIERTO ordenes_logicas PAR_CERRADO;
ordenes_logicas: iguales | and | or | mayor | menor;

iguales: IGUALES dato dato;
and: AND condicion condicion;
or: OR condicion condicion;
mayor: MAYOR numero numero;
menor: MENOR numero numero;

/* Sentencias aritmeticas */
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
menos: MENOS ENTERO;

/* Sentencias de listas */
ordenes_listas: elegir | elemento_n | largo | primero | ultimo;
elegir: ELEMENTO_AZAR PAR_CUAD_ABIERTO dato* PAR_CUAD_CERRADO;
elemento_n: ELEMENTO_N ENTERO PAR_CUAD_ABIERTO dato* PAR_CUAD_CERRADO;
largo: LONGITUD PAR_CUAD_ABIERTO dato* PAR_CUAD_CERRADO;
primero: PRIMERO_LISTA PAR_CUAD_ABIERTO dato* PAR_CUAD_CERRADO;
ultimo: ULTIMO PAR_CUAD_ABIERTO dato* PAR_CUAD_CERRADO;

/* Sentencias de la tortuga */
ordenes_tortuga: avanzar | retroceder | girar_derecha | girar_izquierda
                 | ocultar_tortuga | aparecer_tortuga
                 | definir_coord | definir_x | definir_y
                 | definir_dir | rumbo | centrar | esperar;

avanzar returns [ASTNode node]: AVANZA numero {$node = new TortugaAvanza($numero.node);};
retroceder returns [ASTNode node]: RETROCEDE numero {$node = new TortugaRetrocede($numero.node);};
girar_derecha returns [ASTNode node]: GIRA_DERECHA numero {$node = new TortugaGiraDerecha($numero.node);};
girar_izquierda returns [ASTNode node]: GIRA_IZQUIERDA numero {$node = new TortugaGiraIzquierda($numero.node);};

definir_coord returns [ASTNode node]: PON_POS PAR_CUAD_ABIERTO numero numero PAR_CUAD_CERRADO
               |  PON_POS numero numero;
     
definir_x returns [ASTNode node]: PONX numero {$node = $numero.node;};
definir_y returns [ASTNode node]: PONY numero {$node = $numero.node;};
definir_dir returns [ASTNode node]: PON_RUMBO numero {$node = $numero.node;};

esperar returns [ASTNode node]: ESPERA numero {$node = $numero.node;};

ocultar_tortuga returns [ASTNode node]: OCULTA_TORTUGA;
aparecer_tortuga returns [ASTNode node]: APARECE_TORTUGA;

rumbo returns [ASTNode node]: RUMBO;
centrar returns [ASTNode node]: CENTRO;


/* Sentencias generales del lienzo */
ordenes_lienzo: borrar | dibujar | no_dibujar | definir_color | borra_pantalla;

borrar: BORRADOR;
dibujar: BAJA_LAPIZ;
no_dibujar: SUBE_LAPIZ;
definir_color: COLOR ID;

borra_pantalla: BORRA_PANTALLA;

/* Sentencias utilitarias */
dato returns [ASTNode node]:  COMILLA ID COMILLA {$node = new Constante(String.parseString($ID.text));}
							  | TRUE {$node = new Constante(Boolean.parseBoolean($TRUE.text));}
							  | FALSE {$node = new Constante(Boolean.parseBoolean($FALSE.text));} 
							  | ID 
							  | numero {$node = $numero.node;};
numero returns [ASTNode node]: ENTERO {$node = new Constante(Integer.parseInt($ENTERO.text));}
						      | operacion_aritmetica {$node = $numero.node;} ;


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
