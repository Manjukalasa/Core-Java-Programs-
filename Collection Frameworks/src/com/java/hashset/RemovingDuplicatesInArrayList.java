package com.java.hashset;

import java.util.*;

public class RemovingDuplicatesInArrayList
{
	public static void main(String[] args) 
	{
     ArrayList<Object> h1 =new ArrayList<Object>();
     h1.add(1);
     h1.add(2);
     h1.add(6);
     h1.add(6);
     h1.add(null);
     h1.add(6);
     h1.add(null);
     h1.add(3);
     h1.add(4);
     h1.add(4);
     for(int i=0;i<h1.size();i++)
     {
    	 System.out.print(h1.get(i)+" ");
     }
     System.out.println();
     HashSet<Object> h2 =new  HashSet<Object>(h1);
     h2.forEach(Obj -> System.out.println(Obj));
     }

}
