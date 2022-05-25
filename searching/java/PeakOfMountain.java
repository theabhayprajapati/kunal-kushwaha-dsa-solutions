package searching.java;

/**
 * PeakOfMountain
 */
public class PeakOfMountain {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 1 };
        int peak = peakOfMountainFN(nums);
        int ans = 0;
        boolean low = binarySearch(nums, 3, 0, peak);
        boolean high = binarySearch(nums, 3, 0, peak);

        // if low and high is truw then make ans 2, if any one it true make ans as 1
        // else -1;
        if (low && high) {
            ans = 2;
        } else if (low) {
            ans = 1;
        } else if (high) {
            ans = 1;
        } else {
            ans = -1;
        }
        System.out.println(ans);

        // System.out.println(binarySearch(nums, 3, peak, nums.length - 1));
        // System.out.println(binarySearch(nums, 3, 0, peak));
        // System.out.println(peakOfMountainFN(nums));

    }

    static int peakOfMountainFN(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (start == end) {
                return start;
            }
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    static boolean binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
    // what is Github Actions?
    // GH Actions is a tool that helps you automate your workflow.
    // It is a free service that lets you run your GitHub Actions workflow on any
    // platform.
    // distance between moon and mars?
    // distance between moon and mars is 384,400,000 km
}