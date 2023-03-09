package com.java.linkedhashset;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{

	public static void main(String[] args) 
	{
	LinkedHashSet<Object> h1 =new LinkedHashSet<Object>();
	h1.add(1);
	h1.add(3);
	h1.add(45);
	h1.add(1);
	h1.add(16);
	h1.add(33);
	h1.add("manju");
	h1.add(null);
	h1.add(null);
    System.out.println(h1);
    //collections.sort(h1);  // not posible use Arratlist/vectot/treeSe
   //  h1.forEach(Obj -> System.out.println(Obj));
    Iterator<Object> i1=h1.iterator();       // it is used for all collections
	 while(i1.hasNext())
	 {
		 System.out.println(i1.next());
	 }
	}
}
