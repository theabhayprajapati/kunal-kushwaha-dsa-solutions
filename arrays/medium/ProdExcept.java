package arrays.medium;

/**
 * ProdExcept
 */
public class ProdExcept {

    public static void main(String[] args) {
        // nums = [1,2,3,4]
        // int[] nums = {1,2,3,4};
        // [-1,1,0,-3,3]
        int[] nums = { -1, 1, 0, -3, 3 };
        // print ans
        int[] ans = productExceptSelf(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            int total = 1;
            // case for -1
            if (nums[i] == -1) {
                for (int j = 0; j < ans.length; j++) {
                    if (j != i) {
                        total *= nums[j];
                    }
                }
                ans[i] = total;
            } else {
                for (int j = 0; j < ans.length; j++) {
                    if (i != j) {
                        total *= nums[j];
                    }
                }
            }
            ans[i] = total;

        }
        return ans;
    }
}