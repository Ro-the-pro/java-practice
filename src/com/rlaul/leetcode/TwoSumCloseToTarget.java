package com.rlaul.leetcode;

import java.util.Arrays;

/**
 * Given an array of integers, find two integers whose sum is closest to the target (not necessarily equal to target).
 * @author rohit
 *
 */
public class TwoSumCloseToTarget {

	public static void main(String[] args) {
		int[] input = {4,5,6,-1, -3};
	
		twoClosestSum(input, 10);
	}

	private static void twoClosestSum(int[] input, int target) {
		if (input.length <2) {
			System.out.println("Invalid input. Please give at least two numbers in input");
			return;
		}
		
		Arrays.sort(input);
		
		int left = 0;
	    int right = input.length-1;
	    int[] result = {-1,-1};
	    int diff = Integer.MAX_VALUE;
	    
	    while (left<right) {
	    	int sum = input[left] + input[right]; 
	    	
	    	if (Math.abs(sum - target) < diff) {   //if (target - sum < closeSum)
	    		diff = Math.abs(sum - target);
    			result[0] = input[left];
	    		result[1] = input[right];
	    	} 
	    	
	    	if (sum> target) {
	    		right--;
	    	}else {
	    		left++;
	    	}
	    }
	    
	    System.out.println("Numbers are: "+ result[0]+", "+ result[1]);
	}

}
