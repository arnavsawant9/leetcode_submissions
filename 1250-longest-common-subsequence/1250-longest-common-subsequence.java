class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] t = new int[text1.length() + 1][text2.length() + 1];
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)) t[i][j] = 1 + t[i-1][j-1];
                else {
                    t[i][j] = Math.max(
                        t[i][j-1], t[i-1][j]
                    );
                }
            }
        }
        return t[text1.length()][text2.length()];
    }
}