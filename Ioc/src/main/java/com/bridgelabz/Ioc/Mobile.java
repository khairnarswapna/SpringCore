package com.bridgelabz.Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{
    public static void main( String[] args )
    { 
    	 
    	//by using implementedclass read the config file
	
    	  ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		  System.out.println("configure loaded");
		 
		  /* Vadaphone vada=context.getBean("vadaphone",Vadaphone.class);
		  vada.calling();
		  vada.data();*/
		  
		  Sim sim=context.getBean("sim",Sim.class);
		  sim.calling();
		  sim.data();
		  
		  
		  
		 
    	 
         
    }
}
