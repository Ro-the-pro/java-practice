/**
 * 
 */
package com.rlaul.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Some people are standing in a row in a park. There are trees between them which cannot be moved. 
 * Your task is to rearrange the people by their heights in a non-descending order without moving the trees.

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190]

1) Clone the array 
2) Keep trees into its positions 
3) get a people's list (where value != -1) 
4) sort people's list
5) loop through the original array and replace non-trees with sorted people. If tree is encountered, go to next number. 

 * @author rohit
 *
 */
public class SortByHeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = {-1, 150, 190, 170, -1, -1, 160, 180};
		
		System.out.print("Input: {");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+",");
		}
		System.out.println("}");
		solution(input);
		
		
		System.out.print("\nResult: {");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+",");
		}
		
		System.out.println("}");
	}
	
	/*
	 *  input = [-1, 150, 190, 170, -1, -1, 160, 180]
	 *  
	 */
	static void solution(int[] input) {
		ArrayList<Integer> peopleList = new ArrayList<Integer>();
		
		for(int i=0;i<input.length;i++) {
			if (input[i] != -1) {
				peopleList.add(input[i]);
			} 
		}
		Collections.sort(peopleList); //sort people by height excluding trees
		
		for(int i=0, j=0;i<input.length;i++) {
			if(input[i] == -1) { //skip tree positions
				continue;
			}
			input[i] = peopleList.get(j);
			j++;
		}
	}
	
	/*
	 *  input = [-1, 150, 190, 170, -1, -1, 160, 180]
	 *  
	 */
	static void solution1(int[] givenArray) {
		 for(int initialPointer=0; initialPointer < givenArray.length; initialPointer++) {
	            for(int secondPointer=1; secondPointer < givenArray.length; secondPointer++)
	            // If value of initialPointer and secondPointer is not -1
	            if (givenArray[initialPointer] != -1
	                    && givenArray[secondPointer] != -1
	                    && givenArray[initialPointer] < givenArray[secondPointer]) {
	                //swap the numbers
	                int swapNumber = givenArray[initialPointer];
	                givenArray[initialPointer] = givenArray[secondPointer];
	                givenArray[secondPointer] = swapNumber;
	            }
	        }
	        System.out.println(Arrays.toString(givenArray));
	}

}
