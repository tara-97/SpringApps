package com.tara.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("mycoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
		
		
	}

}
