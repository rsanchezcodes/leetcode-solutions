# 03 · Stack & Queue

## What this pattern covers

Using stacks to solve nesting, matching, and "next element that satisfies X" problems, and queues to process by level or in arrival order.

## What to recognize in the problem statement

- Mentions **parentheses, brackets, or braces** that need to be validated or matched.
- Asks for the "next greater/smaller element" of each position (monotonic stack).
- Something needs to be **undone** in reverse order of recent operations (undo, expression evaluation).
- Asks to process something **level by level** (this usually connects to BFS in trees/graphs, folder 05) — there the queue is the underlying structure.

## Extended notes

<!-- Link to the corresponding note in Obsidian/Zettelkasten, if any -->

## Solved problems

| # LeetCode | Name | Language | Time complexity | Space complexity | Notes |
|---|---|---|---|---|---|
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Java | O(n) | O(n) | Stack of expected closing brackets (map opening → closing), early return on mismatch and empty-stack guard before peek() |
