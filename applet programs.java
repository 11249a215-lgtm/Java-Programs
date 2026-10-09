import java.applet.Applet;
import java.awt.*;

/* <applet code="ShapeApplet.class" width="400" height="400"></applet> */
public class ShapeApplet extends Applet {
    public void paint(Graphics g) {
        // b) Red rectangle, blue oval, bold text
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 60);
        
        g.setColor(Color.BLUE);
        g.fillOval(180, 50, 100, 60);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.drawString("Java Applets are fun!", 50, 150);

        // a) & c) Geometric shapes / House outline
        g.drawRect(50, 200, 80, 80); // House base
        g.drawLine(50, 200, 90, 150); // Roof left
        g.drawLine(90, 150, 130, 200); // Roof right
    }
}