package com.rlaul.ik;

public class ParenthesisCombinations {

	// Class name must be "Main"
	// Libraries included:
	// json simple, guava, apache commons lang3, junit, jmock

	/*
	 * '''
	 * 
	 * The task is to write a function that prints all combinations of well-formed
	 * parenthesis from 1...n.
	 * 
	 * Input: 3 Console Output: 
	 * () 
	 * (()) ()() 
	 * ((())) (()()) (())() ()(()) ()()()
	 * 
	 * '''
	 * 
	 */

	/*
	 * if(open == n && close == open) print(current); return
	 * 
	 * current: ""
	 * 
	 * if(open < n) helper(current + open, open +1, close) current.remove(last)
	 * 
	 * if(open > close){ helper(current + close, open, close+1) current.remove(last)
	 * }
	 * 
	 * 
	 * Lets see if it works for n=2
	 * 
	 * n = 2 open = 1 close = 1
	 * 
	 * string = "()()"
	 * 
	 * string "("
	 * 
	 * string "(("
	 * 
	 * string "()()
	 * 
	 */

	public static void main(String[] args) {

		printAllParanthesis(3);
	}

	static void printAllParanthesis(int n) {

		for (int i = 1; i <= n; i++) {
		StringBuffer sb = new StringBuffer();
			// lazy manager
			printHelper(sb, 0, 0, i);
			System.out.println();
		}

	}

	private static void printHelper(StringBuffer current, int openCtr, int closeCtr, int n) {
		char openChar = '(';
		char closeChar = ')';

		// base case
		if (openCtr == n && closeCtr == openCtr) {
			System.out.print(current.append(" "));
		}

		// Add open brackets
		if (openCtr < n) {
			current.append(openChar);
			printHelper(current, openCtr + 1, closeCtr, n);
			// removing the newly added character for printing the next combination of
			// parenthesis
			current.deleteCharAt(current.length() - 1);
		}

		// Add close brackets
		if (openCtr > closeCtr) {
			current.append(closeChar);
			printHelper(current, openCtr, closeCtr + 1, n);
			current.deleteCharAt(current.length() - 1);
		}
	}
}
