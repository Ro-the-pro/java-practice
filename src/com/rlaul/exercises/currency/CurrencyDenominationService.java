package com.rlaul.exercises.currency;

import java.util.Map;

public interface CurrencyDenominationService {

	Map<String, Integer> getCurrencyDenominations();

	Map<String, Integer> getAmountInDenominations(int amount);

}
