# LeetCode Solutions

Solutions organized by problem-solving pattern rather than chronological order. The goal is for each folder to teach a reusable technique instead of just accumulating standalone exercises.

**Languages:** Java, Python

## Progress by pattern

| # | Pattern | Problems solved | Notes |
|---|---------|:---:|-------|
| 01 | [Arrays & Hashing](./01-arrays-hashing) | 1 | |
| 02 | [Two Pointers & Sliding Window](./02-two-pointers-sliding-window) | 1 | |
| 03 | [Stack & Queue](./03-stack-queue) | 0 | |
| 04 | [Binary Search](./04-binary-search) | 0 | |
| 05 | [Trees & Graphs](./05-trees-graphs) | 0 | |
| 06 | [Backtracking](./06-backtracking) | 0 | |
| 07 | [Dynamic Programming](./07-dynamic-programming) | 0 | |
| 08 | [Greedy & Intervals](./08-greedy-intervals) | 0 | |

## Naming convention

Each file follows the format `NNN.problemName.<ext>`, where `NNN` is the problem's LeetCode number and `<ext>` is `.java` or `.py` (e.g. `001.problemName.<ext>`). If a problem is solved in more than one language, both files live in the same pattern folder.

## Structure of each folder README

Each pattern folder has its own `README.md` including:
- What to recognize in a problem statement to identify that this pattern applies
- Link to extended notes (if any)
- List of solved problems with language and time/space complexity

## Per-problem record (inside each solution file)

Each solution file includes a header comment:

Java:
```java
// Problem: [name + link]
// Pattern: [pattern applied]
// Complexity: O(?) time, O(?) space
// First attempt vs. final solution: [what went wrong initially, if applicable]
```

Python:
```python
# Problem: [name + link]
# Pattern: [pattern applied]
# Complexity: O(?) time, O(?) space
# First attempt vs. final solution: [what went wrong initially, if applicable]
```
