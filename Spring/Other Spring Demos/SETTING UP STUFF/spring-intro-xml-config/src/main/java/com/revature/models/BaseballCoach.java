package com.revature.models;

import com.revature.services.MotivationService;

public class BaseballCoach implements Coach {
	
	private MotivationService motivateService;
	
	public BaseballCoach() {
		super();
		System.out.println("Inside of BaseballCoach, no-args constructor");
	}
	
	// Dependency injection (constructor-based injection)
	public BaseballCoach(MotivationService service) {
		super();
		this.motivateService = service;
		System.out.println("Inside of BaseballCoach, parameterized constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Today's workout: Spend 30 minutes on batting practice.";
	}

	@Override
	public String getMotivation() {
		return "The baseball coach says: " + motivateService.getMotivation();
	}

}
