package com.rlaul.ik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BubbleSort {

	
	public static void main(String[] args) {
		int[] inputArr = {5, 8, 3, 9, 4, 1, 7};
		List input = new ArrayList<Integer>();
	    Collections.addAll(input, inputArr);
		List result = bubble_sort((ArrayList<Integer>) input);
		System.out.println(result);
	}
	

    static ArrayList<Integer> bubble_sort(ArrayList<Integer> arr) {
    	boolean inProgress = false;
    	int size = arr.size();
    	for (int i=0;i<size-1; i++) {
    		inProgress = false;
    		
    		for (int j=0; j<size-i-1; j++) {
    			if(arr.get(j) > arr.get(j+1)) {
    				inProgress = true;
    				
    				int temp = arr.get(j);
    				arr.set(j, arr.get(j+1));
    				arr.set(j+1, temp);
    			}
    		}
    		if (!inProgress)
    			break;
    	}
    	
        return arr;
    }
    
    
	


}
