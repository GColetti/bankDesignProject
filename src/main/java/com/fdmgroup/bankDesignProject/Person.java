package com.fdmgroup.bankDesignProject;

import java.util.List;

public class Person extends Customer {

	public Person(String name, String address) {
		super(name, address);
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
			a.withdraw(amount);
		}
	}

	

}
