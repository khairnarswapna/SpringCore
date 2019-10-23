package com.bridgelabz.DependencyInjection.injectingobject;

public class Student 
{

	// MathCheat mathCheat=new MathCheat();//tightly couply
    int id;
	MathCheat mathCheat;
	public void setId(int id) {
		this.id = id;
	}	 
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating()
	{
		mathCheat.mathCheat();
		System.out.println("hey this is my id:"+id);
	}
	
}
