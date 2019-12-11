package com.ades.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ades.moneybag.Money;

public class MoneyTest {
	
	@Test
	void testGetAmount() {
		Money m = new Money(5,"EUR");
		Assertions.assertEquals(5, m.amount());
	}
	
	@Test
	void testGetCurrency() {
		Money m = new Money(5,"EUR");
		Assertions.assertEquals("EUR", m.currency());
	}
	
	@Test
	void testAddMoneySameCurrency() {
		Money m1 = new Money(5,"EUR");
		Money m2 = new Money(7,"EUR");
		m1.add(m2);
		Assertions.assertEquals(12,m1.amount());
	}

	@Test
	void testAddMoneyDifferentCurrency() {
		Money m1 = new Money(5,"USD");
		Money m2 = new Money(7,"EUR");
		m1.add(m2);
		Assertions.assertEquals(5, m1.amount());
	}
	
	@Test
	void testAddNegativeMoney() {
		Money m1 = new Money(5,"EUR");
		Money m2 = new Money(-2,"EUR");
		m1.add(m2);
		Assertions.assertEquals(3, m1.amount());
	}
	
	@Test
	void testAddWithAmountAndCurrency(){
		Money m1 = new Money(5,"EUR");
		m1.add(12,"EUR");
		Assertions.assertEquals(17,m1.amount());
	}
	
	@Test
	void testAddWithAmountAndDifferentCurrency() {
		Money m1 = new Money(5,"EUR");
		m1.add(12,"USD");
		Assertions.assertEquals(5,m1.amount());
	}
	
	@Test
	void testConstructor() {
		Money m1 = new Money(5,"EUR");
		Assertions.assertEquals(5, m1.amount());
		Assertions.assertEquals("EUR",m1.currency());
	}
	
}
