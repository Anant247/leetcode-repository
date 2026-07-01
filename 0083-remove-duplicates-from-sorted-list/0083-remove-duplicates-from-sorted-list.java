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
       if(head == null || head.next == null) {
           return head;
       }
       ListNode current = head;
       ListNode forward = head.next;
        while (forward != null){
            if(current.val == forward.val){
                forward = forward.next;
            } else {
                current.next = forward;
                current = forward;
                forward = forward.next;
            }  
        }
        current.next = forward;
        return head;
    }
}