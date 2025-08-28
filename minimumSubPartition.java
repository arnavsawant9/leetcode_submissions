// User function Template for Java
// minimum subset difference question
// question link -> http://geeksforgeeks.org/problems/minimum-sum-partition3317/1

class Solution {

    public int minDifference(int arr[]) {
        // Your code goes here
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        
        return subsetsum(arr, sum);
    }
    
    public int subsetsum(int[] nums, int sum){
        int n = nums.length;
        boolean[][] t = new boolean[n+1][sum+1];
        // base condn
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(j == 0) t[i][j] = true;
            }
        }
        
        // main logic here!!
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(nums[i-1] <= j){
                    t[i][j] = t[i-1][j-nums[i-1]] || t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(int j = 0;j<sum+1 && j <= sum/2;j++){
            if(t[n][j]) list.add(j);
        }
        
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            min = Math.min(min, sum - 2*list.get(i));
        }
        return min;
    }
}
