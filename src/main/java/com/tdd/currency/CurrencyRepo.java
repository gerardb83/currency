package com.tdd.currency;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdd.currency.model.Dollar;

public interface CurrencyRepo extends JpaRepository <Dollar, Long> {

}
