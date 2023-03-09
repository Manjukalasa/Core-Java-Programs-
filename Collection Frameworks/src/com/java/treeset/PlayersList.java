package com.java.treeset;
import java.util.Comparator;
public class PlayersList implements Comparator<Players>
{
	@Override
	public int compare(Players o1, Players o2)    // using comparator-->@ compare()
	{
		//        return o1.getRanking()-o2.getRanking(); // ascending order
		//        return o2.getRanking()-o1.getRanking(); // descending ogder
		//        return o1.getName().compareTo(o2.getName()); // ascending order
		          return o2.getName().compareTo(o1.getName()); // descending ogder
	}
}