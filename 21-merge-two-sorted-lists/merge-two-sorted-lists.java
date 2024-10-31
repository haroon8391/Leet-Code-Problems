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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        
        ListNode newNode  = new ListNode(0);
        ListNode curr = newNode;
        
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                curr.next = head1;
                head1 = head1.next;
            }
            else{
                curr.next = head2;
                head2 = head2.next;
            }
            
            curr = curr.next;
        }
        
        if(head1 == null) curr.next = head2;
        if(head2 == null) curr.next = head1;
        
        return newNode.next;
    }
}