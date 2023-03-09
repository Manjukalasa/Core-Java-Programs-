package com.java.accountbalence;

public class LoanAccount implements Account{
	int  Accnum;
	String custname;
	double balance;
		
	public LoanAccount(int accnum, String custname, double balance) {
		Accnum = accnum;
		this.custname = custname;
		this.balance = balance;
	}

	public void viewbalance() {
		System.out.println("Oustanding Balance "+balance);
	}

	@Override
	public void deposit(double amount) {
		if(amount<balance) {
		balance=balance-amount;
		}
		else {
			System.out.println("Paying excess amount");
		}
	}

	@Override
	public void withdraw(double amount) {
		balance=balance+amount;
		}
}