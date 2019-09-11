import java.util.Scanner;
public class PizzaCost {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double dmtr;
        double topp;
        double base;
        double total;
        base = 2.25;
        System.out.print("What would you like for the diameter of your pizza to be in inches? ");
        dmtr = s.nextDouble();
        System.out.print("How many toppings would you like on your pizza? ");
        topp = s.nextDouble();
        dmtr = dmtr * 0.5;
        topp = topp * 0.75;
        total = topp + dmtr + base;
        System.out.format("Your pizza will cost $%.2f", total);
        
    }
    
}
