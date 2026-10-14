# 2778.sumOfSquaresOfSpecialElements

# Problem: Sum of Squares of Special Elements (https://leetcode.com/problems/sum-of-squares-of-special-elements/)
# Pattern: Arrays & Hashing (array traversal with a divisibility check)
# Complexity: O(n) time, O(1) space
# First attempt vs. final solution: Solved directly with a single pass.

class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        total = 0
        n = len(nums)
        for i in range (1, n + 1):
            if n % i == 0:
                total += nums[i - 1]**2
        return total