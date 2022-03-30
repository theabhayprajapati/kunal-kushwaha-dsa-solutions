// package java;
package firstjava.java;
import java.util.Scanner;

public class CalFib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        input.close();
        int a = 0;
        int b = 1;
        int c = 3;
        // for (int i = 0; i < n - 1; i++) {

        // // a = b;
        // c = a + b;
        // // now c = 2
        // a = b;
        // // a = 1
        // b = c;

        // }
        while (c <= n) {
            a = a + b;
            b = a + b;
            c++;
        }
        System.out.println(n + "th Fibonacci number : " + b);

    }

}