package com.rlaul.greenbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedListTest obj = new LinkedListTest();
		LinkedList<String> n = new LinkedList<>();
		String[] arr = {"a", "b","c","d","e","f","g"};
		List<String> list = Arrays.asList(arr);
		n.addAll(list);
	
		String k = obj.findKThElement (n, 4);
		System.out.println(k);
	}
	
	public String findKThElement(LinkedList<String> n, int k){
		String kelement = n.get(k-1);
		return kelement;
	}

}
