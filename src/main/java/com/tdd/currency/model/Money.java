package com.tdd.currency.model;

public abstract class Money {

	protected Integer amount;
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount 
				&& getClass().equals(money.getClass());
	}

	public static Dollar dollar(int amount) {
		return new Dollar(amount);
	}
	
	public static Money franc(int amount) {
		return new Franc(amount);
	}
	
	public abstract Money times(int multiplier);


}
