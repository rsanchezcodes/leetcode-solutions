// 003.longestSubstringWithoutRepeatingCharacters

// Problem: Longest Substring Without Repeating Characters (https://leetcode.com/problems/longest-substring-without-repeating-characters/)
// Pattern: Sliding Window (variable size) with HashMap of last seen indices
// Complexity: O(n) time, O(min(n, k)) space (k = alphabet size)
// First attempt vs. final solution: The first attempt kept the window as a StringBuilder and trimmed it with
// indexOf/delete, which was correct but O(n·k) because every step scanned and shifted the window. The final
// version tracks the window with a left index and a HashMap of last seen positions, giving O(1) per step.
// An intermediate version had a bug: left = pos + 1 could move backwards on stale entries ("abba" returned 3);
// fixed with left = Integer.max(left, pos + 1).

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, best = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
        	char currentChar = s.charAt(i);
        	Integer pos = map.put(currentChar, i);
        	if (pos != null) {
        		left = Integer.max(left, pos + 1);
        	}
        	int newBest = i - left + 1;
        	if (newBest > best) {
        		best = newBest;
        	}
        }     
        return best;
    }
}