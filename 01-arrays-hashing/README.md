# 01 · Arrays & Hashing

## What this pattern covers

Using arrays and hash-based structures (`HashMap`, `HashSet`) to reduce lookups from O(n) to O(1), detect duplicates, count frequencies, or find complements without brute force O(n²).

## What to recognize in the problem statement

- Asked to find a pair, triplet, or subset that satisfies a sum or value condition (`two sum`, `three sum`).
- Asked to detect duplicates, unique elements, or the frequency of occurrence of something.
- Mentions "anagram", "frequency", "contains duplicate", or comparing the composition of two collections.
- The obvious brute force is O(n²) comparing every pair — a signal that a hashmap can bring it down to O(n).

## Extended notes

<!-- Link to the corresponding note in Obsidian/Zettelkasten, if any -->

## Solved problems

| # LeetCode | Name | Language | Time complexity | Space complexity | Notes |
|---|---|---|---|---|---|
| 1 | Two Sum | Java | O(n) | O(n) | Started with brute force O(n²), then used a HashMap (value → index) checking the complement before inserting |
| 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams) | Java | O(n^2 * k) | O(n * k) | Started with brute force O(n^2 * k), then used a canonical string representation of characters' frequencies in order to hash the different anagrams | 
| 217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Python | O(n) | O(n) | Hash set with early exit on the first repeated value. Brute force would be O(n^2) time and sorting O(n log n) time |
| 242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Java | O(n + m) | O(1) | Frequency array int[26] with early exit on negative count |
| 2778 | [Sum of Squares of Special Elements](https://leetcode.com/problems/sum-of-squares-of-special-elements/) | Python | O(n) | O(1) | Single pass checking n % i for each 1-based index |