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
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode fastRef = head;
        ListNode slowRef = head;
        
        while(fastRef != null && fastRef.next != null){
            fastRef = fastRef.next.next;
            slowRef = slowRef.next;
        }
        
        return slowRef;
    }
}