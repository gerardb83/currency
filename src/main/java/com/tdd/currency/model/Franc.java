package com.tdd.currency.model;

public class Franc extends Money {
	
	public Franc(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int multiplyer) {
		return Money.franc(amount * multiplyer);
	}
	
	public String currency() {
		return currency;
	}
}
