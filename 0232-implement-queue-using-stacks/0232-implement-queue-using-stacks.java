class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        if(!stack2.isEmpty()){
            while(stack2.size() > 0){
                stack1.push(stack2.pop());
            }
            stack1.push(x);
        }
        stack1.push(x);
    }

    public int pop() {
        while(stack1.size() > 0){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public int peek() {
        while(stack1.size() > 0){
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}