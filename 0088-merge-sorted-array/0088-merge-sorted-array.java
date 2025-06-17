class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = n+m-1;
        int right = 0;
        while(left >= 0 && right < n){
            // int temp = nums1[left];
            nums1[left] = nums2[right];
            // nums2[right] = temp;
            left--;
            right++;
        }

        Arrays.sort(nums1);
    }
}