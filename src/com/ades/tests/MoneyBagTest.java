package com.ades.tests;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import com.ades.moneybag.Money;
import com.ades.moneybag.MoneyBag;

public class MoneyBagTest {

	@Test
	void testNormalizeCurrency() {
		MoneyBag mB = new MoneyBag();
		Money m = mB.normalizeCurrency(new Money(5, "EUR"));
		Assertions.assertEquals(m.currency(),"USD");
		Assertions.assertEquals(m.amount(),5.545);
	}
	
//	@TestFactory
//	Stream<DynamicTest> testAdd(){
//		Money m1 = new Money(5,"EUR");
//		Money m2 = new Money(10,"USD");
//		
//		MoneyBag mB = new MoneyBag();
//		mB.add(m1);
//		mB.add(m2);
//		
//		return mB.moneys().stream()
//				.map(termes -> DynamicTest.dynamicTest("add : " + termes, () -> (
//					int i =input.indexOf(termes);
//				
//				)));
//		
//		return null;
//	}
}
