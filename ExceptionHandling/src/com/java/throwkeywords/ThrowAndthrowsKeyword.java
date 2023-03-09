package com.java.throwkeywords;
public class ThrowAndthrowsKeyword
{
public static void add(int a,int b)throws ArithmeticException
{
	if(a>=0 && b>=0)
	{
		int res=a+b;
		System.out.println(res);
	}
	else
	try
	{
      //   throw new ArithmeticException(); 
       throw new ArithmeticException("hiiii");
    }
	catch(Exception e)
	{
		//System.out.println(e.getMessage());
	    System.out.println("negetive number");
	}
}
public static void main(String[] args) 
  {
     add(1,1);
     add(0,0);
     add(-1,1);
  }
}
