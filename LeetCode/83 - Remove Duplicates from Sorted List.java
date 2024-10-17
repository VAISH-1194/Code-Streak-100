Question

https://leetcode.com/problems/remove-duplicates-from-sorted-list/

Answer

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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)   return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != null && fast != null) {
        
            while(fast != null && fast.val == slow.val) {
                fast = fast.next;
            }
            slow.next = fast; 
            slow = slow.next;
            if(fast != null) fast = fast.next; 
        }

        return head;
    }
}