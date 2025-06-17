class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = m - 1;
        int idx2 = n - 1;
        int zeroIndex = m + n - 1;

        while (idx2 >= 0) {
            if (idx1 >= 0 && nums1[idx1] > nums2[idx2]) {
                nums1[zeroIndex] = nums1[idx1];
                idx1--;
            } else {
                nums1[zeroIndex] = nums2[idx2];
                idx2--;
            }
            zeroIndex--;
        }
    }
}