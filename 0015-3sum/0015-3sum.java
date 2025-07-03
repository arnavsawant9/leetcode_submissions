class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            int j = i+1, k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                    Collections.sort(list);
                    hs.add(list);
                    j++;
                    k--;
                } else if(sum < 0){
                    j++;
                } else {
                    k--;
                }
            }
        }
        List<List<Integer>> finalAns = new ArrayList<>(hs);
        return finalAns;
    }
}