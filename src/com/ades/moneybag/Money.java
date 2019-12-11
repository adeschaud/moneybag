package com.ades.moneybag;

public class Money {
	
	private int fAmount;
	
	private String fCurrency;
	
	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}
	
	public int amount() {
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
