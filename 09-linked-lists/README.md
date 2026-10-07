# 09 · Linked Lists

## What this pattern covers

Manipulating a sequence of nodes connected via `next` references instead of an array with random access — traversing, reversing, merging, or building new chains while keeping track of state (a `prev` pointer, a carry, a runner pointer) as you move forward one node at a time.

## What to recognize in the problem statement

- The input is described as a chain of nodes (`ListNode`, `Node`), not an array — no direct indexing, only sequential traversal via `.next`.
- The problem talks about reversing, merging, removing a node, detecting a cycle, or reordering a sequence without indices.
- You're asked to build a **new** list while consuming one or more existing ones (e.g. merging two sorted lists, adding numbers represented as lists).
- Constant extra space is often expected/possible — a strong hint that pointer manipulation (not converting to an array) is the intended approach.
- Typical keywords: "reverse the list", "merge two sorted lists", "remove the nth node", "detect a cycle", "add two numbers represented as linked lists".

## Extended notes

<!-- Link to the corresponding note in Obsidian/Zettelkasten, if any -->

## Solved problems

| # LeetCode | Name | Language | Time complexity | Space complexity | Notes |
|---|---|---|---|---|---|
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Java | O(max(n, m)) | O(max(n, m)) | Simulation / Carry Propagation |
| 19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Java | O(Size) | O(1), only references are used | First measured the list in a first pass and then walked size - n nodes, lacked dummy head, so removing the head needed a fragile special case; optimized with a dummy head so the node before the target always exists, and a fast pointer advanced n steps ahead of a slow one, finding the node to delete in a single pass |
| 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Java | O(m + k) | O(1) | First overwrote newList.next on every iteration without advancing the tail pointer, picked the larger node instead of the smaller one, and returned the dummy node itself; optimized with a single dummy head with a moving tail, and attaches the remaining list in one assignment once either list runs out |
| 876 | [Middle Of The Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | Java, Python | O(n) | O(1) | First used a counter with a parity check and an offset start; optimized with fast and slow pointers starting at head, so slow ends at the middle when fast reaches the end |
