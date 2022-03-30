// https://leetcode.com/problems/running-sum-of-1d-array/

package arrays;
public class Sumofarray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        runningSum(nums);
     }

    static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum =sum + nums[i];
            nums[i] = sum;
        }
        System.out.println();
        
        return nums;
    }
}