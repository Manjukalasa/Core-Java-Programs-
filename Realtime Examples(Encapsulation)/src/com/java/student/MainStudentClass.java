package com.java.student;

public class MainStudentClass {

	public static void main(String[] args)
	{
		 Updation u1=new  Updation();
		 Student s1=new Student("Manju",7795543450l,"1DS19EC417","manju@gmail","kalsa123");
		 u1.Studentdetails(s1);
		 System.out.println("------------------after Upadete email & password-----------------------");
		 u1.updatemail(s1,"manjunathkalasa@gmail");
		 u1.updatepassword(s1,"manju@123");
		 u1.Studentdetails(s1);

		 System.out.println("___________________________________________________________________________");
		 
		 Student s2=new Student("sanju",7775543450l,"1DS19EC420","sanjukalasa@gmail","setty123");
		 u1.Studentdetails(s2);
		 System.out.println("------------------after Upadete email & password-----------------------");
		 u1.updatemail(s2,"sanjusetty123@gmail");
		 u1.updatepassword(s2,"sanju@123");
		 u1.Studentdetails(s2);
		 

	}

}
