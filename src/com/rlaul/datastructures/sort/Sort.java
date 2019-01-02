package com.rlaul.datastructures.sort;

public interface Sort {
	
	public void sort(int arr[]);
	
	public default void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " "); 
		}
		System.out.println("\n-----------------------------------");
	}
}
