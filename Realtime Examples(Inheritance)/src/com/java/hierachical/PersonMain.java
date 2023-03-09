package com.java.hierachical;
class Person
{
	public void name(String name)
	{
		System.out.println(name);		
	}
}
class Student extends Person
{
	public void stdusn(String USN)
	{
		System.out.println(USN);
	}
}
class Employee extends Person
		{
			public void  emmid(int id)
			{
				System.out.println(id);	
			}
}
public class PersonMain
{
	public static void main(String[] args) 
	{
		 Employee e=new Employee();
		 e.name("kalasa");
		 e.emmid(101);
		 Student s= new Student();
	     s.name("manju");
	     s.stdusn("1DS19EC417");
	}
}