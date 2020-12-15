package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.models.Coach;
import com.revature.models.FootballCoach;

public class SpringDriver {
	
	public static void main(String[] args) {
		
		System.out.println("Creating bean container...");
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			
			System.out.println("Bean container created!");
			
			System.out.println("Requesting coach bean...");
			
			Coach coach = context.getBean("myCoach", Coach.class);
			
			System.out.println(coach.getWorkout());
			System.out.println(coach.getMotivation());
			System.out.println("+-----------------------------------------------------+");
			
			//----------------------------------------------------------------------------
			
			FootballCoach footballCoach = context.getBean("footballCoach", FootballCoach.class);
			
			System.out.println(footballCoach.getWorkout());
			System.out.println(footballCoach.getMotivation());
			System.out.println(footballCoach.getEmail());
			System.out.println(footballCoach.getTeam());
			System.out.println("+-----------------------------------------------------+");
			
			//----------------------------------------------------------------------------
			
			Coach assistantCoach = context.getBean("myCoach", Coach.class);
			System.out.println(coach);
			System.out.println(assistantCoach);
			System.out.println(coach == assistantCoach);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
