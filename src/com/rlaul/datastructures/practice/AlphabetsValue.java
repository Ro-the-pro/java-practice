package com.rlaul.datastructures.practice;

public class AlphabetsValue {
	
	public static void printAlphabetValues() {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		int[] index = new int[26];
		for (int i=0;i<index.length;i++) {
			index[alphabets.charAt(i)-'a'] = i;
			System.out.println(alphabets.charAt(i)+":"+i);
		}
	}
	
	public static void main (String[] args) {
		printAlphabetValues();
	}

}
