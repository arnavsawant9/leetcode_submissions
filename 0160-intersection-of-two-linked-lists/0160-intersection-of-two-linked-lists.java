/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int len1 = 0;
        int len2 = 0;
        while(temp1 != null){
            len1++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            len2++;
            temp2 = temp2.next;
        }

        if(len2 > len1) return findIntersection(headA, headB, len2 - len1);
        else if(len1 > len2) return findIntersection(headB, headA, len1 - len2);
        return findIntersection(headA, headB, 0);
    }

    public ListNode findIntersection(ListNode headA, ListNode headB, int len){
        ListNode small = headA;
        ListNode large = headB;
        int count = 0;
        while(count < len){
            count++;
            large = large.next;
        }
        while(small != null && large != null){
            if(small == large) return small;
            small = small.next;
            large = large.next;
        }
        return null;
    }
}