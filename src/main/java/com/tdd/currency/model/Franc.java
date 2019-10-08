package com.tdd.currency.model;

public class Franc extends Money {
	
	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int multiplyer) {
		return new Franc(amount * multiplyer);
	}
	
	public String currency() {
		return "CHF";
	}
}
