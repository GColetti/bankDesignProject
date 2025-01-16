package com.fdmgroup.bankDesignProject;

public class CheckingAccount extends Account{

	private int nextCheckNumber = 1;
	
	public CheckingAccount() {
		super();
	}
	
	public int getNextCheckNumber() {
		return nextCheckNumber++;
	}

	@Override
	public double withdraw(double amount) {
		correctBalance(getBalance() - amount);		
		return amount;
	}

	@Override
	public void deposit(double amount) {
		correctBalance(getBalance() + amount);
	}

	@Override
	public void correctBalance(double amount) {
		this.balance = amount;
	}

	@Override
	public long getACCOUNT_ID() {
		return super.getACCOUNT_ID();
	}

	@Override
	public double getBalance() {
		return super.balance;
	}


}
