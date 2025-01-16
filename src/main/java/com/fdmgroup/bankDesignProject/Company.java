package com.fdmgroup.bankDesignProject;

import java.util.List;

public class Company extends Customer {

	public Company(String name, String address) {
		super(name, address);
	}

	public void addAccount(Account account) {
		super.addAccount(account);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getAddress() {
		return super.getAddress();
	}

	@Override
	public List<Account> getAccounts() {
		return super.getAccounts();
	}

	@Override
	public void chargeAllAccounts(double amount) {
		for (Account a : getAccounts()) {
			if (a instanceof SavingsAccount) {
				a.withdraw(amount * 2);
			} else {
				a.withdraw(amount);
			}
		}
	}
}
