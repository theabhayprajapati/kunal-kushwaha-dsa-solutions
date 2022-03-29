package java;

// Q 1: Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;
 

// package functions;
public class Maxmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        int max = max(array);
        int min = min(array);
        System.out.println("The maximum is " + max + " minimum is " + min);
    }

    static int max(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
        // return System.out.println("The manx is" + max)
    };

    static int min(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;

    }
}
