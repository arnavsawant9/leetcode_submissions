class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positiveNums = new ArrayList<>();
        List<Integer> negativeNums = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                positiveNums.add(nums[i]);
            } else {
                negativeNums.add(nums[i]);
            }
        }

        int evenIdx = 0, oddIdx = 0;
        for(int i = 0;i<nums.length;i++){
            if(i % 2 == 0){
                nums[i] = positiveNums.get(evenIdx);
                evenIdx++;
            } else {
                nums[i] = negativeNums.get(oddIdx);
                oddIdx++;
            }
        }

        return nums;
    }
}