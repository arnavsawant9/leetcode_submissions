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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }

        // now go till stack length is not zero
        ListNode traverse = head;
        while(stack.size() > 0){
            traverse.val = stack.pop();
            traverse = traverse.next;
        }
        return head;
    }
}