import java.util.*;
class Solution {
    public int trap(int[] height) {
        int[] prefixMax = createPrefixMax(height);
        int[] suffixMax = createSuffixMax(height);
        int waterVolume = 0;
        for(int i=1;i<height.length-1;i++){
            int amount = Math.min(prefixMax[i-1], suffixMax[i+1]) - height[i];
            if(amount > 0){
                waterVolume += amount;
            }
        }
        return waterVolume;
    }

    public int[] createPrefixMax(int[] height){
        int max = Integer.MIN_VALUE;
        int[] prefixMax = new int[height.length];
        for(int i=0;i<height.length;i++){
            max = Math.max(max,height[i]);
            prefixMax[i] = max;
        }

        return prefixMax;
    }

    public int[] createSuffixMax(int[] height){
        int max = Integer.MIN_VALUE;
        int[] suffixMax = new int[height.length];
        for(int i=height.length-1;i>=0;i--){
            max = Math.max(max,height[i]);
            suffixMax[i] = max;
        }

        return suffixMax;
    }
}