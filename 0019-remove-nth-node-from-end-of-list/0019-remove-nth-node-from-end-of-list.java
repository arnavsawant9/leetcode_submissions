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
        ListNode temp = head;
        if(head == null || head.next == null) return null;
        int counter = 0;
        while(temp != null){
            counter++;
            temp = temp.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        prev.next = head;
        int target = counter - n;
        if(target == 0) return head.next;
        int index = 0;
        ListNode currPointer = head;
        while(currPointer != null && index < target){
            //prev = prev.next;
            prev = currPointer;
            currPointer = currPointer.next;
            index++;
        }
        prev.next = currPointer.next;
        return head;
    }
}