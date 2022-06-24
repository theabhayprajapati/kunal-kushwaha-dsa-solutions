// https://leetcode.com/problems/fair-candy-swap/
package searching.java;

import java.util.ArrayList;

/**
 * FairCandyShop
 */
public class FairCandyShop {

    public static void main(String[] args) {
        int nums[] = { 1, 1 };
        int nums2[] = { 2, 2 };
        int ans[] = fairCandyShop(nums, nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] fairCandyShop(int nums[], int nums2[]) {

        ArrayList<Integer> cars = new ArrayList<Integer>();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            sum2 += nums2[i];
        }
        int len1 = nums.length;
        int len2 = nums2.length;
    
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int diff = nums[i] - nums2[j];
                if (sum1 - diff == sum2 + diff) {
                    cars.add(nums[i]);
                    cars.add(nums2[j]);
                    return cars.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        return cars.stream().mapToInt(Integer::intValue).toArray();
    }
}
