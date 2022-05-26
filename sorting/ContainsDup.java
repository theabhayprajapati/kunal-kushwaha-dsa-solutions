// https://leetcode.com/problems/contains-duplicate/
package sorting;

import java.util.Arrays;

/**
 * ContainsDup
 */
public class ContainsDup {

    public static void main(String[] args) {
        System.out.println(containsDup(new int[] { 1, 2, 3, 1 }));
        ;
    }

    static boolean containsDup(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}