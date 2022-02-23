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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(69);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < lists.length; i++){
            while(lists[i] != null){
                pq.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        ListNode temp = dummy;
        int n = pq.size();
        for(int i = 0; i < n; i++){
            dummy.next = new ListNode((int)pq.poll());
            dummy = dummy.next;
        }
        return temp.next;
    }
}
 // array called lists - contains sorted linkedlists
        //need to return the head of a list that contains the merged lists in sorted order
        /*
            ideas:
                heap ?
            
        */