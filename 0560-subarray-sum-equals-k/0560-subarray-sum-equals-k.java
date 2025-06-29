class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);  // for handling subnumsays starting from index 0

        int preSum = 0, cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            int remove = preSum - k;

            cnt += hm.getOrDefault(remove, 0);  // if 'remove' exists in map, add its count

            hm.put(preSum, hm.getOrDefault(preSum, 0) + 1);  // increment frequency of preSum
        }

        return cnt;
    }
}