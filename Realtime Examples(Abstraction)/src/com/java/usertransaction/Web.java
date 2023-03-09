package com.java.usertransaction;
public class Web implements User  // object implementation
{
	double bal=1000;
	@Override
	public void transfer(int choice,double amt) 
	{
		if(choice==1)
		{
			recieve(amt);  
		}
		else
		{
			send(amt);
		}
		System.out.println("trensfer of Web");
	}
	public void send(double amt)
	{
		if(bal>amt)
		{
			bal=bal-amt;
			System.out.println("amount Sended="+amt);
			System.out.println("Available balence is="+bal);
		}
		else
		{
			System.out.println("insufficient balence");
		}
	}
		public void recieve(double amt)
		{
				bal=bal+amt;
				System.out.println("amount Recevied="+amt);
				System.out.println("Available balence is="+bal);
	}

}
