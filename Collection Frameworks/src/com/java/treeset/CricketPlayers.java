package com.java.treeset;

public class CricketPlayers implements Comparable<CricketPlayers>
{
	private String name;
	private int ranking;
	public CricketPlayers(String name, int ranking) {
		this.name = name;
		this.ranking = ranking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	@Override
	public String toString() {

		return "CricketPlayers [name=" + name + ", ranking=" + ranking +"]";
	}
	@Override
	public int compareTo(CricketPlayers o)       // using comparable-->@ compareTo()
	{
		//sorting based on Ranking
		return this.ranking-o.ranking;     // ascending order
		// return o.ranking-this.ranking;   // decending order

		//sorting based on Names
		// return this.name.compareTo(o.name);  //ascending order--> comparing string( comparing unicode values)
		//return o.name.compareTo(this.name);  //decending order--> comparing string( comparing unicode values)
	}

}
