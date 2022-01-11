package com.rlaul.leetcode.easy;

import java.util.HashMap;

/* 
 * https://leetcode.com/problems/two-sum/
 * Return the pair which adds up to the target value
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int complement = 0;
        HashMap<Integer, Integer> twoSumMap = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            int x = nums[i];
            complement = target - x;
            if (twoSumMap.containsKey(complement)){
            	twoSumMap.forEach( (k,v) -> System.out.println(k+":"+v));
				// index i , index of compliment. 
                return new int[]{i,twoSumMap.get(complement)};
            }
			// Put the value as key and the index as value in HashMap
            twoSumMap.put(x,i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
    	int nums[] = {2,2,7,11,15};
    	int target = 9;
    	int[] expected = {2,1};
    	TwoSum obj = new TwoSum();
    	int[] complementPairs = obj.twoSum(nums, target);
    	assert(complementPairs.equals(expected));
    }
}


