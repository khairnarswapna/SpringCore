package com.bridgelabz.autowiring.byName;

public class Human 
{
  private Heart heart;

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
