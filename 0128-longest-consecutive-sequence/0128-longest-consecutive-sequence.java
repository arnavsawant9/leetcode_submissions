class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int longest = 1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }

        // traverse the hashset;
        for(int i : hs){
            if(!hs.contains(i-1)){
                int cnt = 1;
                int x = i;
                while(hs.contains(i+1)){
                    i = i+1;
                    cnt += 1;
                }
            longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}