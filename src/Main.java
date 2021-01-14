import java.awt.*;
import java.util.Scanner;
import java.io.IOException

public class Main {
    private  static Scanner scanner= new Scanner(System.in);
    private static World w= new World(700,700, Color.WHITE);
    private static Turtle t = new Turtle(w, 0,0);
    private static String tortuga ="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwOHiqKT5NUVs1l1diJa9PjxTgx5FwP38qNw&usqp=CAU";
    static boolean goma=false;

    private static final String EXTENSION = "txt";

    /**
     * Metodo para analizar los comandos introducidos
     * @param partes lineas de comandos
     */
    public static void Analizador(String[] partes){
        System.out.println("ANALIZADOR");
        String comando = partes[0];
        switch (comando){
            case "avanza":

                t.forward(Double.parseDouble(partes[1]));
                w.clearOverlay();
                w.drawImage(t.pic,t.getAF(tortuga,50));

                break;
            case "retrocede":

                t.backward(Double.parseDouble(partes[1]));
                w.clearOverlay();
                w.drawImage(t.pic,t.getAF(tortuga,50));
                break;
            case "giraderecha":
                t.turnRight(Double.parseDouble(partes[1]));
                w.drawImage(t.pic,t.getAF(tortuga, 50));
                break;
            case "giraizquierda":
                t.turnLeft(Double.parseDouble(partes[1]));
                w.drawImage(t.pic,t.getAF(tortuga, 50));
                break;
            case "ocultatortuga":
                w.clearOverlay();
                w.drawImage(t.pic,t.getAF(tortuga,0));
                break;
            case "aparecetortuga":
                w.drawImage(t.pic,t.getAF(tortuga,50));
                break;
            case "ponpos":
                t.GoTo(Double.parseDouble(partes[2]), Double.parseDouble(partes[3]));
                w.drawImage(t.pic,t.getAF(tortuga, 50));
                break;
            case "ponrumbo":
                t.ponRumbo(Double.parseDouble(partes[1]));
                w.drawImage(t.pic,t.getAF(tortuga, 50));
                break;
            case "rumbo":
                System.out.println(t.rumbo());
                break;
            case "ponx":
                t.GoTo(Double.parseDouble(partes[1]), t.location.y);
                w.drawImage(t.pic,t.getAF(tortuga, 50));
                break;
            case "pony":
                t.GoTo(t.location.x, Double.parseDouble(partes[1]));
                w.drawImage(t.pic,t.getAF(tortuga, 50));
                break;
            case "goma":
                if(goma){
                    goma=false;
                    t.setColor(Color.BLACK);
                }else{
                    goma=true;
                    t.setColor(Color.WHITE);
                }

                break;
            case "bajalapiz":
                t.penDown();
                break;
            case "subelapiz":
                t.penUp();
                break;
            case "poncolorlapiz":
                System.out.println(partes[1].toLowerCase());
                switch (partes[1].toLowerCase()){
                    case "blanco":
                        t.setColor(Color.WHITE);
                        break;
                    case "azul":
                        t.setColor(Color.BLUE);
                        break;
                    case "marron":
                        t.setColor(new Color(153,102,0));
                        break;
                    case "cian":
                        t.setColor(Color.CYAN);
                        break;
                    case "gris":
                        t.setColor(Color.gray);
                        break;
                    case "amarillo":
                        t.setColor(Color.YELLOW);
                        break;
                    case "negro":
                        t.setColor(Color.BLACK);
                        break;
                    case "rojo":
                        t.setColor(Color.RED);
                        break;
                    case "verde":
                        t.setColor(Color.green);
                        break;
                }
                break;
            case "centro":
                t.GoTo(w.centerX,w.centerY);
                w.drawImage(t.pic,t.getAF(tortuga, 50));
                break;
            case "espera":
                t.setDelay(Integer.parseInt( partes[1] ) /60 );
                break;
            case "ejecuta":
                String[] enunciado = new String[partes.length-1];
                for(int i=0;i< partes.length-1;i++){
                    if(i==0){
                        enunciado[i]=partes[i+1].substring(1);
                    }else if(i==partes.length-2){
                        enunciado[i]=partes[i+1].substring(0, partes[i+1].length()-1);
                    }
                    else {
                        enunciado[i] = partes[i + 1];
                    }
                }
                System.out.println("ENUNCIADO: "+enunciado[0]+" "+enunciado[1]);
                for (int i=0;i< enunciado.length;i++){
                    String orden[] = new String[2];
                    if(i==enunciado.length-1){
                        orden[0]=enunciado[i];
                        orden[1]=" ";
                        Analizador(orden);
                    }else {
                        orden[0] = enunciado[i];
                        orden[1] = enunciado[i + 1];
                        Analizador(orden);
                    }

                    i=i+1;
                }
                break;
            case "repite":
                int c=0;
                String[] instruccoines = new String[partes.length-2];
                for(int i=0;i< partes.length-2;i++){
                    if(i==0){
                        instruccoines[i]=partes[i+2].substring(1);
                    }else if(i==partes.length-3){
                        instruccoines[i]=partes[i+2].substring(0, partes[i+2].length()-1);
                    }
                    else {
                        instruccoines[i] = partes[i + 2];
                    }
                }
                while(Integer.parseInt(partes[1])>c){
                    for (int i=0;i< instruccoines.length;i++){
                        String orden[] = new String[2];
                        orden[0]=instruccoines[i];
                        orden[1]=instruccoines[i+1];

                        Analizador(orden);
                        i=i+1;
                    }
                    c+=1;
                }
                break;
        }
        System.out.println("SALE SWITCH");
    }

    public static void main(String[] args) {

        String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;
        System.out.println("Interpretando el archivo " + program);

        SimpleLexer lexer





    /*
     t.drop(tortuga,50);
      System.out.println("INGRESE LOS MOVIMIENTOS DE LA TORTUGA");
      while(true) {
          String[] partes=scanner.nextLine().split(" ");

          Analizador(partes);
      }*/
    }
}
