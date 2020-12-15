package com.revature.models;

import com.revature.services.MotivationService;

public class BaseballCoach implements Coach {

private MotivationService motivateService;
	
	public BaseballCoach(MotivationService service) {
		this.motivateService = service;
		System.out.println("Inside of BaseballCoach, parameterized constructor");
	}

	@Override
	public String getWorkout() {
		return "Today's workout: Spend 30 minutes on batting practice.";
	}

	@Override
	public String getMotivation() {
		return "The baseball coach says: " + motivateService.getMotivation();
	}

}
