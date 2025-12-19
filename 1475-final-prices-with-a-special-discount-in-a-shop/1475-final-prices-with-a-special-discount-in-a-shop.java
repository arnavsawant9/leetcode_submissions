class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=prices.length-1; i>=0 ; i--){
            if(stack.isEmpty()) ans[i] = prices[i];
            else{
                if(!stack.isEmpty() && stack.peek() > prices[i]){
                    while(!stack.isEmpty() && stack.peek() > prices[i]) stack.pop();
                }
                if(stack.isEmpty()) ans[i] = prices[i];
                else ans[i] = prices[i] - stack.peek();
            }
            stack.push(prices[i]);
        }
        return ans;
    }
}