package arrays;

public class Smallercurrent {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        smallerNumbersThanCurrent(nums);
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            int max = 0;
            
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    max++;
                }
                ans[i] = max;
            }
        }
        return ans;
    }
}