package com.java.map;

import java.util.*;

public class TreeMapSortingBasedOnValues
{
	public static void main(String[] args)
	{
		Map<String,Integer> map=new TreeMap<String,Integer>(); // by default ascending order
		map.put("manj",1);   // <String,Integer>
		map.put("kalasa",4);
		map.put("abc",null);
		map.put("xyz",null);
	//	map.put("bmw",3);
		System.out.println(map);
		// Retriveing key & elements from hashSet by using KeySet()method
		Set<String> keys =map.keySet();
		for(String key : keys)
		{
			System.out.println(key+" "+map.get(key));
		}		 
		System.out.println("___using without Set<String>____________");
		for(String key :map.keySet() )
		{
			System.out.println(key+" "+map.get(key));
		}
		
		System.out.println("------------------------------------------------------");
		
		// Retriveing key & elements from hashSet by using EntrySet()method
		for( Map.Entry<String,Integer> ref :map.entrySet())
		{
			System.out.println(ref.getKey()+" "+ref.getValue());
		}
	}
}
