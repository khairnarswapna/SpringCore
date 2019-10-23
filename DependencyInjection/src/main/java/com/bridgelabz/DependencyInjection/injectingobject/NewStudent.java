package com.bridgelabz.DependencyInjection.injectingobject;

public class NewStudent 
{
	private MathCheat cheat; //properties or dependencies 
    public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	
	public void startcheating()
	{
		cheat.mathCheat();
		//System.out.println("hey this is my id:"+id);
	}
	
}
