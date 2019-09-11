import java.awt.Color;
import hsa.Console;
public class Bar {
    int xLoc, yLoc, height;
    Color barColor;
    public Bar(int x, int h, Color fil){
        xLoc = x;
        height = h;
        barColor = fil;
    }
    void draw(Console c){
        yLoc = 700 - height;
        c.setColor(barColor);
        c.fillRect(xLoc, yLoc, 50, height);
        c.setColor(Color.BLACK);
        c.drawRect(xLoc, yLoc, 50, height);
        c.drawString("Value:"+ height, xLoc, 715);
    }
}
