package arrays;

/**
 * ReshapeMat
 */
public class ReshapeMat {

    public static void main(String[] args) {
        // Input: mat = [[1,2],[3,4]], r = 2, c = 4
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int[][] ans = reshaped(mat, 1, 4);
        // print ans;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] reshaped(int[][] mat, int r, int c) {
        // int[][] ans = new int[r][c];
        int[][] ans = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            // convert mat in to mat with r rows and c columns
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = mat[i][j];
            }

        }
        return ans;
    }
}