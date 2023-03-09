package com.java.vector;
import java.util.Collections;
import java.util.Vector;

public class VectorExample
{
		public static void main(String[] args) 
		{
	     Vector<Integer> v =new Vector<Integer>();
	     v.add(1);
	     v.add(3);
	     v.add(2);
	     v.add(5);
	     v.add(4);
	     System.out.println("befpr sorting: "+v);
	      Collections.sort(v);  // ascending order
	   //  Collections.sort(v,Collections.reverseOrder());  // descending order
	     System.out.println("after sorting: "+v);
	     for(int i=0;i<v.size();i++)
	     {
	    	 System.out.println(v.get(i));
	     }
//	     Iterator<Integer> i1=v.iterator();
//		 while(i1.hasNext())
//		 {
//			 System.out.println(i1.next());
//		 }
	  }
	}
