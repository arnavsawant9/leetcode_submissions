class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        if(nums.length == 1) return nums[0];
        //int j = i+1;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}