package arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = { {1,2,3}, {3,2,1} };
        // maximumWealth(accounts);
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
      
        for (int i = 0; i < accounts.length; i++) {
            int self = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                self = self + accounts[i][j];
                if (self > max) {
                    max = self;
                }
            }
        }
        return max;
    }
}