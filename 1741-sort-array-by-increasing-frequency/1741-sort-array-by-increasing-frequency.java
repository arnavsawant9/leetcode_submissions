import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Step 1: Count frequency
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Create a PriorityQueue (Min-Heap by freq, Max-Heap by value if tie)
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                if (!freq.get(a).equals(freq.get(b))) {
                    return freq.get(a) - freq.get(b); // lower freq first
                } else {
                    return b - a; // if freq equal → larger number first
                }
            }
        );
        
        // Step 3: Push all nums into heap
        for (int num : nums) {
            pq.offer(num);
        }
        
        // Step 4: Pop from heap into result
        int[] result = new int[nums.length];
        int i = 0;
        while (!pq.isEmpty()) {
            result[i++] = pq.poll();
        }
        
        return result;
    }
}