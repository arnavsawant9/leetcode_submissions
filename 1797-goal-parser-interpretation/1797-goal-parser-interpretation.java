class Solution {
    public String interpret(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while(idx < s.length()){
            if(s.charAt(idx) == 'G'){
                sb.append(s.charAt(idx));
                idx++;
            }
            else{
                if(s.charAt(idx+1) == ')'){
                    sb.append("o");
                    idx = idx+2;
                } else {
                    sb.append("al");
                    idx = idx+4;
                }
            }
        }
        return sb.toString();
    }
}