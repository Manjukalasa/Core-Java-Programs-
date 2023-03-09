package com.java.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class HashToTreeMapConvertion
{
		public static void main(String[] args)
		{
	           Map<Integer,String> map=new HashMap<Integer,String>();
	      //   Map<Integer,String> map=new LinkedHashMap<Integer,String>();
	         map.put(1,"Hello");
   	       //  map.put(null,null);
	         map.put(5,null);
	         map.put(17,"b s k");
	         map.put(3,"abc");
	         map.put(4,"hi");
	         map.put(2,"manju");
	         map.put(16,"kalasa");
	         map.put(1,"mk");  // derefferd previous object and pointing to new obeject
	         System.out.println(map);
	
	   TreeMap<Integer,String> map1=new TreeMap<Integer,String>(map);
	  // Retriveing key & elements from hashSet by using KeySet()method
	    Set<Integer> keys =map1.keySet();
	    for(Integer key : keys)
	    {
	    	System.out.println(key+" "+map1.get(key));
	    }
	   System.out.println("------------------------------------------------------------------------------");
	    // Retriveing key & elements from hashSet by using EntrySet()method
	    for( Map.Entry<Integer, String> ref :map1.entrySet())
	    {
	    	System.out.println(ref.getKey()+" "+ref.getValue());
	    }
}
}
