package arrays;

import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.RunElement;

public class Contationationofarray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            for (int j = 0; j < nums.length; j++) {
                ans[i + nums.length] = nums[i];
            }
        }
        return ans;
    }
}