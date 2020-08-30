/**
 * 
 */
package com.rlaul.exercises.currency;

import java.util.Map;

/**
 * 
 * @author rohitash
 *
 */
public class DenominationCalculator {
	
	private static String CURRENCY_CODE = "EURO";
	
	public static void main(String[] args) {
		int amount = 287;
		System.out.println("The currency code is:"+CURRENCY_CODE);
		CurrencyDenominationService currencyDenominationService = null;
		
		currencyDenominationService = initializeDenominationService();
		
		Map<String, Integer> currDenMap = currencyDenominationService.getCurrencyDenominations();
		System.out.println("The currency denominations are:");
		printInDenominations(currDenMap);
		
		Map<String, Integer> denominations = currencyDenominationService.getAmountInDenominations(amount);
		System.out.println("The amount denominations are:");
		printInDenominations(denominations);
	}

	private static CurrencyDenominationService initializeDenominationService() {
		CurrencyDenominationService currencyDenominationService;
		switch(CURRENCY_CODE)
		{
			case "USD":
				currencyDenominationService = new UsdDenominationService();
				break;
			case "EURO":
				currencyDenominationService = new EuroDenominationService();
				break;
			default:
				currencyDenominationService = new UsdDenominationService();
		}
		return currencyDenominationService;
	}

	private static void printInDenominations(Map<String, Integer> denominationsMap) {
		for(Map.Entry<String,Integer> entry: denominationsMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println();
	}
}
