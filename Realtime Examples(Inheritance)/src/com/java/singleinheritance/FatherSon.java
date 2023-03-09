package com.java.singleinheritance;
class Father                  // super class
{
	public  void eye() 
	{
	System.out.println("father eye");      
    }
	public  void hair() 
	{
	System.out.println("father hair");      
    }
}
class Son  extends Father  //sub class
{
	public void eye()
	{
		System.out.println("similar eye");
	}
	public void hair()
	{
		System.out.println("similar hair");
	}
	public void skincolour()
	{
		System.out.println("different colour");
	}
}
public class FatherSon
{
	public static void main (String[] args)
	{
       Son s1=new Son();
       s1.hair();
       s1.eye();
       s1.skincolour();
	}

}