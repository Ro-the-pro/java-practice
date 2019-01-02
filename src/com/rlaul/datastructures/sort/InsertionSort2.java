package com.rlaul.datastructures.sort;

public class InsertionSort2 implements Sort{
	
	public void sort(int arr[]) {
		int n = arr.length;
		for (int i=1;i<n;i++) {
			int j=i-1;
			int current = arr[i];
			
			while(j>=0 && arr[j] > current) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
	}

}
