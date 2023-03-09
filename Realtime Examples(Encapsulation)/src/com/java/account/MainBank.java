package com.java.account;

public class MainBank 
{
	public static void main(String[] args) 
	{
		Transaction t1=new Transaction();
		Account a1=new Account();
         t1.deposit(10000.0, a1);
         t1.checkbal(a1);
         t1.withdraw(400.0,a1);
         t1.checkbal(a1);
         t1.deposit(-6000.0, a1);
         t1.checkbal(a1);
	}

}