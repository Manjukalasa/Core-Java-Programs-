package com.java.student;

public class Student
{
String Stdname;
long Stdnmobileno;
String Stdusn;
String Stdmail;
String Stdpsw;
public Student(String stdname, long stdnmobileno, String stdusn, String stdmail, String stdpsw) 
{
	this.Stdname = stdname;
	this.Stdnmobileno = stdnmobileno;
	this.Stdusn = stdusn;
	this.Stdmail = stdmail;
	this.Stdpsw = stdpsw;
}
public String getStdname()
{
	return Stdname;
}
public void setStdname(String stdname) 
{	
	this.Stdname = stdname;
}
public long getStdnmobileno() 
{
	return Stdnmobileno;
}
public void setStdnmobileno(long stdnmobileno)
{
	this.Stdnmobileno = stdnmobileno;
}
public String getStdusn() 
{
	return Stdusn;
}
public void setStdUSN(String stdusn) {
	this.Stdusn = stdusn;
}
public String getStdmail() {
	return Stdmail;
}
public void setStdmail(String Stdmail) 
{
	this.Stdmail = Stdmail;
}
public String getStdpsw() 
{
	return Stdpsw;
}
public void setStdpsw(String Stdpsw) 
{
	this.Stdpsw = Stdpsw;
}
}
