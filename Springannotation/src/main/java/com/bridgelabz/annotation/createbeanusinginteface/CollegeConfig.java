/******************************************************************************
 *  Purpose: Program is written for configuring the application with the use
 *  		 @Configuration annotation which can provide object to application
 *  		 @ComponentScan is used to scan the whole package and creates object
 *
 *  @author  Swapna khairnar 
 *  @version 1.0
 *  @since   23-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.annotation.createbeanusinginteface;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.annotation.createbeanusinginteface")
public class CollegeConfig {

	/*
	 * @Bean public Teacher teacherBean() { return new MathTeacher(); }
	 * 
	 * @Bean public College collegeBean() { College college = new College();
	 * college.setTeacher(teacherBean()); return college; }
	 */
}
