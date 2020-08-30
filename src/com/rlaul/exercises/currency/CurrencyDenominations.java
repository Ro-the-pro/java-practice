/**
 * 
 */
package com.rlaul.exercises.currency;

import java.util.Map;

/**
 * @author rohit
 *
 */
public class CurrencyDenominations {
	
	private String currencyCode;
	private Map<String, Integer> denominations;
	
	public CurrencyDenominations(String currencyCode, Map<String, Integer> denominations) {
		super();
		this.currencyCode = currencyCode;
		this.denominations = denominations;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public Map<String, Integer> getDenominations() {
		return denominations;
	}
	
}
