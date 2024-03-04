package com.rlaul.ik;

/**
 * Count All Subsets Of A Set Of Size N
 * If we have a set {1, 2, 3}, then all the possible subsets are: {}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}.
 * 0 <= input number <= 30.
 * @author rohit
 *
 */
public class CountAllSubsets {

	public static void main(String[] args) {
		
		int result = count_all_subsets(2);
		System.out.println(result);
		
	}
	

	static int count_all_subsets(int n) {
        if(n==0)
			return 1; 
		
		int base = 2;
        int exponent = n;
        int result = 1;
        
        for(int i = 0; i < exponent; i++) {
            result *= base;
        }
        
        return result;
	}
}
