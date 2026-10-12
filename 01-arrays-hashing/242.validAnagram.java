// 242.validAnagram

// Problem: Valid Anagram (https://leetcode.com/problems/valid-anagram/)
// Pattern: Arrays & Hashing (frequency counting with a fixed-size array)
// Complexity: O(n) time, O(1) space
// First attempt vs. final solution: First attempt used a single HashMap over both strings and checked that every frequency was even; parity is necessary but not sufficient (fails on "aaaabb" vs "aabbbb"). 
// Final version counts s with +1 and t with -1 in an int[26], with an early length check and an early exit when a count goes negative, which makes a final zero-check unnecessary.

public class Solution {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		int[] freqs = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
        	Character c = s.charAt(i);
        	freqs[c - 'a']++;
        }
		
		for (int j = 0; j < t.length(); j++) {
        	Character c = t.charAt(j);
			freqs[c - 'a']--;
			if (freqs[c - 'a'] < 0) {
				return false;
			}
		}
		
		return true;
    }
}