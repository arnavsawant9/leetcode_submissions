class Solution {
        public int minLength(int[] A, int k) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int i = 0, n = A.length, res = n + 1;
        for (int j = 0; j < A.length; j++) {
            int a = A[j];
            cnt.put(a, cnt.getOrDefault(a, 0) + 1);
            if (cnt.get(a) == 1)
                k -= a;
            while (k <= 0) {
                res = Math.min(res, j - i + 1);
                cnt.put(A[i], cnt.get(A[i]) - 1);
                if (cnt.get(A[i]) == 0)
                    k += A[i];
                i++;
            }
        }
        return res > n ? -1 : res;
    }
}