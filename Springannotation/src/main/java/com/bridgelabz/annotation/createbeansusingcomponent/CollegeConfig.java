/******************************************************************************
 *  Purpose: Program is written for configuring the application with the use
 *  
 *  		 @Configuration annotation which can provide object to application
 *  		 @ComponentScan is used to scan the whole package and creates object
 *
 *  @author  Swapna khairnar  
 *  @version 1.0
 *  @since   23-10-2019
 *
 ******************************************************************************/

package  com.bridgelabz.annotation.createbeansusingcomponent;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.annotation.createbeansusingcomponent")
public class CollegeConfig {

}
