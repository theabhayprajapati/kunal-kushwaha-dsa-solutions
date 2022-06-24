package searching.java;

//https://leetcode.com/problems/kth-missing-positive-number/
/**
 * KthMissPosNum
 */
public class KthMissPosNum {

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 7, 11 };
        System.out.println(kthMissPosNum(nums, 5));
    }

    public static int kthMissPosNum(int[] nums, int i) {
        int[] count = new int[i + 1];
        // Sol:
        int currentValue = 1;
        int index = 0;
    }
}