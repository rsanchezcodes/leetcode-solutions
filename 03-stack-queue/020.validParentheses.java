// 020.validParentheses

// Problem: Valid Parentheses (https://leetcode.com/problems/valid-parentheses/)
// Pattern: Stack (matching brackets, LIFO)
// Complexity: O(n) time, O(n) space
// First attempt vs. final solution: First attempt was already correct but used a boolean flag in the while condition and a helper with three hardcoded bracket comparisons.
// Final version maps each opening bracket to its closing one and pushes the expected closing bracket, so a closing bracket only has to match the top, returning false as soon as one does not match.
// While refactoring, the empty-stack guard was lost (unboxing a null peek() threw an NPE) and switching c to Character made == compare references; fixed with an isEmpty() check first and a char value comparison.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class Solution {

	public boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}

		Deque<Character> stack = new ArrayDeque<>();
		Map<Character, Character> pairs = Map.of('(', ')', '[', ']', '{', '}');

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (pairs.containsKey(c)) {
				stack.push(pairs.get(c));
			} else {
				if (!stack.isEmpty() && stack.peek() == c) {
					stack.pop();
				} else {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
