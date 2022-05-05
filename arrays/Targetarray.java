package arrays;

public class Targetarray {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        createTargetArray(nums, index);
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int target[] = new int[nums.length];
        for (int i = 0; i < target.length; i++) {
            int ind = index[i];
            for (int j = 0; j < target.length; j++) {
                
            }
        }
        for (int i : target) {
            System.out.print(target[i]);
        }
        return target;
    }
}