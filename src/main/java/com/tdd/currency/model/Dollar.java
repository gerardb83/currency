package com.tdd.currency.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dollar extends Money {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Dollar(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int multiplyer) {
		return Money.dollar(amount * multiplyer);
	}

	public String currency() {
		return currency;
	}

}
