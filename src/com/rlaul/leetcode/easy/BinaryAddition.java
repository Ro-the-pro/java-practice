package com.rlaul.leetcode.easy;

import static org.junit.Assert.assertEquals;

/*
 * Given two binary strings, return their sum (also a binary string). 
 * The input strings are both non-empty and contains only characters 1 or 0.
 */
public class BinaryAddition {

    public static String addBinary(String a, String b) {
        String sum = Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2));
        return sum;
    }
    
	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		String binarySum = addBinary(a, b);
		assertEquals("100", binarySum);
		System.out.println(binarySum);
	}

}
