package com.java.finallyblock;

public class UseOfFinallyBlock1
{
	 public static void divide(int a)
	   {
		   try          // we can use try inside the try and catch Blocks
		   {
		   int res=1000/a;
		   System.out.println(res);
		      try     
		      {
		      String res2="manju";
		      System.out.println(res2.charAt(a));
		      }
		      catch(Exception e)
		      {
			   System.out.println("string exception handelled");   
		      }
		   }
		   catch(Exception e)
		   {
			   System.out.println("exception handelled");   
		   }
		   finally
		   {
			   try
			   {
			   int[]res1= {1,2,3,4,5,6};
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
		divide(5);
		}
}
