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
        if(head == null || head.next == null || k==0){
            return head;
        }
        int length = 1;
        ListNode end = head;
        
        while(end.next != null){
            end = end.next;
            length++;
        }
        k = k%length;
        if(k==0){
            return head;
        }
        end.next = head;
        ListNode temp = head;
        for(int i = 1; i < (length - k); i++){
            temp = temp.next;
        }
        
        head = temp.next;
        temp.next = null;
        return head;
    }
}