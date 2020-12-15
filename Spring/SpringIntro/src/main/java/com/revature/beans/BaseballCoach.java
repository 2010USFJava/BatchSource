package com.revature.beans;

public class BaseballCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Today's workout: Spend 30 mins on batting practice.";
	}

	@Override
	public String getMotivation() {
		
		return null;
	}
}
