package sorting;

import java.util.Arrays;

/**
 * SortArrayByParityII
 */
public class SortArrayByParityII {

    public static void main(String[] args) {
        int nums[] = {2,3 };
        // {2, 4, 5, 7}
        int value[] = sortArrayByParityII(nums);
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
        // make a list and copy values
        // sort the list
        // check for odd values and push to back of array

    }

    private static int[] sortArrayByParityII(int[] nums) {
        // sort
        int[] res = new int[nums.length];
        int[] sorted = new int[nums.length];
        // copy
        for (int k = 0; k < nums.length; k++) {
            sorted[k] = nums[k];
        }
        // sort
        Arrays.sort(sorted);
        int even = 0;
        int odd = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[even] = nums[i];
                even += 2;
            } else {
                res[odd] = nums[i];
                odd += 2;
            }
        }
        return res;
           
    }
}