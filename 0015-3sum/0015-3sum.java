class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> hs_num = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int k = -(nums[i]+nums[j]);
                if(hs_num.contains(k)){
                    List<Integer> list = Arrays.asList(nums[i], nums[j], k);
                    Collections.sort(list);
                    hs.add(list);
                }
                hs_num.add(nums[j]);
            }
        }
        List<List<Integer>> finalAns = new ArrayList<>(hs);
        return finalAns;
    }
}