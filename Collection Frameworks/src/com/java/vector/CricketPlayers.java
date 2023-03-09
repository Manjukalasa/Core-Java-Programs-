package com.java.vector;
public class CricketPlayers implements Comparable<CricketPlayers>
{
  private String name;
  private int ranking;
  private int score;
public CricketPlayers(String name, int ranking, int score) {
	this.name = name;
	this.ranking = ranking;
	this.score = score;
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
public int getscore() {
	return score;
}
public void setscore(int score) {
	this.score = score;
}
@Override
public String toString() {
	
	return "CricketPlayers [name=" + name + ", ranking=" + ranking + ", score=" + score + "]";
}
@Override
public int compareTo(CricketPlayers o) 
{
	return this.ranking-o.ranking;     // ascending order
	//return o.ranking-this.ranking;   // decending order
}
  
}
