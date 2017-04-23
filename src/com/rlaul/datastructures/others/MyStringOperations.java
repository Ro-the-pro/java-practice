package com.rlaul.datastructures.others;

public class MyStringOperations {
	
	public static  class MaximumOccuringChar {

	   final static String testcase1 = "Hello! Are you all fine? What are u doing today? Hey Guyz,Listen! I have a plan for today.";

	    public static void main(String[] args) 
	    {
	        MaximumOccuringChar test = new MaximumOccuringChar();
	        char[] result = test.maximumOccuringChar(testcase1);
	        System.out.println(result);
	    }

	    public char[] maximumOccuringChar(String str) 
	    {
	        int temp = 0;
	        int count = 0;
	        int current = 0;

	        char[] maxchar = new char[str.length()];

	        for (int i = 0; i < str.length(); i++) 
	        {
	            char ch = str.charAt(i);

	            for (int j = i + 1; j < str.length(); j++) 
	            {
	                char ch1 = str.charAt(j);

	                if (ch != ch1) 
	                {
	                    count++;
	                }
	            }

	            if (count > temp) 
	            {
	                temp = count;
	                maxchar[current] = ch;
	                current++;
	            }
	        }
	        return maxchar;
	    }
	}

}
