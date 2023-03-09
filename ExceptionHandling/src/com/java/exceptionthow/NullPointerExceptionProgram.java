package com.java.exceptionthow;

public class NullPointerExceptionProgram
{
   public static void test(String s1)
   {
	   String s=null;
	   if(s.equals(s1))
	   {
	   System.out.println("hi");
       }
   }
	public static void main(String[] args)
	{
	   new NullPointerExceptionProgram().test("hello");
	}

}
