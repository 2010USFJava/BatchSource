package com.revature.design;
	/*
	 * Singleton Design Pattern
	 * ensure a class has only one instance and provides
	 * a global access to it
	 */
public class Singleton {
	
	//private static property of itself /the self class
	private static Singleton instance;
	
	//private constructor
	private Singleton(){
		//logic here
	}
	
	//public Static synchronized method to get the unique instance- if it does not exist,
	//we will create it
	public static synchronized Singleton getInstance() {
		if(instance==null) {
			instance= new Singleton();
		}
		return instance;
	}
	
	public void doSomething() {
		//what the object should do
	}
	
}
