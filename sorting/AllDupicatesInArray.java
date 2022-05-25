package sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * AllDupicatesInArray
 */
public class AllDupicatesInArray {

    public static void main(
            String[] args) {
        int[] nums = { 1, 1, 2 };
        ArrayList<Integer> list = allDupicatesInArray(nums);
        System.out.println(list);
    }

    static ArrayList<Integer> allDupicatesInArray(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
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
                list.add(nums[j]);
            }
        }
        return list;
        abcdefjghijklmnopqrstuvwxyz
    }
}