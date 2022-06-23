package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * InsertionOfTwoArrays
 */
public class InsertionOfTwoArrays {
	public static void main(String[] args) {

		/**
		 * [1,2,2,1]
		 * [2]
		 */
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2 };
		int[] result = intersection(nums1, nums2);
		// pritn
		System.out.println(Arrays.toString(result));
	}

	public static int[] inserationOfTwo(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				ans.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}
		int[] result = new int[ans.size()];
		for (int k = 0; k < ans.size(); k++) {
			result[k] = ans.get(k);
		}
		return result;
	}

	// using HASHMAP
	// https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/
	// https://leetcode.com/problems/intersection-of-two-arrays-ii/discuss/106088/Java-O(n)-solution-using-HashMap
	public static int[] intersection(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			return intersection(nums2, nums1);
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums1) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
				ans.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}
		int[] ans2 = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			ans2[i] = ans.get(i);
		}
		return ans2;
	}

}

// sorting the array at first
// main is to check soes a elemtn lies in both arrays or not
//
