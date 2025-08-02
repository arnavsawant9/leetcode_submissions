import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int i = 0;
        int j = 0;
        int maxIndex = Integer.MIN_VALUE;
        HashMap<Character, Integer> hm = new HashMap<>();
        while(j < s.length()){
            char ch = s.charAt(j);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            } else {
                hm.put(ch,1);
            }

            if(hm.size() == (j-i+1)){
                maxIndex = Math.max(maxIndex, j-i+1);
            } else if(hm.size() < j-i+1){
                while(hm.size() < j-i+1){
                    hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
                    if(hm.get(s.charAt(i)) == 0){
                        hm.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            j++;
        }
        return maxIndex;
    }
}