class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int[] t = new int[n];

        // base cases
        t[0] = nums[0];
        t[1] = Math.max(nums[0], nums[1]);

        // fill the table
        for (int i = 2; i < n; i++) {
            int pick = nums[i] + t[i - 2];
            int notPick = t[i - 1];
            t[i] = Math.max(pick, notPick);
        }

        return t[n - 1];
    }
}