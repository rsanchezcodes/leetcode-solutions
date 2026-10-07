# 876.middleOfTheLinkedList

# Problem: Middle of the Linked List (https://leetcode.com/problems/middle-of-the-linked-list/)
# Pattern: Fast & Slow Pointers (two pointers moving at different speeds)
# Complexity: O(n) time, O(1) space
# First attempt vs. final solution: Direct port of the final Java solution (Python practice run); no logic change.
# The only adaptation was syntax: `&&` became `and`, `null` became `None`, and the loop condition needs no parentheses.

class Solution:
    def middleNode(self, head: ListNode | None) -> ListNode | None:
        fast = head
        slow = head

        while fast is not None and fast.next is not None:
            slow, fast = slow.next, fast.next.next

        return slow