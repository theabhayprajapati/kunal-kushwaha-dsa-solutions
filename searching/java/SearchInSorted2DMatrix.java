package searching.java;

/**
 * SearchInSorted2DMatrix
 */
public class SearchInSorted2DMatrix {

    public static void main(String[] args) {
        // search in sorted 2D matrix
        int[][] matrix = { { 1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30} };
        int value = 7;
        boolean res = searchInSorted2DMatrix(matrix, value);
        System.out.println(res);
    }

    public static boolean searchInSorted2DMatrix(int[][] matrix, int value) {
        // search for the value in the matrix
        // use binary search to find the row
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