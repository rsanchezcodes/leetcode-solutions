// 019.removeNthNodeFromEndOfList

// Problem: Remove Nth Node From End of List (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
// Pattern: Linked List Traversal (dummy head + fast/slow pointers with fixed gap)
// Complexity: O(L) time, O(1) space
// First attempt vs. final solution: The first attempt measured the list in a first pass and then walked size - n
// nodes, but the counter started at 1 (off-by-one), so the pointer overshot the target, and removing the head
// needed a fragile special case. The final version uses a dummy head so the node before the target always exists,
// and a fast pointer advanced n steps ahead of a slow one, finding the node to delete in a single pass.

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
	}
}