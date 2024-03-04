package com.rlaul.ik;

/**
 * Given a number n, find the n-th Fibonacci Number. E.g. if n=2, 2nd Fibonacci Number is the sum of the 0th and 1st Fibonacci Number = 0 + 1 = 1.
 * F(n) = F(n-1) + F(n-2) 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
 * @author rohit
 *
 */
public class FibonacciSimple{

	public static void main(String[] args) {
		Integer result = find_fibonacci(46);
		System.out.println(result);
		
	}
	

    static Integer find_fibonacci(Integer n) {
    	int result = 0;
    	if(n==0)
    		return 0;
    	if(n==1)
    		return 1;
    	if (n>46)
    		return 0;
    	
    	result = find_fibonacci(n-1)+ find_fibonacci(n-2);
    	
    	return result;
    }


}
