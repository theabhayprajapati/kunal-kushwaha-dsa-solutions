// https://leetcode.com/problems/majority-element/
package sorting;

/**
 * MajorityNumbers
 */
public class MajorityNumbers {

    public static void main(String[] args) {
        System.out.println(majorityNumbers(new int[] { 3, 2, 3, 1, 1, 1 }));
        ;
    }

    static int majorityNumbers(int nums[]) {
        int results = 0;
        int count = 0;
        for (int i : nums) {
            if (count == 0) {
                results = i;
            }
            if (results == i) {
                count++;
            } else {
                count--;
            }
        }
        return results;
    }

}