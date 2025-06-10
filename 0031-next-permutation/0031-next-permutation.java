class Solution {
    public void nextPermutation(int[] nums) {
        // find the breaking point out here!
        int index = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        // now if the index is still -1 that is the permutation is at the max one so reverse it
        if(index == -1){
            reverseArray(nums,0,nums.length-1);
            return;
            //return nums;
        }

        // now suppose if the index is not -1 so we have a particular index
        for(int i = nums.length-1;i>index;i--){
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                //System.out.println("hello i am here");
                break;
            }
        }

        // the last part is to reverse the rest of the array from index+1 -> nums.length-1
        reverseArray(nums, index+1, nums.length-1);
        return; 
    }

    public void reverseArray(int[] nums, int sp, int ep){
        while(sp < ep){
            int temp = nums[sp];
            nums[sp] = nums[ep];
            nums[ep] = temp;
            sp++;
            ep--;
        }
    }
}