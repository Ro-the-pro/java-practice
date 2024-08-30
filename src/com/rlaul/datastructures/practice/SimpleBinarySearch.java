package com.rlaul.datastructures.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SimpleBinarySearch {
	
	static int numberofTries = 0;
	public static int binarySearch (int[] nums, int left, int right, int target ) {
		
		numberofTries++;
		if(nums.length==0)
			return -1;
		if (right >= left) {
			int mid = left + (right - left)/2;
			if (nums[mid] == target) {
				return mid;
			}
			
			if (nums[mid] > target) {
				return binarySearch(nums, left, mid-1, target);
			}
			else {
				return binarySearch(nums, mid+1, right, target);
			}
		}
		
		return -1;
	}
	
	
	@Test
	public void testValid() {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int target = 6;
		int index = binarySearch(arr, 0, arr.length-1, target);
		assertEquals(index,  5);
		assertEquals(numberofTries, 8);
	}

	@Test
	public void testNotFound() {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int target = 11;
		int index = binarySearch(arr, 0, arr.length-1, target);
		assertEquals(index, -1 );
	}
}
