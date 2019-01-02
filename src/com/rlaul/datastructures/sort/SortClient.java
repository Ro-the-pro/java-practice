package com.rlaul.datastructures.sort;

public class SortClient {
	
	public static void main(String args[]) {
		int arr[] = {2,4,1,5,3,7};
		//Sort sortObj = new SelectionSort2();
		//Sort sortObj = new BubbleSort2();
		//Sort sortObj = new InsertionSort2();
		Sort sortObj = new MergeSort2();
		System.out.println("Given array:");
		sortObj.print(arr);
		sortObj.sort(arr);
		System.out.println("Sorted array:");
		sortObj.print(arr);
	}

}
