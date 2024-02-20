package com.rlaul.ik;

import java.util.ArrayList;
import java.util.List;

/*
	Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.
	
	Return a list of all possible strings we could create. Return the output in any order.
	Example
	Input: s = "a1b2"
	Output: ["a1b2","a1B2","A1b2","A1B2"]
 * @author rohit
 */
public class LetterCaseTransformation {

	public static void main(String[] args) {
		List<String> resultlist = new ArrayList<String>();
		helper("a1b2","", 0, resultlist);
	}
	
	static void helper(String input, String partial, int idx, List<String> resultlist) {
		// base condition
		// decrease size of problem
		// Implement partial solution
		// designate
		
		if (input == null || input.isEmpty() ) {
			System.out.println("Nothing");
		}
		
		if (input.length()  == idx) {
			resultlist.add(partial);
			System.out.println(partial);
			--idx;
			return;
		}
		
		char nextChar = input.charAt(idx);
		
		if(Character.isAlphabetic(nextChar)) {
			helper(input, partial + Character.toLowerCase(nextChar), idx+1, resultlist);
			helper(input, partial + Character.toUpperCase(nextChar), idx+1, resultlist);
		} else {
			helper(input, partial + nextChar, idx+1, resultlist);
		}
		
	}
		
		

}
