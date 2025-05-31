class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> dummyStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            if(stack.size() == 0){
                stack.push(s.charAt(i));
                i++;
            } else if(stack.size() > 0 && stack.peek() == s.charAt(i)){
                stack.pop();
                i++;
            } else {
                stack.push(s.charAt(i));
                i++;
            }
        }

        while(stack.size() > 0){
            dummyStack.push(stack.pop());
        }

        while(dummyStack.size() > 0){
            sb.append(dummyStack.pop());
        }

        return sb.toString();
    }
}