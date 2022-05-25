// https://leetcode.com/problems/find-target-indices-after-sorting-array/

package searching.java;

import java.util.ArrayList;
import java.util.Arrays;

import arrays.List;

/**
 * FindTargetAfterSorting
 */
public class FindTargetAfterSorting {

    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        int firstOcc = -1;
        int lastOcc = -1;
        ArrayList<Integer> list = new ArrayList<>();
        // find first occurance
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                firstOcc = mid;
                high = mid - 1;
                continue;
            }
            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        // find last occurance
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                lastOcc = mid;
                low = mid + 1;
                continue;
            }
            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (lastOcc - firstOcc == 0 && firstOcc != -1 && lastOcc != -1) {
            list.add(firstOcc);
        } else if (firstOcc == -1 || lastOcc == -1) {
            // Do Nothing
        } else {
            for (int i = firstOcc; i <= lastOcc; i++) {
                list.add(i);
            }
        }
        return list;
    }
}