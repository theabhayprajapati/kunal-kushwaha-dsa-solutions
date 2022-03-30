package arrays;

public class Shufflearray {

    public static void main(String[] args) {
        int[] arr = {2,3,2,4,4,3};
        shuffle(arr, 3);
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int j = 0;
        for (int i = 0; i < 2 * n; i = i + 2) {
            ans[i] = nums[j];
            ans[i + 1] = nums[j + n];
            j++;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[n] + " ");
        }
        return ans;
    }
}