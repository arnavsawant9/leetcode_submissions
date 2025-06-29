class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        //int sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int preSum = 0, cnt = 0;
        hm.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            preSum += nums[i];
            //preSum %= k;
            int remainder = preSum % k;
            if(hm.containsKey(remainder)){
                if(i - hm.get(remainder) > 1){
                    return true;
                }
            } else {
                hm.put(remainder, i);
            }
        }
        return false;
    }
}