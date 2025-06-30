class Solution {
    public int maxProduct(int[] nums) {
        int finalProd = Integer.MIN_VALUE;
        int pre = 1, suff = 1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;
            pre *= nums[i];
            suff *= nums[n-i-1];
            finalProd = Math.max(finalProd, Math.max(pre, suff));
        }
        return finalProd;
    }
}