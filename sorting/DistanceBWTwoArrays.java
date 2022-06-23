package sorting;

import java.util.Arrays;

/**
 * DistanceBWTwoArrays
 */
public class DistanceBWTwoArrays {

    public static void main(String[] args) {
        // r1 = [4,5,8], arr2 = [10,9,1,8], d = 2
        int[] nums1 = { 4, 5, 8 };
        int[] nums2 = { 10, 9, 1, 8 };
        int d = 2;
        int[] result = distanceBWarrays(nums1, nums2, d);
        // pritn
        System.out.println(Arrays.toString(result));
    }

    public static int[] distanceBWarrays(int[] nums1, int[] nums2, int d) {
        if(nums1.length > nums2.length) {
            return distanceBWarrays(nums2, nums1, d);
        }
        
    }
}