package com.revature.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.revature.services.MotivationService;

@Scope("prototype")
@Component("myBaseballCoach")
public class BaseballCoach implements Coach {

	private MotivationService motivateService;
	
	@Autowired
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
