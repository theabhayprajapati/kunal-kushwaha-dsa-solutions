package functions.java;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius ");
        double raduis = in.nextDouble();
        in.close();
        double value = getradius(raduis);
        System.out.println("Circumference is : " + value);
    }

    static double getradius(double r) {
        return (r*2*3.14);
    }
}