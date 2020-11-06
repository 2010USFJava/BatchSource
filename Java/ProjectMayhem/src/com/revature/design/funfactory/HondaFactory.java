package com.revature.design.funfactory;
//Factories create an object w/o exposing the creation logic to client
public class HondaFactory {
	/*
	 * use a "factory" method to return a Car Model based on 
	 * what String is given
	 * if the method is given a parameter of something besides 
	 * crv or civic, it will return null
	 */
	
	public Car getCar(String whatCar, String color) {
		if(whatCar.equals("civic")) {
			return new Car("Honda",2020,"Civic",color);
		}else if(whatCar.equals("crv")){
			return new Car("Honda",2020,"CRV",color);
		}
		return null;
	}
}
