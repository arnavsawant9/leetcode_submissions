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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
        ListNode curr = head;
        int len = 1;
        if(head == null) return head;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        k = k % len;
        int pointer = len - k;
        if(pointer == 0) return head;
        tail.next = head;
        for(int i=1;i<pointer;i++){
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}