package com.bridgelabz.DependencyInjection.constuctor;

public class Student1 
{
	
	private String studentName;
	 private int id;
	 
	public Student1(int id)
	{
		this.id =id;
	}
	 
    public Student1(int id,String studentName)
    {
    	this.id=id;
    	this.studentName=studentName;
    }
	
	
	public void displayStudentInfo()
	{
		System.out.println("student name:"+studentName+" and id is:"+id);
	}


}
