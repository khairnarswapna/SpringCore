package com.bridgelabz.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Profile profile=context.getBean("profile",Profile.class);
		profile.displayStudinfo();
		

	}

}
