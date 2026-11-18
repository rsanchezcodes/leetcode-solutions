# 128.longestConsecutiveSequence

# Problem: Longest Consecutive Sequence (https://leetcode.com/problems/longest-consecutive-sequence/)
# Pattern: Arrays & Hashing (hash set + sequence start detection)
# Complexity: O(n) time (amortized), O(n) space
# First attempt vs. final solution: first attempt used counting-sort-style buckets sized by the
# value range (max - min + 1), O(n + R) time and space, which exceeded the memory limit with values
# up to 10^9. A second version dropped the buckets but still iterated over the whole range, O(R) time.
# Final version iterates over the set and only counts from streak starts (num - 1 not in set),
# walking forward with num + 1; each number is visited at most twice, giving O(n).

class Solution:
    def longestConsecutive(self, nums: list[int]) -> int:
        s = set(nums)

        maxLength = 0

        for num in s:
            if num - 1 not in s:
                currentLength = 1
                consecutiveNumber = num + 1
                while consecutiveNumber in s:
                    currentLength += 1
                    consecutiveNumber += 1

                if currentLength > maxLength:
                    maxLength = currentLength

        return maxLength