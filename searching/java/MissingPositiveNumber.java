package searching.java;

/**
 * MissingPositiveNumber
 */
public class MissingPositiveNumber {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 6, 8, 10 };
        System.out.println(missingNumber(nums, 3));
    }

    static int missingNumber(int[] nums, int k) {
        if (nums[0] > k) {
            return k;
        }
        ;
        int idx = 0;
        int i = 0;
        while (i < nums.length && (nums[idx] - (idx + 1)) < k) {
            idx++;
            i++;
        }
        return (k + idx);
    }
}