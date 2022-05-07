package arrays.medium;

import java.util.ArrayList;

/**
 * SpiralMat
 */
public class SpiralMat {
    public static void main(String[] args) {
        // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // [[1,2,3,4],
        // [5,6,7,8],
        // [9,10,11,12]]
        // int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        // System.out.println(3 / 2);
        int[][] matrix = { { 2, 3 } };
        // [[2,3]]
        // int[][]
        // spiralOrder(matrix);
        // print spiral order
        ArrayList<Integer> ans = spiralOrder(matrix);
        // print ans;
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }

    // two
    static ArrayList<Integer> spiralOrder(int[][] matrix) {
        // list of interge
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (left <= right && top <= bottom) {
            // get the top element
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            // get the right element
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            // break if there is no element
            if (left > right || top > bottom) {
                break;
            }
            // get the bottom element
            for (int i = right; i >= left; i--) {
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            // get the left element
            for (int i = bottom; i >= top; i--) {
                ans.add(matrix[i][left]);
            }
            left++;

        }
        return ans;
    }
}