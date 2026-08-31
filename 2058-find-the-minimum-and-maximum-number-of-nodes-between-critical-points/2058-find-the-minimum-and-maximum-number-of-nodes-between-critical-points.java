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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null) return new int[]{-1,-1};;
        
        ListNode curr = head.next;
        ListNode prev = head;
        int idx = 1;
        int firstidx = 0;
        int previdx = 0;
        int mindis = Integer.MAX_VALUE;
        
        while (curr.next != null){
            if(curr.val > prev.val && curr.val > curr.next.val || curr.val < prev.val && curr.val < curr.next.val){
                if(previdx == 0) {
                    previdx = idx;
                    firstidx = idx;
                } else {
                    mindis = Math.min(mindis, idx - previdx);
                    previdx = idx;
                }
            }              
            idx++;
            prev = curr;
            curr = curr.next;        
        }
        if(mindis != Integer.MAX_VALUE){
            int maxdis = previdx - firstidx;
            return new int[]{mindis, maxdis};
        } 
        return new int[]{-1,-1};
    }
}