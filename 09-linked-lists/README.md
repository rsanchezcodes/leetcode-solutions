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
| 002 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Java | O(max(n, m)) | O(max(n, m)) | Simulation / Carry Propagation |
