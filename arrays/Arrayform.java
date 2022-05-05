package arrays;

import java.util.ArrayList;

/**
 * Arrayform
 */
public class Arrayform {

    public static void main(String[] args) {
        // [1,2,0,0]
        // int[] nums = { 1, 2, 0, 0 };
        // addToArrayForm(nums, 34);
        //
        // [9,9,9,9,9,9,9,9,9,9]
        // 1
        int[] nums = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        int k = 1;
        addToArrayForm(nums, k);
    }

    static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        // conver the num into a number and add k convert into a arr;
        ArrayList<Integer> arr = new ArrayList<>();
        int numInt = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            numInt += num[i] * Math.pow(10, num.length - 1 - i);
        }
        numInt += k;
        String numStr = String.valueOf(numInt);
        for (int i = 0; i < numStr.length(); i++) {
            arr.add(Integer.parseInt(String.valueOf(numStr.charAt(i))));
        }
        return arr;
    }
}