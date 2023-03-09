package com.java.exceptionthow;
class A3
{
	public  void test()
	{
		System.out.println("test(); of A2 superclass ");
	}
}
class B3 
{
	public void count()
	{
		System.out.println("coutn(); of B2 subclass");
	}
}
public class NullPointerException
{
	public static void main(String[] args) 
	{
	 A3 a=new A3();
     a.test(); 
     System.out.println("------------------------------");
     B3 b=new B3();
      b=null;          // b objject is a Null--->NullPointerException
     System.out.println("JVM will throw------------ NullPointerException----------------------");
     // after this mathod is executed JVM will be throw error
      b.count();
      a.test();
	}
}
