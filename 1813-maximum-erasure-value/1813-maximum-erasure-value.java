class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int left=0, right=0;
        int currSum = 0, maxSum = 0;
        while(right < nums.length){
            // suppose the element contains that element
            while(hs.contains(nums[right])){
                hs.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }

            // suppose the element is unique doesn't has duplicate
            hs.add(nums[right]);
            currSum += nums[right];
            maxSum = Math.max(currSum, maxSum);
            right++;
        }

        return maxSum;
    }
}