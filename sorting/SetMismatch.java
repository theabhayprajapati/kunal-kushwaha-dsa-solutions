// https://leetcode.com/problems/set-mismatch/submissions/
package sorting;

import java.util.Arrays;

/**
 * SetMismatch
 */
public class SetMismatch {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        System.out.println(Arrays.toString(setMismatch(nums)));
    }

    static int[] setMismatch(int[] nums) {
        int[] ans = { -1, -1 };
        int i = 0;
        while (i < nums.length) {
        int correct = nums[i] - 1;
        if (nums[i] != nums[correct]) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
        } else {
        i++;
        }
        }
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans[0] = nums[j];
                ans[1] = j + 1;
            }
        }
        return ans;
    }
}