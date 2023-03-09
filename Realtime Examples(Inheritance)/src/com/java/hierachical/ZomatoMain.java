package com.java.hierachical;
class Zonamto
{
	public void order()
	{
		System.out.println("items Ordered");		
	}
}
class Veg extends Zonamto
{
	public void vegitems()
	{
		System.out.println("veg items selected");
	}
}
class NonVeg extends Zonamto
		{
			public void  nonvegitems()
			{
				System.out.println("Nonveg items selected");	
			}
}
public class ZomatoMain
{
	public static void main(String[] args) 
	{
		Veg v=new Veg();
		v.vegitems();
		v.order();
		NonVeg n=new NonVeg();
		n.nonvegitems();
		n.order();
	}
}