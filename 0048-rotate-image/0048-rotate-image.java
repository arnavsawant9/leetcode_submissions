class Solution {
    public void rotate(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
        int[][] ans = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[j][col-1-i] = matrix[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
}