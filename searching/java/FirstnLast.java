// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package searching.java;

import java.util.Arrays;

/**
 * FirstnLast
 */
public class FirstnLast {

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        firstNLast(nums, 6);
    }

    //
    static int[] firstNLast(int[] nums, int target) {
        int[] ans = { -1, -1 };

        int first = binarySearch(nums, target, true);
        // for last
        int last = binarySearch(nums, target, false);
        ans[0] = first;
        ans[1] = last;
        System.out.println(Arrays.toString(ans));

        return ans;
    }

    static int binarySearch(int[] arr, int target, boolean startornot) {
        int start = 0;
        int ans = -1;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (startornot) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            mid = (start + end) / 2;
        }
        return ans;
    }
}