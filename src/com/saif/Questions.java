package com.saif;

import java.util.*;

public class Questions {
	private String ques;
	private int id;
	Map<Answers, Users>tab = new HashMap<Answers, Users>();
	
	public void setQues(String ques)
	{
		this.ques = ques;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setTab(HashMap<Answers, Users>tab)
	{
		this.tab = tab;
	}
	
	public void display()
	{
		System.out.println("Question id : " + id);
		System.out.println("Question is : " + ques);
		System.out.println("\nAnswers are ... ");
		
		Iterator itr = tab.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println();
			Map.Entry e = (Map.Entry)itr.next();
			Answers a = (Answers)e.getKey(); Users u = (Users)e.getValue();
			a.show();
			System.out.println("Posted By,");
			u.show();
		}
	}
}
