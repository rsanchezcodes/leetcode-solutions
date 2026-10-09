// 206.reverseLinkedList

// Problem: Reverse Linked List (https://leetcode.com/problems/reverse-linked-list/)
// Pattern: Linked List Reversal (iterative, prev/curr/next pointers)
// Complexity: O(n) time, O(1) space
// First attempt vs. final solution: The first attempt treated newHead = head as if it created a new node (it is only
// an alias) and overwrote head.next without saving the rest of the list first, so the remaining nodes were lost.
// The final version saves curr.next in a temporary variable, points curr.next to prev, and then advances prev and
// curr; prev starts at null and ends up as the new head.

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
