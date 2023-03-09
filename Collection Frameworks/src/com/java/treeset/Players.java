package com.java.treeset;
public class Players
{
	private String name;
	private int ranking;
	public Players(String name, int ranking)
	{
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

		return "Players [name=" + name + ", ranking=" + ranking +"]";
	}
}

