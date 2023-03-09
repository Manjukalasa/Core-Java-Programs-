package com.java.hierachical;
class Acc 
{
	long accNo;
	double bal;
	String owner;   
	
public Acc(long accNo,String owner) 
{
  this.accNo=accNo;
  this.owner=owner;
}
public void showcaccuntdetailes()
{
System.out.println(accNo);
System.out.println(owner);
}
public void deposite(double amt)
{
	bal=bal+amt;
	System.out.println(bal);
}
public void withdraw(double amt)
{
	if(bal>amt)
	{
	bal=bal-amt;
	System.out.println(bal);
    }	
}
}
class Sav extends Acc 
{
	public Sav(long accNo,String owner)
	{
	  super(accNo, owner);	
	}
	public void calculateRoi()
	{
		double Roi=0.5;
		bal=bal+bal*Roi;
		System.out.println(bal);
 }
}
class Cur extends Acc
{
	public Cur(long accNo,String owner)
	{
		super(accNo,owner);
	}
		public void showminbal()
		{
			double minbal=1000;
			System.out.println(minbal);
		}
}
public class AccountDeatails
{
	public static void main(String[] args) 
	{
	   Sav s=new Sav(12456952l,"manju");
	   s.showcaccuntdetailes();
//		System.out.println("-----------------------------------------");
//		Savings s2=new Savings(123413245l,"manju kalasa");
//		System.out.println("-----------------------------------------");

	}	
  }
