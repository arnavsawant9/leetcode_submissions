class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        
        int[][] cache = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(cache[i], -1);
        }
        
        return helper(text1, n - 1, text2, m - 1, cache);
    }

    private int helper(String text1, int i, String text2, int j, int[][] cache) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (cache[i][j] != -1) {
            return cache[i][j];
        }

        if (text1.charAt(i) == text2.charAt(j)) {
            cache[i][j] = 1 + helper(text1, i - 1, text2, j - 1, cache);
        } else {
            cache[i][j] = Math.max(helper(text1, i - 1, text2, j, cache),
                           helper(text1, i, text2, j - 1, cache));
        }

        return cache[i][j];
    }
}