package arrays.medium;

/**
 * SpiralMat2
 */
public class SpiralMat2 {

    public static void main(String[] args) {
        int n = 3;
        int[][] ans = spiralMatrix(n);
        // print ans
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] spiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int count = 1;
        while (left <= right && top <= bottom) {
            // get the top element
            for (int i = left; i <= right; i++) {
                matrix[top][i] = count;
                count++;
            }
            top++;
            // get the right element
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count;
                count++;
            }
            right--;
            // break if there is no element
            if (left > right || top > bottom) {
                break;
            }
            // get the bottom element
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = count;
                count++;
            }
            bottom--;
            // get the left element
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = count;
                count++;
            }
            left++;
        }

        return matrix;
    }
}