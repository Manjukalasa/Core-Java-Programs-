package com.java.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample 
{

	public static void main(String[] args) 
	{
		PriorityQueue<Object> p1 =new  PriorityQueue<Object>();
		p1.add(1);
		// p1.add(1);
		p1.add(3);
		p1.add(10);
		p1.add(7);
		p1.add(8);
		//p1.add("manju");  // do not allow heterogeneous elements(jvm will throw class cast exception
		System.out.println(p1);
		System.out.println("-----------peak----------------");
		System.out.println(p1.peek());
		System.out.println(p1);
		System.out.println("-----------pool----------------");
		System.out.println(p1);
		System.out.println(p1.poll());
		System.out.println(p1);
		System.out.println("-----------element----------------");
		System.out.println(p1.element());
		System.out.println("manja"+'4');
		Iterator<Object> i1=p1.iterator();     
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
