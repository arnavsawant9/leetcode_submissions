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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode list1 = l1;
        ListNode list2 = l2;
        int carry = 0;
        int sum = 0;
        while(list1 != null || list2 != null){
            sum = carry;
            if(list1 != null) sum += list1.val;
            if(list2 != null) sum += list2.val;
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;
            if(list1 != null) list1 = list1.next;
            if(list2 != null) list2 = list2.next;
        }

        if(carry == 1){
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
        }
        return dummy.next;
    }
}