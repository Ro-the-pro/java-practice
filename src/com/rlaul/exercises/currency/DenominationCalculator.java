/**
 * 
 */
package com.rlaul.exercises.currency;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import com.rlaul.exercises.currency.UsdDenominationService.UsdDenominations;

/**
 * 
 * @author rohitash
 *
 */
public class DenominationCalculator {
	
	enum Currencies{USD, EURO}

	public void printMap(Map<String, Integer> denominationsMap) {
		for(Map.Entry<String,Integer> entry: denominationsMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println();
	}

	public Map<String, Integer> getAmountInDenominations(int amount, CurrencyDenominations currency){
		String currCode = currency.getCurrencyCode();
		System.out.println("Currency Code selected: "+currCode+"\n");
		Map<String,Integer> denominationsMap = currency.getDenominations();
		
		Map<String,Integer> amountDenMap = new LinkedHashMap<String, Integer>();
		
		int denominationCount = 0;
		
		for(Map.Entry<String,Integer> entry: denominationsMap.entrySet()) {
			String den = entry.getKey();
			int denominationValue = entry.getValue();
			while(amount > denominationValue) {
				denominationCount = amount / denominationValue;
				amount = amount % denominationValue;
			}
			amountDenMap.put(den.toString(), denominationCount);
		}
		
		return amountDenMap;
	}

	public boolean areEqualMaps(Map<String, Integer> first, Map<String, Integer> second) {
	    if (first.size() != second.size()) {
	        return false;
	    }
	    return first.entrySet().stream()
	      .allMatch(e -> e.getValue().equals(second.get(e.getKey())));
	}

}
