package com.rlaul.exercises;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class CommonCharCount {

	public static void main(String[] args) {

		//int matches = commonCharCount("aabcc", "adcaa");
		int matches = commonCharCount("abca", "xyzbac");
		System.out.println("\n"+matches);
	}
	
	static int commonCharCount(String s1, String s2) {
		int matches = 0;
		HashMap<Character, Integer> map1 = createCharacterCountMap(s1);
		HashMap<Character, Integer> map2 = createCharacterCountMap(s2);
		HashMap<Character, Integer> commonCharMap = new HashMap<Character, Integer>();
		Set<Character> s1UniqueChars = map1.keySet();
		for(Character character: s1UniqueChars) {
			if(map2.containsKey(character)) {
				Integer count1 = map1.get(character);
				Integer count2 = map2.get(character);
				Integer commonCount = count1 <=count2 ? count1 : count2;
				commonCharMap.put(character, commonCount);
			}
		}
		
		Collection<Integer> values = commonCharMap.values();
		for(Integer value: values) {
			matches+=value;
		}
		return matches;
	}

	private static HashMap<Character, Integer> createCharacterCountMap(String word) {
		
		HashMap<Character, Integer> charMap = new HashMap<>();
		for(int i=0;i<word.length();i++) {
			Character key = word.charAt(i);
			if(charMap.containsKey(key)) {
				charMap.put(key, charMap.get(key)+1);
			} else {
				charMap.put(key,1);
			}
		}
		
		return charMap;
	}

}
