package com.rlaul.leetcode.easy;

import static org.junit.Assert.assertEquals;

/**
 * In an alien language, surprisingly they also use english lowercase letters, 
 * but possibly in a different order. The order of the alphabet is some permutation 
 * of lowercase letters.
 * Given a sequence of words written in the alien language, and the order of the 
 * alphabet, return true if and only if the given words are sorted lexicographicaly 
 * in this alien language.
 * @author rohit
 *
 */
public class AlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        for (int i = 0; i < order.length(); ++i)
            index[order.charAt(i) - 'a'] = i;

        search: for (int i = 0; i < words.length - 1; ++i) {
            String word1 = words[i];
            String word2 = words[i+1];

            // Find the first difference word1[k] != word2[k].
            for (int k = 0; k < Math.min(word1.length(), word2.length()); ++k) {
                if (word1.charAt(k) != word2.charAt(k)) {
                    // If they compare badly, it's not sorted.
                    if (index[word1.charAt(k) - 'a'] > index[word2.charAt(k) - 'a'])
                        return false;
                    continue search;
                }
            }

            // If we didn't find a first difference, the
            // words are like ("app", "apple").
            if (word1.length() > word2.length())
                return false;
        }

        return true;
    }
    
    public static void main (String[] args) {
    	String order = "hlabcdefgijkmnopqrstuvwxyz";
    	String[] words = {"hello","leetcode"};
    	String[] words2 = {"apple", "app"};
    	
    	AlienDictionary solution = new AlienDictionary();
    	boolean isSorted = solution.isAlienSorted(words, order);
		assertEquals(true, isSorted);
    	System.out.println(isSorted);
    	
    }
}