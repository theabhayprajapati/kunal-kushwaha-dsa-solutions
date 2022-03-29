package java;

// Q : Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class Oddeveb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        input.close();
        boolean value = OddEven(num);
        System.out.println("the is " + value);

    }

    static boolean OddEven(int n) {
        return n % 2 == 0 ? true : false;
    }
}
