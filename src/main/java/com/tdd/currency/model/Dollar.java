package com.tdd.currency.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dollar {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	public Integer amount;
	
	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplyer) {
		return new Dollar(amount * multiplyer);
	}
	
	public boolean equals(Object object) {
		Dollar dollar = (Dollar) object;
		return amount == dollar.amount;
	}


}
