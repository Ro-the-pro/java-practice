package com.rlaul.leetcode.easy;

/*
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is a palindrome while 123 is not.
 */
public class ValidPalindrome {
    public boolean isPalindrome(int num){
    	if(num<0) {
    		return false;
    	}
    	int remainder = 0, reversed = 0,original = num;
    	while (num!=0) {
    		remainder = num % 10; 
    		reversed = reversed*10 + remainder;
    		num /= 10; 
    	}
    	return original == reversed;
    }
    
    public static void main (String args[]) {
    	ValidPalindrome obj = new ValidPalindrome();
    	System.out.println("valid:"+obj.isPalindrome(1221));
    	System.out.println("invalid:"+obj.isPalindrome(1234));
    }
}
