// 049.groupAnagrams

// Problem: Group Anagrams (https://leetcode.com/problems/group-anagrams)
// Pattern: Arrays & Hashing (Hashing using character count)
// Complexity: O(n*k) time, O(n*k) space
// First attempt vs. final solution: First attempt used a HashMap where keys were the first instance of each anagram. Reusing the logic from LeetCode 242 (Valid Anagram)
// each String from the list was compared with every existing key in order to find to which list it belonged to, resulting in a poor O(n^2*k) time complexity.
// An intermediate version tried using primitive arrays (e.g., int[]) as map keys instead of string.
// This resulted in a bug since primitive arrays inherit directly from Object, thereby lacking deep-equals implementation and comparing strictly by reference.
// Final version uses a HashMap where the keys are a canonical string representation of character frequencies.
// This allows O(1) lookups instead of iterating over the keySet, achieving optimal performance, O(n*k) time complexity.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	
	private String frequencies(String str) {
		int[] freqs = new int[26];
		for (int i = 0; i < str.length(); i++) {
        	char c = str.charAt(i);
        	freqs[c - 'a']++;
        }
		return Arrays.toString(freqs);
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
        	String freqs = frequencies(str);
        	map.computeIfAbsent(freqs, k -> new ArrayList<>()).add(str);
        }
        
        
        return new ArrayList<>(map.values());
        
    }
	
}