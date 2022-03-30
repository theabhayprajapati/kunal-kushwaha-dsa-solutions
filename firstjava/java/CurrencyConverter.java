package firstjava.java;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dol = 75.23;
        while (true) {
            System.out.print("Enter Currency in INR: ");
            float inr = input.nextFloat();
            if (inr == 0) {
                System.out.println("Exited()");
                break;
            }
            dol = inr / dol;
            System.out.println("Your DOLLARS is: " + dol);
        }
        input.close();

    }
}