class CustomStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> dummyStack = new Stack<>();
    private int maxSize = 0;

    public CustomStack(int maxSize) {
        stack = new Stack<>();
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(stack.size() < maxSize){
            stack.push(x);
        }
    }
    
    public int pop() {
        if(stack.size() > 0) return stack.pop();
        return -1;
    }
    
    public void increment(int k, int val) {
        int ptr = k;
        while(stack.size() > 0){
            dummyStack.push(stack.pop());
        }

        while(dummyStack.size() > 0){
            if(ptr > 0){
               stack.push(dummyStack.pop()+val); 
               ptr--;
            } else {
                stack.push(dummyStack.pop());
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */