/*********************************************************************
 * pupose:implemanetation of constructor based dependency injection
 * @author swapna k.
 * 
 */
package com.bridgelabz.DependencyInjection.constuctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.DependencyInjection.setter.Student;

public class Exam1 {

	public static void main(String[] args) 
	{
		//passing the value using constuctor
		/*
		 * Student1 student=new Student1(1, "abc"); student.displayStudentInfo();
		 */
		
		 ApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
		 Student1 stud=context1.getBean("student1",Student1.class);
		 stud.displayStudentInfo();
		 Student1 ash=context1.getBean("ash",Student1.class);
		 ash.displayStudentInfo();
 
 
		 
		 
	}

}
