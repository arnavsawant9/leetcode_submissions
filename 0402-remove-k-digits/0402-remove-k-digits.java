class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack  = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!stack.isEmpty() && k > 0 && (stack.peek() - '0') > (num.charAt(i) - '0')){
                stack.pop();
                k = k - 1;
            }
            stack.push(num.charAt(i));
        }
        while(k > 0){
            stack.pop();
            k--;
        }
        if(stack.size() == 0) return "0";
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String res = sb.reverse().toString().replaceFirst("^0+", "");
        if(res.isEmpty()) return "0";
        return res;
    }
}