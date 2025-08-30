class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] t = new int[n+1][amount+1];
        // initialization
        for(int j=0;j<amount+1;j++) t[0][j] = Integer.MAX_VALUE - 1;

        // for row 1 part
        for(int j=1;j<amount+1;j++){
            if(j % coins[0] == 0) t[1][j] = j/coins[0];
            else t[1][j] = Integer.MAX_VALUE - 1;
        }

        // main logic below
        for(int i=2;i<n+1;i++){
            for(int j=1;j<amount+1;j++){
                if(coins[i-1] <= j){
                    t[i][j] = Math.min(t[i][j-coins[i-1]]+1, t[i-1][j]);
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return (t[n][amount] == Integer.MAX_VALUE - 1) ? -1 : t[n][amount];
    }
}