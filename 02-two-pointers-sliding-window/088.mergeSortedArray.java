// 088.mergeSortedArray

// Problem: Merge Sorted Array (https://leetcode.com/problems/merge-sorted-array/)
// Pattern: Two Pointers & Sliding Window
// Complexity: O(m+n) time, O(1) space
// First attempt vs. final solution: first merged into a new O(m+n) array with two 
// pointers left-to-right; optimized to merge in-place into nums1 with two pointers 
// right-to-left (comparing largest elements first), achieving O(1) extra space

public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) {
        	int i = m - 1, j = n - 1, k = m + n - 1;
        	while (k >= 0) {	
        		if (j < 0 || (i >= 0 && nums1[i] > nums2[j])) {
        		    nums1[k] = nums1[i];
        		    i--;
        		} else {
        		    nums1[k] = nums2[j];
        		    j--;
        		}
        		k--;
        	}
        	
        }
    }
}