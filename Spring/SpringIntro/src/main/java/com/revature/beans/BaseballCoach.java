package com.revature.beans;

import com.revature.services.MotivationService;

public class BaseballCoach implements Coach {
	
	private MotivationService motivationService;
	
	public BaseballCoach() {
		super();
	}
	//Define a constructor for dependency injection
	public BaseballCoach(MotivationService motivationService) {
		super();
		this.motivationService = motivationService;
	}

	@Override
	public String getDailyWorkout() {
		return "Today's workout: Spend 30 mins on batting practice.";
	}

	@Override
	public String getMotivation() {
		
		return "The baseball coach says: " + motivationService.getMotivation();
	}
}
