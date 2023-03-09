package com.java.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLisExample 
{

	public static void main(String[] args) 
	{
		LinkedList<Object> p1 =new  LinkedList<Object>();
		 p1.add(1);
		 p1.add(3);
		 p1.add(7);
		 p1.add(8);
		 p1.add(null);
		 p1.add("manju");
		 p1.add(null);
		 System.out.println(p1);
		 System.out.println(p1.peek());
		 System.out.println(p1.poll());
		 System.out.println(p1.element());
		 System.out.println(p1);
		 System.out.println(p1.get(0));
		// p1.forEach(Obj ->System.out.print(Obj+" "));
		  Iterator<Object> i1=p1.iterator();       // it is used for all collections
			 while(i1.hasNext())
			 {
				 System.out.println(i1.next());
			 }
	}

}
