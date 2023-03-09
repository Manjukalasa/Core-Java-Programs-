package com.java.vector;
import java.util.Collections;
import java.util.Vector;
public class CricketPlayersMain 
{
	public void addplayers()
	{
		CricketPlayers e1=new CricketPlayers("m s dhoni", 07,2000);
		CricketPlayers e2=new CricketPlayers("mr shannu", 10,2100);
		CricketPlayers e3=new CricketPlayers("raina", 05,2200);
		CricketPlayers e4=new CricketPlayers("jadeja",03,23040);
    Vector<CricketPlayers> clist =new Vector<CricketPlayers>();
	 clist.add(e1);
	 clist.add(e2);
	 clist.add(e1);
	 clist.add(e4);
	 clist.add(e3);
	 System.out.println(clist);
	 Collections.sort(clist);  // ascending order

	 for(int i=0;i<clist.size();i++)
     {
    	 System.out.println(clist.get(i));
     }
	}
	public static void main(String[] args)
	{
		CricketPlayersMain m1=new CricketPlayersMain();
		m1.addplayers();
	}

}
