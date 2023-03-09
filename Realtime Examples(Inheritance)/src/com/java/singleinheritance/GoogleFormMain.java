package com.java.singleinheritance;

class GoogleForm                  // super class
{
	public void login(String name,long number,String gmail)
	{
		System.out.println("fill your details");
	}	
}
class Fill extends GoogleForm  //sub class
{
	public void login(String name,long number,String gmail)
	{
		System.out.println(name+" "+number+" "+ gmail);
	}
	public void submit()
	{
		System.out.println("Application submitted");
	}
}
public class GoogleFormMain
{
	public static void main (String[] args)
	{
		Fill f1=new Fill();
         f1.login("manju",7795543450l,"manan@123");
         f1.submit();
	}

}