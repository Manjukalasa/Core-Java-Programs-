package com.java.swiggy;

public class Service
{
	 Swiggy s1;
  public Swiggy Createobject(String col)
  {
	  if(col=="Green")
	  {
		 s1=new Veg();
		  return s1;
	  }
	  else
	  {
		  s1=new NonVeg();
		  return s1;
	  }
  }
}
