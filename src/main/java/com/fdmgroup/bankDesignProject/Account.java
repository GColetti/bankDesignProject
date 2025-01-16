package com.fdmgroup.bankDesignProject;

public abstract class Account {
	
	private long ACCOUNT_ID;
	private static long nextAccountId = 1000;
	protected double balance;
	
	public Account() {
		ACCOUNT_ID = nextAccountId;
		nextAccountId += 5;
	}

	public double withdraw(double amount) {
		correctBalance(getBalance() - amount);		
		return amount;
	}

	public void deposit(double amount) {
		correctBalance(getBalance() + amount);
	}

	public void correctBalance(double amount) {
		this.balance = amount;
	}

	public long getACCOUNT_ID() {
		return ACCOUNT_ID;
	}

	public double getBalance() {
		return balance;
	}

}
