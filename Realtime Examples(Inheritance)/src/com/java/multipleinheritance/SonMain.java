package com.java.multipleinheritance;
interface Father
{
	public void eye();
	public void hair();
//	public static void eye()  // static---> overriding not posible
//	{
//		System.out.println("blue eye");
//	}
//	public default void  hair()   // default---> overriding is compulsory(we have implementation body that time use)
//	{
//		System.out.println("Brown colour hair");
//	}
}
interface Mother
{
	public void heigth();
	public void colour();
}
class Son implements Father,Mother
{

	@Override
	public void eye() 
	{
		System.out.println("father eye");	
	}

	@Override
	public void hair() {
		System.out.println("father hairs");
	}
	@Override
	public void heigth() {
		System.out.println("mother haigth");	
	}
	@Override
	public void colour() 
	{
		System.out.println("mother colour");	
	}
	
}
public class SonMain 
{
	public static void main(String[] args)
	{
	  Son s=new Son();
      s.eye();
      s.hair();
      s.colour();
      s.heigth();
   
	}

}