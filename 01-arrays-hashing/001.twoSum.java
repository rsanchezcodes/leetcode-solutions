// 001-two-sum.java

// Problem: Two Sum (https://leetcode.com/problems/two-sum/)
// Pattern: Arrays & Hashing
// Complexity: O(n) time, O(n) space
// First attempt vs. final solution: started with brute force O(n²) and ended with hash maps, checking before building it. 
// Extra: Time complexity of map.containsKey() is O(1) due to keys are stored in a HashSet, making the finding O(1) since there is no need to traverse the whole set when we can only check if the bucket associated to the key's hashcode is empty or not. That is why when nested inside a for loop, time complexity does not become O(n^2)

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public int[] twoSum(int[] nums, int target) {
		/*
		 * BRUTE FORCE
        boolean found = false;
        int i = 0;
        while (i < nums.length && !found) {
            int j = i + 1;
            while (j < nums.length && !found){
            	System.out.println("i: " + i + ", j: " + j);
                if (nums[i] + nums[j] == target){
                    indexes[0] = i;
                    indexes[1] = j;
                    found = true;
                }
               j++; 
            }
            i++;
        }
		 */
		int[] indexes = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(target - nums[i])) {
				map.put(nums[i], i);
			} else {
				indexes[0] = i;
				indexes[1] = map.get(target - nums[i]);
				return indexes;
			}
		}
		return indexes;
    }
}