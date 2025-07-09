class Solution {
    public int[] searchRange(int[] nums, int target) {
        //int[] ans = {-1,-1};
        int first= binSearch(nums,target,true);
        int second = binSearch(nums,target,false);
        return new int[]{first,second};
    }

    public int binSearch(int[] nums, int target, boolean isFirstIndex){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] < target){
                start = mid+1;
            } else if(nums[mid] > target){
                end = mid-1;
            } else{
                ans = mid;
                if(isFirstIndex){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }

        return ans;
    }
}