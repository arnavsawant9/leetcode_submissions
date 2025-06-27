class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int temp = hm.get(nums[i]);
                hm.put(nums[i], temp+1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i]) == 1){
                return nums[i];
            }
        }

        return -1;
    }
}