package com.revature.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.revature.services.MotivationService;

@Component
public class FootballCoach implements Coach {

	@Value("${coach.email}")
	private String email;
	
	@Value("${coach.team}")
	private String team;
	
	private MotivationService motivateService;
	
	public FootballCoach() {
		super();
		System.out.println("Inside of FootballCoach, no-args constructor");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Autowired
	public void setMotivateService(MotivationService motivateService) {
		this.motivateService = motivateService;
	}
	
	public void customInit() {
		System.out.println("Inside of FootballCoach.customInit()...");
	}
	
	public void customDestroy() {
		System.out.println("Inside of FootballCoach.customDestroy()...");
	}

	@Override
	public String getWorkout() {
		return "Today's workout: Do suicide runs to the 40, 50, 60, 80, and 100 yard lines.";
	}

	@Override
	public String getMotivation() {
		return "The football coach says: " + motivateService.getMotivation();
	}

}
