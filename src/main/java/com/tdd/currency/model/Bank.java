package com.tdd.currency.model;

import java.util.Hashtable;

public class Bank {

	@SuppressWarnings("rawtypes")
	private Hashtable rates = new Hashtable();

	public Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}

	@SuppressWarnings("unchecked")
	public void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), new Integer(rate));
	}

	public int rate(String from, String to) {
		if (from.equals(to)) return 1;
		Integer rate = (Integer) rates.get(new Pair(from, to));
		return rate.intValue();
	}

}
