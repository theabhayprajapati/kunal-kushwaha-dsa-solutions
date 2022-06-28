/**
 * MaxXOROpr
 */
public class MaxXOROpr {

    public static void main(String[] args) {
        /**
         * You are given a 0-indexed integer array nums. In one operation, select any
         * non-negative integer x and an index i, then update nums[i] to be equal to
         * nums[i] AND (nums[i] XOR x).
         * 
         * Note that AND is the bitwise AND operation and XOR is the bitwise XOR
         * operation.
         * 
         * Return the maximum possible bitwise XOR of all elements of nums after
         * applying the operation any number of times.
         */
        int[] nums = { 3, 10, 5, 25, 2, 8 };
        System.out.println(maxXor(nums));

    }

    static int maxXor(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max, nums[i] ^ nums[j]);
            }
        }
        return max;
    }
}