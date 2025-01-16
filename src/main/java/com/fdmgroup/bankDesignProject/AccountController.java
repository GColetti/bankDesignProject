package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class AccountController {

	private List<Customer> customers = new ArrayList<Customer>();;
	private List<Account> accounts = new ArrayList<Account>();;

	public Customer createCustomer(String name, String address, String type) {
		if (type.equals("person")) {
			Person newPerson = new Person(name, address);
			customers.add(newPerson);
			return newPerson;
		} else {
			Company newCompany = new Company(name, address);
			customers.add(newCompany);
			return newCompany;
		}
	}

	public Account createAccount(Customer customer, String type) {
		if (type.equals("checking")) {
			CheckingAccount newCheckingAccount = new CheckingAccount();
			accounts.add(newCheckingAccount);
			customer.addAccount(newCheckingAccount);
			return newCheckingAccount;
		} else {
			SavingsAccount newSavingsAccount = new SavingsAccount();
			accounts.add(newSavingsAccount);
			customer.addAccount(newSavingsAccount);
			return newSavingsAccount;
		}
	}

	public void removeCustomer(Customer customer) {
		customers.remove(customer);
		accounts.removeAll(customer.getAccounts());
	}

	public void removeAccount(Account account) {
		List<Account> accountsToRemove = new ArrayList<Account>();
		
		accounts.remove(account);
		for (Customer c : customers) {
			for (Account a : c.getAccounts()) {
				if (a.getACCOUNT_ID() == account.getACCOUNT_ID()) {
					accountsToRemove.add(a);
				}
			}
			for (Account a : accountsToRemove) {
				c.removeAccount(a);
			}
		}
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

}
