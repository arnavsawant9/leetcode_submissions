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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        int len = 0;
        ListNode dummy = head;
        // checking the length of the list
        while(dummy != null){
            len++;
            dummy = dummy.next;
        }
        //n = n % len;
        int cnt = len - n;
        if(cnt == 0) return head.next;


        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode curr = head;

        int index = 0;
        while(index < cnt){
            prev = curr;
            curr = curr.next;
            index++;
        }
        prev.next = curr.next;
        return head;
    }
}