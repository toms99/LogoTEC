package tortuga;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

public class Turtle {

    private World world;
    public double theta;

    public Point2D.Double location;
    private boolean isdown;

    public Color color;
    private double shellSize;
    private int pause = 200;


    /**
     * Crea una tortuga en un punto especifico del mundo.
     * @param w mundo
     * @param x coordenada x, en pixeles; 0 es el centro
     * @param y coordenada y, en pixeles; 0 es el centro
     */
    public Turtle(World w, double x, double y) {
        this.location = new Point2D.Double(x + w.centerX, y + w.centerY);
        this.theta = 90*Math.PI/180;
        this.world = w;
        this.color = Color.BLACK;
        this.penWidth = 1;
        this.isdown = true;
        this.shellSize = 8;

        w.addTurtle(this);
    }

    /**
     * Mueve la tortuga la cantidad de pixeles dada, en la direccion que este mirando
     * @param d numero de pixeles a mover
     */
    public void forward(double d) {
        this.GoTo(this.location.x + Math.cos(this.theta)*d, this.location.y + Math.sin(this.theta)*-d);
        this.pause();

    }

    /**
     * Mueve la tortuga la cantidad de pixeles dada, en la direccion opuesta que este mirando
     * @param d numero de pixeles a mover
     */
    public void backward(double d)
    {
        this.forward(-d);
        this.pause();
    }
    /**
     * Gira la tortuga los grados dados en direccion horaria
     * @param degrees grados a rotar
     */
    public void turnRight(double degrees) {
        this.theta += Math.PI*-degrees/180;
        while (this.theta > Math.PI) {
            this.theta -= Math.PI * 2;
        }
        while (this.theta <= -Math.PI){
            this.theta += Math.PI*2;
        }
        world.turtleMoved();
        this.pause();
    }
    /**
     * Gira la tortuga los grados dados en direccion anti horaria
     * @param degrees the number of degrees to turn
     */
    public void turnLeft(double degrees) {

        this.turnRight(-degrees);
    }
    /**
     * Levanta el lapiz
     */
    public void penUp() {

        this.isdown = false;
    }
    /**
     * Baja el lapiz
     */
    public void penDown() {

        this.isdown = true;
    }

    /**
     * Coloca la fotografia de la tortuga en el lapiz
     * @param filename url de la imagen a colocar
     * @param size tamaño de la imagen en pixeles
     * @return true si la imagen se encontro, false si no
     */
    BufferedImage pic;
    public boolean drop(String filename, double size ) {
        try {
            try {
                pic = ImageIO.read(new URL(filename).openStream());
            } catch (Throwable ex) {
                pic = ImageIO.read(new File(filename));
            }
            double scale = size/Math.max(pic.getWidth(), pic.getHeight());
            AffineTransform af = new AffineTransform();
            af.translate(this.location.x, this.location.y);
            af.rotate(-this.theta+Math.PI/2);
            af.translate(-size/2, -size/2);
            af.scale(scale, scale);
            this.world.drawImage(pic, af);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * Getter del AffineTransform de la imagen colocada
     * @param filename url de la imagen a colocar
     * @param size tamaño de la imagen en pixeles
     * @return AffineTransform de la imagen colocada
     */
    public AffineTransform getAF(String filename, double size ) {
        AffineTransform af = new AffineTransform();
        try {
            double scale = size/Math.max(pic.getWidth(), pic.getHeight());
            af.translate(this.location.x, this.location.y);
            af.rotate(-this.theta+Math.PI/2);
            af.translate(-size/2, -size/2);
            af.scale(scale, scale);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return af;
    }

    /**
     * Cambia el color del lapiz
     * @param color Nuevo color a utilizar
     */
    public void setColor(Color color) {
        this.color = color;
    }
    private double penWidth;



    /**
     * Getter de la direccion a la que mira la tortuga
     * @return angulo en la que mira la tortuga
     */
    public double rumbo() {
        return theta*180/Math.PI;
    }

    /**
     * Set the direction the Turtle is facing
     * @param angle in degrees; 0 is right, 90 is up, etc
     */
    public void ponRumbo(double angle) {
        this.theta = (angle*Math.PI)/180;
        world.turtleMoved();
        this.pause();
    }

    /**
     * Mueve la tortuga a una posicion dada
     * @param x Nueva posicion en x. 0 es el centro de la pantalla
     * @param y Nueva posicion en y. 0 es el centro de la pantalla
     */
    protected void GoTo(double x, double y) {
        double ox = this.location.x;
        double oy = this.location.y;
        this.location.x = x;
        this.location.y = y;
        if (this.isdown) {
            world.drawLine(this.location, new Point2D.Double(ox,oy), this.penWidth, this.color);
            world.turtleMoved();
        } else {
            world.turtleMoved();
        }
    }

    /**
     * Segundos a esperar entre movimientos
     * @param seconds segundos a esperar
     */
    public void setDelay(double seconds) {
        this.pause = (int)(seconds*1000);
    }

    /**
     * Pausa entre movimientos
     */
    private void pause() {
        try {
            Thread.sleep(this.pause);
        } catch (InterruptedException e) { }
    }
}
