import hsa.Console;
import java.awt.Color;
public class Wagon {

    public static void main(String[] args) {
        Console c = new Console();
        Color lb = new Color(135, 206, 235);
        Color dg = new Color(0,150,0);
        c.setColor(lb);
        c.fillRect(0, 0, 640, 375);
        c.setColor(dg);
        c.fillRect(0, 375, 640, 250);
        c.setColor(Color.red);
        c.fillRect(150, 250, 300, 100);
        c.setColor(Color.yellow);
        c.fillOval(525, 35, 80, 80);
        c.setColor(Color.black);
        c.fillOval(185, 325, 50, 50);
        c.fillOval(375, 325, 50, 50);
        c.drawLine(150, 250, 50, 150);
    }
    
}
