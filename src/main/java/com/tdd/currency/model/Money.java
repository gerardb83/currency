package com.tdd.currency.model;

public class Money {

	protected Integer amount;
	protected String currency;
	
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount 
				&& currency().equals(money.currency());
	}

	public static Dollar dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	
	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	public String currency() {
		return currency;
	}
	
	public Money times(int multiplyer) {
		return new Money(amount * multiplyer, currency);
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
	
	
}
