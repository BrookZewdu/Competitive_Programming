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
    public int linkedListSize(ListNode head){
        ListNode temp = head;
        if(temp == null){
            return 0;
        }else{
            return 1 + linkedListSize(temp.next);
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        
        ListNode temp = head;
        int counter = 1;
        int bound = linkedListSize(head) - n;
        
        while(counter < bound){
            temp = temp.next;
            counter++;
        }
        if(bound == 0) head = head.next; else  temp.next = temp.next.next ;
       
       
        return head;
    }
}