class Solution {
    public int climbStairs(int n) {
        int[] t = new int[n+1];
        for(int i=0;i<n+1;i++) t[i] = 1;
        return finalAns(t, n);
    }

    public int finalAns(int[] dp , int n){
        if(n == 1 || n == 0) return 1;
        for(int i=2;i<n+1;i++){
            dp[i] =  dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}