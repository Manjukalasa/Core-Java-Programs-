package com.java.accountbalence;

public class AccountMain {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		SavingsAccount sa = new SavingsAccount(123456, "manju", 10000.00);
		
		LoanAccount la = new LoanAccount(987654, "kalasa", 20000.00);
		
		Transaction t = new Transaction();
		
		System.out.println("Savings Account Operation");
		t.checkviewbalance(sa);
		t.deposittxn(sa, 1000.00);
		t.checkviewbalance(sa);
		t.withdrawtxn(sa, 500.00);
		t.checkviewbalance(sa);
		
		System.out.println("---------------------------");
		
		System.out.println("Loan Account Operation");
		t.checkviewbalance(la);
		t.deposittxn(la, 1000.00);
		t.checkviewbalance(la);
		t.withdrawtxn(la, 500.00);
		t.checkviewbalance(la);
		
		System.out.println("Main Method Ended");
	}
}