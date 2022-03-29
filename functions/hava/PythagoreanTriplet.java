package hava;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declare number of integers you will take as input
        int[] arr = new int[3]; // declare array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // take values

        }
        getTriplet(arr);
    }

    static void getTriplet(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        int left = (a * a) + (b * b);
        int right = c*c;
        System.out.println(left);
        String result = (left==right) ? "Pass" : "Faild";
        // left!=right ? System.out.println("It is") : System.out.println("its noe");
        System.out.println(result);
        
        
    }
}
