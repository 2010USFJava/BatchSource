package com.revature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Coach;
import com.revature.models.FootballCoach;

public class SpringDriver {

	public static void main(String[] args) {
		System.out.println("Creating bean container...");

		// Load the Spring configuration file
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");) {

			System.out.println("Bean container created!");

			System.out.println("Requesting coach bean!");

			// Retrieve a bean from the Spring container
			Coach coach = context.getBean("myCoach", Coach.class);

			// Call getDailyWorkout() on the retrieved bean
			System.out.println(coach.getDailyWorkout());

			// Call getMotivationService() on the retrieved bean
			System.out.println(coach.getMotivation());

			System.out.println("+-----------------------------------------------+");

			// ------------------------------------------------------------------------

			FootballCoach footballCoach = context.getBean("myFootballCoach", FootballCoach.class);

			System.out.println(footballCoach.getDailyWorkout());
			System.out.println(footballCoach.getMotivation());
			System.out.println(footballCoach.getEmail());
			System.out.println(footballCoach.getTeam());

			System.out.println("+-----------------------------------------------+");

			// -------------------------------------------------------------------------

			Coach assistantCoach = context.getBean("myCoach", Coach.class);
			System.out.println(coach);
			System.out.println(assistantCoach);
			System.out.println(coach == assistantCoach);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
