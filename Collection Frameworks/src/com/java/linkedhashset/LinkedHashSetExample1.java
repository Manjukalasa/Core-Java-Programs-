package com.java.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetExample1
{
	public static void main(String[] args)
	{ 
	 LinkedHashSet<Integer> tset =new LinkedHashSet<Integer>();
	 tset.add(4);
	 tset.add(8);
	 tset.add(3);
	 tset.add(1);
	 tset.add(9);
	 tset.add(10);
	 tset.add(7);
	 tset.add(8);
	 tset.add(4);
	 tset.add(2);
	 System.out.println(tset);
	 TreeSet<Integer> tset1 =new TreeSet<Integer>(tset); //  Heterogeneous elements not posibles(only Intrger valuse)
	 Iterator<Integer> i1=tset1.iterator();
	 while(i1.hasNext())
	 {
		 System.out.println(i1.next());
	 }
	}
}