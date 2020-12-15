package com.revature.beans;

import com.revature.services.MotivationService;

public class TrackCoach implements Coach{
	private MotivationService motivationService;
	
	
	//Define a constructor for dependency injection
	public TrackCoach(MotivationService motivationService) {
		super();
		this.motivationService = motivationService;
	}

	public TrackCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		
		return "Today's workout: Run a 30 min 5K";
	}

	@Override
	public String getMotivation() {
		return "The track coach says: "+motivationService.getMotivation();
	}

}
