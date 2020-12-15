package com.revature;

import com.revature.models.BaseballCoach;
import com.revature.models.Coach;
import com.revature.services.MotivationServiceImpl;

public class Driver {

	public static void main(String[] args) {
		Coach coach = new BaseballCoach(new MotivationServiceImpl());
		System.out.println(coach.getMotivation());
	}
}
