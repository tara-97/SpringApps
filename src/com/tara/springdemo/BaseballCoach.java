package com.tara.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Play with bat 25 times";
	}
	
	public String getFortuneService() {
		return fortuneService.assignFortune();
	}
	
	

}
