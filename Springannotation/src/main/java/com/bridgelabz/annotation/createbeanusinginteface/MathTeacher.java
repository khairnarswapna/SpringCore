/******************************************************************************
 *  Purpose: Program is written for providing MathTeacher functionality and 
	this class in implementing Teacher interface
 *
 *  @author  Swapna khairnar 
 *  @version 1.0
 *  @since   23-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.annotation.createbeanusinginteface;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	
	public void teach() 
	{
		System.out.println("hi I am your Teacher");
	}

	
 
}
