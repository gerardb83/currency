package com.tdd.currency;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tdd.currency.model.Dollar;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CurrencyApplicationTests {

//	@Test
//	public void contextLoads() {
//	}

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		Integer expected = 10;
		Integer actual = five.amount;
		assertEquals(expected, actual);
	}
}
