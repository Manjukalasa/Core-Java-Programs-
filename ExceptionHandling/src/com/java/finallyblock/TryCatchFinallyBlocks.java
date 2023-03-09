package com.java.finallyblock;

public class TryCatchFinallyBlocks
{
   public static void divide(int a)
   {
	   try
	   {
	   int res=1000/a;
	   System.out.println(res);
	   int[]res1= {1,2,3,4,5};    // divide(0) not working in this case,because Arithmetic Exception terminate the try block
	   System.out.println(res1[a]);// we can achieve by using finally block(we write entair code in finally block) 
	   }
	   catch(Exception e)
	   {
		   System.out.println("Arithmetic Exception handelled");   
	   }
	   finally
	   {
		   System.out.println("finally");
	   }
   }
	public static void main(String[] args)
	{
	divide(1);
	divide(0);
	divide(5);
	}
}