package com.bridgelabz.DependencyInjection.setter;

public class Student 
{
	 private String studentName;
	 private int id;
	 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("setter method called"+"setid");
		 
	}

	public String getStudentName() 
	{
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("setter method called"+"setstudentName");
		 
	}
	
	
	public void displayStudentInfo()
	{
		System.out.println("student name:"+studentName+" and id is:"+id);
	}

	 

}
