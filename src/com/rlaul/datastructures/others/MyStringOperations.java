package com.rlaul.datastructures.others;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MyStringOperations {
	
	public static  class MaximumOccuringChar {

	   final static String testcase1 = "Hello! Are you all fine? What are u doing today? Hey Guyz,Listen! I have a plan for today.";

	    public static void main(String[] args) 
	    {
	        MaximumOccuringChar test = new MaximumOccuringChar();
	        char result = test.maximumOccuringChar(testcase1);
	        System.out.println("Max occuring char is:"+result);
	    }

	    public Character maximumOccuringChar(String str) 
	    {
	        Map<Character, Integer> map = new HashMap<Character, Integer>();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (String.valueOf(ch).matches("[^a-zA-Z0-9]")) {
	            	continue;
	            } else {
		            if(map.containsKey(ch)) {
		            	int countOfChar = map.get(ch);
		            	map.put(ch, countOfChar+1);
		            }
		            else {
		            	map.put(ch, 1);
		            }
	            }

	        }
	        
			/* This is for sorting in ascending order.  
			 * final Map sortedByCount = map.entrySet() .stream()
			 * .sorted(Map.Entry.comparingByValue()) .collect(Collectors.toMap(
			 * Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
			 */
	        
            final LinkedHashMap<Character, Integer> reverseSortedMap = map.entrySet()
            		.stream()
            		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            		.collect( Collectors.toMap(Map.Entry::getKey,
            						Map.Entry::getValue,
            						(e1, e2) -> e2,
            		                LinkedHashMap::new));
            System.out.println(reverseSortedMap);
            int revSetCount = 0;
            for(Character key: reverseSortedMap.keySet()) {
            	if(revSetCount == 0) {
            		return key;
            	}
            	revSetCount++;
            }
			return null;
	    }
	}

}
