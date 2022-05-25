package searching.java;

/**
 * ArrangingCoins
 */
public class ArrangingCoins {

    public static void main(String[] args) {
        int n = 12;
        System.out.println(arrangeCoinsFn3(n));
    }

    // ? Time Complexity: O(n)
    static int arrangeCoinsFn(int n) {
        int i = 1;
        while (n >= i) {
            n -= i;
            i++;
        }
        return i - 1;
    }

    // ? Time Complexity: O(log n)
    static int arrangeCoinsFn2(int n) {
        long start = 0;
        long end = n;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sum = mid * (mid + 1) / 2;
            if (sum == n) {
                return (int) mid;
            } else if (sum < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end;
    }
    
    // ? Time Complexity: O(1)
    static int arrangeCoinsFn3(int n) {
        return (int) (-0.5 + Math.sqrt(2 * (long) (n) + 0.25));
    }
}