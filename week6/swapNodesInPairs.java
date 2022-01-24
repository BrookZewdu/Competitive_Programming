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
    public ListNode swapPairs(ListNode head) {
        ListNode prev = new ListNode(69);
        prev.next = head;
        ListNode curr = prev;
        
        while(curr.next != null && curr.next.next != null){
            ListNode slow = curr.next;
            ListNode fast = curr.next.next;
            
            slow.next = fast.next;
            fast.next = slow;
            curr.next = fast;
            
            curr = curr.next.next;
        }
        return prev.next;
    }
}