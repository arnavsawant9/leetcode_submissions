/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        };

        int[] ans = new int[list.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i = list.size()-1 ; i>=0 ; i--){
            int ele = list.get(i);
            while(!stack.isEmpty() && stack.peek() <= ele) stack.pop();
            if(stack.isEmpty()) ans[i] = 0;
            else ans[i] = stack.peek();
            stack.push(ele);
        }

        return ans;
    }
}