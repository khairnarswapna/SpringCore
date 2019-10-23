package com.bridgelabz.DependencyInjection.injectingobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{

	public static void main(String[] args) 
	{
		
		  /*Student student=new Student(); //tightly coupling
		  MathCheat cheat=new MathCheat();
		  student.setMathCheat(cheat); 
		  student.cheating();*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext
				("com/bridgelabz/DependencyInjection/injectingobject/beans.xml");
		//student
		Student stu=context.getBean("stud",Student.class);
		stu.cheating();
		//New student
		NewStudent newstu=context.getBean("newstud",NewStudent.class);
		newstu.startcheating();
		
		 
	}

}
