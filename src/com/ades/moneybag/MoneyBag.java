package com.ades.moneybag;

import java.util.ArrayList;

public class MoneyBag {

	private ArrayList<Money> moneys;
	
	public static final double EUR_TO_USD = 1.109;
	public static final double GBP_TO_USD = 1.317;
	public static final double CHF_TO_USD = 1.014;
	
	public ArrayList<Money> moneys() {
		return moneys;
	}
	
	public Money normalizeCurrency(Money m) {
		double newAmount = 0;
		switch (m.currency()) {
		case "EUR":
			newAmount = EUR_TO_USD*m.amount();
			break;
		case "GBP":
			newAmount = GBP_TO_USD*m.amount();
			break;
		case "CHF":
			newAmount = CHF_TO_USD*m.amount();
			break;
		case "USD":
			newAmount = m.amount();
			break;
		default:
			return null;
		}
		return new Money(newAmount,"USD");
	}
	
	public void add(Money m) {
		m = normalizeCurrency(m);
		moneys.add(m);
	}
}
