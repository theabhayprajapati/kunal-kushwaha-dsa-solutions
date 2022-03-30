import java.util.Scanner;

public class Nnatural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = in.nextInt();
        in.close();
        sumofNnaturalnum(num);
    }

    static void sumofNnaturalnum(int n) {
        int sum = 0;
        System.out.println("The sum of number from " + n + " is ");
        
        for(int i =0; i<=n; i++){
            // System.out.println(i);
            sum = sum +i;

        }
        System.out.println(sum);
        
    }
}