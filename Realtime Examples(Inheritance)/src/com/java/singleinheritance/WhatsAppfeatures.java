package com.java.singleinheritance;
class Wa1                  // super class
{
	long Mobileno=7795543450l;

	public  void sendmessage()  // 	public long sendmessage()  
	{
	System.out.println("sendmessage() of super class");
	return ;                     // optinal //	return Mobileno;   
    }
}
class Wa2  extends Wa1  //sub class
{
	public void addstatus()
	{
		System.out.println("addstatus() of sub clss");
	}
	public void sendvoicemsg()
	{
		System.out.println("sendvoicemsg() of sub clss");
	}
}
public class WhatsAppfeatures
{
	public static void main (String[] args)
	{
       Wa1 w1=new Wa1();
       System.out.println(w1.Mobileno);	
       w1.sendmessage();
       System.out.println("------------------------");	
       Wa2 w2=new Wa2();
       w2.sendmessage();
       w2.addstatus();
       w2.sendvoicemsg();
	}

}