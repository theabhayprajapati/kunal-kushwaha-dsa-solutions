package arrays;

/**
 * EvenLength
 */
public class EvenLength {

    public static void main(String[] args) {
        int[] nums = { 1, 324, 23, 23, 23, 23, 3, 232342, 12 };
        sum2(nums);
        System.out.println(sum2(nums));
    }

    static int sum2(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                int length = 1 + (int) Math.floor(Math.log10(nums[i]));

                if (length % 2 == 0) {
                    sum++;
                }
            }
            return sum;
    }
}