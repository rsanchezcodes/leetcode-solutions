# 347.topKFrequentElements

# Problem: Top K Frequent Elements (https://leetcode.com/problems/top-k-frequent-elements/)
# Pattern: Arrays & Hashing (frequency count + bucket sort indexed by frequency)
# Complexity: O(n) time, O(n) space
# First attempt vs. final solution: The first attempt counted frequencies with a dictionary and sorted the
# (number, frequency) pairs, which is O(n log n). The bucket sort version uses a list indexed by frequency, where
# each bucket holds the numbers with that frequency, scanned from the highest frequency down until k numbers are
# collected. An early version moved each number between buckets while counting, using list.remove(), which is
# linear and made it O(n^2) in the worst case, so the buckets are now built after counting. Building them with n
# buckets was correct but slower than sorting, because it allocated and scanned many empty buckets. The final
# version sizes the buckets by the actual maximum frequency. The nested loops are still O(n), since all the buckets
# together hold only the distinct numbers.

class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        bucketList = []
        d = {}
        maxFreq = 1


        for num in nums:
            freq = d.get(num, 0) + 1
            if freq > maxFreq:
                maxFreq = freq
            d[num] = freq

        for _ in range(maxFreq):
            bucketList.append([])

        for key, value in d.items():
            bucketList[value - 1].append(key)

        toReturn = []

        for i in range(len(bucketList) -1, -1, -1):
            bucket = bucketList[i]
            for num in bucket:
                toReturn.append(num)
                if len(toReturn) == k:
                    return toReturn

        return toReturn

