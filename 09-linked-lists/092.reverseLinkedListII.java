// 092.reverseLinkedListII

// Problem: Reverse Linked List II (https://leetcode.com/problems/reverse-linked-list-ii/)
// Pattern: Linked List Reversal (dummy head + in-place reversal of a sublist)
// Complexity: O(n) time, O(1) space
// First attempt vs. final solution: The first attempt was a single pass with a position counter and two extra
// references (the node before the segment and the first node of the segment), reconnecting both ends when the
// counter reached right. It threw a NullPointerException when left was 1, because there was no node before the
// segment, and returning head would have been wrong in that case as well. A dummy head fixed both problems. The
// final version splits the work in two phases: it walks to the node before the segment, reverses exactly
// right - left + 1 nodes with the prev/curr/next scheme, and then reconnects the ends using beforeLeft.next, which
// still points to the original left node, as the new tail.

public class Solution {
	public ListNode reverseBetween(ListNode head, int left, int right) {

	    ListNode dummy = new ListNode();
	    dummy.next = head;
	    ListNode beforeLeft = dummy;

	    for (int i = 0; i < left - 1; i++) {
	        beforeLeft = beforeLeft.next;
	    }

	    ListNode curr = beforeLeft.next;
	    ListNode prev = beforeLeft;

	    for (int i = 0; i < right - left + 1; i++) {
	        ListNode next = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = next;
	    }

	    beforeLeft.next.next = curr;
	    beforeLeft.next = prev;

	    return dummy.next;
	}
}