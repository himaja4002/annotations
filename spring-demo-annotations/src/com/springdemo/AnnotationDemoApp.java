package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from container
		Coach theCoach = context.getBean("sillyCoach", Coach.class);
		
		//call method
		System.out.println(theCoach.getDailyWorkout());
		
		//close container
		context.close();

	}

}
