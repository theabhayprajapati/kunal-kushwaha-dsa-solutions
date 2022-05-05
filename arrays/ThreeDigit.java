package arrays;

import java.util.ArrayList;

/**
 * ThreeDigit
 */
public class ThreeDigit {

    public static void main(String[] args) {
        int[] nums = { 2, 1, 3, 0 };
        int[] ans =   findEvenNumbers(nums);
        // print
        for (int i : ans) {
            System.out.print(i + " ");
        }

    }

    // https://leetcode.com/problems/finding-3-digit-even-numbers/

    static int[] findEvenNumbers(int[] nums) {
        // arrlist
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // no leading zeros
            
            for (int j = 0; j < nums.length; j++) {
                for (int j2 = 0; j2 < nums.length; j2++) {
                    String n = String.valueOf(nums[i]) + String.valueOf(nums[j]) + String.valueOf(nums[j2]);
                    int num = Integer.parseInt(n);
                    if (num % 2 == 0) {

                        arr.add(num);
                        count++;
                    }
                }
            }
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }
}