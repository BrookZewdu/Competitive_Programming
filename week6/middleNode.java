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
        //store in an array and length/2 is the index of the middle one. dang
//         List<ListNode> lst = new ArrayList<ListNode>();
//         while(head.next != null){
//             lst.add(head);
//             head = head.next;
//         }
//         lst.add(head);
         
//         return lst.get(lst.size()/2);
        
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}