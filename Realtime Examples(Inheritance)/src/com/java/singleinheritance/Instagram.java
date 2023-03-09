package com.java.singleinheritance;
class insta1                  // super class
{
    String name="manju";
	public void addphoto()  
	{
	System.out.println("addphoto() of super class");
    }
	public void addvideo()
	{
		System.out.println("addvideo() of super clss");
	}
}
class insta2 extends insta1      //sub class
{
	public void reels()
	{
		System.out.println("reels() of sub clss");
	}
}
public class Instagram
{
	public static void main (String[] args)
	{    
	   
	   insta1 i1=new insta1();
	   System.out.println(i1.name);	
       i1.addphoto();
       i1.addvideo();
       System.out.println("-----------------------------------");	
       insta2 i2=new insta2();
       i2.addphoto();
       i2.addvideo();
       i2.reels();

	}

}