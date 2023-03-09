package com.java.map;
import java.util.*;
public class CustomerObjectsTreeMapExample 
{
	public static void addplayers() 
	{
		CustomerObjects c1=new CustomerObjects("manju",101,"manj123",7795543450l);
		CustomerObjects c2=new CustomerObjects("kalsa",102,"manj456",123466789l);
		CustomerObjects c3=new CustomerObjects("abc",103,"manj789",524613522l);
		TreeMap<CustomerObjects,String> map=new TreeMap<CustomerObjects,String>();
		map.put(c3,"Hi");
		map.put(c1,"xyz");
		map.put(c2,"pqr");
		System.out.println(map);

		// Retriveing key & elements from TreeMap by using KeySet()method
		for(CustomerObjects key : map.keySet())
		{
			System.out.println(key+" "+map.get(key));
		}
		System.out.println("----------------------------------------------------------");
		// Retriveing key & elements from TreeMap by using EntrySet()method
		for( Map.Entry<CustomerObjects, String> ref :map.entrySet())
		{
			System.out.println(ref.getKey()+" "+ref.getValue());
		}
	}
	public static void main(String[] args) 
	{
		addplayers() ;
	}
}
