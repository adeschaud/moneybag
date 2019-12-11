package com.ades.moneybag;

public class Money {
	
	private double fAmount;
	
	private String fCurrency;
	
	public Money(double amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}
	
	public double amount() {
		return fAmount;
	}
	
	public String currency() {
		return fCurrency;
	}
	
	public Money add(Money m) {
		if(fCurrency == m.currency()) fAmount+=m.amount();
		return this;
	}
	
	public Money add(int nAmount, String nCurrency) {
		if(fCurrency == nCurrency) fAmount+=nAmount;
		return this;
	}
}
