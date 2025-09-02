class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int nums_target = target - nums[i];
            if(hm.containsKey(nums_target)){
                return new int[]{hm.get(nums_target), i};
            } else {
                hm.put(nums[i], i);
            }
        }

        return new int[]{-1,-1};
    }
}