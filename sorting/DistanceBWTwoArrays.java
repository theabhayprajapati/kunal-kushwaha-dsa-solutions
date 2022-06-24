package sorting;

import java.util.Arrays;

/**
 * DistanceBWTwoArrays
 */
public class DistanceBWTwoArrays {

    public static void main(String[] args) {
        // r1 = [4,5,8], nums2 = [10,9,1,8], d = 2
        int[] nums1 = { 2, 1, 100, 3 };
        int[] nums2 = { -5, -2, 10, -3, 7 };
        int d = 6;
        int result = distanceBWarrays(nums1, nums2, d);

        System.out.println(result);
    }

    public static int distanceBWarrays(int[] nums1, int[] nums2, int d) {
        Arrays.sort(nums2);
        // pritn
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int start = 0;
            int end = nums2.length - 1;
            int a = 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (Math.abs(nums2[mid] - nums1[i]) <= d) {
                    a = 0;
                    break;
                } else if (nums2[mid] > nums1[i]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            count += a;
        }
        return count;
    }
}