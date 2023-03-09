package com.java.map;
public class CustomerObjects implements Comparable<CustomerObjects>
{
	private String name;
	private int id;
	private String pw;
	private long phoneNumber;
	public CustomerObjects(String name, int id, String pw, long phoneNumber) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "CustomerObjects [name=" + name + ", id=" + id + ", pw=" + pw + ", phoneNumber=" + phoneNumber + "]";
	}
	@Override
	public int compareTo(CustomerObjects o) {
		return this.getName().compareTo(o.getName());//natural sorting
	}
//	@Override
//	public int compareTo(CustomerObjects o) {
//		return o.getId()-this.getId();//natural sorting
//	}
}
