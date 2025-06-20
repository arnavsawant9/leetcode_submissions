class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // writing my hashmap appraoch
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        double numsLength = Math.floor(nums.length/3);
        for (Integer value : hm.keySet()) {
            if(hm.get(value) > numsLength){
                list.add(value);
            }
        }

        return list;
    }
}