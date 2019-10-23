package com.bridgelabz.autowiring.bytype;

public class Human 
{
  private Heart heart;

public void setHeart(Heart heart) 
{
	this.heart = heart;
	System.out.println("autowiring bytype called internally setter method");
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
