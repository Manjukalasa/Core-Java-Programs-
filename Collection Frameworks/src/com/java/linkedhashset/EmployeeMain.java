package com.java.linkedhashset;
import java.util.*;

public class EmployeeMain 
{
	public void addemp()
	{
	Employee e1=new Employee("name1", 101,20000);
	Employee e2=new Employee("name2", 102,21000);
	Employee e3=new Employee("name3", 103,22000);
	Employee e4=new Employee("name4", 104,23000);
	LinkedHashSet<Employee> emplist =new LinkedHashSet<Employee>();
	 emplist.add(e2);
	 emplist.add(e1);
	 emplist.add(e1);
	 emplist.add(e3);
	 emplist.add(e2);
	 emplist.add(e4);
	 System.out.println(emplist);
	 Vector<Employee> emp =new Vector<Employee>(emplist);
	 Collections.sort(emp);
	 for(int i=0;i<emp.size();i++)
     {
    	 System.out.println(emp.get(i));
     }
	}
	public static void main(String[] args)
	{
		EmployeeMain m1=new EmployeeMain();
		m1.addemp();
	}

}
