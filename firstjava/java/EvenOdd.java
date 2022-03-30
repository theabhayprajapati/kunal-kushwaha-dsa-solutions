package firstjava.java;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");

        double num = in.nextDouble();
        in.close();
        if (num % 2 == 0) {
            System.out.println(num + "is even");
        } else {
            System.out.println(num + "is Odd");
        }
    }
}
