class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> final_list = new ArrayList<>();
        generateSubset(0,list,final_list,nums);
        return final_list;
    }

    public void generateSubset(int index,List<Integer> list,List<List<Integer>> final_list, int[] nums){
        if(index == nums.length){
            final_list.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        generateSubset(index+1, list,final_list, nums);
        list.remove(list.size()-1);
        generateSubset(index+1, list,final_list, nums);
    }
}