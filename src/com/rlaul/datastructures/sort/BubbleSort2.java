package com.rlaul.datastructures.sort;

//compares every element to its right and swaps in ascending. 
//In the first pass, the last element is the largest. 
//It need not be considered in the second run. 
public class BubbleSort2 implements Sort {

	@Override
	public void sort(int[] arr) {
		int arrlen = arr.length;
		boolean inProgress = false;
		for(int k=1;k<arrlen-1;k++) {
			for (int i=0;i<arrlen-k-1;i++) {
				if(arr[i] > arr[i+1]){
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					inProgress = true;
				}
			}
			
			if(!inProgress) {
				break;
			}
		}
	}
	
	
}
