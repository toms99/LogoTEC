grammar simple;

/* Sentencia de un programa */
programa: PROGRAMA BRACKET_ABIERTO sentencia_logoTEC* BRACKET_CERRADO;

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

avanzar: AVANZA ENTERO | AVANZA operacion_aritmetica;
retroceder: RETROCEDE ENTERO | RETROCEDE operacion_aritmetica;
girar_derecha: GIRA_DERECHA ENTERO | GIRA_DERECHA operacion_aritmetica;
girar_izquierda: GIRA_IZQUIERDA ENTERO | GIRA_IZQUIERDA operacion_aritmetica;
ocultar_tortuga: OCULTA_TORTUGA;
aparecer_tortuga: APARECE_TORTUGA;
definir_coord: PON_POS PAR_CUAD_ABIERTO ENTERO ENTERO PAR_CUAD_CERRADO
               |  PON_POS ENTERO ENTERO;
definir_x: PONX ENTERO;
definir_y: PONY ENTERO;
definir_dir: PON_RUMBO ENTERO;
rumbo: RUMBO;
centrar: CENTRO;
esperar: ESPERA ENTERO;

/* Sentencias generales del lienzo */
ordenes_lienzo: borrar | dibujar | no_dibujar | definir_color | borra_pantalla;

borrar: BORRADOR;
dibujar: BAJA_LAPIZ;
no_dibujar: SUBE_LAPIZ;
definir_color: COLOR ID;

borra_pantalla: BORRA_PANTALLA;

/* Sentencias utilitarias */
dato:  COMILLA ID COMILLA | TRUE | FALSE | ID | numero;
numero: ENTERO | operacion_aritmetica;


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


