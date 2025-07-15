class Solution {
    public String removeOuterParentheses(String s) {
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char str = s.charAt(i);
            if(str == ')') cnt--;

            if(cnt != 0) sb.append(str);

            if(str == '(') cnt++;
        }
        return sb.toString();
    }
}