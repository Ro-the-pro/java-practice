package com.rlaul.datastructures.practice;

public class BubbleSort {
	public static void main (String[] args) {
		int[] array = {20,35,10,6,50};
		BubbleSort bs = new BubbleSort();
		int[] sorted = bs.bubbleSort(array);
		for (int i=0;i<sorted.length;i++)
		System.out.println(sorted[i]);
	} 
	
	public int[] bubbleSort(int[] array) {
		
		for(int i=0;i<array.length-1;i++) {
			boolean swapped = false;
			
			for(int j=0;j<array.length - i - 1; j++) {
				if (array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		return array;
		
	}

}
