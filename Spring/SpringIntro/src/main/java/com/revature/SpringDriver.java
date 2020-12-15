package com.revature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Coach;

public class SpringDriver {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		
		Coach coach= context.getBean("myCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}
}
