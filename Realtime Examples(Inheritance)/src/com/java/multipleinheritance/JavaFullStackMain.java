package com.java.multipleinheritance;

interface Corejava
{
	public void javacources();
}
interface Web
{
	public void webcources();
}
interface SQL
{
	public void sqlcources();
}
class JavaFullStackCource implements Corejava,Web,SQL 
{
	@Override
	public void javacources() {
	System.out.println("core java concepts");
		
	}

	@Override
	public void webcources() {
		System.out.println("Web technology concepts");
		
	}
	@Override
	public void sqlcources() {
		System.out.println("SQL concepts");
		
	}
}
public class JavaFullStackMain 
{
	public static void main(String[] args)
	{
		JavaFullStackCource jf=new JavaFullStackCource();
        jf.javacources();
        jf.webcources();
        jf.sqlcources();
   
	}

}