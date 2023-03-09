package com.java.account;

public class Transaction 
{
public void deposit(double amt,Account a1)
{
	if(amt>0)
	{
   double b1=a1.getbal();
     b1=b1+amt;
     a1.setbal(b1);
    }
	else
	{
		System.out.println("invalid deposite");
	}
}
public void withdraw(double amt,Account a1)
{
	if(a1.getbal()>amt)
	{
   double b2=a1.getbal();
   b2=b2-amt;
   a1.setbal(b2);
    }
	else
	{
		System.out.println("insufficient balence");
	}
}
public void checkbal(Account a1)
  {
	System.out.println("Current bal: "+ a1.getbal());
   }
}