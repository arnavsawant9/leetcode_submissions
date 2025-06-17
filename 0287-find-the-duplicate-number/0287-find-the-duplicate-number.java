class Solution {
    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];
        while(fast < nums.length && slow < nums.length){
            fast = nums[nums[fast]];
            slow = nums[slow];
            if(fast == slow){
                break;
            }
        } 

        slow = nums[0];
        while(fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }

        return fast;
    }
}