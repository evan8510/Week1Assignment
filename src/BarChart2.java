
import hsa.Console;
import java.awt.Color;


public class BarChart2 {

    public static void main(String[] args) {
        Console c = new Console(80,60);
        Bar b[] = new Bar[5];
        Color f[] = new Color[5];
        f[0] = Color.BLACK;
        f[1] = Color.RED;
        f[2] = Color.GREEN;
        f[3] = Color.BLUE;
        f[4] = Color.YELLOW;
        int j = 50;
        int x;
        for(int i = 1; i<5; i++){
            c.print("Enter a value for bar " + i + " less than 500. ");
            x = c.readInt();
            while(x>499){
                c.print("Less than 500. ");
                x= c.readInt();
            }
            b[i] = new Bar(j, x, f[i]);
            b[i].draw(c);
            j +=120;
        }
    }
    
}
