class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int[] suffixSum = new int[nums.length];
        //calculating the prefixSum
        int preSum = 0;
        for(int i = 0;i<nums.length;i++){
            preSum += nums[i];
            prefixSum[i] = preSum;
        }

        //calculating the suffixSum
        int sufSum = 0;
        for(int i=nums.length-1;i>=0;i--){
            sufSum += nums[i];
            suffixSum[i] = sufSum;
        }

        // now calc the difference, so whichever is 0 is the index
        for(int i=0;i<nums.length;i++){
            if(prefixSum[i] - suffixSum[i] == 0){
                return i;
            }
        }
        return -1;
    }
}