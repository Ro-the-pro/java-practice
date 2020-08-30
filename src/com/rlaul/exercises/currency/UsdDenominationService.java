/**
 * 
 */
package com.rlaul.exercises.currency;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rohitash
 *
 */
public class UsdDenominationService implements CurrencyDenominationService {
	
	enum UsdDenominations {
		DOLLAR (100),
		QUARTER (25), 
		DIME (10),
		NICKEL(5),
		PENNY(1);
	    
		private final int value;

	    private UsdDenominations(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }
	}
	
	@Override
	public Map<String,Integer> getCurrencyDenominations() {
		Map<String,Integer> denMap = new HashMap<String, Integer>();
		for(UsdDenominations den: UsdDenominations.values()) {
			denMap.put(String.valueOf(den), den.getValue());
		}
		return denMap;
	}
	
	@Override
	public Map<String, Integer> getAmountInDenominations(int amount){
		Map<String,Integer> amountDenMap = new HashMap<String, Integer>();
		int denominationCount = 0;
		for(UsdDenominations den: UsdDenominations.values()) {
			int denominationValue = den.getValue();
			while(amount > denominationValue) {
				denominationCount = amount / denominationValue;
				amount = amount % denominationValue;
			}
			amountDenMap.put(den.toString(), denominationCount);
		}
		
		return amountDenMap;
	}

}
