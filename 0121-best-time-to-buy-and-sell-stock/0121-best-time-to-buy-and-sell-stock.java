class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int min = prices[0];
        for(int i=0;i<prices.length;i++){
            int cost = prices[i] - min;
            maxProfit = Math.max(cost, maxProfit);
            min = Math.min(prices[i], min);
        }

        return maxProfit;
    }
}