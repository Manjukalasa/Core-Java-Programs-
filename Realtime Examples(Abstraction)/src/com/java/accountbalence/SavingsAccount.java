package com.java.accountbalence;

public class SavingsAccount implements Account{
	int  Accnum;
	String custname;
	double balance;

public SavingsAccount(int accnum, String custname, double balance) {
	
		Accnum = accnum;
		this.custname = custname;
		this.balance = balance;
	}

@Override
public void viewbalance() {
	System.out.println("Available Balance "+balance);
}

@Override
public void deposit(double amount) {
	balance=balance+amount;
}

@Override
public void withdraw(double amount) {
	if(amount<balance) {
	balance=balance-amount;
	}
	else {
		System.out.println("Insufficient balance");
	}
}

}