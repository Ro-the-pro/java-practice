/**
 * 
 */
package com.rlaul.exercises;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

/**
 * move zeroes to the left while mainitaing the order of other numbers
 * Example

	For a = [0, 150, 190, 170, 0, 0, 160, 180], the output should be
	solution(a) = [0, 0, 0, 150, 190, 170, 160, 180]
	
	 Iterate through the array using a for loop. For each element, if it's non-zero, copy it to the nonZeroIndex position
	  in the array and decrement nonZeroIndex. This process effectively shifts all non-zero elements to the end of the array 
	  while preserving their original order.Finally,fill the remaining positions in the array (from nonZeroIndex to the beginning)
	   with zeros using a while loop.
 * @author rohit
 *
 */
public class MoveZerosToLeft {

	public static void main(String[] args) {
		int[] input = {0, 150, 190, 170, 0, 0, 160, 180};
		
		System.out.print("Input: {");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+",");
		}
		System.out.println("}");
		moveZeroes(input);
		
		System.out.print("\nResult: {");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+",");
		}
		
		System.out.println("}");
	}

	 private static int[] moveZeroes(int[] nums) {
	        if(nums.length == 1)
	            return nums;

	        int nonzeroIndex = nums.length-1;

	        for (int i=nums.length-1;i>=0;i--){
	            if(nums[i]!=0){
	                nums[nonzeroIndex] = nums[i];
	                nonzeroIndex--;
	            }
	        }

	        while (nonzeroIndex<nums.length && nonzeroIndex>=0){
	            nums[nonzeroIndex] = 0;
	            nonzeroIndex--;
	        }
	        
	        return nums;
	        
	    }
	
	@Test
	public void testMyArrayList() {
		int[] input = {0, 150, 190, 170, 0, 0, 160, 180};
		int[] expectedResult = {0, 0, 0, 150, 190, 170, 160, 180};
		int[] result = moveZeroes(input);
		for (int i = 0; i < expectedResult.length; i++)
		    assertEquals("mismatch at " + i, expectedResult[i], result[i]);
	}

}
