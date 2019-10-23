package com.bridgelabz.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Body {

	public static void main(String[] args) {
	 

		ApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");
		
		//getting the object by using the getbeans method injecting to the human reference var
		Human human=context.getBean("human",Human.class);
		human.StartPumping();
	

	}

}
