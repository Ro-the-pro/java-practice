package com.rlaul.leetcode.easy;

/**
 * Given a number ‘n’, write a program to get the sum of all prime numbers from 0 to n.
 * @author rohit
 *
 */
public class SumPrimeNumbers {

	public static void main(String[] args) {
		int sum = findSumPrime(7);
		System.out.println("sum="+sum);
	}
	
	private static int findSumPrime (int num) {
		int sum = 1;
		for(int i=1;i<=num;i++) {
			if(isPrime(i)) {
				sum+=i;
			}
		}
		return sum;
	}

	private static boolean isPrime(int number) {
		int i = 2; 
		while(i<=number/2) {
			if(number%i==0) {
				return false;
			}
			++i;
		}
		return true;
	}
	
	

}
