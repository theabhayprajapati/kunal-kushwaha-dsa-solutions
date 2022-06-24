package searching.java;

public class Sqrt {
    public static void main(String[] args) {
        int x = 16;
        System.out.println(mySqrt(3));
    }

    static int mySqrt(int x) {
        // efficent
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left - 1;

    }
}