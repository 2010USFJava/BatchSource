package com.revature.driver;

import java.sql.Date;

// ctrl+shift+o to auto import
import com.revature.beans.Person;//Fully Qualified Class Name
import com.revature.exceptions.IncreasedByNegativeNumberException;
//import com.revature.beans.*;//wild card import
//import static com.revature.beans.Person.*;

public class Driver {
	
	public static void main(String[] args) {
		
		Date d= new Date(1);
		java.util.Date f= new java.util.Date();
		
		
		System.out.println(Person.getHomePlanet());
		Person a= new Person("Matt",34,275);
		System.out.println(a);
		//Person b=new Person();
		//System.out.println(b);
		//Person.setHomePlanet("Jupiter");
		//System.out.println(a);
		//System.out.println(b);
		//a.setHomePlanet("Venus");
		//System.out.println(b);
		try {
			a.increaseAgeBy(20);
			System.out.println(a.getAge());
		}catch(IncreasedByNegativeNumberException e) {
			e.printStackTrace();
		}
		
		
		try {
			a.increaseAgeBy(-20);
			System.out.println(a.getAge());
		}catch(IncreasedByNegativeNumberException e) {
			e.printStackTrace();
		}
	}

}
