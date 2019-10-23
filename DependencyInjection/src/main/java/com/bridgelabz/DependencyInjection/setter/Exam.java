/*********************************************************************
 * pupose:implemanetation of setter based dependency injection
 * @author swapna k.
 * 
 */

package com.bridgelabz.DependencyInjection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Exam 
{

	public static void main(String[] args) 
	{
	
		  //passing the value as the setter method of setstudentname and called displaystudinfo() method
		
		//Student student=new Student();
		//student.setStudentName("swati");
		//student.displayStudentInfo();
		
		  ApplicationContext context1=new ClassPathXmlApplicationContext("beans1.xml");
	      Student stud=context1.getBean("student",Student.class);
		  stud.displayStudentInfo();
		  
		  
		  Student ash=context1.getBean("ash",Student.class);
		  ash.displayStudentInfo();
		  
		  
		 
				 
		  //Vadaphone vada=context.getBean("vadaphone",Vadaphone.class);
		 // vada.calling();
		 // vada.data();*/
		 
		
		 
	}

}
