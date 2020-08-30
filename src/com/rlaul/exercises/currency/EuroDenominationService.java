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
public class EuroDenominationService implements CurrencyDenominationService {
	
	enum EuroDenominations {
		TWO_EURO (200),
		FIFTY (50), 
		TWENTY (20),
		TEN(10),
		FIVE(5),
		ONE(1);
	    
		private final int value;

	    private EuroDenominations(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }
	}
	
	@Override
	public Map<String,Integer> getCurrencyDenominations() {
		Map<String,Integer> denMap = new HashMap<String, Integer>();
		for(EuroDenominations den: EuroDenominations.values()) {
			denMap.put(String.valueOf(den), den.getValue());
		}
		return denMap;
	}
	
	@Override
	public Map<String, Integer> getAmountInDenominations(int amount){
		Map<String,Integer> amountDenMap = new HashMap<String, Integer>();
		int denominationCount = 0;
		for(EuroDenominations den: EuroDenominations.values()) {
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
