
import TurtleGraphics.Pen;
import java.awt.Color;


public class PBar {
    int yLoc;
    int val;
    Color col;
    public PBar(int y, int v, Color fil){
        col = fil;
        yLoc = y;
        val = v;
    }
    void draw(Pen p){
        p.move(-250, yLoc);
        p.setWidth(50);
        p.setColor(col);
        p.down();
        p.setDirection(0);
        p.move(val);
        p.up();
    }
    void drawString(Pen p){
        p.move((val-210),(yLoc + 10));
        p.setColor(Color.BLACK);
        p.drawString("Value: " + val);
    }
}
