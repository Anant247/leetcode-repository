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
        if(head == null){
            return null;
        }

        ListNode end = head;
        ListNode target = head;
        for(int i = 0; i < n; i++){
            end = end.next;
        }
        if(end == null){
            return head.next;
        }
        while(end.next != null){
            end = end.next;
            target = target.next;
        }
        target.next = target.next.next;

        return head;
    }
}