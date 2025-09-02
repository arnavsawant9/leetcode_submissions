class Solution {
    public void rotate(int[] nums, int k) {
        int sp = 0;
        int ep = nums.length-1;
        k = k % nums.length;
        rotateArray(nums,sp,ep);
        rotateArray(nums,sp,k-1);
        rotateArray(nums,k,ep);
    }

    public void rotateArray(int[] nums, int sp, int ep){
        while(sp<ep){
            int temp = nums[sp];
            nums[sp] = nums[ep];
            nums[ep] = temp;
            sp++;
            ep--;
        }
    }
}