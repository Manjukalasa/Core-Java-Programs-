package com.java.treeset;
import java.util.TreeSet;
import java.util.Iterator;

public class CricketPlayersMain  // using camparable @ compareTo()
{
	public void addplayers()
	{
		CricketPlayers e1=new CricketPlayers("msd",7);
		CricketPlayers e2=new CricketPlayers("Amanju",8);
		CricketPlayers e3=new CricketPlayers("raina", 2);
		CricketPlayers e4=new CricketPlayers("virat",1);
    TreeSet<CricketPlayers> clist =new TreeSet<CricketPlayers>();
	 clist.add(e1);
	 clist.add(e2);
	 clist.add(e1);
	 clist.add(e4);
	 clist.add(e3);
	 System.out.println(clist);
	// clist.forEach(Obj -> System.out.println(Obj));   // both are same
	 Iterator<CricketPlayers> i1=clist.iterator();       // it is used for all collections
	 while(i1.hasNext())
	 {
		 System.out.println(i1.next());
	 }
	}
	public static void main(String[] args)
	{
		CricketPlayersMain m1=new CricketPlayersMain();
		m1.addplayers();
	}
}
