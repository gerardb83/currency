package com.tdd.currency.model;

public interface Expression {

	Money reduce(Bank bank, String to);
	
}
