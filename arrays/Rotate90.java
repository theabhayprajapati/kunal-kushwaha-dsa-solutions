package arrays;

/**
 * Rotate90
 */
public class Rotate90 {

    public static void main(String[] args) {
        // [[0,0,0],[0,1,0],[1,1,1]]
        // [[1,1,1],[0,1,0],[0,0,0]]
        int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        int[][] target = {
                { 1, 1, 1 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };

        // print mat
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        boolean ans = rotate90(mat, target);
        System.out.println(ans);

    }

    static boolean rotate90(int[][] mat, int[][] target) {
        // rotate the matrix 90deg check if the target is equal to the rotated;if not
        // return false;
        // if yes return true;

        boolean ans = true;
        int n = mat.length;
        int m = mat[0].length;
        int[][] rotated = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rotated[i][j] != target[i][j]) {
                    ans = false;
                }
            }
        }
        return ans;
    }
}