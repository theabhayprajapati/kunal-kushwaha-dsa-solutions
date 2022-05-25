// https://leetcode.com/problems/find-the-duplicate-number/
package sorting;
import java.util.Arrays;

/**
 * DuplicateNumbers
 */
public class DuplicateNumbers {

    public static void main(String[] args) {
        int[] nums = { 3, 1, 3, 4, 2 };
        duplicateNumbersI(nums);
        System.out.println(duplicateNumbersI(nums));
    }

    static int duplicateNumbersI(int[] nums) {

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
        return nums[nums.length - 1];
    }
}