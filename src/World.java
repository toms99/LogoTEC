import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class World extends JFrame {

    private BufferedImage overlay, ground, back, front;
    private Graphics2D og, gg, bg, fg;

    private ArrayList<Turtle> turtles;

    public final int centerX;
    public final int centerY;


    /**
     * Crea un nuevo mundo para las tortugas
     */
    public World(int width, int height, Color backgroundColor) {
        super("Turtle World");
        this.centerX = width/2;
        this.centerY = height/2;

        this.overlay = new BufferedImage(2*this.centerX, 2*this.centerY, BufferedImage.TYPE_INT_ARGB);
        this.ground = new BufferedImage(2*this.centerX, 2*this.centerY, BufferedImage.TYPE_INT_ARGB);
        this.back =  new BufferedImage(2*this.centerX, 2*this.centerY, BufferedImage.TYPE_INT_ARGB);
        this.front = new BufferedImage(2*this.centerX, 2*this.centerY, BufferedImage.TYPE_INT_ARGB);


        this.og = (Graphics2D)this.overlay.getGraphics();
        this.gg = (Graphics2D)this.ground.getGraphics();
        this.bg = (Graphics2D)this.back.getGraphics();
        this.fg = (Graphics2D)this.front.getGraphics();
        og.setBackground(new Color(0,0,0,0));
        gg.setBackground(backgroundColor);

        Graphics2D[] gs = {og, gg};
        for(Graphics2D g : gs) {
            g.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
            g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        }

        this.setContentPane(new JLabel(new ImageIcon(this.front)));
        this.pack();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.clearOverlay();
        this.gg.clearRect(0, 0, this.ground.getWidth(), this.ground.getHeight());

        this.repaint();
        this.setVisible(true);

        this.turtles = new ArrayList<Turtle>();
    }

    /**
     * limpia la capa donde se colocan las imagenes de tortuga
     */
    public void clearOverlay() {
        this.og.clearRect(0, 0, this.overlay.getWidth(), this.overlay.getHeight());
    }

    /**
     * agrega una tortuga al mundo
     */
    void addTurtle(Turtle t) {
        this.turtles.add(t);
        this.turtleMoved();
    }
    /**
     * Metodo para dibujar lineas
     * @param p1 punto final de la linea
     * @param p2 punto inicial de la linea.
     * @param width ancho del lapiz
     * @param color color del lapiz
     */
    void drawLine(Point2D p1, Point2D p2, double width, Color color) {
        this.gg.setColor(color);
        this.gg.setStroke(new BasicStroke((float)width, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        Line2D.Double line = new Line2D.Double(p1, p2);
        this.gg.draw(line);
        this.blit();
    }

    /**
     * Metodo para mostrar las nuevas lineas
     */
    private void blit() {
        this.bg.drawImage(this.ground,0,0, null);
        this.bg.drawImage(this.overlay, 0,0, null);
        this.fg.drawImage(this.back, 0,0, this);
        this.repaint();
    }
    /**
     * Refresca la poantalla para mostrar los cambios hechos
     */
    void turtleMoved() {
        this.clearOverlay();
        this.blit();
    }

    /**
     * Usado para colocar la imagen de la tortuga
     * @param img imagen a colocar
     * @param placement Affine Transform para colocar la imagen
     */
    void drawImage(Image img, AffineTransform placement) {
        this.og.drawImage(img, placement, this);
        this.blit();
    }
}

