package searching.java;

/**
 * DoubleExit
 */
public class DoubleExit {

    public static void main(String[] args) {
        int[] nums = { 3,1,7,11 };
        // doubleExit(nums);
        System.out.println(doubleExit(nums));

    }

    static boolean doubleExit(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == (2 * nums[j])) {
                    System.out.println(nums[i] + "==" + (2 * nums[j]));
                    return true;
                }
            }
        }
        //
        return false;
    }
}