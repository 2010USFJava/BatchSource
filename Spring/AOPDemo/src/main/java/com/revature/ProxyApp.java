package com.revature;

import org.springframework.stereotype.Component;

@Component("appProxy")
public class ProxyApp {

	public ProxyApp() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * What are Cross Cutting Concerns?
	 * 		CCC is meta logic that an application needs, that is independent to the business logic. 
	 * In other words, logic that EVERY application needs, 
	 * 			even before you consider specific business logic. 
	 * 
	 * Examples?
	 * 		Logging
	 * 		Security 
	 * 		Caching 
	 * 		Exception 
	 * 		Transaction 
	 */
	
	//Examples of CCC
	public void moonWalking() {
		//5 lines of security
		//7 line dedicated to exception handling
		System.out.println("Look at me, I'm over the moon");
		
		//2 lines for caching
		//3 lines for logging
		
		//17 lines of code that have NOTHING to do with our own specific bus logic
		
	}
	public Boolean launchingToMars(double fuel) {
		// .security()
		// .exceptionhandlng()
		
		System.out.println("Big explosions!");
		
		//.caching();
		// .logging()
		
		return true;
	}
	
	protected Boolean orbitEarth() {
		// .security()
		// .exceptionhandlng()
		
		//.caching();
				// .logging()
		return false;
	}

	public Integer painting(int tools, double paint) {
		
		// .security()
				// .exceptionhandlng()
				
				//.caching();
						// .logging()
		return 0;
	}
}
