package com.rlaul.datastructures.sort;

//Finds the smallest element and swaps it with the first element. Then, it finds the lowest and swaps with 
//the second element. 
public class SelectionSort2 implements Sort{
	
	
	public void sort(int arr[]) {
		int arrlen = arr.length;
		for (int i=0;i<arrlen-1;i++) {
			int minIdx = i;
			for(int j=i+1;j<arrlen;j++) {
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}
	
}
