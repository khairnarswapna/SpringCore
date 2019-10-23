/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
           by configuration class which can configure all beans which is 
 *  	 	 present in this package this can achieve using java based config
 *
 *  @author :Swapna khairnar  
 *  @version 1.0
 *  @since   :23-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.annotation.createbeansusingcomponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("collegeBean", College.class);
		System.out.println("programme is running using Component");
		System.out.println("College object name: " + college);
	}

}
