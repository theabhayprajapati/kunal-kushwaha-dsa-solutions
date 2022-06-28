package searching.java;

/**
 * RotatedSortedArray
 */
public class RotatedSortedArray {

    public static void main(String[] args) {
        int nums[] = { 2, 2, 2, 3, 2, 2, 2 };
        System.out.println(getPivot(nums));
        System.out.println(search(nums, 3));
    }

    public static boolean search(int[] nums, int target) {
        if (nums.length == 0)
            return false;
        if (nums.length == 1)
            return nums[0] == target;
        int peak = getPivot(nums);

        if (target == nums[peak]) {
            return true;
        }
        // if the target is more than 0th value but less than peak value, then search in
        // the left side
        if (target > nums[0] && target < nums[peak]) {
            return binarySearch(nums, 0, peak - 1, target);
        } else {
            return binarySearch(nums, peak + 1, nums.length - 1, target);
        }
    }

    private static boolean binarySearch(int[] nums, int i, int j, int target) {
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return false;
    }

    public static int getPivot(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (nums[mid] > nums[j]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }
}