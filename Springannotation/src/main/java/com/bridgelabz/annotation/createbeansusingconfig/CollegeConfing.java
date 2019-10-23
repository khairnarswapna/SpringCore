/*****
 * 
 */
package com.bridgelabz.annotation.createbeansusingconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfing 
{
	  //using the bean notation
	  @Bean
      public College collegeBean()
      {
    	  College collage=new College();
    	  return collage;
      }
	
}
