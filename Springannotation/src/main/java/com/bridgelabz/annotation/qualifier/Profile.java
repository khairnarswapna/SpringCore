package com.bridgelabz.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
   
	 @Autowired
	  @Qualifier("student3")
	   private Student student;

	   public Profile(){
	      System.out.println("Inside Profile constructor." );
	   }
	   public void displayStudinfo()
	   {
		   System.out.println("Student id:"+student.getId());
		   System.out.println("student name:"+student.getName());
	   }
	 
}
