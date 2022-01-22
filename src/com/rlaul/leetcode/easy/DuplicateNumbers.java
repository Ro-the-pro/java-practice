package com.rlaul.leetcode.easy;

import java.util.Arrays;

import org.junit.Test;

public class DuplicateNumbers {
	
	public boolean containsDuplicate(int[] nums) {
	    Arrays.sort(nums);
	    for (int i = 0; i < nums.length - 1; ++i) {
	        if (nums[i] == nums[i + 1]) return true;
	    }
	    return false;
	}
	
	@Test
	public void  testContainsDuplicate() {
		
	}
}
