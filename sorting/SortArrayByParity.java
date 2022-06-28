package sorting;

import java.util.ArrayList;

/**
 * SortArrayByParity
 */
public class SortArrayByParity {

    public static void main(String[] args) {
        int nums[] = { 3, 1, 2, 4 };
        int value[] = sortArrayByParity(nums);
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
        // make a list and copy values
        // sort the list
        // check for odd values and push to back of array

    }

    public static int[] sortArrayByParity(int[] A) {
        // make a list
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                list.add(A[i]);
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                list.add(A[i]);
            }
        }
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}