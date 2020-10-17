package com.tara.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(cricketCoach.getDailyWorkout());
		
		System.out.println(cricketCoach.getFortuneService());
		
	}
}
