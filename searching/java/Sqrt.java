package searching.java;

public class Sqrt {
    public static void main(String[] args) {
        int x = 16;
        mySqrt(x);
    }

    static int mySqrt(int x) {
        int n = 0;
        int xa = x / 2;
        for (int i = 1; i < xa; i++) {
            if (i * i == xa) {
                n = i;
            } else {
                System.out.println(i);
            }
        }
        return n;
    }
}