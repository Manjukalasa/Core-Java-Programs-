package com.java.hibreadinheritance;
class Zomato               
{
	public void order()
	{
		System.out.println("order placed");
	}
}
class Veg extends Zomato
{
	public void vegitems()
	{
		
		System.out.println("veg items");
	}
}
class Nonveg extends Zomato
{
	public void nonvegitems()
	{

		System.out.println("nonveg items");
	}
}
class Rice extends Veg
{
	public void gheerice()
	{
		super.vegitems();
		System.out.println("Ghee rice selected");
	}
	public void masalarice()
	{
		super.vegitems();
		System.out.println("masala rice selected");
	}
}
class Biriyani extends Nonveg
{
	public void AmburBiriyani()
	{
		super.nonvegitems();
		System.out.println("amburbiriryani selected");
	}
	public void hydrabadbiriyani()
	{
		super.nonvegitems();
		System.out.println("Hydrabad biriryani selected");
	}
}
public class ZomatoMain
{
	public static void main (String[] args)
	{    
		Biriyani b= new Biriyani();
		b. hydrabadbiriyani();
		System.out.println("------------------------------------");
		Rice r= new Rice();
		r.gheerice();
		r.order();
	}
}
