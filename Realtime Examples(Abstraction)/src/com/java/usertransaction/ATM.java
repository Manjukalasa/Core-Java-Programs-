package com.java.usertransaction;
public class ATM implements User   // object implementation
{
	double bal=1000;
	@Override
	public void transfer(int choice,double amt)
	{
		if(choice==1)
		{
			deposit(amt);
		}
		else
		{
			withdraw(amt);
		}
		System.out.println("trensfer of ATM");
	}
	public void deposit(double amt)
	{
			bal=bal+amt;
			System.out.println("amount deposited="+amt);
			System.out.println("Available balence is="+bal);
	}
		public void withdraw(double amt)
		{
			if(bal>amt)
			{
				bal=bal-amt;
				System.out.println("amount withdraw="+amt);
				System.out.println("Available balence is="+bal);
			}
			else
			{
				System.out.println("insufficient balence");
			}
	}
}
