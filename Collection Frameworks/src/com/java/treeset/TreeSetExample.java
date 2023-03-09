
package com.java.treeset;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample
{
	public static void main(String[] args)
	{ 
	 TreeSet<Integer> tset =new TreeSet<Integer>();
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
	 Iterator<Integer> i1=tset.iterator();
	 while(i1.hasNext())
	 {
		 System.out.println(i1.next());
	 }
	}
}