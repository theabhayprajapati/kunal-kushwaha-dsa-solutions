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
        while (pal < num) {
            num = num%10;
            pal = pal * 10 + num;
            System.out.println(num + "NUM");
        }
        System.out.println(pal + "PAl");
        if (pal == num) {
            return true;
        } else {
            return false;
        }

    }
}