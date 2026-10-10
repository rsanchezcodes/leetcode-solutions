# 217.containsDuplicate

# Problem: Contains Duplicate (https://leetcode.com/problems/contains-duplicate/)
# Pattern: Arrays & Hashing (hash set for O(1) membership checks)
# Complexity: O(n) time, O(n) space
# First attempt vs. final solution: Solved directly with a hash set and an early return on the first repeated value.

class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        s = set()
        for n in nums:
            if n in s:
                return True
            s.add(n)
        return False