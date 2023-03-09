package com.java.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkeHashMapExample
{
	public static void main(String[] args)
	{
         Map<Integer,String> map=new LinkedHashMap<Integer,String>();  // preserve insertion oreder
         map.put(1,"Hello");
         map.put(null,null);
        // map.put(null,"nhj");
         map.put(5,null);
         map.put(6,null);
         map.put(3,"abc");
         map.put(2,"manju");
         map.put(16,"mk"); //16%16==0
         map.put(17,"mbk");
         map.put(1,"mkalasa");  // derefferd previous object and pointing to new obeject
      // map.clear();
//    System.out.println(map.containsKey(2));// false
//    System.out.println(map.containsKey(3));// true
//    System.out.println(map.containsValue("manju"));// false
//    System.out.println(map.containsValue("abc")); // ture
    
    // Retriveing key & elements from hashSet by using KeySet()method
    Set<Integer> keys =map.keySet();
    for(Integer key : keys)
    {
    	System.out.println(key+" "+map.get(key));
    }
    
    System.out.println("---------------------------------------------------");
   
    // Retriveing key & elements from hashSet by using EntrySet()method
    for( Map.Entry<Integer, String> ref : map.entrySet())
    {
    	System.out.println(ref.getKey()+" "+ref.getValue());
    }
	}
}
