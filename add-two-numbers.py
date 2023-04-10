# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        carry = 0
        dummy = ListNode(69)
        first, second = l1, l2
        curr = dummy
        while first or second:
            first_val = first.val if first else 0
            second_val = second.val if second else 0

            res = (first_val + second_val + carry) % 10
            carry = (first_val + second_val + carry) // 10
            
            curr.next = ListNode(res)
            curr = curr.next

            if first: first = first.next
            if second: second = second.next
            
        if carry: curr.next = ListNode(carry)
        return dummy.next