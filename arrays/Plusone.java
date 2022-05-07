package arrays;

/**
 * Plusone
 */
public class Plusone {

    public static void main(String[] args) {
        // [1,2,3]
        int[] digits = { 1, 2, 3 };
        int[] ans = plusOne(digits);
        // print ans;
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] plusOne(int[] digits) {
        // convert into int
        int num = 0;
        for (int i = 0; i < digits.length; i++) {
            num = num * 10 + digits[i];
        }
        // plus one
        num = num + 1;
        // print
        System.out.println(num);
        // arr
        int[] ans = new int[digits.length];
        // convert back to int
        int temp = num;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = temp % 10;
            temp = temp / 10;
        }
        
        // reverse
        for (int i = 0; i < ans.length / 2; i++) {
            int temp1 = ans[i];
            ans[i] = ans[ans.length - 1 - i];
            ans[ans.length - 1 - i] = temp1;
        }

        return ans;
    }
}