// 002.addTwoNumbers

// Problem: Add Two Numbers (https://leetcode.com/problems/add-two-numbers/)
// Pattern: Simulation / Carry Propagation (Linked List Traversal)
// Complexity: O(max(n, m)) time, O(max(n, m)) space
// First attempt vs. final solution: first attempt duplicated the carry/sum
// logic across three separate if/else branches (both nodes present, only
// l1, only l2). Final version merges them into a single flow by seeding
// sum with carry and conditionally adding each node's value if it exists,
// plus replacing the boolean carry check with sum / 10 for a cleaner,
// more general carry calculation

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        ListNode l = new ListNode(sum % 10);
        ListNode next1 = l1.next, next2 = l2.next, nextL = l.next, prev = l;
        int carry = (sum >= 10) ? 1 : 0;
        while (next1 != null || next2 != null){
            sum = carry;
            if (next1 != null){
                sum += next1.val;
                next1 = next1.next;
            }
            if (next2 != null){
                sum += next2.val;
                next2 = next2.next;
            }
            nextL = new ListNode(sum % 10);
            carry = sum / 10;
            prev.next = nextL;
            prev = nextL;
        }
        if (carry == 1){
            prev.next = new ListNode(1);
        }
        return l;
    }
}