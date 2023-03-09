package com.java.student;

public class Updation
{
public void Studentdetails(Student s1)
{
	System.out.println("Student Name: "+s1.getStdname());
	System.out.println("Student Mno: "+s1.getStdnmobileno() );
	System.out.println("Student USN: "+s1.getStdusn());
	System.out.println("Student Mail-id: "+s1.getStdmail());
	System.out.println("Student p: "+s1.getStdpsw());
}
public void updatemail(Student s1,String Stdmail)
{
	s1.setStdmail(Stdmail);
}
	public void updatepassword(Student s1,String Stdpsw)
	{
		s1.setStdpsw(Stdpsw);
	}
}
