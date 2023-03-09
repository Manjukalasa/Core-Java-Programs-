package com.java.finallyblock;

public class UseOfFinallyBlock
{
	 public static void divide(int a)
	   {
		   try
		   {
		   int res=1000/a;
		   System.out.println(res);
		   }
		   catch(Exception e)
		   {
			   System.out.println("exception handelled");   
		   }
		   finally
		   {
			   try
			   {
			   int[]res1= {1,2,3,4,5};
			   System.out.println(res1[a]);
			   }
			   catch(Exception e)
			   {
				   System.out.println("invalide index");   
			   }
		   }
	   }
		public static void main(String[] args)
		{
		divide(1);
		divide(0);
		divide(5);
		}
}
