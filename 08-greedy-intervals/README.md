# 08 · Greedy & Intervals

## What this pattern covers

Making the locally optimal decision at each step without reconsidering it later, trusting that this sequence of decisions leads to the global optimum (requires justifying why the greedy choice is correct, not just applying it by intuition). Interval problems almost always start by sorting by start or end.

## What to recognize in the problem statement

- Talks about **intervals** (meetings, time ranges) that need to be **merged, checked for overlap, or scheduled** without conflicts.
- The obvious strategy is "sort first by some criterion and then do a single pass" — if that's enough, it's a strong greedy signal.
- Asks for the **minimum/maximum** number of resources (rooms, arrows, platforms) needed to cover all intervals.
- Before trusting a greedy solution, you should be able to argue the **exchange argument** (why swapping the greedy choice for another never improves the result) — if that's unclear, it might actually be a DP problem instead (folder 07).

## Extended notes

<!-- Link to the corresponding note in Obsidian/Zettelkasten, if any -->

## Solved problems

| # LeetCode | Name | Language | Time complexity | Space complexity | Notes |
|---|---|---|---|---|---|
| | | | | | |
