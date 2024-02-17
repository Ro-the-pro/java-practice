package com.rlaul.ik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1000000000, 199999999, 0);
		List<Integer> list2 = Arrays.asList(5, 8, 3, 9, 4, 1, 7);
		List<Integer> list3 = Arrays.asList(5, 8, 3, 9, 4, 1, 7);
		List<Integer> list4 = Arrays.asList(1,-2);
		List<Integer> list5 = Arrays.asList(1000000000, 0);
		ArrayList<Integer> a = new ArrayList<Integer>(list2);
		merge_sort(a);

		for (Integer item : a) {
			System.out.print(item + ",");
		}
	}

	static ArrayList<Integer> merge_sort(ArrayList<Integer> arr) {
		sortHelper(arr, 0, arr.size() - 1);
		return arr;
	}

	static void sortHelper(ArrayList<Integer> arr, int start, int end) {
		if (end <= start) {
			return;
		}

		int mid = start + (end - start) / 2;

		sortHelper(arr, start, mid);
		sortHelper(arr, mid + 1, end);

		merge(arr, start, mid, end);

	}

	private static void merge(ArrayList<Integer> arr, int start, int mid, int end) {

		ArrayList<Integer> aux = new ArrayList<>(end - start + 1);
		int left = start;
		int right = mid + 1;

		while (left <= mid && right <= end) {
			if (arr.get(left) <= arr.get(right)) {
				aux.add(arr.get(left));
				left++;
			} else {
				aux.add(arr.get(right));
				right++;
			}
		}

		while (left <= mid) {
			aux.add(arr.get(left));
			left++;
		}

		while (right <= end) {
			aux.add(arr.get(right));
			right++;
		}

		for (int k = 0; k < aux.size(); k++) {
			arr.set(k + start, aux.get(k));
		}

	}

}
