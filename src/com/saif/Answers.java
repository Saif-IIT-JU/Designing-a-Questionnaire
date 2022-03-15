package com.saif;


public class Answers {
	private int id;
	private String ans;
	private static final Answers obj = new Answers();
	
	public static Answers getAnswers()
	{
		return obj;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setAns(String ans)
	{
		this.ans = ans;
	}
	public String getAns()
	{
		return ans;
	}
	
	public void show()
	{
		System.out.println("Answer id : " + id);
		System.out.println("Answer is : " + ans);
	}
}
