class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        generateSubsets(0,candidates,list,finalList,target); //to store sum as 0 at first
        return finalList;
    }

    public void generateSubsets(int index, int[] candidates, List<Integer> list, List<List<Integer>> finalList, int target){
        if(index == candidates.length){
            if(target == 0){
                finalList.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[index] <= target){
            list.add(candidates[index]);
            generateSubsets(index,candidates,list,finalList,target-candidates[index]);
            list.remove(list.size()-1);
        }
        generateSubsets(index+1,candidates,list,finalList,target);
    }
}