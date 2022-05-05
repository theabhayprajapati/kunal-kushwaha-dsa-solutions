package arrays;

/**
 * Transpose
 */
public class Transpose {

    public static void main(String[] args) {
        // [[1,2,3],[4,5,6],[7,8,9]]
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        int[][] ans = transposeMat(matrix);
        // print the matrix
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("....");
        // print the ans;
        for (int[] row : ans) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static int[][] transposeMat(int[][] mat) {
        int[][] ans = new int[mat[0].length][mat.length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = mat[j][i];
            }
        }
        return ans;
        // int[][] ans = new int[mat[0].length][mat.length];
        // for (int i = 0; i < ans.length; i++) {
        // for (int j = 0; j < ans[0].length; j++) {
        // ans[i][j] = mat[j][i];
        // }
        // }
        // return ans;
    }
}