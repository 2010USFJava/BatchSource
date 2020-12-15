package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.revature.models.Coach;
import com.revature.models.FootballCoach;

@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringDriver {
	
	public static void main(String[] args) {
		
		System.out.println("Creating bean container...");
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDriver.class)) {
			
			System.out.println("Bean container created!");
			
			Coach baseballCoach = context.getBean("myBaseballCoach", Coach.class);
			System.out.println(baseballCoach.getWorkout());
			System.out.println(baseballCoach.getMotivation());
			
			Coach assistantCoach = context.getBean("myBaseballCoach", Coach.class);
			System.out.println(baseballCoach);
			System.out.println(assistantCoach);
			System.out.println(baseballCoach == assistantCoach);
			
			System.out.println("+-----------------------------------------------------------+");
			
			FootballCoach coach = context.getBean("footballCoach", FootballCoach.class);
			System.out.println(coach.getWorkout());
			System.out.println(coach.getMotivation());
			System.out.println(coach.getEmail());
			System.out.println(coach.getTeam());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
