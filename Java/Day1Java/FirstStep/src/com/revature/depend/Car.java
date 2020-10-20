package com.revature.depend;

public class Car {
	
	int vin;
	String model;
	String make;
	String color;
	Engine engine;
	
	public Car(int vin, String model,String make, String color, Engine engine) {
		this.vin=vin;
		this.model=model;
		this.make=make;
		this.color=color;
		this.engine=engine;
	}
}
