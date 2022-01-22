package com.rlaul.leetcode.easy;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

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
		//System.out.println("raw input:"+nums);
		Arrays.sort(nums);
		//System.out.println("sorted input:"+nums);
		int[] newNums = new int[nums.length];
		int j=0;
		
		for (int i=0;i<nums.length-1;i++) {
			if(nums[i]!=nums[i+1]) {
				newNums[j] = nums[i];
				j++;
			}
		}
		//System.out.println("without duplicates:"+newNums);
		return newNums ;
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
