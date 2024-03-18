package com.rlaul.exercises;

import java.util.ArrayList;
import java.util.List;

public class LongestStringsArray {

	public static void main(String[] args) {
		
		String[] input = {"aba", "aa", "ad", "vcd", "aba"};
		String[] result = solution(input);
		System.out.print("[");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+", ");
		}
		System.out.print("]");
		
	}
	
	static String[] solution(String[] inputArray) {
	    int longestLength = 0;
	    
	    List<String> arrlist  = new ArrayList<String>(); 
	    
	    for(int i=0;i<inputArray.length;i++){
	        int length = inputArray[i].length();
	        if(length > longestLength){
	            longestLength = length;
	            arrlist  = new ArrayList<String>(); 
	        } 
	        if(length == longestLength){
	            arrlist.add(inputArray[i]);
	        }
	        
	    }
	    
	    return  arrlist.toArray(new String[arrlist.size()]);
	}

}
