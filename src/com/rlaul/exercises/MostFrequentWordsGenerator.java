package com.rlaul.exercises;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentWordsGenerator {

	// 1st chapter of Tale of A TALE OF TWO CITIES By Charles Dickens

	public static void main(String[] args) {
		String bookExtract = "It was the best of times, it was the worst  authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only";
		Map<String, Integer> topWords = getTopNMostFrequentwords(bookExtract, 10);

		printMap(topWords);
	}

	/**
	 * This method should return a Map with the top N words e.g for the string
	 * example above and a limit of 10 it should return the: 76 of: 55 and: 41 in:
	 * 26 to: 23 a: 23 was: 21 it: 16 with: 14 that: 13
	 * 
	 * @param bookExtract
	 * @param n
	 * @return
	 */

	/*
	 * //Add implementation here //break down the string into an array of words.
	 * Exclude commas and fullstops. //loop through the words. //Check if the words
	 * map has the key == word. //if yes, then increment the value of the key by 1.
	 * //if not, then add that word as a key with a value = 1.  //Sort the map in descending order and limit to 10. 
	 * 
	 */
	public static Map<String, Integer> getTopNMostFrequentwords(String text, int n) {

		Map<String, Integer> wordsMap = new HashMap<String, Integer>();
		String[] words = text.split("\\s+");
		
		for (String word : words) {
			word = word.toLowerCase();
			if (wordsMap.containsKey(word)) {
				wordsMap.put(word, wordsMap.get(word) + 1);
			} else {
				wordsMap.put(word, 1);
			}
		}
		
		wordsMap = sortMapbyValues(wordsMap, false, n);
		
		return wordsMap;

	}

	private static Map<String, Integer> sortMapbyValues(Map<String, Integer> map, boolean isAscOrder, int size) {
		Map<String, Integer> sorted = null;
		if(isAscOrder)
			sorted = map.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByValue())
			.limit(size)
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e2, LinkedHashMap::new));
		else {
			sorted = map.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			.limit(size)
			.collect(Collectors.toMap( //  This is a collector that takes a Stream of elements and accumulates them into a Map.
					Map.Entry::getKey, //  It extracts the key from each entry in the stream.
					Map.Entry::getValue, //  this method reference extracts the value from each entry in the stream 
					(e1,e2)-> e2, //This is a merge function - handle situations where there might be duplicate keys in the original map. 
					//Here, the function simply returns the value (e2) from the second entry encountered for the same key. 
					//This effectively overwrites the previous value e1 with the latter one e2.
					LinkedHashMap::new)); //LinkedHashMap preserves the order in which entries are added to the map.
		}
		
		return sorted;
	}

	private static void printMap(Map<String, Integer> wordsMap) {
		for (String word:wordsMap.keySet() ) {
			System.out.println(word + ":" + wordsMap.get(word));
		}
	}
}
