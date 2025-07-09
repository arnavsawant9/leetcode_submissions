class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //if pivot is -1, i.e your array is not rotated
        if(pivot == -1) return binSearch(nums,0,nums.length-1, target);

        //if pivot has some value, check if the target is @pivot
        if(nums[pivot] == target) return pivot;

        //go for normal searching
        if(nums[0] > target){
            return binSearch(nums,pivot+1,nums.length-1,target);
        }

        //else codition
        return binSearch(nums,0,pivot-1,target);
    }

    public int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            //case-1
            if(mid < end && nums[mid] > nums[mid+1]) return mid;
            //case-2
            if(mid > start && nums[mid] < nums[mid-1]) return mid-1;
            //case-3
            if(nums[mid] < nums[start]){
                end = mid-1;
            } else { //case-4
                start = mid+1;
            }
        }
        return -1;
    }

    public int binSearch(int[] nums, int start, int end, int target){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return -1;
    }
}