
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;


public class BarChart3 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PBar b[] = new PBar[5];
        int j = 175;
        Color f[] = new Color[5];
        f[0] = Color.BLACK;
        f[1] = Color.RED;
        f[2] = Color.GREEN;
        f[3] = Color.BLUE;
        f[4] = Color.YELLOW;
        // draw window and stuff
        Pen p = new StandardPen(new SketchPadWindow(640,480));
        p.up();
        for(int i = 1; i<5; i++){
            System.out.print("Enter a value for bar " + i + " less than 500. ");
            int x = s.nextInt();
            while(x>499){
                System.out.print("Less than 500. ");
                x= s.nextInt();
            }
            b[i] = new PBar(j, x, f[i]);
            b[i].draw(p);
            j -=100;
        }
    }
    
}
