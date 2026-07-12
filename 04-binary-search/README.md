# 04 · Binary Search

## What this pattern covers

Halving the search space on every iteration, not just over literal sorted arrays, but over any "answer space" where you can check whether a candidate value satisfies a monotonic condition (binary search on the answer).

## What to recognize in the problem statement

- The input array is **sorted** (or can be sorted without losing the answer).
- Asks to **minimize or maximize** a value subject to a condition ("minimum speed such that...", "maximum such that...") — even without an explicit sorted array, this is a binary-search-on-the-answer candidate.
- The brute force is O(n) or worse scanning the whole range, and there's a monotonic condition (if X works, everything greater/smaller than X also works) that allows discarding halves.
- Asks to find an element, the first/last one satisfying something, or the "rotation" point in a rotated array.

## Extended notes

<!-- Link to the corresponding note in Obsidian/Zettelkasten, if any -->

## Solved problems

| # LeetCode | Name | Language | Time complexity | Space complexity | Notes |
|---|---|---|---|---|---|
| | | | | | |
