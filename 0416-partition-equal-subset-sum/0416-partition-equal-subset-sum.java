class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0 ; i<nums.length ; i++){
            sum += nums[i];
        }

        if(sum % 2 != 0) return false;
        return subsetsum(nums,sum/2);
    }

    public boolean subsetsum(int[] nums, int sum){
        boolean[][] t = new boolean[nums.length+1][sum+1];
        int n = nums.length;

        // here you wrote the base condition
        for(int i = 0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(j == 0) t[i][j] = true;
            }
        }

        // main implementation starts here !!
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(nums[i-1] <= j){
                    t[i][j] = t[i-1][j-nums[i-1]] || t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][sum];
    }
}