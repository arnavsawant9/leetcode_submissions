class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];  // base case

        int[] t = new int[n];   // t[i] = max money up to house i

        // base cases
        t[0] = nums[0];
        t[1] = Math.max(nums[0], nums[1]);

        // fill the table
        for (int i = 2; i < n; i++) {
            int pick = nums[i] + t[i - 2]; // rob current + best till i-2
            int notPick = t[i - 1];        // skip current, take best till i-1
            t[i] = Math.max(pick, notPick);
        }

        return t[n - 1];  // answer at the last index
    }
}