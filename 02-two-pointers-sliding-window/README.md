# 02 · Two Pointers & Sliding Window

## What this pattern covers

Traversing a structure (array or string) with two coordinated indices, avoiding recomputation from scratch on every iteration. Two pointers usually converge from opposite ends; sliding window maintains a contiguous window that grows/shrinks.

## What to recognize in the problem statement

- Talks about a **contiguous subarray or substring** satisfying a condition (max sum, no repeated characters, minimum length).
- The input array/string is **sorted** and asks for pairs or triplets with a given sum — a clear candidate for two pointers from the ends.
- Asks to compare from the start and end at the same time (palindromes, reversing in-place).
- The brute force recomputes the entire window at each step — a signal that a sliding window can be maintained instead of recomputing.

## Extended notes

<!-- Link to the corresponding note in Obsidian/Zettelkasten, if any -->

## Solved problems

| # LeetCode | Name | Language | Time complexity | Space complexity | Notes |
|---|---|---|---|---|---|
| 3 | Longest Substring Without Repeating Characters | Java | O(n) | O(min(n, k)) | First kept the window as a StringBuilder and trimmed it with indexOf/delete, which was correct but O(n·k) since every step scanned and shifted the window; optimized with a left pointer and a HashMap of last seen indices, using Math.max(left, pos + 1) so left never moves backwards on stale entries (e.g. "abba"), achieving O(1) per step |
| 88 | Merge Sorted Array | Java | O(m+n) | O(1) | First merged into a new O(m+n) array with two pointers left-to-right; optimized to merge in-place into nums1 with two pointers right-to-left (comparing largest elements first), achieving O(1) extra space |
