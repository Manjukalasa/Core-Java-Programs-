package com.java.swiggy;

public class SwiggyMain {

	public static void main(String[] args)
	{
		Service t1=new Service();
	Swiggy s1=	t1.Createobject("Green");
	s1.order();
	Swiggy s2=	t1.Createobject("Red");
	s2.order();
	
	}

}
