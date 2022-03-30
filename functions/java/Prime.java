package functions.java;
// package java;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        
        int num = in.nextInt();
        in.close();
        boolean check = knowPrime(num);
        System.out.println("Is ans is "+ check);
    }

    static boolean knowPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}