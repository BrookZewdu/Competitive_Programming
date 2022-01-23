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


/*
    stk 1 ->   7     5
    ans   -> 7 0 5 5 0
    
*/
class Solution {
    // public int linkedListSize(ListNode head){
    //     ListNode temp = head;
    //     if(temp.next == null){
    //         return 1;
    //     }else{
    //         return 1 + linkedListSize(temp.next);
    //     }
    // }
    
    public int[] nextLargerNodes(ListNode head) {
        
        if(head.next == null) return new int[1];
        List<Integer> lst = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            lst.add(temp.val);
            temp = temp.next;
        }
        int size = lst.size();
        int[] ans = new int[size];
        for(int i = 0; i < size; i++){
            
            while(!stk.isEmpty() && lst.get(i) > lst.get(stk.peek())){
                ans[stk.pop()] = lst.get(i);
            }
            
            stk.push(i);
        }
        
        
        return ans;
    }
}
        
        // THIS ONE FAILS IN CASE OF IDENTICAL NUMBERS AND IF THERE ISA GREATER ELEMENT THAN THE NEXT GREATER ELEMENT
//         Stack<Integer> stk = new Stack<>();
//         int[] ans = new int[linkedListSize(head)];
//         Map<Integer, Integer> map = new HashMap<>();
//         ListNode temp = head;
        
       
        
//         stk.push(temp.val);
//         temp = temp.next;
//         while(temp != null){
//             // ListNode curr = temp;
           
//             while(!stk.isEmpty() && temp.val > stk.peek()){
//                 map.put(stk.pop(),temp.val);
//             }
//             stk.push(temp.val);
//             temp = temp.next;
//         }
//         ListNode curr = head;
//         int i = 0;
//         while(curr != null){
//             ans[i] = (map.containsKey(curr.val) ? map.get(curr.val) : 0);
//             i++;
//             curr = curr.next;
//         }
        
//         return ans;
//     }        
// }
        
        
        
        
//          BRUTE FORCE BUT PASSES. AWEFULLY SLOW
//         int[] ans = new int[linkedListSize(head)];
//         // System.out.println(linkedListSize(head));
//         ListNode temp = head;
//         int i = 0;
//         while(temp != null){
//             ListNode curr = temp;
//             while(curr.next != null && curr.next.val <= temp.val){
//                 curr = curr.next;
//             }
//             ans[i] = (curr.next == null) ? 0 : curr.next.val;
//             i++;
//             temp = temp.next;  
//         }
        
//         return ans;
//     }
// }