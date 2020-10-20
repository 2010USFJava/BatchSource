package com.revature.driver;

import com.revature.beans.Person;

public class Driver {

	public static void main(String[] args) {
		Person a= new Person("Matt",34,275);
		System.out.println(a);
		Person b=new Person();
		System.out.println(b);
		Person.setHomePlanet("Jupiter");
		System.out.println(a);
		System.out.println(b);
		a.setHomePlanet("Venus");
		System.out.println(b);
		
	}

}
