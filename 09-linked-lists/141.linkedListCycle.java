// 141.linkedListCycle

// Problem: Linked List Cycle (https://leetcode.com/problems/linked-list-cycle/)
// Pattern: Fast & Slow Pointers (cycle detection, comparing node references)
// Complexity: O(n) time, O(1) space
// First attempt vs. final solution: The first version used a boolean flag (isCycle) as a third loop condition.
// The final version drops the flag and returns true as soon as slow and fast meet; if the loop ends because fast
// reaches the end of the list, it returns false.

public class Solution {
	public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        boolean isCycle = false;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }

        return false;
    }
}
