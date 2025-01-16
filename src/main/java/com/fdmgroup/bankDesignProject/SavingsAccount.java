package com.fdmgroup.bankDesignProject;

public class SavingsAccount extends Account {

	private double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public void addInterest() {
		balance += balance * interestRate / 100;
	}
	
	public double getInterestRate() {
		return interestRate;
	} 
	
	public void setInterestRate(double rate) {
		this.interestRate = rate;
	} 
	
	@Override
	public double withdraw(double amount) {
		if (amount < balance) {
			correctBalance(getBalance() - amount);		
			return amount;
		} else {
			return 0;
		}
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
