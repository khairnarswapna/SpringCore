package com.bridgelabz.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Human 
{
  private Heart heart;

  public Human()
  {
  
  }
@Autowired  
public Human(Heart heart) 
{
	 System.out.println("human constructor is called ..");
	this.heart = heart;
}
public void setHeart(Heart heart) 
{
	this.heart = heart;
	System.out.println("internally called setter method");
}
public void StartPumping()
{
	//heart.pubp causing the nullpointer exception
	if(heart!=null)
	{
		heart.pump();
	}
	else
	{
		System.out.println("you are dead");
	}
}
  
}
