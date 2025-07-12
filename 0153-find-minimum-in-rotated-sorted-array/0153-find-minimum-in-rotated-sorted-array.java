class Solution {
    public int findMin(int[] nums) {
        int index = rotatedIndex(nums);
        return index == -1? nums[0]: Math.min(nums[0],nums[index+1]);
    }

    public int rotatedIndex(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                return i-1;
            }
        }
        return -1;
    }
}