package arrays;

import java.util.ArrayList;

/**
 * LuckyNumber
 */
public class LuckyNumber {

    public static void main(String[] args) {
        // matrix = [[3,7,8],[9,11,13],[15,16,17]]
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        luckyNumbers(matrix);
    }

    static ArrayList<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int small = 0;
            // check the smallest number in the row
            for (int j = 0; j < matrix[i].length; j++) {
                if (small == 0) {
                    small = matrix[i][j];
                } else if (small > matrix[i][j]) {
                    small = matrix[i][j];
                }
            }

            // get the column index of the smallest number
            int col = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == small) {
                    col = j;
                }
            }

            // loop over this columen and check wether this largest or not
            int large = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (large == 0) {
                    large = matrix[j][col];
                } else if (large < matrix[j][col]) {
                    large = matrix[j][col];
                }
            }
            if (small == large) {
                ans.add(small);
            }
        }
        
        return ans;
    }
}
