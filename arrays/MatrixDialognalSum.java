package arrays;

/**
 * MatrixDialognalSum
 */
public class MatrixDialognalSum {

    public static void main(String[] args) {
        // mat = [[1,2,3],
        // [4,5,6],
        // [7,8,9]]
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(sum(mat));
    }

    static int sum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {

            sum = sum + mat[i][mat.length - 1 - i];
            sum = sum + mat[mat.length - 1 - i][i];
        }
        if (mat.length % 2 != 0) {
            sum = sum - mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    };
}