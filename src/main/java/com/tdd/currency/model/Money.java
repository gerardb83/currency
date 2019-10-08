package com.tdd.currency.model;

public class Money {

	protected Integer amount;
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount 
				&& getClass().equals(money.getClass());
	}
}
