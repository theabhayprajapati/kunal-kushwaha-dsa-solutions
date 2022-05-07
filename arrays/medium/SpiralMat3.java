package arrays.medium;

/**
 * SpiralMat3
 */
public class SpiralMat3 {

    public static void main(String[] args) {
        // [[0,0],[0,1],[0,2],[0,3]]
        // int[][] matrix = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 } };
        // [[1,4],[1,5],[2,5],[2,4],[2,3],[1,3],[0,3],[0,4],[0,5],[3,5],[3,4],[3,3],[3,2],[2,2],[1,2],[0,2],[4,5],[4,4],[4,3],[4,2],[4,1],[3,1],[2,1],[1,1],[0,1],[4,0],[3,0],[2,0],[1,0],[0,0]]
        int[][] matrix = { { 1, 4 }, { 1, 5 }, { 2, 5 }, { 2, 4 }, { 2, 3 }, { 1, 3 }, { 0, 3 }, { 0, 4 }, { 0, 5 },
                { 3, 5 }, { 3, 4 }, { 3, 3 }, { 3, 2 }, { 2, 2 }, { 1, 2 }, { 0, 2 }, { 4, 5 }, { 4, 4 }, { 4, 3 },
                { 4, 2 }, { 4, 1 }, { 3, 1 }, { 2, 1 }, { 1, 1 }, { 0, 1 }, { 4, 0 }, { 3, 0 }, { 2, 0 }, { 1, 0 },
                { 0, 0 } };
        // print mat
        // rows = 5; cols =6; rStart = 0; cStart= 0;
        int rows = 5;
        int cols = 6;
        int rStart = 0;
        int cStart = 0;
        int[][] ans = spiralMatrix(rows, cols, rStart, cStart);

        // pritna ans;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        

    }

    static int[][] spiralMatrix(int rows, int cols, int rStart, int cStart) {
        int[][] matrix = new int[rows][cols];
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        int count = 1;
        while (left <= right && top <= bottom) {
            // get the top element
            for (int i = left; i <= right; i++) {
                // matrix[top
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