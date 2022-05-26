// https://leetcode.com/problems/first-missing-positive/
package sorting;

import java.util.Arrays;

/**
 * FirstMissingPos
 */
public class FirstMissingPos {

    public static void main(String[] args) {
        int[] nums = { 3,4,-1,1 };
        System.out.println(firstMissingPos(nums));
    }

    static int firstMissingPos(int nums[]) {
        int ans = -1;
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < 0 && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                ans = j+1;
            }
        }
        return ans;
    }
}
