import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);  // Sort to ensure duplicates are adjacent
        HashSet<List<Integer>> set = new HashSet<>();  // Use HashSet to avoid duplicates
        List<Integer> list = new ArrayList<>();
        generateSubset(0, nums, list, set);
        
        List<List<Integer>> finalList = new ArrayList<>(set);
        // Convert HashSet to List
        // return new ArrayList<>(set);
        return finalList;
    }

    public void generateSubset(int index, int[] nums, List<Integer> list, HashSet<List<Integer>> set) {
        if (index == nums.length) {
            set.add(new ArrayList<>(list));  // Add subset to HashSet
            return;
        }

        // Include the current element
        list.add(nums[index]);
        generateSubset(index + 1, nums, list, set);
        list.remove(list.size() - 1);  // Backtrack

        // Exclude the current element
        generateSubset(index + 1, nums, list, set);
    }
}