class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        int len = str.length();
        for(int i=1; i<strs.length; i++){
            String compare = strs[i];
            while(len > compare.length() || !str.equals(compare.substring(0, len))){
                len--;
                if(len == 0) return "";
                str = str.substring(0, len);
            }
        }
        return str;
    }
}