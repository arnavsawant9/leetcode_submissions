class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            } else {
                if(stack.isEmpty()){
                    if(i+1 < s.length() && s.charAt(i+1) == ')'){
                        count++;
                        i++;
                    } else {
                        count += 2;
                    }
                } else {
                    if(i+1 < s.length() && s.charAt(i+1) == ')'){
                        stack.pop();
                        i++;
                    } else {
                        count++;
                        stack.pop();
                    }
                }
            }
        }
        return count + stack.size() * 2;
    }
}