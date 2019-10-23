package com.bridgelabz.annotation.createbeansusingconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) 
	{
	
	//when we have the .xml configuration file with use that time we use classPathXmlApplicationContext
    //xml file 
	
   /*ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("configuration");
	Collage collage=context.getBean("collageBean",Collage.class);
	System.out.println("object is created by using spring"+collage);*/

	//when we don't have.xml file and we read it configuration by using the config class we use
		//AnnotationConfigApplicationContext and pass argument as the class
	
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfing.class);
		System.out.println("configuration file is loaded");
		
       College collage=context.getBean("collegeBean",College.class);        
		System.out.println("object is created by using spring"+collage);
		collage.test();


	}

}
