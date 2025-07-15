class Solution {
    public String reverseWords(String s) {
       Stack<String> stack = new Stack<>();
       String str = "";
       for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                if(!str.equals("")){
                    stack.push(str);
                str = "";
                }
            } else {
                str += s.charAt(i);
            }
       }

       if (!str.equals("")) {
            stack.push(str);
        }

       // now add that to another string!!
       String answer = "";
       while(stack.size() > 0){
            answer += stack.peek() + " ";
            stack.pop();
       }
       return answer.trim();
    }
}