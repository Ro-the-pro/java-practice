package com.rlaul.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is
 *  equal to the product of all the elements of nums except nums[i].
 *  
 * Note: Please solve it without division and in O(n).
 * @author rohit
 *
 */
public class ArrayProductExceptSelf {

	public int[] calculateProductofArray(int[] arr) {
		if(arr==null || arr.length==0) {
			return null;
		}
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int[] answer = new int[arr.length];
		left[0] = 1;
		for(int i=1;i<arr.length;i++) {
			left[i] = arr[i-1]*left[i-1];
		}
		right[arr.length-1] = 1;
		for(int j=arr.length-2;j>=0;j--) {
			right[j] = arr[j+1]*right[j+1];
		}
		
		for(int k=0;k<arr.length;k++) {
			answer[k]=left[k]*right[k];
		}
		
		return answer;
	}
	
	@Test
	public void calculateProductofArrayTest() {
		int arr[] = {1,2,3,4};
		int answer[] = calculateProductofArray(arr);
		int expected[] = {24,12,8,6};
		Assert.assertArrayEquals(expected, answer);
	}

}
