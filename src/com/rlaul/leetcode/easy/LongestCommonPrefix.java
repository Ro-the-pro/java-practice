package com.rlaul.leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.*;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
	
    public String longestCommonPrefix(String[] strings) {
    	if (strings.length == 0)
    		return "";
    	String prefix = strings[0];
    	for (int i=1; i< strings.length; i++) {
    		while(strings[i].indexOf(prefix)!=0) {
    			prefix = prefix.substring(0, prefix.length()-1);
    			if (prefix.isEmpty())
    				return "";
    		}
    	}
    	return prefix;
    }

    @Test
    public void testLongestCommonPrefixValid() {
    	String[] input1 = {"flower", "flight", "fleet"};
    	String commonPrefix = longestCommonPrefix(input1);
    	assertEquals( "fl", commonPrefix);
    }
    

    @Test
    public void testLongestCommonPrefixInvalid() {
    	String[] input2 = {"dogcar", "racecar", "car"};
    	String commonPrefix2 = longestCommonPrefix(input2);
    	assertEquals( "", commonPrefix2);
    }

}
