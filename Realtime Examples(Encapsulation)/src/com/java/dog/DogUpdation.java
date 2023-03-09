package com.java.dog;

public class DogUpdation 
{
public void dogdetails(Dog d)
{
	System.out.println("Dog name "+d.getName());
	System.out.println("Dog Age "+d.getAge());
	System.out.println("Dog breed "+d.getBreed());	
}
public void updatedogdatails(Dog d,String name,int age,String breed)
	{
		d.setName(name);
		d.setAge(age);
		d.setBreed(breed);
	}

}
