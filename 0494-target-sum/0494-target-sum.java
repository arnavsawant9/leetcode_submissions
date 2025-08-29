class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        // If not possible
        if ((target + totalSum) % 2 != 0 || totalSum < Math.abs(target)) return 0;

        int sum = (target + totalSum) / 2;
        return countSubsets(nums, sum);
    }

    private int countSubsets(int[] nums, int sum) {
        int n = nums.length;
        int[][] t = new int[n + 1][sum + 1];

        // Initialization
        for (int i = 0; i <= n; i++) t[i][0] = 1;

        // DP
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (nums[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - nums[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }
}
