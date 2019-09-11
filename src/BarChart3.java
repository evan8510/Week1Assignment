
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
        int x;
       
        for(int i = 1; i<5; i++){
            System.out.print("Enter a value for bar " + i + " 50 to 500. ");
            x = s.nextInt();
            while(x>500 || x<50){
                System.out.print("Error ");
                x= s.nextInt();
            }
            b[i] = new PBar(j, x, f[i]);
            j -=100;
        }
         // draw window and stuff
        Pen p = new StandardPen(new SketchPadWindow(640,480));
         p.up();
        for (int i = 1; i < 5; i++) {
            b[i].draw(p);
            b[i].drawString(p);

        }
    }
    
}
