package recursion;

/**
 * Triangles
 */
public class Triangles {

    public static void main(String[] args) {
        triangle(3, 0);
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }
}
