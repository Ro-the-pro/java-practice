package com.rlaul.leetcode.easy;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DuplicateNumbers {
	
	public boolean containDuplicates(int[] nums) {
	    Arrays.sort(nums);
	    for (int i = 0; i < nums.length - 1; ++i) {
	        if (nums[i] == nums[i + 1]) return true;
	    }
	    return false;
	}
	
	public int[] removeDuplicates(int[] nums) {
		Arrays.sort(nums);
		ArrayList<Integer> nodupeslist = new ArrayList<Integer>();
		
		for (int i=0;i<nums.length-1;i++) {
			if(nums[i]!=nums[i+1]) {
				nodupeslist.add(nums[i]);
			}
		}
		//int[] outputArray = nodupeslist.stream().mapToInt(i -> i).toArray();
		int[] outputArray = nodupeslist.stream().mapToInt(Integer::intValue).toArray();
		return outputArray;
	}
	
	@Test
	public void  testContainDuplicates() {
		int[] input = {1,3, 7,9,11,11,9,7,3,3,1};
		boolean hasDuplicates = containDuplicates(input);
        
		assertTrue(hasDuplicates);
	}
	
	
	@Test
	public void  testRemoveDuplicates() {
		int[] input = {1,3, 7,9,11,11,9,7,3,3,1};
		int[] actual = removeDuplicates(input);
        int[] expected = {1, 3, 7, 9, 11};
		//assertArrayEquals(expected, actual);
	}
	
	
}
