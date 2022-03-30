package firstjava.java;
import java.util.Scanner;

public class CalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Operator: (+,-,/,*)");

        char op = input.next().trim().charAt(0);

        System.out.print("Enter first number: ");
        float x = input.nextFloat();
        System.out.print("Enter second number: ");
        float y = input.nextFloat();
        double ans = 0;
        input.close();
       

        if (op == 'x' || op == 'X') {
            System.out.println("Your Exited()");
            return;
        } else if (op == '+') {
            ans = x + y;
        } else if (op == '-') {
            ans = y - x;
        } else if (op == '/') {
            ans = x / y;
        } else if (op == '*') {
            ans = x * y;
        } else {
            System.out.println("Select Proper Operator !:-- (+,-,/,*) " + op);
        }
        System.out.println("Your Ans: " + ans);

    }
}