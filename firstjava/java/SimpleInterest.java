package firstjava.java;
// package java;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Get ready with your details");
        System.out.print("what's Your Principal: ");
        float p = input.nextFloat();
        System.out.print("Enter your rate of interest?  ");
        float rate = input.nextFloat();
        System.out.print("Enter your Tenure: (months)");
        float t = input.nextFloat();
        input.close();
        double ans = (p * rate * t) / 100;
        System.out.println("Simple interest is: " + ans);

    }
}