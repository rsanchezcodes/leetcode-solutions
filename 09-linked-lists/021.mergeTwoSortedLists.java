// 021.mergeTwoSortedLists

// Problem: Merge Two Sorted Lists (https://leetcode.com/problems/merge-two-sorted-lists/)
// Pattern: Linked List Traversal (dummy head + tail pointer, two-pointer merge)
// Complexity: O(n + m) time, O(1) space
// First attempt vs. final solution: The first attempt overwrote newList.next on every iteration without advancing
// the tail pointer, picked the larger node instead of the smaller one, and returned the dummy node itself.
// A later fix introduced a second dummy node that added an extra leading 0 to the output. The final version uses a
// single dummy head with a moving tail, and attaches the remaining list in one assignment once either list runs out.

public class Solution {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode(); // dummy
        ListNode outputList = newList; // tail
        ListNode pt1 = list1, pt2 = list2;
        while (pt1 != null && pt2 != null) {
        	if (pt1.val > pt2.val) {
        		newList.next = pt2;
            	pt2 = pt2.next;
        	} else {
        		newList.next = pt1;
            	pt1 = pt1.next;
        	}
        	newList = newList.next;
        }
        newList.next = (pt1 == null) ? pt2 : pt1;
        return outputList.next;
    }
}