package searching.java;

/**
 * SmallestGreatestChar
 */
public class SmallestGreatestChar {
    public static void main(String[] args) {
        char[] chars = { 'a', 'b' };
        System.out.println(nextGreatestLetter(chars, 'z'));

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}