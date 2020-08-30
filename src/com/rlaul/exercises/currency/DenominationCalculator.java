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
 * This class calculates the denomination breakdown for an amount based on the currency chosen. 
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

	/**
	 * This method calculates the denominations (bills/coins) for the currency selected. 
	 * @param amount 
	 * @param currency
	 * @return
	 */
	public Map<String, Integer> getAmountInDenominations(int amount, CurrencyDenominations currency){
		String currCode = currency.getCurrencyCode();
		System.out.println("Currency Code selected: "+currCode);
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
			denominationCount = 0;
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
