package searching.java;

/**
 * PerfectSquare
 */
public class PerfectSquare {
    public static void main(String[] args) {
        int num = (999999999);
        System.out.println(

                perfectSquare(num));
    }

    private static boolean perfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long low = 2;
        long high = num / 2;
        long sqr;
        while (low <= high) {
            long mid = (low + high) / 2;
            sqr = mid * mid;
            if (sqr == num) {
                return true;
            } else if (sqr < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }

}