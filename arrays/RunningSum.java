package arrays;

/**
 * RunningSum
 */
public class RunningSum {

    public static void main(String[] args) {
        // [1,2,3]
        int[] digits = { 1, 2, 3 };
        // print ans;
        getRunningSum(digits);

    }

    static int[] getRunningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}