// https://leetcode.com/problems/set-matrix-zeroes/
package arrays.medium;

/**
 * SetMatrixZero
 */
public class SetMatrixZero {

    public static void main(String[] args) {
        // matrix = [[1,1,1],[1,0,1],[1,1,1]]
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        // print mat
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] ans = setZeros(matrix);

        // print ans;
        System.out.println(".....");

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] setZeros(int[][] matrix) {
        boolean[][] val = new boolean[matrix.length][matrix[0].length];
        // print mat
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
                // if value is 0,then false the val
                if (matrix[i][j] == 0) {
                    val[i][j] = false;
                } else {
                    val[i][j] = true;
                }
            }
            System.out.println();
        }
        // print val
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[0].length; j++) {
                System.out.print(val[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < val.length; i++) {
            
        }
        return matrix;
    }

}