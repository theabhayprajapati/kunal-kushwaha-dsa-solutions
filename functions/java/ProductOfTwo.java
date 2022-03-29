package java;

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        in.close();
        double Product = getProduct(num1, num2);
        System.out.println(Product);
        
    }

    static double getProduct(double num1, double num2) {
        return num1 * num2;
    }
}