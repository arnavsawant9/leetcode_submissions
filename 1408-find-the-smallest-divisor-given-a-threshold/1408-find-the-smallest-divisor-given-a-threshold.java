class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if(nums.length > threshold) return -1;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxi = Math.max(maxi, nums[i]);
        }

        int left = 0, right = maxi;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(getDivision(nums, mid) <= threshold){
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int getDivision(int[] nums, int mid){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += Math.ceil((double)nums[i] / (double)mid);
        }
        return sum;
    }
}