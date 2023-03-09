package com.java.accountbalence;

public class Transaction {
	
	void checkviewbalance(Account a)
	{
		a.viewbalance();
	}
	void deposittxn(Account a, double amount)
	{
		System.out.println("Depositing Amount "+amount);
		a.deposit(amount);
	}
	void withdrawtxn(Account a, double amount)
	{
		System.out.println("Withdrawing Amount "+amount);
		a.withdraw(amount);
	}
}