class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }

        // now we will pop the stack in the reverse order
        ListNode curr = head;
        while(stack.size() > 0){
            if(stack.peek() != curr.val) return false;
            stack.pop();
            curr = curr.next;
        }
        return true;
    }
}