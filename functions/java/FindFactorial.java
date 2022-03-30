package functions.java;
import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter teh numner");

        int num = in.nextInt();
        Factorial(num);

    }

    static void Factorial(int num) {
        System.out.println("Your are finding facotorila of " + num);
        int fact = 1;
        System.out.print(num+"! = ");
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
            System.out.print(i+" * ");
        }
        System.out.print("= " + fact);
        
    }
}