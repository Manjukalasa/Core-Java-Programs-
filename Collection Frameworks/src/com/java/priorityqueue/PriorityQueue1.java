package com.java.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1
{

	public static void main(String[] args) 
	{
		PriorityQueue<Object> p1 =new  PriorityQueue<Object>();
		p1.add(1);
		p1.add(5);
		p1.add(7);
		p1.add(8);
		p1.add(9);
		p1.add(10);
		p1.add(11);
		p1.add(12);
		//p1.add("manju");  // do not allow heterogeneous elements(jvm will throw class cast exception
		System.out.println(p1);
		p1.poll();
		Iterator<Object> i1=p1.iterator();     
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
