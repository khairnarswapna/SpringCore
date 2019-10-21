package com.example.demo;

public class Airtel implements Sim
{

	@Override
	public void calling() {
		 
		System.out.println("calling from the Airtel");
	}

	@Override
	public void data() 
	{
		System.out.println("browsing from the Airtel"); 
		
	}
 
}
