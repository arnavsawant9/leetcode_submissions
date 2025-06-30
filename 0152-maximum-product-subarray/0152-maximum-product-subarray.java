class Solution {
    public int maxProduct(int[] nums) {
        int finalProd = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            int prod = 1;
            for(int j = i;j<nums.length;j++){
                prod *= nums[j];
                finalProd = Math.max(finalProd, prod);
            }
        }
        return finalProd;
    }
}