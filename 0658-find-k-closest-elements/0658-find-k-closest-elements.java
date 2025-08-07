import java.util.*;

class Pair {
    int x, y;
    Pair(int x, int y) {
        this.x = x; // difference
        this.y = y; // actual number
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (b.x != a.x) return b.x - a.x;     // max heap by diff
            return b.y - a.y;                     // break ties by larger value
        });

        for (int num : nums) {
            int diff = Math.abs(num - x);
            pq.offer(new Pair(diff, num));
            if (pq.size() > k) {
                pq.poll(); // remove the farthest
            }
        }

        // Extract elements and sort them
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll().y);
        }

        Collections.sort(result); // since output needs to be sorted
        return result;
    }
}