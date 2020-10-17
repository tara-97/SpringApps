package com.tara.springdemo;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach:Inside No Arg Constructor");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Bowl for 30 minutes";
	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.assignFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach:Inside Setter Injection");
		this.fortuneService = fortuneService;
	}
	
	
	
	
}
