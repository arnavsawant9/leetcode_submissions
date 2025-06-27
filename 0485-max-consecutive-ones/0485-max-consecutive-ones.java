class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int tempCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                tempCount++;
            } else if(nums[i] == 0){
                tempCount = 0;
            }
            count = Math.max(tempCount, count);
        }

        return count;
    }
}