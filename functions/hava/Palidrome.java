package hava;

// Q 1: Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        boolean check = checkPalidrome(num);
        System.out.println(check);
    }

    static boolean checkPalidrome(int num) {
        int pal = 0;
        int real = num;
        while (num > 0) {
            int r = num % 10;
            pal = (pal * 10) + r;
            num = num / 10;
        }
        // System.out.println(pal + "PAl");
        if (pal == real) {
            System.out.println("iT'S pALIDINOE NUMSNUE");
            
            return true;
        } else {
            System.out.println("Use your braing and write properly it's not by the wya");
            
            return false;
        }

    }
}