package java;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        in.close();
        int value = getSum(num1, num2);
        System.out.println(value);
    }

    static int getSum(int num1, int num2) {
        return num1 + num2;
    }
}