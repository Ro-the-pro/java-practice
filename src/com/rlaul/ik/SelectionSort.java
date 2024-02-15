package com.rlaul.ik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

	static int minIndex(int a[], int start, int end) {
		if (start == end) {
			return start;
		}
		int k = minIndex(a, start + 1, end);
		return (a[k] < a[start] ? k : start);
	}

	static int[] selectionSortHelper(int a[], int arrSize, int index) {
		if (index == arrSize) {
			return a;
		}
		int minIdx = minIndex(a, index, arrSize - 1);
		if (minIdx != index) {
			// swap
			int temp = a[index];
			a[index] = a[minIdx];
			a[minIdx] = temp;
			
		}
		selectionSortHelper(a, arrSize, index + 1);
		return a;
	}
	
    static ArrayList<Integer> selection_sort(ArrayList<Integer> arr) {
    	int[] array = arr.stream().mapToInt(i -> i).toArray();
    	int[] sorted = selectionSortHelper(array, arr.size(), 0);
    	ArrayList<Integer> sortedList = new ArrayList<Integer>();
    	for(int i=0;i<sorted.length;i++) {
    		sortedList.add(sorted[i]);
    	}
        return sortedList;
    }

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(3, 6, 1, 5, 9, 2));
		ArrayList<Integer> sortedList = selection_sort(a);
		for (Integer item : sortedList) {
		    System.out.println(item);
		}
	}
	
}
