package com.java.dog;

public class DogMain
{

	public static void main(String[] args) 
	{
     DogUpdation u= new DogUpdation();
     Dog d=new Dog("tommy", 5,"Bulldog");  // one dog details
     u.dogdetails(d);
     System.out.println("---------------------------------------");
     u.updatedogdatails(d, "jully",3,"german shepherd");
     u.dogdetails(d); 
	}

}
