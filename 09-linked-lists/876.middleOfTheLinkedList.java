// 876.middleOfTheLinkedList

// Problem: Middle of the Linked List (https://leetcode.com/problems/middle-of-the-linked-list/)
// Pattern: Fast & Slow Pointers (two pointers moving at different speeds)
// Complexity: O(n) time, O(1) space
// First attempt vs. final solution: The first attempt was already a single pass, but it carried extra state: fast
// started one node ahead of slow, and a counter i with a parity check decided when slow could advance. The final
// version drops the counter and the offset: both pointers start at head, fast moves two nodes and slow one per
// iteration, and the loop runs while fast != null && fast.next != null, so slow lands on the second middle node
// for even-length lists.

public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
