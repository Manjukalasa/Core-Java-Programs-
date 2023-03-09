package com.java.treeset;
import java.util.TreeSet;
import java.util.Iterator;
public class PlayersMainUsingCoparator
{
	public static void main(String[] args)
	{
		Players e1=new Players("xyz",1);
		Players e2=new Players("manju",7);
		Players e3=new Players("arun", 8);
		Players e4=new Players("iresh",2);
		PlayersList p= new PlayersList();
		TreeSet<Players> clist =new TreeSet<Players>(p);
		clist.add(e1);
		clist.add(e2);
		clist.add(e1);
		clist.add(e4);
		clist.add(e3);
		System.out.println(clist);
		// clist.forEach(Obj -> System.out.println(Obj));   // both are same(forEcah and iterator)

		Iterator<Players> i1=clist.iterator();       // it is used for all collections
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
