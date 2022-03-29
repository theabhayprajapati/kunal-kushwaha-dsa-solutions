import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("Enter your Name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        input.close();
        System.out.println("Hello, " + name);

    }
}