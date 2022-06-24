package searching.java;

/**
 * SearchInSorted2DMatrix
 */
public class SearchInSorted2DMatrix {

    public static void main(String[] args) {
        // search in sorted 2D matrix
        int[][] matrix = { { 1,3,5,7}, {10,11,16,20}, { 23,30,34,60 } };
        int value = 7;
        boolean res = searchInSorted2DMatrix(matrix, value);
    }

    public static boolean searchInSorted2DMatrix(int[][] matrix, int value) {
        // search for the value in the matrix
        // use binary search to find the row
        int row = 0;
        int col = matrix[0].length - 1;
        
        return false;
    }
}