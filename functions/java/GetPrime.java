package functions.java;
import java.util.Scanner;

public class GetPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int till = in.nextInt();
        in.close();
        getPrimeNum(start, till);
    }

    static void getPrimeNum(int start, int till) {
        int i, j, yes;
        System.out.println("Prime number from " + start + " to " + till + " are.");
        for (i = 0; i <= till; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            yes = 1;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    yes = 0;
                    break;
                }
            }
            if (yes == 1) {
                System.out.print(i + " ");
            }
        }
    }

}