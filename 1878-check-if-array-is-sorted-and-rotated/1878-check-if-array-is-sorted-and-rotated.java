class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                count++;
            }
        }
        if(nums[nums.length-1] > nums[0]){ count++;}

        return (count <=1)? true:false;
    }
}