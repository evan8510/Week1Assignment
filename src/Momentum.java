import java.util.Scanner;

public class Momentum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mass;
        double velo;
        double mome;
        System.out.print("Enter the objects velocity in meters per second: ");
        velo = s.nextDouble();
        System.out.print("Enter the objects mass in kilograms: ");
        mass= s.nextDouble();
        mome = mass*velo;
        System.out.print("The objects momentum is " + mome + "kg m/s");
    }
    
}
