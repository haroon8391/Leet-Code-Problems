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
        
        if(head == null || head.next == null) return head;
        
        ListNode prev = head;
        ListNode next = head;
        
        while(next.next != null){
            next = prev.next;
            if(prev.val == next.val){
                prev.next = next.next;
            }
            else{
                prev = next;
            }
        }
        
        return head;
    }
}