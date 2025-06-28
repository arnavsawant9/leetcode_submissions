class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //int[][] ans = new int[n][n];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix, i, j);
            }
        }

        //now reverse within the n
        for(int i=0;i<n;i++){
            reverseArray(matrix[i]);
        }
    }

    public void swap(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void reverseArray(int[] mat){
        int left = 0, right = mat.length - 1;
        while(left < right){
            int temp = mat[left];
            mat[left] = mat[right];
            mat[right] = temp;
            left++;
            right--;
        }
    }
}