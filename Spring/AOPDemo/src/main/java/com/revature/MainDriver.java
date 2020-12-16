package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {

	private static ApplicationContext appContext = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static void main(String[] args) {
		ProxyApp app=appContext.getBean("appProxy",ProxyApp.class);
		app.launchingToMars(10);
		app.moonWalking();
		System.out.println(app.orbitEarth());
		
	}

}
