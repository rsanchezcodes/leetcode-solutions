# 206.reverseLinkedList

# Problem: Reverse Linked List (https://leetcode.com/problems/reverse-linked-list/)
# Pattern: Linked List Reversal (iterative, prev/curr/next pointers)
# Complexity: O(n) time, O(1) space
# First attempt vs. final solution: Python port of the final Java solution, rewritten from memory as a consolidation
# exercise; no logic changes. The only Python-specific adaptation is advancing both pointers at once with a tuple
# assignment.

class Solution:
    def reverseList(self, head: ListNode | None) -> ListNode | None:
        curr = head
        prev = None
        while curr is not None:
            nxt = curr.next
            curr.next = prev
            prev, curr = curr, nxt
        return prev