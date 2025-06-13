class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (!list.isEmpty() && end <= list.get(list.size() - 1).get(1)) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }
            list.add(Arrays.asList(start, end));
        }

        int[][] ans = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            List<Integer> row = list.get(i);
            ans[i] = new int[row.size()];
            for (int j = 0; j < row.size(); j++) {
                ans[i][j] = row.get(j); // auto-unboxing Integer -> int
            }
        }
        return ans;
    }
}