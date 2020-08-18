package com.rlaul.leetcode.easy;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/*
 * Given two non-negative integers num1 and num2 represented as string, return the sum
 * of num1 and num2.
 * Note:
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer
 * directly.
 */
public class TwoStringSum {

    public String addStrings(String num1, String num2) {
    	StringBuilder result = new StringBuilder();
    	int p1 = num1.length() -1;
    	int p2 = num2.length() -1;
		int carry = 0;	
    	while(p1>=0 || p2>=0) {
    		int x1 = p1>=0 ? num1.charAt(p1)-'0' : 0;
    		int x2 = p2>=0 ? num2.charAt(p2)-'0' : 0;
    		int sum = (x1+x2+carry)%10;
    		carry = (x1+x2+carry)/10;
    		result.append(sum);
    		p1--;
    		p2--;
    	}
    	if(carry!=0)
    		result.append(carry);
		return result.reverse().toString();
    }
    
    
	public static void main(String[] args) {
		TwoStringSum obj = new TwoStringSum();
		String sum = obj.addStrings("990", "11");
		assertEquals("1001", sum);
		System.out.println(sum);
	}

}
