class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
if(nums[0] != nums[1]) return nums[0];
if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
        int left=0, right=nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(mid<nums.length-1 && mid>0){
                if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            if((mid % 2 ==0 && nums[mid] == nums[mid+1]) || (mid%2==1 && nums[mid] == nums[mid-1])){
                left = mid+1;
            } else {
                right = mid-1;
            }
            }
        }
        return -1;
    }
}