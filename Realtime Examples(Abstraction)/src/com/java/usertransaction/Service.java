package com.java.usertransaction;
public class Service  // object Creation
{
	User u1;
public User createobject(int atmpin)
{
	if(atmpin == 1234)
	{
	  u1=new ATM();   // upcasting
	  System.out.println("Object  of ATM is created");
	  return u1;	 
	}
	else
	{
		  u1=new Web();  // upcasting
		  System.out.println("Object  of Web is created");
		  return u1;	 
		}
   }
}

