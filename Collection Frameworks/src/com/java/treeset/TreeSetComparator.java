package com.java.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Descending implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2)
	{
         return o1.compareTo(o2);  // ascending order(not neccessory)
	 //  return o2.compareTo(o1);   // descending order
	}
}
class LengthOrder implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2)
	{
        //  return o1.length()-o2.length();       // ascending order
		     return o2.length()-o1.length();      // descending order
	}
}
public class TreeSetComparator 
{
	public static void main(String[] args)
	{
	     Descending d=new Descending();  // find comparing (chars uincode valuse)ascendin or descending order
	     LengthOrder l=new LengthOrder(); // find comparing(lenth)
		 TreeSet<String> tset =new TreeSet<String>(d);
		// TreeSet<String> tset =new TreeSet<String>(l);
		 tset.add("manju");
		 tset.add("kalasa");
		 tset.add("Hi");
		 tset.add("mbk");
		 System.out.println(tset);
       //  tset.forEach(Obj ->System.out.println(Obj));  // using foreach method
		  Iterator<String>  i1=tset.iterator();       // it is used to traverse all collections elements only forward direction
			 while(i1.hasNext())
			 {
				 System.out.println(i1.next());
			 }
	}

}
