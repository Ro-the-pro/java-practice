/**
 * 
 */
package com.rlaul.exercises.currency;

import static org.junit.Assert.assertTrue;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import com.rlaul.exercises.currency.DenominationCalculator.Currencies;

/**
 * Test class for DenominationCalculator
 * @author rohitash
 *
 */
public class DenominationCalculatorTest {
	
	
	@Test
	public void testUSDDenominationCalculator(){
		DenominationCalculator calculator = new DenominationCalculator();
		int amount = 287;
		
		Map<String, Integer> usdDenominations = new LinkedHashMap<String, Integer>();
		usdDenominations.put("DOLLAR", 100);
		usdDenominations.put("QUARTER", 25);
		usdDenominations.put("DIME", 10);
		usdDenominations.put("NICKEL", 5);
		usdDenominations.put("PENNY", 1);
		CurrencyDenominations usdCurrency = new CurrencyDenominations(Currencies.USD.toString(), usdDenominations);
		
		Map<String, Integer> actualResultMap = calculator.getAmountInDenominations(amount, usdCurrency);
		Map<String, Integer> expectedValueMap = new LinkedHashMap<String,Integer>();
		expectedValueMap.put("DOLLAR",2);
		expectedValueMap.put("QUARTER",3);
		expectedValueMap.put("DIME",1);
		expectedValueMap.put("NICKEL",0);
		expectedValueMap.put("PENNY", 2);
		System.out.println("The amount "+amount+" is broken into:");
		calculator.printMap(actualResultMap);
		
		assertTrue(calculator.areEqualMaps(expectedValueMap,actualResultMap));
	}
	
	
	@Test
	public void testEuroDenominationCalculator(){
		DenominationCalculator calculator = new DenominationCalculator();
		int amount = 287;
		
		Map<String, Integer> euroDenominations = new LinkedHashMap<String, Integer>();
		euroDenominations.put("TWO_EURO", 200);
		euroDenominations.put("50c", 50);
		euroDenominations.put("20c", 20);
		euroDenominations.put("10c", 10);
		euroDenominations.put("5c", 5);
		euroDenominations.put("1c", 1);
		CurrencyDenominations euroCurrency = new CurrencyDenominations(Currencies.EURO.toString(), euroDenominations);
		
		Map<String, Integer> actualResultMap = calculator.getAmountInDenominations(amount, euroCurrency);
		Map<String, Integer> expectedValueMap = new LinkedHashMap<String,Integer>();
		expectedValueMap.put("TWO_EURO",1);
		expectedValueMap.put("50c",1);
		expectedValueMap.put("20c",1);
		expectedValueMap.put("10c",1);
		expectedValueMap.put("5c",1);
		expectedValueMap.put("1c", 2);
		System.out.println("The amount "+amount+" is broken into:");
		calculator.printMap(actualResultMap);
		
		assertTrue(calculator.areEqualMaps(expectedValueMap,actualResultMap));
	}

}
