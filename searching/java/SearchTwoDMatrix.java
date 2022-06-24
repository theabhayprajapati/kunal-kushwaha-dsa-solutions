package searching.java;

/**
 * SearchTwoDMatrix
 */
public class SearchTwoDMatrix {

    public static void main(String[] args) {
        // Create a 2D matrix
        int[][] matrix = { { 1,3,5,7}, {10,11,16,20}, { 23,30,34,60 } };
        // Search for a value in the matrix
        int value = 7;
        boolean res = searchIn2D(matrix, value);
        System.out.println(res);

    }

    public static boolean searchIn2D(int[][] matrix, int value) {
        // Search for the value in the matrix
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == value) {
                return true;
            } else if (matrix[row][col] > value) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}