package com.revature.classtypes;

import com.revature.beans.Person;

public class Driver {

	public static void main(String[] args) {
		Puma p= new Puma();
		System.out.println(p);
		
		Animal p1= new Puma();
		System.out.println(p1);
		
		Animal p2= new Person();
		System.out.println(p2);
	}

}
