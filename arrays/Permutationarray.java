// Arrray Q 1: Build Array from Permutation
// https://leetcode.com/problems/build-array-from-permutation/
package arrays;
public class Permutationarray {
    public static void main(String[] args) {

        int[] nums = { 0, 2, 1, 5, 3, 4 };
        buildArray(nums);
    }

    static int[] buildArray(int[] nums) {
         int[] ans = new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
             ans[i] = nums[nums[i]];
         }
         return ans; 
    }
}