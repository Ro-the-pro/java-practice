package com.rlaul.leetcode.easy;

import java.util.HashMap;

/* 
 * https://leetcode.com/problems/two-sum/
 * Return the pair which adds up to the target value
 */

public class TwoSumBad {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length ==0 ){
            return null;
        }
        
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                int first = nums[i];
                if(nums[j] == target - first){
                    return new int[] {i,j};
                }
            }
        }
        return null;
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


