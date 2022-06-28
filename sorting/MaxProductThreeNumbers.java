package sorting;

import java.util.Arrays;

/**
 * MaxProductThreeNumbers
 */
public class MaxProductThreeNumbers {

    public static void main(String[] args) {
        int nums[] = { -1, -2, -3 };
        System.out.println(maxProduct(nums));

    }

    private static int maxProduct(int[] arr) {
        // convert neg to post
        Arrays.sort(arr);
        if (arr[arr.length - 1] == 0)
            return 0;
        int product = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        if (arr[0] < 0)
            product = Math.max(product, arr[0] * arr[1] * arr[arr.length - 1]);
        return product;
    }
}