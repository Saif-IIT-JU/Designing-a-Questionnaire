package com.saif;

public class Users {
	private int id;
	private String name;
	private String date;
	private static final Users obj = new Users();
	
	public static Users getUsers()
	{
		return obj;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(String date)
	{
		this.date = date;
	}
	public void show()
	{
		System.out.println("User id : " + id);
		System.out.println("User name : " + name);
		System.out.println("Posted at : " + date);
	}
}
