package searching.java;

/**
 * MissingNum
 */
public class MissingNum {

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 7, 11 };
        System.out.println(missingNum(nums, 5));

    }

    static int missingNum(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == k) {
                return k;
            } else if (nums[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k;
    }
}