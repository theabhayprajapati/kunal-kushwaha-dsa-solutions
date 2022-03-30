import java.util.Scanner;

public class Nnatural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = in.nextInt();
        in.close();
        int sum =sumofNnaturalnum(num);
        System.out.println(sum);
        
    }

    static int sumofNnaturalnum(int n) {
        int sum = 0;
        System.out.println("The sum of number from 0 to " + n + " is ");
        
        for(int i =0; i<=n; i++){
            // System.out.println(i);
            sum = sum +i;

        }
        return sum;
        
    }
}