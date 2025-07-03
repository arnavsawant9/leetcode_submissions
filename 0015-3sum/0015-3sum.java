class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //HashSet<List<Integer>> hs = new HashSet<>();
        // List<List<Integer>> finalAns = new ArrayList<>();
        List<List<Integer>> finalAns = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1, k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                    //Collections.sort(list);
                    finalAns.add(list);
                    //finalAns.add(list);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                } else if(sum < 0){
                    j++;
                } else {
                    k--;
                }
            }
        }
        return finalAns;
    }
}