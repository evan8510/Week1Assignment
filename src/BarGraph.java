import hsa.Console;
import java.awt.Color;
public class BarGraph {

    public static void main(String[] args) {
        Console c = new Console();
        int h1, h2, h3, h4;
        c.print("Enter the height of the first bar: ");
        h1 =c.readInt();
        c.print("Enter the height of the second bar: ");
        h2 =c.readInt();
        c.print("Enter the height of the third bar: ");
        h3 =c.readInt();
        c.print("Enter the height of the fourth bar: ");
        h4 =c.readInt();
        c.setColor(Color.RED);
        c.fillRect(350, 480-h1, 50, h1);
        c.setColor(Color.GREEN);
        c.fillRect(425, 480-h2, 50, h2);
        c.setColor(Color.BLUE);
        c.fillRect(500, 480-h3, 50, h3);
        c.setColor(Color.YELLOW);
        c.fillRect(575, 480-h4, 50, h4);
        c.setColor(Color.BLACK);
        c.drawString("Value: " + h1, 350, 470-h1);
        c.drawString("Value: " + h2, 425, 470-h2);
        c.drawString("Value: " + h3, 500, 470-h3);
        c.drawString("Value: " + h4, 575, 470-h4);
        c.drawRect(350, 480-h1, 50, h1);
        c.drawRect(425, 480-h2, 50, h2);
        c.drawRect(500, 480-h3, 50, h3);
        c.drawRect(575, 480-h4, 50, h4);
        
    }
    
}
