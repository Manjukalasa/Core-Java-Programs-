package com.java.hibreadinheritance;

class Flipkart                
{
	public void order()
	{
		System.out.println("order placed");
	}
}
class Fashion extends Flipkart
{
	public void men()
	{
		super.order();
		System.out.println("men fashion cloths");
	}
	public void women()
	{
		super.order();
		System.out.println("women fashion cloths");
	}
}
class electronics extends Flipkart
{
	public void mobile()
	{
		super.order();
		System.out.println("moblie ordered");
	}
	public void laptop()
	{
		System.out.println("laptop ordered");
	}
}
class BrandFashion extends Fashion
{
	public void puma()
	{
		super.men();
		super.women();
		super.order();
		System.out.println("puma dresses oredred");
	}
	public void nike()
	{
		super.men();
		super.women();
		System.out.println("nike dresses ordered");
	}
}
class Brandelectronics extends electronics
{
	public void Samsug()
	{
		super.mobile();
		System.out.println("samsug moblie");
	}
	public void acer()
	{
		System.out.println("acer laptop ordered");
	}
	public void hp()
	{
		System.out.println("hp laptop ordered");
	}
}
public class FlipkartMain
{
	public static void main (String[] args)
	{    
		BrandFashion b1 =new BrandFashion();
     	b1.puma();
//		b1.nike();
//		b1.men();
//		b1.women();
//		b1.order();
		System.out.println("---------------------------------------");
		Brandelectronics b2 =new Brandelectronics();
		b2.Samsug();
//		b2.acer();
//		b2.hp();
//		b2.mobile();
//		b2.laptop();
//		b2.order();
	}
	}
